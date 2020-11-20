package cyclic;

/**
 * @author luchuang
 * @date 2020-11-12
 */
public class TestA {
	private TestB testB;

	public TestA() {

	}

	public void a(){
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public TestA(TestB testB) {
		this.testB = testB;
	}
}
