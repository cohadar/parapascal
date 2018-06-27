{* test return value *}
program test01;

function njak():integer;
begin
	njak := 222;
end;

begin
	debug(111);
	debug(njak());
	debug(333);
end.