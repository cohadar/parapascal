program test;
var x:integer;
begin
	for x := 1 to 10 do
		x := x * 444;

	while (x = x) do
	begin
		x := x + 777;
	end;


	repeat 
		x := x + 333;
	until x > 10;

	if (x>2) then begin 
		x := x + 1
	end else begin
		x := x - 1
	end;

	cobegin
		x := x-111;
		x := x + 222;
	coend;
end.
