package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobron", 35);
        User user4 = new User("Ola", "Lewandowska", 24);


        BankAccount bankAccount = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4444, 654231);
        BankAccount bankAccount3 = new BankAccount(3, "Bank", 3333, 1231);
        BankAccount bankAccount4 = new BankAccount(4, "BigBank", 2222, 2542);

        user.setBankAccount(bankAccount);
        user2.setBankAccount(bankAccount2);
        user3.setBankAccount(bankAccount3);
        user4.setBankAccount(bankAccount4);


        ObjectMapper objectMapper = new ObjectMapper() ;
        List<User> userList = new ArrayList<>();
        userList.add(user) ;
        userList.add(user2) ;
        userList.add(user3) ;
        userList.add(user4) ;

        try {
            objectMapper.writeValue(new File("userList.json"), userList) ;
            objectMapper.writeValue(new File("user.json"), user) ;
            objectMapper.writeValue(new File("user2.json"), user2) ;
            objectMapper.writeValue(new File("user3.json"), user3) ;
            objectMapper.writeValue(new File("user4.json"), user4) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Podaj ID  konta ");
        int ID =scanner.nextInt() ;
        int bankAccountID = ID ;

        switch (bankAccountID) {
            case 1 :
                System.out.println( "Imie " + user.getName());
                System.out.println("Nazwisko " + user.getLastname());
                System.out.println( "Wiek " + user.getAge());
                System.out.println("Numer Konta " + bankAccount.getAccountNumber());
                System.out.println( "srodki na koncie " + bankAccount.getBalance());
                break ;
            case 2 :
                System.out.println( "Imie " + user2.getName());
                System.out.println("Nazwisko " + user2.getLastname());
                System.out.println( "Wiek " + user2.getAge());
                System.out.println("Numer Konta " + bankAccount2.getAccountNumber());
                System.out.println( "srodki na koncie " + bankAccount2.getBalance());
                break ;
            case 3 :
                System.out.println( "Imie " + user3.getName());
                System.out.println("Nazwisko " + user3.getLastname());
                System.out.println( "Wiek " + user3.getAge());
                System.out.println("Numer Konta "  + bankAccount3.getAccountNumber());
                System.out.println( "srodki na koncie " + bankAccount3.getBalance());
                break ;

            case  4 :
                System.out.println( "Imie " + user4.getName());
                System.out.println("Nazwisko " + user4.getLastname());
                System.out.println( "Wiek " + user4.getAge());
                System.out.println("Numer Konta "  +bankAccount4.getAccountNumber());
                System.out.println( "srodki na koncie " + bankAccount4.getBalance());
            default :


        }

      //  System.out.println(user4.getName()) ;
      //  System.out.println(user4.getLastname());
     //   System.out.println(user4.getBankAccount().getBalance());
    }
}
