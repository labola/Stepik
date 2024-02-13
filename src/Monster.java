public class Monster {
    int eyes;
    int hand;
    int leg;

    Monster(){
        eyes = 2;
        hand = 2;
        leg = 2;
    }
    Monster(int count){
        eyes = count;
        hand = count;
        leg = count;
    }
    Monster (int eyes, int hand, int leg){
        this.eyes = eyes;
        this.hand = hand;
        this.leg = leg;

    }
    void voice(){
        System.out.println("Grrrrrrrrrrrr....");
    }
    void voice(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("Grrrrrrrrrrrr....");
        }
    }
    void voice(int count, String voice){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }
}
