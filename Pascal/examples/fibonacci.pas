program fibonacci;

function fib(n:integer):integer;
begin
    if (n>1) then fib := n * fib(n-1) else fib := 1;
end;

begin
    writeln(fib(10));
end.