{* test nested records *}
program recordrecord;

type 
	Trec = record
		x,y:integer;
		z:record 
			t:real; 
			w:boolean;
		end;
	end;

var 
	x:Trec;

{by reference}
procedure initTrec(var v:Trec);
begin
	v.x := 111;
	v.y := 222;
	v.z.t := 1.234;
	v.z.w := true;
end;

{by value}
procedure printTrec(v: Trec);
begin
	writeln(v.x);
	writeln(v.y);
	writeln(v.z.t);
	writeln(v.z.w);
end;

begin
	initTrec(x);
	printTrec(x)
end.
