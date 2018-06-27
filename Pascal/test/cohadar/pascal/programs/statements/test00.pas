{* test while statement *}
program test00;
var x:integer;

begin
	x := 10;
	while (x>0) do begin
		debug(x);
		x := x - 1;
	end;
end.
