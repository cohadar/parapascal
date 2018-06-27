{* test cofor statement *}
program test03;
var mutex : semaphore;
	x : shared integer;

procedure writexy(a:integer);
begin
	wait(mutex);
	x := x + a;
	signal(mutex);
end;

var i: integer;

begin
	x := 0;
	init(mutex, 1);
	begin
		cofor i := 1 to 10 do writexy(i);
	end;
	debug(x);
end.