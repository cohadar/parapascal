program forfork;
var mutex : semaphore;

procedure writexy(x:integer);
var y: integer;
begin
	wait(mutex);
    for y := 1 to 10 do begin
        write('(',x,', ',y,') ');
    end;
    writeln();
	signal(mutex);
end;

var i: integer;

begin
	init(mutex, 1);
	cofor i := 1 to 10 do writexy(i);
end.
