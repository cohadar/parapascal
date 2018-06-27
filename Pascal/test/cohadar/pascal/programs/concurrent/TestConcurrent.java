package cohadar.pascal.programs.concurrent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.interpreter.kernel.CCSemaphore;
import cohadar.pascal.programs.TestPasProgram;

public class TestConcurrent extends TestPasProgram {
	private int processorCount = 1;
	private int schedulerIndex = 0;
	private int semaphoreSAW = 0;

	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/concurrent/";
	}

	// returns true on overflow
	private boolean incSem() {
		semaphoreSAW++;
		if (semaphoreSAW >= 2) {
			semaphoreSAW = 0;
			return true;
		}
		return false;
	}

	// returns true on overflow
	private boolean incSch() {
		schedulerIndex++;
		if (schedulerIndex >= 3) {
			schedulerIndex = 0;
			return true;
		}
		return false;
	}

	// returns true on overflow
	private boolean incProc() {
		processorCount *= 2;
		if (processorCount >= 128) {
			processorCount = 1;
			return true;
		}
		return false;
	}

	private boolean concurrentDebug(String fileName, boolean print) {
		kernel.setProcessorCount(processorCount);
		kernel.setScheduler(schedulerIndex);
		CCSemaphore.setDiscipline(semaphoreSAW);

		debugProcess(fileName, print);

		if (incProc()) {
			if (incSch()) {
				if (incSem()) {
					return false;
				}
			}
		}

		return true;
	}

	@Test
	public void test00() {
		while (concurrentDebug("test00.pas", false)) {
			assertEquals(d222, p.pop());
			assertEquals(d111, p.pop());
			assertEmptyStack();
		}
	}

	@Test
	public void test01() {
		while (concurrentDebug("test01.pas", false)) {
			assertEquals(d222, p.pop());
			assertEquals(d222, p.pop());
			assertEquals(d111, p.pop());
			assertEquals(d111, p.pop());
			assertEmptyStack();
		}
	}

	@Test
	public void test02() {
		while (concurrentDebug("test02.pas", false)) {
			assertEquals(d999, p.pop());
			assertEmptyStack();
		}
	}

	private final int sum1to10 = 55;

	@Test
	public void test03() {
		while (concurrentDebug("test03.pas", false)) {
			assertEquals(sum1to10, p.pop());
			assertEmptyStack();
		}
	}

	@Test
	public void test04() {
		while (concurrentDebug("test04.pas", false)) {
			assertEquals(d555, p.pop());
			assertEmptyStack();
		}
	}

	@Test
	public void test05() {
		while (concurrentDebug("test05.pas", false)) {
			for (int j = 10; j > 0; j--) {
				assertEquals(j * j, p.pop());
				assertEquals(j, p.pop());
			}
			assertEmptyStack();
		}
	}

	@Test
	public void test06() {
		while (concurrentDebug("test06.pas", false)) {
			for (int j = 10; j > 0; j--) {
				assertEquals(j * j, p.pop());
				assertEquals(j, p.pop());
			}
			assertEmptyStack();
		}
	}

	@Test
	public void test07() {
		while (concurrentDebug("test07.pas", false)) {
			assertEquals(d333, p.pop());
			assertEquals(d222, p.pop());
			assertEquals(d111, p.pop());
			assertEmptyStack();
		}
	}

}
