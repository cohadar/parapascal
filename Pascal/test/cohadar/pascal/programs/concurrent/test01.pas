{* test rendezvous, A111, B111 before A222, B222 *}
program test00;
var aHalf, bHalf : semaphore;

procedure A;
begin
	debug(111);
	signal(aHalf);
	wait(bHalf);
	debug(222);
end;

procedure B;
begin
	debug(111);
	signal(bHalf);
	wait(aHalf);
	debug(222);
end;

begin 
	init(aHalf, 0);
	init(bHalf, 0);
	cobegin
		B();
		A();
	coend;
end.
