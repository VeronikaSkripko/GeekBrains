import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        int count = 3;
        newGame(count, number);
    }
    public static void newGame (int counter, int number){
        System.out.println("Угадайте загаданное число. У Вас есть 3 попытки.");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int a = scan.nextInt();
            if (a == number) {
                System.out.println("Вы угадали!");
                inviteToPlay();
                break;
            } else if (a > number) {
                counter--;
                System.out.println("Загаданное число меньше. Осталось попыток: " + counter);
            } else {
                counter--;
                System.out.println("Загаданное число больше. Осталось попыток: " + counter);
            }
            if (counter == 0) {
                System.out.println("Не унывай! Ты был близок - загаданное число: " + number);
                inviteToPlay();
            }
        }
    }
    public static void inviteToPlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите сыграть еще раз? Выберете 1, если да или 0, если нет");
        int choice = scan.nextInt();
        if (choice == 1) {
            int newcount = 3;
            Random random = new Random();
            int newnumber = random.nextInt(10);
            newGame(newcount, newnumber);
        } else {
            System.out.println("Спасибо за игру!");
        }
    }
}


