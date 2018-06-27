// test for hex constants
.CODE

//======================================
@main():
	const  0x12345678
	syscall %DEBUG
	const  0xFEDCBA98
	syscall %DEBUG

	exit 0

