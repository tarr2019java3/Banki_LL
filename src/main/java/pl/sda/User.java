package pl.sda;

public class User {
    private  String name ;
    private String lastname ;
    private int age ;
    private BankAccount bankAccount ;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
        public void setBankAccount(BankAccount bankAccount) {
            this.bankAccount = bankAccount ;
        }
        public BankAccount getBankAccount() {
        return this.bankAccount ;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
