{* test reference nesting *}
program test16;
var x:integer;

procedure njak(var a:integer);
begin
	a := 333;
end;

procedure zrak(var z:integer);
begin
	njak(z);
end;

begin
	x := 111;
	zrak(x);
	debug(x);
end.