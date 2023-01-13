import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,password,balance to create account");

        //create user
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();

        SBIUser user=new SBIUser(name,balance,password);
//        HDFCUser user1=new HDFCUser(name,balance,password);

        //add money
        String message = user.addMoney(100000);
        System.out.println(message);
//        String message1 = user1.addMoney(100000);
//        System.out.println(message1);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
//        System.out.println(user1.withdrawMoney(money,pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));
//        System.out.println(user1.calculateInterest(10));
        System.out.println("This is a Change");
    }
}