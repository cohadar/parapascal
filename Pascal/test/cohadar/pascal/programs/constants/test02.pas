{* test negative constants *}
program test02;
const 
	x = -222;
	r = -33.3;
	t = not false;
	f = not true;
begin
	debug(x, r, t, f);
end.