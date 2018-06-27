{* test subtracting constants *}
program test04;
const 
	x = 555 - (333 - 222);  {* 444 *}
	f = x - 410.7;  {* 33.3 *}
begin
	debug(x, f);
end.