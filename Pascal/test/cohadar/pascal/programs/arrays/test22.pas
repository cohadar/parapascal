{* test sub-array block transfer by reference *}
program test22;
type arr = array[-3..1] of array[1..10] of integer;

var x, y:arr;

procedure njak(var a,b:arr);
begin
	a[-1] := b[-1];
end;

begin
	x[-1][7] := 111;
	x[0][7] := 333;
	njak(y, x);
	y[-1][3] := 222;
	debug(x[-1][3], y[-1][7], y[0][7]);   { 0, 111, 0 }
end.
