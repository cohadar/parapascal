{* test logic constants *}
program test09;

const 
	a = true and true;
	b = true and false;
	c = false or true;
	d = false or false;
	e = true xor false;
	f = false xor false;
begin
	debug(a, b, c, d, e, f);
end.