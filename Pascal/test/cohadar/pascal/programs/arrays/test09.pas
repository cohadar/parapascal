{* test 2 dim arrays *}
program test09;
var a: array[1..10] of array[1..10] of integer;
	x : integer;

begin
	a[7][3] := 111;
	x := a[7][3]; 
	debug(x);
end.