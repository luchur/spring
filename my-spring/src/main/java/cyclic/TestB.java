package cyclic;

/**
 * @author luchuang
 * @date 2020-11-12
 */

public class TestB {
	private TestC testC;

	public TestB() {

	}

	public void b(){
		testC.c();
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public TestB(TestC testC) {
		this.testC = testC;
	}
}
