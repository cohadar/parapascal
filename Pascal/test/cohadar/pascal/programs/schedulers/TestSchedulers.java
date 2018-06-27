package cohadar.pascal.programs.schedulers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestSchedulers extends TestPasProgram {
	private static final int RUNS = 50;

	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/schedulers/";
	}

	@Test
	public void testRandom() {
		int sx = 0;
		int sy = 0;

		for (int i = 0; i < RUNS; i++) {
			kernel.setProcessorCount(4);
			kernel.setScheduler("Random");
			debugProcess("test00.pas", false);
			assertEquals("Random", kernel.getScheduler());
			sy += p.pop();
			sx += p.pop();
		}

		assertTrue(2 * RUNS == sy);
		assertFalse(2 * RUNS == sx);
	}

	@Test
	public void testNonPreemptive() {
		int sx = 0;
		int sy = 0;

		// NonPreemptive with more than one processor behaves like FIFO
		for (int i = 0; i < RUNS; i++) {
			kernel.setProcessorCount(1); // <------<<
			kernel.setScheduler("NonPreemptive");
			debugProcess("test00.pas", false);
			assertEquals("NonPreemptive", kernel.getScheduler());
			sy += p.pop();
			sx += p.pop();
		}

		assertTrue(2 * RUNS == sy);
		assertTrue(2 * RUNS == sx);
	}

}
