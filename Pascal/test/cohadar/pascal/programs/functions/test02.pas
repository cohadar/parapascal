{* test arguments *}
program test02;
var a, b : integer;
	c: real;


procedure njak(x, y: integer; z:real);
begin
	a := x;
	b := y;
	c := z;
end;

begin
	njak(111, 222, 33.3);
	debug(a, b, c);
end.