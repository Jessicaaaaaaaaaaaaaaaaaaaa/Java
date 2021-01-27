import java.util.Scanner;

public class VoucherDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean check = true;
		Voucher.initialize(1001, 2001, 7);
		
		System.out.println("XYZ COMPANY Voucher Manager\n");
		
		System.out.println("Activities available:\n" 
				+ "1. create voucher\n"
				+ "2. print voucher checks\n" + "3. issue checks\n\n" 
				+ "Enter number of choice (or zero to quit): ");
		
		while (check) {
			
			String activityChoice =  scan.nextLine();
			
			if(activityChoice.equals("1")) {
				
				// ask for info using scanner
				// Voucher.addVoucher();
			}
			
			if(activityChoice.equals("2")) {
				Voucher.printData();
				
			}
			
			if(activityChoice.equals("3")) {
				// Voucher find (get voucher number)
				// no vouchers have that number verifier
				// get purchase date
				// Voucher.issueCheck();
				
			}
		
			if(activityChoice.equals("0")) {
				break;
			}
		
			if(!(activityChoice.equals("0") || activityChoice.equals("1") || 
					activityChoice.equals("2") || activityChoice.equals("3"))) {
				System.out.println("invalid choice. Try again. \n");
				
				System.out.println("Activities available:\n" 
						+ "1. create voucher\n"
						+ "2. print voucher checks\n" + "3. issue checks\n\n" 
						+ "Enter number of choice (or zero to quit): ");
			}
		}
	
		System.out.println("Have a nice day!");
		
		scan.close();
		
	}
}