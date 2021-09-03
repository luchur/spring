package aop;

/**
 * @author luchuang
 * @date 2021-09-03 17:58:52
 */
public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("---------add---------");
	}
}
