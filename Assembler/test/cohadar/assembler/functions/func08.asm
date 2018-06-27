// swap function, tests indirect addressing (pointers)
.SHARED
	x : 1
.INSTANCE
	y : 1

.CODE

// function swap(var a, b: integer);
// var t: integer
@swap(a:1, b:1){t:1}:
	// t := *a
	addr a
	load
	load
	addr t
	store

	// *a := *b
	addr b
	load
	load
	addr a
	load
	store

	// *b := t
	addr t
	load
	addr b
	load
	store

	ret

// function print(x, y:integer);
@print(x:1, y:1):
	// writeln(x, ',', y)
	addr x
	load
	syscall %PRINT_INTEGER
	const ', '
	syscall %PRINT_CREF
	addr y
	load
	syscall %PRINT_INTEGER
	const '\n'
	syscall %PRINT_CREF
	ret


@main():
	// x := 111;
	const 111
	addr x
	store

	// y := 222;
	const 222
	addr y
	store
	
	// swap(x, y)
	addr x
	addr y
	call @swap

	addr x
	load
	addr y
	load	
	
	syscall %DEBUG
	syscall %DEBUG

	exit 0
