{* producer_consumer with semaphores *}
program test06;
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
        debug(x, y);
        signal(empty);
    end;
end;

begin
    x := 1; y := 1;
    init(full, 0); init(empty, 1);
    cobegin
        makepoints;
        printpoints;
    coend;    
end.
