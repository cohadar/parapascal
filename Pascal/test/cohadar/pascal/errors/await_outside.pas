program test;
var a: shared integer;
	
begin
	await (a = 0);
	
	region a do begin 
	end;
end.