package Interface.InterfaceRealLife;

public class SignUpManager {
    
    public void signUp(User user){

        AgeUserCheckService ageUserCheckService =new AgeUserCheckService();
        if (ageUserCheckService.checkUser(user)) {
            System.out.println("Kullanici Kayit Oldu!: "+user.getName());
        }
        else {
            System.out.println("Kayit olamadi!");
        }
    }
}
