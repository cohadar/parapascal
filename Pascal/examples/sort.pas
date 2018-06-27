{ sorts random numbers and prints them as matrix }
program sort;

const L = 10;
const N = L*L;

type Arr = array[0..N-1] of integer;

var a: Arr;

procedure swap(var a,b:integer);
var t:integer;
begin
	t := a;
	a := b;
	b := t;
end;

procedure fill(var x:Arr);
var i : integer;
begin
	for i := 0 to N-1 do x[i] := random(N);
end;

procedure bubbleSort(var x:Arr);
var i, j : integer;
begin
	for i:= 0 to N-2 do
	for j:= i to N-1 do
	begin
		if (a[i]>a[j]) then	swap(a[i], a[j]);
	end;
end;

var i, j:integer;

begin
	fill(a);
	bubbleSort(a);
	for i := 0 to L-1 do begin
		for j := 0 to L-1 do begin
			write(a[i*L+j], ' ');
		end;
		writeln();
	end;
end.
