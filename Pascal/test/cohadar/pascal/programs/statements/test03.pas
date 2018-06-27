{* test empty repeat statement *}
program test03;
var x:integer;

function decrease(var z:integer):boolean;
begin
	debug(z);
	z := z - 1;
	decrease := (x=0);
end;

begin
	x := 10;
	repeat until decrease(x);
end.
