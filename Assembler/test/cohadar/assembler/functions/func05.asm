// test function call without enough arguments
.CODE
@func(x:3, y:2):
	ret

@main():
	const 111
	const 222
	call @func // NotEnoughArgumentsException
	
	exit 0

