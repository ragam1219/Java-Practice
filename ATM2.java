import java.util.Scanner;
class ATM2
{
public static void main(String [] args)
	{
	int balance=1000000,withdraw, deposit;
    Scanner sc=new Scanner(System.in);
	while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for Withdraw");
           	System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for Check Balance");
			System.out.println("choose 4 for Exit");
			System.out.println("Choose the operation you want to perform:");
			int choice =sc.nextInt();
			switch (choice)
			{
			case 1:        System.out.print("Enter money to be withdrawn:");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("Please Collect Your Cash");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
			System.out.println("");
			break;
			case 2:
				System.out.println("Enter Money To Deposited");
			    deposit =sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your Money has been deposited Sucessfully..");
				System.out.println("");
				break;
				case 3:
				System.out.println("Balance:"+ balance);
				System.out.println("");
				break;
				case 4:
					System.exit(0);


			
			}


	}
}
}