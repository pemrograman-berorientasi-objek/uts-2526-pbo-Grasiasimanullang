package fintech.driver;

/**
 * @author 12S24027_Grasia Simanullang
 * @author NIM Nama
 */
public class Driver1 {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        
        while (masukan.hasNext()) {
            String input = masukan.nextLine();
            
            if (input.equals("---")) {
                break;
            }
            
            // memecah masukan menjadi tiga segmen
            String[] inputSegments = input.split("#");
            String command = inputSegments[0];
            String owner = inputSegments[1];
            String accountName = inputSegments[2];
            
            if (command.equals("create-account")) {
                // membuat objek Account
                Account account = new Account(owner, accountName);
                
                // menambah akun ke dalam ArrayList accounts
                accounts.add(account);
                System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            }
        }
        masukan.close();
    }
}