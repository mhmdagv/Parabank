package Pom;

public class LoginPom {
    private LoginPom(){

    }

    private static LoginPom Instance;

    public static LoginPom getInstance(){
        if (Instance == null){
            Instance = new LoginPom();
            return Instance;
        }else {
            return Instance;
        }
    }
}
