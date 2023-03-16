package Interface.InterfaceRealLife;

public class ComplexUserCheckSrv implements IUserCheckService {

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("Fi")) {
            return true;
        }
        else {
            return false;
        }
    }
    

}
