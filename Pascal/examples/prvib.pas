program prvib;
var x : shared integer;
var s : semaphore;

begin
    x := 2; init(s, 1);
    cobegin
	begin
            wait(s);
            x := x + 1;
	    signal(s);
	end;
	begin
            wait(s);
            x := x - 1;
	    signal(s);
	end;
    coend;
    writeln('X = ', x);
end.
