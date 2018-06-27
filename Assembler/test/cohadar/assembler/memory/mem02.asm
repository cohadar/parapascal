// test aload and astore instructions on instance array
.INSTANCE
	x : 2

.CODE
@main():
	// x[0] := 333
	const 333
	const 0
	addr x
	astore

	// x[1] := 444
	const 444
	const 1
	addr x
	astore

	// debug(x[0], x[1])
	const 0
	addr x
	aload
	syscall %DEBUG
	const 1
	addr x
	aload
	syscall %DEBUG
	
	exit 0

