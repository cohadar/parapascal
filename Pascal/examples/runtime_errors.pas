program errors;
var x:integer;
	f: real;
	r:-3..3;
	a:array[1..10] of integer;
	zero:integer;
	out:integer;
begin
	zero := 0;
	out := 777;
	cobegin
		x := x div zero;
		f := f / zero;
		r := out;
		a[out] := zero;
	coend
end.
