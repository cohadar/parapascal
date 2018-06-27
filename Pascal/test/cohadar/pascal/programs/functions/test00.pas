{* test call order *}
program test00;

procedure njak();
begin
	debug(222);
end;

begin
	debug(111);
	njak();
	debug(333);
end.