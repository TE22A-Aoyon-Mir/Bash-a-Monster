public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Object (class name = new class())
        Player thePlayer = new Player();
        Foe theFoe = new Foe();

        System.out.println(thePlayer.name + " has " + thePlayer.hp + " hp");
        System.out.println(theFoe.name + " has " + theFoe.hp + " hp");

        System.out.println("Player attacks!");
        theFoe.hp -= 10;
        System.out.println(theFoe.name + " has " + theFoe.hp + " hp");
    }
}