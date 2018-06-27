{* set scheduler to random and see how X varies*}
program test00;
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
    debug(x, y);
end.
