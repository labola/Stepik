public class MyArrayList {
    private String[] array = new String[10];
    private int size =0;

    public void add(String element){
        array[size] = element;
        size++;
        if(size==array.length){
            String[] newArray = new String[array.length*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }
    public String get(int index){
        return array[index];
    }
    public int getSize(){
        return size;
    }

    public void remove(int index){
        for (int i = index; i < array.length - 1; i++) {
            array[i]=array[i+1];
        }
        size--;
    }

    public void remove(String element){
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                remove(i);
                return;
            }
        }
    }
}
