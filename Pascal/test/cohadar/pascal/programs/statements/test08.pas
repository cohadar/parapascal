{* test nested if *}
program test08;

var x, y:integer;

procedure test(x, y: integer);
begin
	if (x>0) then
		if (y>0) then
			debug(111)
		else
			debug(222)
	else
		if (y>0) then	
			debug(333)
		else
			debug(444)
end;

begin
	test( 1,  1);
	test( 1, -1);
	test(-1,  1);
	test(-1, -1);
end.
