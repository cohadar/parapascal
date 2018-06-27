{* test name clashing *}
program test00;
var i: integer;

procedure proc;
var i:integer;
begin
	i := 222;
end;


begin
	i := 111;
	proc();
	debug(i);
end.