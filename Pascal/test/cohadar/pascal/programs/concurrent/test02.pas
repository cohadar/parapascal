{* test mutual exclusion *}
program test02;
var x : shared integer;
	mutex: semaphore;

procedure increase(var a:integer);
begin
	wait(mutex);	
	a := a + 111;
	signal(mutex);
end;

begin 
	x := 0;
	init(mutex, 1);
	cobegin
		increase(x);
		increase(x);
		increase(x);
		increase(x);
		increase(x);
		increase(x);
		increase(x);
		increase(x);
		increase(x);
	coend;
	debug(x);
end.
