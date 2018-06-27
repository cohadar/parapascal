{* test array reference *}
program test17;
type arr = array[1..10] of integer;

var x:arr;

procedure zrak(var z:arr);
begin
	z[7] := 333;
end;

begin
	x[7] := 111;
	zrak(x);
	debug(x[7]);
end.