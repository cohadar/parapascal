.SHARED
	x : 1	// integer
	y : 1	// integer  
	full : 1	// semaphore
	empty : 1	// semaphore
.CODE

//======================================
@makepoints(){i}:
	// FOR
	// index := start
	const    1
	addr     i
	store
	br       @0001
@0000:
	// DO
	addr     empty
	load
	syscall  %SEM_WAIT
	// :=
	addr     i
	load
	addr     x
	store
	// :=
	addr     i
	load
	addr     i
	load
	mul
	addr     y
	store
	addr     full
	load
	syscall  %SEM_SIGNAL
	// index++
	addr     i
	load
	inc
	addr     i
	store
@0001:
	// condition (index <= end)
	addr     i
	load
	const    10
	lte
	brt      @0000
	ret
//======================================
@printpoints(){i}:
	// FOR
	// index := start
	const    1
	addr     i
	store
	br       @0003
@0002:
	// DO
	addr     full
	load
	syscall  %SEM_WAIT
	const    '('
	syscall  %PRINT_CREF
	addr     x
	load
	syscall  %PRINT_INTEGER
	const    ', '
	syscall  %PRINT_CREF
	addr     y
	load
	syscall  %PRINT_INTEGER
	const    ')'
	syscall  %PRINT_CREF
	syscall  %PRINT_NL
	addr     empty
	load
	syscall  %SEM_SIGNAL
	// index++
	addr     i
	load
	inc
	addr     i
	store
@0003:
	// condition (index <= end)
	addr     i
	load
	const    10
	lte
	brt      @0002
	ret
//======================================
@main():
	// :=
	const    0
	addr     x
	store
	// :=
	const    0
	addr     y
	store
	addr     full
	const    1
	syscall  %SEM_INIT
	addr     empty
	const    0
	syscall  %SEM_INIT
	// FORK
	fork     @forkStart_0001
	br       @forkEnd_0001
	@forkStart_0001:
	call     @makepoints
	exit     0
	@forkEnd_0001:
	// FORK
	fork     @forkStart_0002
	br       @forkEnd_0002
	@forkStart_0002:
	call     @printpoints
	exit     0
	@forkEnd_0002:
	// JOIN
	join
	exit 0

