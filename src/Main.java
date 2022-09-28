import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Hello World!");
        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Aleks");
        Friend falseFriend = new Friend("malsdm", false);
        System.out.println("aFriend has " + aFriend.getHp() + " in health");
        System.out.println("how much damage?");
        int damage = myscanner.nextInt();

        aFriend.hit(damage);
        System.out.println("aFriend has " + aFriend.getHp() + " in health");

        System.out.println(aFriend);
        aFriend.hit(damage);

    }

}

