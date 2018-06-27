// test argument order
.CODE
@func(x:2, y:2):4
	// func[0] := x[0]
	const 0 
	addr x
	aload
	const 0
	addr func
	astore
	
	// func[1] := x[1]
	const 1 
	addr x
	aload
	const 1
	addr func
	astore
	
	// func[2] := y[0]
	const 0 
	addr y
	aload
	const 2
	addr func
	astore
	
	// func[3] := y[1]
	const 1
	addr y 
	aload
	const 3
	addr func
	astore
	ret

@main():
	const 111
	const 222
	const 333
	const 444
	call @func 
	
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	syscall %DEBUG
	
	exit 0

