import java.util.Scanner;

class Bank_Account{
	int accountNo ;
	String userName ;
	String email ;
	String accountType ;
	int accountBalance ;


	public void getAccountDetails(int accountNo,String userName,String email,String accountType,int accountBalance){
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}


	public void displayAccountDetails(){
		System.out.println("Enter account number:"+accountNo);
		System.out.println("Enter user name:"+userName);
		System.out.println("Enter E-mail address:"+email);
		System.out.println("Enter account type:"+accountType);
		System.out.println("Enter account balance:"+accountBalance);
	}
}



public class Lab5_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         
        Bank_Account p1 = new Bank_Account();
		System.out.println("Enter account number:");
		p1.accountNo = sc.nextInt();
		System.out.println("Enter user name:");
		p1.userName = sc.next();
		System.out.println("Enter E-mail address:");
		p1.email = sc.next();
		System.out.println("Enter account type:");
		p1.accountType = sc.next();
		System.out.println("Enter account balance:");
		p1.accountBalance = sc.nextInt();
		p1.displayAccountDetails();
	}
}