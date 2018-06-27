{* test locals *}
program test04;
var a, b : integer;
	c: real;

procedure njak();
var x, y: integer;
	z: real;
begin
	x := 111;
	y := 222;
	z := 33.3;

	a := x;
	b := y;
	c := z;
end;

begin
	njak();
	debug(a, b, c);
end.