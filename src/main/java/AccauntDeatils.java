import java.util.Scanner;

public class AccauntDeatils {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner =new Scanner(System.in);
    public void creatAccount(){
        System.out.println("wprowadz numer konta");
        accountNumber = scanner.next();
        System.out.println("wprowadz nazwe konta");
        name = scanner.next();
        System.out.println("wprowadz login");
        login = scanner.next();
        System.out.println("podaj stan knta");
        balance = scanner.nextLong();



    }


    public void showAccount(){
        System.out.println("nazwa twojego konta" + name);
        System.out.println("numer konta" + accountNumber);
        System.out.println("login do konta" + login);
        System.out.println("stan konta" + balance);

    }
    public void deposite(){
        System.out.println("ile chcesz wplacic?");
        long pieniadze;
        pieniadze = scanner.nextLong();
        balance =  pieniadze + balance;



    }
    public void withdrawl(){
        System.out.println("podaj kwote wyplaty");
        long kwotaWyplaty;
        kwotaWyplaty = scanner.nextLong();

        if (balance<kwotaWyplaty){
            System.out.println("brak wystarczajacych srodkow");
        } else {
            balance = balance - kwotaWyplaty;

        }


    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
