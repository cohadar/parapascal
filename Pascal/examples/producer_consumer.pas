program producer_consumer;
var x, y: shared integer;
    full, empty: semaphore;

procedure makepoints;
var i: integer;
begin
    for i := 1 to 10 do begin
        wait(empty);
        x := i;
        y := i * i;
        signal(full);
    end;
end;

procedure printpoints;
var i: integer;
begin
    for i := 1 to 10 do begin
        wait(full);
        writeln('(', x,', ', y,')');        
        signal(empty);
    end;
end;

begin
    x := 0; y := 0;
    init(full, 1); init(empty, 0);
    cobegin
        makepoints;
        printpoints;
    coend;    
end.
