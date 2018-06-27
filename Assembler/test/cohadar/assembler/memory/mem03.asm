// test aload and astore instructions on param array
.CODE
@func(x:3):3
	// func[0] := x[0]
	const 0
	addr x
	aload
	const 0
	addr func
	astore

	// x[1] := 444
	const 444
	const 1
	addr x
	astore

	// func[1] := x[1]
	const 1
	addr x
	aload
	const 1
	addr func
	astore

	// func[2] := x[2]
	const 2
	addr x
	aload
	const 2
	addr func
	astore
	
	ret

@main():
	const 111
	const 222
	const 333
	call @func
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	
	exit 0

