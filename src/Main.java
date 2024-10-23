import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello world!");

        //Object (class name = new class())
        Player thePlayer = new Player();
        Foe theFoe = new Foe();

        while (theFoe.hp > 0) {
            System.out.println(thePlayer.name + " has " + thePlayer.hp + " hp");
            System.out.println(theFoe.name + " has " + theFoe.hp + " hp and size " + theFoe.size);

            System.out.println("Player attacks!");
            theFoe.hp -= 10;
            System.out.println(theFoe.name + " now has " + theFoe.hp + " hp");
            System.out.println("Press any key to continue");
            keyboard.nextLine();
        }
        System.out.println("The foe is dead");
    }
}