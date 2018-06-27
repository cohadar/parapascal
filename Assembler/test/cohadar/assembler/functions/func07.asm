// test if local variables are zero initialised
.CODE
@func(){x:2, y:2}:4
	// push x[0]
	const 0 
	addr x
	aload
	// push x[1]
	const 1
	addr x 
	aload
	// push y[0]
	const 0
	addr y 
	aload
	// push y[1]
	const 1
	addr y 
	aload
	ret

@main():
	call @func 
	
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	
	exit 0

