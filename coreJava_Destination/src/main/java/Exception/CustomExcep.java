package Exception;

import java.util.Scanner;

class UnderAgeException extends Exception{
    UnderAgeException(String s){
        super(s);
    }
}

class Candidate{
    int age;

    void collect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age =sc.nextInt();
    }
    void verify()throws Exception{
        if (age<18){
            throw new UnderAgeException("underAge");
        }else if(age>60){
            throw new UnderAgeException("beyond Age");
        }else{
            System.out.println("age verified");
        }
    }
}


class Rto{
    void ValidateCandidate(Candidate c)throws Exception {
//        int attempts = 0;
//        while (attempts < 3) {
//            try {
//                c.collect();
//                c.verify();
//                return; // Exit if successful
//            } catch (Exception e) {
//                System.out.println("Attempt " + (attempts + 1) + " failed: " + e.getMessage());
//                attempts++;
//            }
//        }
//        System.out.println("userBlocked");

        c.collect();
        c.verify();
    }
}


public class CustomExcep {
    public static void main(String[] args)throws Exception {
       Rto rto = new Rto();
       Candidate c = new Candidate();
       rto.ValidateCandidate(c);
    }
}
