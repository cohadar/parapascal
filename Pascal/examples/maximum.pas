program max;
var x, y, z : integer;

function maximum(a, b :integer):integer;
begin
    if (a>=b) then maximum := a else maximum := b;
end;

function max3(a, b, c : integer):integer;
begin
    max3 := maximum(a, maximum(b, c));
end;


begin
    x := 55;
    y := 777;
    z := 3;
    writeln('max3(', x, ', ', y, ', ', z, ') = ', max3(x, y, z));
end.
