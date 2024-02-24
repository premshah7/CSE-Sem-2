import java.util.Scanner;
class Bank_Account {
    int accountNo;
    int accountBalance;
    String userName;
    String email;
    String accountType;
    

    void getAccountDetails() {
        Scanner as = new Scanner(System.in);
        System.out.print("Enter your account no. : ");
        accountNo = as.nextInt();
        as.nextLine(); 

        System.out.print("Enter your name : ");
        userName = as.nextLine();

        System.out.print("Enter your email: ");
        email = as.nextLine();

        System.out.print("Enter your account type: ");
        accountType = as.nextLine();

    }

    void PrintDetails(){
        System.out.println("Acc No is:"+accountNo);
        System.out.println("Username is:"+userName);
        System.out.println("Email is:"+email);
        System.out.println("Acc Type:"+accountType);
    }
}
public class bank {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
        a.PrintDetails();
    }
}


