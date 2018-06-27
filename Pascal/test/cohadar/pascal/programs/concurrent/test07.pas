{* test sleep *}
program test07;

procedure AAA;
begin
	sleep(333);
	debug(333);
end;

procedure BBB;
begin
	sleep(222);
	debug(222);
end;

procedure CCC;
begin
	sleep(111);
	debug(111);
end;


begin
    cobegin
        AAA;
        BBB;
        CCC;
    coend;    
end.
