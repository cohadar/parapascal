{* test real promotion in arguments *}
program test07;
var r:real;

procedure njak(x:real);
begin
	r := x;
end;

begin
	njak(333);
	debug(r);
end.