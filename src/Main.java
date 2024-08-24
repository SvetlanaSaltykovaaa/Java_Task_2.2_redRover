import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
       Создать программу дележа добычи на пиратском корабле.
       По обычаю, половина добычи идет владельцу корабля, половина оставшегося —
       капитану, остальное делится поровну между всеми членами команды, включая капитана.

        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

        Вывести на экран кому сколько пиастров полагается
        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        Дополнительное задание со звездочкой
        Попробовать придумать как программа может проверить правильность деле
        */

        Scanner scanner = new Scanner(System.in);

        int piastr = scanner.nextInt();
        int pirate = scanner.nextInt();
        scanner.close();

        Loot loot = new Loot();

        int lootForShipOwner =  (int) loot.lootForShipOwner(piastr);
        int lootForCaptainAnaOwner = (int) loot.lootForCaptainAndOwner(piastr, pirate);
        int lootForCaptain = (int) loot.lootForCaptain(piastr,pirate);
        int lootForUsualPirate = (int) loot.lootForUsualPirate(piastr,pirate);

        System.out.println("Владелец корабля получит " + lootForShipOwner + " пиастр.");
        System.out.println("Капитан корабля получит "+ lootForCaptainAnaOwner+" , если он владелец корабля.");
        System.out.println("Капитан корабля получит "+lootForCaptain+" пиастр.");
        System.out.println("Обычный пират получит "+lootForUsualPirate+ " пиастр.");





    }
}