package cohadar.pascal.errors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.assembler.TestProgram;
import cohadar.pascal.PCompiler;
import cohadar.pascal.PasErrs;
import cohadar.util.Err;

public class TestErrors extends TestProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/errors/";
	}

	Err err1 = null;
	Err err2 = null;
	Err err3 = null;

	private void testError(String fileName, boolean print) {
		String asm = PCompiler.getListing(slurpTest(fileName));
		if (PCompiler.erlog.getErrCount() == 0) {
			throw new RuntimeException("No Errors");
		} else {
			err1 = PCompiler.erlog.getErr(0);
		}
		if (PCompiler.erlog.getErrCount() > 1) {
			err2 = PCompiler.erlog.getErr(1);
		}
		if (PCompiler.erlog.getErrCount() > 2) {
			err3 = PCompiler.erlog.getErr(2);
		}
		if (print) {
			System.out.println(asm);
		}
	}

	@Test
	public void testUndefinedVariable() {
		testError("undefined_variable.pas", false);

		assertEquals(5, err1.getLine());
		assertEquals(PasErrs.UNDEFINED_IDENTIFIER, err1.getType());
	}

	@Test
	public void testUndefinedConstant() {
		testError("undefined_constant.pas", false);
		assertEquals(PasErrs.NOT_A_CONSTANT, err1.getType());
	}

	@Test
	public void testUndefinedType() {
		testError("undefined_type.pas", false);
		assertEquals(PasErrs.UNDEFINED_TYPE, err1.getType());
	}

	@Test
	public void testUndefinedFunction() {
		testError("undefined_function.pas", false);
		assertEquals(PasErrs.UNDEFINED_FUNCTION, err1.getType());
	}

	@Test
	public void testUndefinedField() {
		testError("undefined_field.pas", false);
		assertEquals(PasErrs.UNDEFINED_FIELD, err1.getType());
	}

	@Test
	public void testBadopArithmetic() {
		testError("bad_operands_arithmetic.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopArithmetic2() {
		testError("bad_operands_arithmetic2.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopArithmetic3() {
		testError("bad_operands_arithmetic3.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopArithmetic4() {
		testError("bad_operands_arithmetic4.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopComparison() {
		testError("bad_operands_comparison.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopEquality() {
		testError("bad_operands_equality.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopLogic() {
		testError("bad_operands_logic.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testBadopLogic2() {
		testError("bad_operands_logic2.pas", false);
		assertEquals(PasErrs.BAD_OPERAND_TYPES, err1.getType());
	}

	@Test
	public void testIncompatibleTypes() {
		testError("incompatible_types.pas", false);

		assertEquals(5, err1.getLine());
		assertEquals(PasErrs.INCOMPATIBLE_TYPES, err1.getType());
	}

	@Test
	public void testNotAnArray() {
		testError("not_an_array.pas", false);
		assertEquals(PasErrs.NOT_AN_ARRAY, err1.getType());
	}

	@Test
	public void testNotAnInteger() {
		testError("not_an_integer.pas", false);
		assertEquals(PasErrs.NOT_AN_INTEGER, err1.getType());
	}

	@Test
	public void testIndexType() {
		testError("index_type.pas", false);
		assertEquals(PasErrs.INDEX_TYPE, err1.getType());
	}

	@Test
	public void testNotARange() {
		testError("not_a_range.pas", false);
		assertEquals(PasErrs.NOT_A_RANGE, err1.getType());
	}

	@Test
	public void testNotARecord() {
		testError("not_a_record.pas", false);
		assertEquals(PasErrs.NOT_A_RECORD, err1.getType());
	}

	@Test
	public void testNumOfArguments() {
		testError("num_of_arguments.pas", false);
		assertEquals(PasErrs.NUMBER_OF_ARGUMENTS, err1.getType());
	}

	@Test
	public void testNumOfArguments2() {
		testError("num_of_arguments2.pas", false);
		assertEquals(PasErrs.NUMBER_OF_ARGUMENTS, err1.getType());
	}

	@Test
	public void testExpectedReference() {
		testError("expected_reference.pas", false);
		assertEquals(PasErrs.EXPECTED_REFERENCE, err1.getType());
	}

	@Test
	public void testBadWrite() {
		testError("bad_write.pas", false);
		assertEquals(PasErrs.BAD_WRITE_ARGUMENT, err1.getType());
	}

	@Test
	public void testLocalShared() {
		testError("local_shared.pas", false);
		assertEquals(PasErrs.LOCAL_SHARED, err1.getType());
	}

	@Test
	public void testCoforOutside() {
		testError("cofor_outside.pas", false);
		assertEquals(PasErrs.COFOR_OUTSIDE, err1.getType());
	}

	@Test
	public void testNotShared() {
		testError("not_shared.pas", false);
		assertEquals(PasErrs.NOT_A_SHARED_VARIABLE, err1.getType());
	}

	@Test
	public void testConditionIf() {
		testError("condition_if.pas", false);
		assertEquals(PasErrs.NOT_A_BOOLEAN, err1.getType());
	}

	@Test
	public void testConditionWhile() {
		testError("condition_while.pas", false);
		assertEquals(PasErrs.NOT_A_BOOLEAN, err1.getType());
	}

	@Test
	public void testConditionRepeat() {
		testError("condition_repeat.pas", false);
		assertEquals(PasErrs.NOT_A_BOOLEAN, err1.getType());
	}

	@Test
	public void testConditionAwait() {
		testError("condition_await.pas", false);
		assertEquals(PasErrs.NOT_A_BOOLEAN, err1.getType());
	}

	@Test
	public void testAwaitOutside() {
		testError("await_outside.pas", false);
		assertEquals(PasErrs.AWAIT_OUTSIDE_REGION, err1.getType());
	}

	@Test
	public void testBreakOutside() {
		testError("break_outside.pas", false);
		assertEquals(PasErrs.BREAK_OUTSIDE_LOOP, err1.getType());
	}
}
