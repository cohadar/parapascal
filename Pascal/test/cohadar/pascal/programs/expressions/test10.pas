{* test binary logic expressions *}
program test10;
var a,b,c:integer;
 
begin
	a := $00FFFFFF and $FFFFFF00;
	b := $00FFFFFF or  $FFFFFF00;
	c := $00FFFFFF xor $FFFFFF00;
	debug(a, b, c);
end.