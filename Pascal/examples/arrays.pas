{* test 2 dim arrays *}
program arrays;
var a: array[1..10] of array[-3..3] of integer;
	i, j : integer;

begin
	for i := 1 to 10 do
	for j := -3 to 3 do 
		begin
			a[i][j] := i+j;
			writeln(i,' + ',j,' = ',a[i][j]);
		end;
end.
