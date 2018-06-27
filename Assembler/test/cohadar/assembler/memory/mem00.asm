// Program changes x and y variables inside another thread
// when control is returned to main thread 
// change will be visible only on shared variable x
// instance variable y inside main will remain the same 
// because every thread has personal copy
.SHARED
	x : 1

.INSTANCE
	y : 1

.CODE
	// x := 3
	const 3
	addr x
	store

	// y := 5
	const 5
	addr y
	store
	
	// create new thread
	fork @new_thread
	// wait for thread to finish
	join 

	// push values on debug stack to be tested by JUnit
	addr x
	load
	syscall %DEBUG
	addr y
	load
	syscall %DEBUG
	
	exit 0
	
@new_thread: 
	// x := x + 1
	addr x
	load
	inc
	addr x
	store
	// y := y + 1
	addr y
	dup
	load
	inc
	swap
	store

	exit 0

