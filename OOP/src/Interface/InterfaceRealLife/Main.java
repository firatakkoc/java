package Interface.InterfaceRealLife;

public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager();
        signUpManager.signUp(new User(1, "Firat",28));
    }
}
