program temp;

procedure njak(x : integer);
var y: integer;
begin
    y := 3;
    cobegin
	writeln(x, y);
	x := x + 1;
	y := y + 1;
	writeln(x, y);
    coend;
end;

begin
    njak(7);
end.
