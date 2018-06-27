{* test if statement *}
program test06;
var x:integer;

begin
	x := 3;
	if (x>0) then debug(111);
	if (x<0) then debug(222);
end.
