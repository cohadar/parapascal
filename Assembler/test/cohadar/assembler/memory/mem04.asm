// test for BLOADX and BSTOREX
.INSTANCE
	x : 3
	y : 3
.CODE

//======================================
@main():
	// x[0] := 111
	const    111
	const    0
	addr x
	astore

	// x[1] := 222
	const    222
	const    1
	addr x
	astore

	// x[2] := 333
	const    333
	const    2
	addr x
	astore

	// y := x    // block transfer
	addr     x
	const    3
	bload
	addr     y
	const    3
	bstore

	// debug (y[0], Y[1], y[2])
	const 0
	addr y
	aload
	syscall %DEBUG
	const 1
	addr y
	aload
	syscall %DEBUG
	const 2
	addr y
	aload
	syscall %DEBUG

	exit 0

