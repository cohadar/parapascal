{* test reference array block transfer *}
program test21;
type arr = array[1..10] of integer;

var x, y:arr;

procedure njak(var a,b:arr);
begin
	a := b;
end;

begin
	x[7] := 111;
	njak(y, x);
	y[3] := 222;
	debug(x[3], y[7]);   { 0, 111 }
end.
