// test empty function call
.CODE
@func():
	ret

@main():
	const 111
	call @func
	const 222

	syscall %DEBUG
	syscall %DEBUG
	exit 0

