// test function with 2 return values
.CODE
@func():2
	const 333
	const 0
	addr func
	astore
	const 444
	const 1
	addr func
	astore
	ret

@main():
	const 111
	call @func
	const 222
	
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	
	exit 0

