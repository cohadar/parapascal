// test function with 1 return value
.CODE
@func():1
	const 333
	addr func
	store
	ret

@main():
	const 111
	call @func
	const 222
	
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	exit 0

