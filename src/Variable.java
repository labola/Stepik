public class Variable {
    public static void main(String[] args) {
        int days = 10000;
        int year = days / 365;
        int months = (days % 365) / 30;
        int d = ((days % 365) % 30);
        System.out.println("Years: "+year +" Months: "+ months + " Days: " +d);
    }
}
