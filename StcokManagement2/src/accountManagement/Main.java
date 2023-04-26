package accountManagement;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account();

		System.out.println("Pls set account balance");
		account.setAmmount(sc.nextInt());
		
		boolean cond=true;
		while(cond)
		{
			System.out.println("which operation you want to perform");
			System.out.println("1.debit or 2.credit");
			int op=sc.nextInt();
			
			if(op==1)
			{
				System.out.println("pls enter the ammount");
				int amount=sc.nextInt();
				account.debitAmount(amount);
			}
			if(op==2)
			{
				System.out.println("pls enter the ammount");
				int amount=sc.nextInt();
				account.creditAmount(amount);
			}
			
			System.out.println();
			
			System.out.println("Do you want to perform again 1.yes or 2.no");
			int n=sc.nextInt();
			if(n==1)
			{
				cond=true;
			}
			
			if(n==2)
			{
				cond=false;
			}
		}
	}

}
