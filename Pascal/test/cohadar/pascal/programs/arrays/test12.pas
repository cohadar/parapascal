{* test array index out of bounds *}
program test12;
var a: array[1..10] of integer;

begin
	a[0] := 7;
end.