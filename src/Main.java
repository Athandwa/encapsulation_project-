import java.util.*;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Lucky";
        player.health = 20;
        player.weapon = "Gun";

//        creating a first damage for the player
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining lives for the player = " + player.healthRemaining());

//        second damage for the player
        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining lives for the player = " + player.healthRemaining());
    }
}
