{* test range type exception *}
program test14;
var x: array[1..10] of 3..7;

begin
	x[7] := 8;
end.