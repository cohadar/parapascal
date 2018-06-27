{* test array block transfer *}
program test19;
type arr = array[1..10] of integer;

var x, y:arr;

begin
	x[7] := 111;
	y := x;
	y[3] := 222;
	debug(x[3], y[7]);   { 0, 111 }
end.
