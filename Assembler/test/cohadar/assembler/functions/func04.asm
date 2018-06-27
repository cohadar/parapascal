// test ret without call
// should throw error
.CODE
@func():
	ret // Ok

@main():
	call @func

	ret  // Error
	
	exit 0

