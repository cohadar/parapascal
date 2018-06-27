{* test name clashing *}
program test05;
var b : integer;

procedure njak(var b:integer);
begin
	b := 222;
end;

begin
	b := 444;
	njak(b);
	debug(b);
end.