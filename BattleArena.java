import java.util.Scanner;

public class BattleArena {
    public static void main(String[] args) {
        Hero hero = new Hero("Arthur", 100, 20);
        Monster monster = new Monster("Dragon", 150, 30);

        Scanner scanner = new Scanner(System.in);
        System.out.println("                                         ?!         ");
        System.out.println("                                       ^!BG7~!      ");
        System.out.println("==================================    ~#@@@@@Y:.    ");
        System.out.println("=Hey Arthur....... Sepertinya kau=    ?@@@@@@@&J:   ");
        System.out.println("=  makanan lezat pemberian dari  =  7@@&&#YB@@@P:   ");
        System.out.println("=         Tuan Kegelapan         = :YJ:.. ~@@@@Y    ");
        System.out.println("==================================        ^@@@@5.   ");
        System.out.println("==================================        ^@@@@5.   ");
        System.out.println("                           .^?Y##^       ?&@@@B~    ");
        System.out.println("                            J&@@@J.    !B@@@@J:     ");
        System.out.println("                            .Y@5J!.  ^P@@@@&!       ");
        System.out.println("                            ^&G     ?&@@@&Y.        ");
        System.out.println("                            ^&G     ?&@@@&Y.        ");
        System.out.println("                             P#~. .G@@@@@PYPBBBPY!. ");
        System.out.println("                              !5P5B@@@@@&BGPPGB@@@#^");
        System.out.println("                                 :B@@@@@&Y?7?YG@@@@^");
        System.out.println("                                  :G&@@@@@@@@@@&BY^ ");
        System.out.println("                                    J5B&&@@&#PYJ7~  ");
        System.out.println();
        System.out.println("Dragon sepertinya akan memakan kita.");
        System.out.println("Serang dia Arthur!!");
        System.out.println("Klik tombol Q untuk menyerang: ");

        while (hero.getHealth() > 0 && monster.getHealth() > 0) {
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                hero.attack(monster);
            }
            monster.attack(hero);
            System.out.println("Health " + hero.getName() + ": " + hero.getHealth());
            System.out.println("Health " + monster.getName() + ": " + monster.getHealth());
            System.out.println();
        }
        scanner.close();
    }
}
