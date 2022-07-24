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



}
