package fintech.driver;

import java.util.ArrayList;
import java.util.Scanner;

import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S24027_Grasia Simanullang
 * @author NIM Nama
 */
public class Driver3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        ArrayList<Transaction> transactions = new ArrayList<>();

        while (masukan.hasNext()) {
            String input = masukan.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] inputArr = input.split("#");
            String command = inputArr[0];

            if (command.equals("create-account")) {
                String owner = inputArr[1];
                String accountName = inputArr[2];
                Account account = new Account(owner, accountName);
                accounts.add(account);
                System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
            } else if (command.equals("find-account")) {
                String accountName = inputArr[1];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                    if (account.getAccountName().toLowerCase().equals(searchKey)) {
                        System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
                        break;
                    }
                }
            } else if (command.equals("create-transfer")) {
                String accountName = inputArr[1];
                double amount = Double.parseDouble(inputArr[2]);
                String timestamp = inputArr[3];
                String description = inputArr[4];
                String searchKey = accountName.toLowerCase();
                for (Account account : accounts) {
                  if (account.getAccountName().toLowerCase().equals(searchKey)) {
                      account.addBalance(amount);accountName, amount
                      Transfer transfer = new Transfer(username,receiver,amount,timestamp,description) {
        super(id, username, amount, timestamp, description);
                      transfer.add(transfer);
                      break;
                  }
                }
            }
        }
        masukan.close();
    }
}