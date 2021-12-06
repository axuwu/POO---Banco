import BankSystem.Client;
import BankSystem.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<>();
        Client client1 = new Client("Xu", 1, "31/12/2000", "Rua Test", "xu@email.com", 987654321);
        Client client2 = new Client("Sergio", 2, "1/1/2000", "Rua Exam", "sb@email.com", 912345678);
        clientList.add(client1); clientList.add(client2);

        ArrayList<Bank> bankList = new ArrayList<>();
        Bank bankC1 = new Bank(client1, 1234, 100.00);
        bankList.add(bankC1);

        boolean flag = true;

        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "Enter Operacion:" + "\n" +
                    "RC : Registo de cliente" + "\n" +
                    "AC : Alteracão de dados de cliente" + "\n" +
                    "NC : Registo de conta" + "\n" +
                    " M : Registo de movimento" + "\n" +
                    "SC : Consulta de saldo de conta");

            String input = sc.nextLine().toUpperCase();
            switch (input) {
                case "RC" :
                    Scanner scn1 = new Scanner(System.in);
                    System.out.println("Enter client name:");
                    String name = scn1.nextLine();
                    System.out.println("Enter client id:");
                    int id = scn1.nextInt();
                    scn1.nextLine(); //consume newline left-over
                    System.out.println("Enter client birthdate:");
                    String birthdate = scn1.nextLine();
                    System.out.println("Enter client address:");
                    String address = scn1.nextLine();
                    System.out.println("Enter client email:");
                    String email = scn1.nextLine();
                    System.out.println("Enter client phone:");
                    int phone = scn1.nextInt();
                    scn1.nextLine(); //consume newline left-over

                    boolean ifIDUsed = false;

                    for (int i = 0; i < clientList.size(); i++) {
                        if (id == clientList.get(i).getId()){
                            ifIDUsed = true;
                        }
                    }

                    if (ifIDUsed == false){
                        Client newClient = new Client(name, id, birthdate, address, email, phone);
                        System.out.println(newClient.toString());
                        clientList.add(newClient);
                    } else {
                        System.out.println("Error: Already ID used");
                    }
                    break;

                case "AC" :
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter client id:");
                    int idChosen = sc2.nextInt();
                    sc2.nextLine(); //consume newline left-over
                    for (Client client : clientList) {
                        if (client.getId() == idChosen) {
                            System.out.println("Enter client name:");
                            String newName = sc2.nextLine();

                            System.out.println("Enter client birthdate:");
                            String newBirthdate = sc2.nextLine();

                            System.out.println("Enter client address:");
                            String newAddress = sc2.nextLine();

                            System.out.println("Enter client email:");
                            String newEmail = sc2.nextLine();

                            System.out.println("Enter client phone:");
                            int newPhone = sc2.nextInt();
                            sc2.nextLine(); //consume newline left-over
                            client.setName(newName);
                            client.setBirthdate(newBirthdate);
                            client.setAddress(newAddress);
                            client.setEmail(newEmail);
                            client.setPhone(newPhone);
                            System.out.println(client.toString());
                        }
                    }
                    break;

                case "NC" :
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter client id:");
                    int idSelected = sc3.nextInt();
                    sc3.nextLine(); //consume newline left-over
                    System.out.println("Insert initial balance amount (write 0,00 for no initial balance):");
                    double iniBalance = sc3.nextDouble();
                    sc3.nextLine(); //consume newline left-over
                    System.out.println(iniBalance);
                    for (Client client : clientList) {
                        if (client.getId() == idSelected) {
                            if (iniBalance == 0.00) {
                                Bank bankAcc2 = new Bank(client, bankList.size() + 1110);
                                bankList.add(bankAcc2);
                                System.out.println("Acc number:");
                                System.out.println(bankAcc2.getAssociatedNumber());
                            } else {
                                Bank bankAcc1 = new Bank(client, bankList.size() + 1110, iniBalance);
                                bankList.add(bankAcc1);
                                System.out.println("Acc number:");
                                System.out.println(bankAcc1.getAssociatedNumber());
                            }
                        }
                    }
                    break;

                case "M" :
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Enter Bank Account number:");
                    int numPicked = sc4.nextInt();
                    sc4.nextLine(); //consume newline left-over
                    System.out.println("Enter amount to deposit / write 0,00 for no deposit");
                    double amountDeposit = sc4.nextDouble();
                    sc4.nextLine(); //consume newline left-over
                    System.out.println("Enter amount to withdraw / write 0,00 for no withdraw");
                    double amountWithdraw = sc4.nextDouble();
                    sc4.nextLine(); //consume newline left-over
                    for (Bank bank : bankList) {
                        if (numPicked == bank.getAssociatedNumber() && amountDeposit == 0.00) {
                            bank.doWithdraw(amountWithdraw);
                            System.out.println("Was withdrawn: " + amountWithdraw);
                        } else if (numPicked == bank.getAssociatedNumber() && amountWithdraw == 0.00) {
                            bank.doDeposit(amountDeposit);
                            System.out.println("Was deposited: " + amountDeposit);
                        } else if (numPicked == bank.getAssociatedNumber() &&
                                amountDeposit != 0.00 && amountWithdraw != 0.00) {
                            bank.doDeposit(amountDeposit);
                            bank.doWithdraw(amountWithdraw);
                            System.out.println("Was withdrawn: " + amountWithdraw);
                            System.out.println("Was deposited: " + amountDeposit);
                        }
                    }
                    break;

                case "SC" :
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Enter Bank Account number:");
                    int numOpted = sc5.nextInt();
                    for (Bank bank : bankList) {
                        if (numOpted == bank.getAssociatedNumber()) {
                            System.out.println(bank.getBalance());
                        }
                    }
                    break;

                default :
                    System.out.println("QUIT!");
                    flag = false;
                    break;

            }
        }
    }
}
