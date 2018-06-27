program test;
var a : shared integer;
	
begin
	region a do begin 
		a := a - 1;
		await (a+3); 
	end; 
end.