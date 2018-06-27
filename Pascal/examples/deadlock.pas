program deadlock;
var sem: semaphore;

procedure njak;
begin
    wait(sem);
end;

procedure zrak;
begin
	wait(sem);
end;

begin
    init(sem, 0); 
    cobegin
		njak;
        zrak;
    coend;    
end.
