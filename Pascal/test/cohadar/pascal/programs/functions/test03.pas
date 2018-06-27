{* test by-reference arguments *}
program test03;
var a, b : integer;
	c, d : integer;

procedure njak(x, y: integer; var z, t:integer);
begin
	a := x;
	b := y;
	
	z := 333;
	t := 444;
end;

begin
	njak(111, 222, c, d);
	debug(a, b, c, d);
end.