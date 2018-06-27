{* test binary logic constants *}
program test10;

const 
	a = $00FFFFFF and $FFFFFF00;
	b = $00FFFFFF or  $FFFFFF00;
	c = $00FFFFFF xor $FFFFFF00;
begin
	debug(a, b, c);
end.