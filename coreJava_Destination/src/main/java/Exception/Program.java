package Exception;

import java.util.Scanner;

class UserNameException extends  Exception{
    UserNameException(){
        super("Invalid username");
    }
}

class PasswordException extends Exception{
    PasswordException(){
        super("Invalid password");
    }
}

class User{
    String userName;
    String password;

    void collect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        userName = sc.next();
        System.out.println("enter password");
        password = sc.next();
    }
}

public class Program {
    String userName = "user";
    String password = "12345678";

    public static void main(String[] args)throws Exception {
        Program p = new Program();
        User u = new User();
        p.auth(u);

    }

    void auth(User u)throws Exception{
        u.collect();
        if(!userName.equals(u.userName)){
           throw new UserNameException();
        } else if (!password.equals(u.password)) {
            throw new PasswordException();
        }else{
            System.out.println("user verified");
        }

    }
}


