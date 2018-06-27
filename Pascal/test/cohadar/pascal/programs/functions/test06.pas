{ range type in param declarations }
program test06;
const N = 10;

procedure think(i : 0..N-1);
begin
	debug(i);
end;

var i:integer;
begin
	for i := 0 to N-1 do think(i);
end.