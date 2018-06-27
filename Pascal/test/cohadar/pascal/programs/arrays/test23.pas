{ test named types for range}
program test23;
const N = 10;
type PhilIndex = 0..N-1;
var forks : shared array[PhilIndex] of integer;
var i: integer;
begin
	for i := 0 to N-1 do forks[i] := i;
	for i := 0 to N-1 do debug(forks[i]);
end.