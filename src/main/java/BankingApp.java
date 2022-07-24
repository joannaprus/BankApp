import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccauntDeatils accauntDeatils = new AccauntDeatils();
        System.out.println("Witaj w aplikacji bankowej");
        accauntDeatils.creatAccount();
        int inputNumber ;
        do {
            System.out.println("Co chcesz zrobic \n 1. Pokaz informacje o koncie\n 2. Wplata gotowki\n 3. Wyplata gotoeki\n 4. wyjscie");
           inputNumber= scanner.nextInt();

            switch (inputNumber){
                case 1:
                    accauntDeatils.showAccount();
                case 2:
                    accauntDeatils.deposite();
                case 3:
                    accauntDeatils.withdrawl();

                    break;
            }
        }
        while (inputNumber !=4);

    }

}
