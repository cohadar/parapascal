{* test mutual exclusion with region *}
program test04;
var x : shared integer;

procedure increase();
begin
	region x do begin	
		x := x + 111;
	end;
end;

procedure decrease();
begin
	region x do begin	
		x := x - 111;
	end;
end;

var i: integer;
begin 
	x := 0;
	cobegin
		cofor i := 1 to 10 do increase();
		cofor i := 1 to 5 do decrease();
	coend;
	debug(x);
end.
