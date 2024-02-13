public class ToDo {
    public static void main(String[] args) {
        int temp = 22;
        int time = 25;
        boolean isWheather = temp > 18;
        boolean isNight = time > 23 || time < 6;
        if(isWheather && !isNight)
        {
            System.out.println("Гулять");
        }
        if(!isWheather && !isNight){
            System.out.println("Читать книгу");
        }
        if (isNight){
            System.out.println("Спать");
        }
    }
}
