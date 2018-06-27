{* test comparison constants *}
program test07;
const 
	a = 1 < 10;
	b = 3 <= 3.0;
	c = 2.2 > 7;
	d = 2.3 >= 1.2;
	
begin
	debug(a, b, c, d);
end.