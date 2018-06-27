{* test if statement with else *}
program test07;
var x:integer;

begin
	x := 3;
	if (x>0) then debug(111) else debug(222);
	if (x<0) then debug(333) else debug(444);
end.
