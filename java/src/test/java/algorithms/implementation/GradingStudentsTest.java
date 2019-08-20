package algorithms.implementation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GradingStudentsTest {

	@Test
	public void test() {
		List<Integer> input = Arrays.asList(73,67,38,33);
		List<Integer> output = Arrays.asList(75,67,40,33);
		assertThat(GradingStudents.gradingStudents(input), is(output));
	}

}
