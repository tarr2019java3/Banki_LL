package pl.sda;

public class Main {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski", 44) ;
        User user2 = new User("Marcin","Nowak",66);
        User user3 = new User("Katarzyna","Dobron",35);
        User user4 = new User("Ola" , "Lewandowska", 24) ;


        BankAccount bankAccount = new BankAccount(1, "BankDlaBogatych", 5555, 6555) ;
        BankAccount bankAccount2 = new BankAccount(2,"BankNowoczesny" ,4444, 654231) ;
        BankAccount bankAccount3 = new BankAccount(3 , "Bank" , 3333,1231) ;
        BankAccount bankAccount4 = new BankAccount(4 ,"BigBank",2222, 2542) ;

        user.setBankAccount(bankAccount);
        user2.setBankAccount(bankAccount2);
        user3.setBankAccount(bankAccount3);
        user4.setBankAccount(bankAccount4);


        System.out.println(user4.getBankAccount().getBalance());
    }
}
