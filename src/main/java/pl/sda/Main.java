package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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


        System.out.println(user4.getName()) ;
        System.out.println(user4.getLastname());
        System.out.println(user4.getBankAccount().getBalance());
    }
}
