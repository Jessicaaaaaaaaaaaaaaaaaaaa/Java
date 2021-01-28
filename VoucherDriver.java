import java.util.Scanner;

public class VoucherDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean check = true;
		Voucher.initialize(1001, 2001, 7);
		
		String purchaseDate = "";
		double amount = 0;
		String debitAccount = "";
		String vendor = "";
		
		System.out.println("XYZ COMPANY Voucher Manager");
		
		while (check) {
			
			System.out.println("\nActivities available:\n" 
				+ "1. create voucher\n"
				+ "2. print voucher checks\n" 
				+ "3. issue checks\n\n" 
				+ "Enter number of choice (or zero to quit): ");
			
			String activityChoice =  scan.nextLine();
			
			if(activityChoice.equals("1")) {
				
				System.out.print("Enter purchase date (dd/mm/yyyy): ");
				purchaseDate = scan.nextLine();
				
				System.out.print("Enter amount: $ ");
				amount = Double.parseDouble(scan.nextLine());
				
				System.out.print("Enter name of account to debit: ");
				debitAccount = scan.nextLine();
				
				System.out.print("Enter name of vendor: ");
				vendor = scan.nextLine();
				
				Voucher.addVoucher(purchaseDate, amount, debitAccount, vendor);
				
				}
			
			else if(activityChoice.equals("2")) {
				Voucher.printData();	
			}
			
			else if(activityChoice.equals("3")) {
				int voucherNumber = 1002;
				boolean b = Voucher.find(voucherNumber);
				
				if (b) {
					
					Voucher.issueCheck(voucherNumber, purchaseDate);
				}
				
				else {
	
					System.out.println("No vouchers have that number.");
				}
				
			}
		
			else if(activityChoice.equals("0")) {
				break;
			}
		
			else {
				System.out.println("invalid choice. Try again.");	
			}
		}
	
		System.out.println("Have a nice day!");
		
		scan.close();
		
	}
}