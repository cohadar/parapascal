{* set scheduler to random and processors to 1 and see how X varies *}
program prvi;
var x : shared integer;
var y : integer;
begin
    x := 2;
    y := 2;
    cobegin
        x := x + 1;
        y := y + 1;
        x := x - 1;
        y := y - 1;
    coend;
    writeln('X = ', x);
    writeln('Y = ', y);
end.
