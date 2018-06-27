{* test arrays *}
program test10;
var a: array[3..10] of integer;
	i : integer;

begin
	for i := 3 to 10 do begin
		a[i] := i;
		debug(a[i]);
	end;
end.