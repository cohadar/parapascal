// factoriel(10), test recursion
.CODE

// function fact(n:integer):integer
@fact(n:1):1
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
	// fact(10)
	const 10
	call @fact
	syscall %DEBUG
	
	exit 0
