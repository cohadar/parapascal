{* test by-reference parameters *}
program swap;
var x, y: integer;

procedure swap(var a, b:integer);
var c: integer;
begin
	c := a;
	a := b;
	b := c;
end;

begin
	x := 3;
	y := 7;
	writeln(x, '-', y);
	swap(x, y);
	writeln(x, '-', y);
end.
