program errors;
var x:integer;
	r:-3..3;
	a:array[1..10] of integer;
	zero:integer;
	out:integer;
begin
	zero := 0;
	out := 777;
	cobegin
		x := x div zero;
		r := out;
		a[out] := zero;
	coend
end.