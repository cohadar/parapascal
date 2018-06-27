{* test constants, only integer expressions supported *}
program constants;
const 
	x = 111;
	y = -222;
	z = x + 222;
	w = 888 div (4*2-6);
	pi = 3.14;
	s = 'hello';
	t = true;
	f = false;

begin
	writeln(x);
	writeln(y);
	writeln(z);
	writeln(w);
	writeln(pi);
	writeln(s);
	writeln(t);
	writeln(f);
end.