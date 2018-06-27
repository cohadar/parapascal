// await
program producer_consumer;
type R = record
			x, y : integer;
			full : boolean;
		 end;
var 
	r : shared R;

procedure makepoints;
var i: integer;
begin
    for i := 1 to 10 do begin
        region r do begin
			await (r.full = false);
	        r.x := i;
    	    r.y := i * i;
			r.full := true;
		end;
    end;
end;

procedure printpoints;
var i: integer;
begin
    for i := 1 to 10 do begin
		region r do begin
			await (r.full = true);
       		writeln('(', r.x,', ', r.y,')');        
			r.full := false;
		end;
    end;
end;

begin
	r.full := false;
    cobegin
        makepoints;
        printpoints;
    coend;    
end.
