{ calculates integral(sin(x)) on [0..pi] - should be 2.0 - but it isn't :) }
program integral;
const N = 200;
	  Xmin = 0;
	  Xmax = 3.14;

type point = record x,y: real end;
var Ymin, Ymax, dx, dy : real;
	Nx, Ny, F : shared integer;
	p: shared point;
	full, empty: semaphore;

function f(x:real):real;
begin
	f := sin(x);  { <------<< change function here }
end;

function fmin(Xmin, Xmax, dx: real):real;
var min, x, y: real;
begin
	x := Xmin + 0.5 * dx; min := f(x);
	while x <= Xmax do begin
		y := f(x);
		if y < min then min := y;
		x := x + dx;
	end;
	fmin := min;
end;

function fmax(Xmin, Xmax, dx: real):real;
var max, x, y: real;
begin
	x := Xmin + 0.5 * dx; max := f(x);
	while x <= Xmax do begin
		y := f(x);
		if y > max then max := y;
		x := x + dx;
	end;
	fmax := max;
end;

procedure pointgen;
var i:integer;
begin
	for i := 0 to N-1 do begin
		wait(empty);
		p.x := Xmin + (i mod Nx + 0.5) * dx;
		p.y := Ymin + (i div Ny + 0.5) * dy;
		signal(full);
	end;
end;


procedure integral;
var i:integer;
begin
	for i := 0 to N-1 do begin
		wait(full);
		if (p.y <= f(p.x)) and (p.y >= 0) then F := F + 1;
		if (p.y >= f(p.x)) and (p.y <= 0) then F := F - 1;
		signal(empty);
	end;
end;

begin
	dx := (Xmax - Xmin) / N;
	Ymin := fmin(Xmin, Xmax, dx);
	Ymax := fmax(Xmin, Xmax, dx);
	Nx := trunc(sqrt(N * (Xmax - Xmin) / (Ymax - Ymin)));
	Ny := trunc(sqrt(N * (Ymax - Ymin) / (Xmax - Xmin)));
	if Nx * Ny < N then Ny := Ny + 1;
	dx := (Xmax - Xmin) / Nx;
	dy := (Ymax - Ymin) / Ny;
	F := 0;
	init(full, 0);
	init(empty, 1);
	cobegin
		pointgen();
		integral();
	coend;
	writeln('dx = ', dx);
	writeln('dy = ', dy);
	writeln('Ymin = ', Ymin);
	writeln('Ymax = ', Ymax);
	writeln('integral = ', F / N * (Xmax-Xmin)*(Ymax-Ymin));
end.