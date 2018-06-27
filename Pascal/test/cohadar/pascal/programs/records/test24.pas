{* test array of records *}
program test24;

type 
	Trec = record
		x,y:integer;
	end;

	Arr = array[3..7] of Trec;

var 
	a:Arr;

procedure initArr(var v:Arr);
var i:integer;
begin
	for i := 3 to 7 do begin
		v[i].x :=i*111;
		v[i].y :=v[i].x * v[i].x;
	end;
end;

var i:integer;
begin
	initArr(a);
	for i := 3 to 7 do begin
		debug(a[i].x, a[i].y);
	end;	
end.
