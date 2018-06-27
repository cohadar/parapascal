program loops;
var x, y, z, t: integer;

begin
	z := 100;
	for x := 1 to z do begin
	for y := 1 to z do begin
		z := z + x + y; 
	end;
	end;
	
end.
