package cn.rainhowchan.ioc;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	
	@Override
	public void addUser() {
		this.userDao.save();
		System.out.println("spring: hello user Service");
	}

}
