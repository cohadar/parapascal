{* test break  *}
program test09;
var i:integer;
begin
	for i := 1 to 10 do begin
		if i=6 then break;
		debug(i);
	end;
	while (true) do begin
		i := i - 1;
		debug(i);
		if i=1 then break;
	end;
	repeat
		if i=6 then break;
		debug(i);
		i := i + 1;
	until false;
end.
