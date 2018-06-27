{* test sub-array block transfer *}
program test20;
type arr = array[-1..1] of array[1..10] of integer;

var x, y:arr;

begin
	x[-1][7] := 111;
	x[0][7] := 333;
	y[-1] := x[-1];
	y[-1][3] := 222;
	debug(x[-1][3], y[-1][7], y[0][7]);   { 0, 111, 0 }
end.
