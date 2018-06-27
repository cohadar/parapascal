program arr;
var x:integer;
var arr : array[1..10] of integer;

begin
    for x := 1 to 10 do begin
        arr[x] := x;
        writeln(arr[x]);
    end;
end.