{* test var-reference inside array *}
program test15;
var a:array[1..3] of integer;
	i, j:integer;

procedure swap(var a,b:integer);
var t:integer;
begin
	t := a;
	a := b;
	b := t;
end;

begin
	a[1] := 333;
	a[2] := 111;
	a[3] := 222;

	for i:= 1 to 2 do
	for j:= i to 3 do
	begin
		if (a[i]>a[j]) then	swap(a[i], a[j]);
	end;

	for i := 1 to 3 do debug(a[i]);
end.