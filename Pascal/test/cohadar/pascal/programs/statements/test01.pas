{* test while statement with no do *}
program test01;
var x:integer;

function decrease(var z:integer):boolean;
begin
	debug(z);
	z := z - 1;
	decrease := x>0;
end;

begin
	x := 10;
	while (decrease(x)) do;
end.
