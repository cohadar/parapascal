{* test nested records *}
program test25;

type 
	Trec = record
		x,y:integer;
		z:record 
			t:real; 
			w:boolean;
		end;
	end;

var 
	t:Trec;

{by reference}
procedure initTrec(var v:Trec);
begin
	v.x := 111;
	v.y := 222;
	v.z.t := 33.3;
	v.z.w := true;
end;

begin
	initTrec(t);
	debug(t.x);
	debug(t.y);
	debug(t.z.t);
	debug(t.z.w);
end.
