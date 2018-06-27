program psleep;

procedure njak;
var i:integer;
begin
	for i:= 1 to 10 do begin
		write(i, ' ');
		sleep(1000);
	end;
end;

begin
	cobegin
		njak();
	coend
end.
