{* test arrays *}
program test08;
var a: array[1..10] of integer;
	x : integer;

begin
	a[7] := 111;
	x := a[7]; 
	debug(x);
end.