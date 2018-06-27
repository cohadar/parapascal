{* test process ordering, A before B *}
program test00;
var aDone : semaphore;

procedure A;
begin
	debug(111);
	signal(aDone);
end;

procedure B;
begin
	wait(aDone); 
	debug(222);
end;

begin 
	init(aDone, 0);
	cobegin
		B();
		A();
	coend;
end.
