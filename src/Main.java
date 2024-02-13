import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = getEmployees();
        ArrayList<Integer> numbers = getNumbers();
        ArrayList<String> data = new ArrayList<>();

        for (int i = 0; i < names.size(); i++){
            data.add(i, numbers.get(i)+" - "+ names.get(i));
        }
        for(String dat : data){
            System.out.println(dat);
        }
    }
    public static ArrayList<String> getEmployees(){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Nick");
        employees.add("Sean");
        return employees;
    }
    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}

