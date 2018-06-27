{* test record fields *}
program test23;

var t: record
			x,y:integer;
			z: real;
	   end;

begin
	t.x := 111;
	t.y := 222;
	t.z := 33.3;
	debug(t.x, t.y, t.z);
end.
