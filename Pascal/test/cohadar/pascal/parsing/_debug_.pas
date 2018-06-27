{* test equality constants *}
program test08;

const 
	s = 'hello';
	
	a = 22 = 22.0;
	b = 77 <> 77;
	c = true = false;
	d = s = 'hello';
	
begin
	debug(a, b, c, d);
end.