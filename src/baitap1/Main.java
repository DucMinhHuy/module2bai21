package baitap1;

public class Main {
    public static void main(String[] args) {
        Gun gun=new Gun();
        System.out.println("start");
        gun.fireInPool();
        System.out.println("game over");
        System.out.println("tocal bullet created :"+Bullet.count);
    }
}
