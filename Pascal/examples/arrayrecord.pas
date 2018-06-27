{* test array of records *}
program arrayrecord;

type 
	Trec = record
		x,y:integer;
	end;

	Arr = array[3..7] of Trec;

var 
	a:Arr;

{by reference}
procedure initArr(var v:Arr);
var i:integer;
begin
	for i := 3 to 7 do begin
		v[i].x := i;
		v[i].y := i*i;
	end;
end;

{by value}
procedure printArr(v: Arr);
var i:integer;
begin
	for i := 3 to 7 do begin
		writeln(a[i].x, '*', a[i].x, '=', a[i].y);
	end;
end;

begin
	initArr(a);
	printArr(a)
end.
