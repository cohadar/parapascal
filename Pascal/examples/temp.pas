program temp;

procedure proc(x:integer; var y:integer);
begin
	writeln(x, ' ', y);
	y := y + 1;
	x := x + y + 2;
	writeln(x, ' ', y);
end;

var a:integer;

begin
	a := 7;
	proc(2, a);    
end.
