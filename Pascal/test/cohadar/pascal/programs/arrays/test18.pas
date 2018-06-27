{* test reference nesting of array element *}
program test18;
type arr = array[1..10] of integer;

var x:arr;


procedure njak(var a:integer);
begin
	a := 333;
end;


procedure zrak(var z:arr);
begin
	njak(z[7]);
end;

begin
	x[7] := 111;
	zrak(x);
	debug(x[7]);
end.