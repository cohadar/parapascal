.CODE

// function fact, 1 argument
@fact(n):1
	// if n < 2 return 1
	addr n
	load   
	const 2
	lt      
	brf @next
	const 1
	addr fact
	store
	ret
@next:
	// return n * fact(n-1)
	addr n
	load 
	dup
	const 1
	sub
	call @fact
	mul
	addr fact
	store 
	ret

@main():
	// writeln fact(10)
	const '\n'
	const 10
	call @fact
	syscall %PRINT_INTEGER
	syscall %PRINT_CREF
	exit 0
