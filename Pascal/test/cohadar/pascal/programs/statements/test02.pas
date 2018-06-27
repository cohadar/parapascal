{* test repeat statement *}
program test02;
var x:integer;

begin
	x := 10;
	repeat
		debug(x);
		x := x - 1;
	until x=0;
end.
