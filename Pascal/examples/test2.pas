program test;
var i:integer;
begin
	for i := 1 to 10 do begin
		if i=6 then break;
		write(i);
	end;
	writeln();
	while (true) do begin
		i := i - 1;
		write(i);
		if i=1 then break;
	end;
	writeln();
	repeat
		if i=6 then break;
		write(i);
		i := i + 1;
	until false;
end.
