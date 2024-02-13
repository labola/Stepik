public class Wallet {
    public static void main(String[] args) {
        int money = 5;
        if(money > 10){
            System.out.println("Pizza");
        } else if (money >= 6 && money <= 10) {
            System.out.println("Hamburger");
        } else if (money < 6) {
            System.out.println("Sandwich");
        }
    }
}
