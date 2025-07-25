package org.example.qa_notes.OOPIntro.Practice.Bank;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount Jeff = new BankAccount("Jefftrey");
        System.out.println(Jeff.getBalance());
        System.out.println(Jeff.getOwner());
        Jeff.deposit(10);
        System.out.println(Jeff.getBalance());
        Jeff.withdraw(5);
        System.out.println(Jeff.getBalance());
        Jeff.withdraw(10);
        System.out.println(Jeff.getBalance());


    }
}
