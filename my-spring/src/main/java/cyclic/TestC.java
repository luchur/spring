package cyclic;

/**
 * @author luchuang
 * @date 2020-11-12
 */
public class TestC {
	private TestA testA;

	public TestC() {

	}

	public void c(){
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public TestC(TestA testA) {
		this.testA = testA;
	}
}
