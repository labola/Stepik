public class Box {
    double length;
    double weight;
    double height;

    Box(){
     this(10);
    }
    Box(Box another){
        this(another.length, another.weight, another.height);
    }
    Box(double length, double weight, double height){
        this.length = length;
        this.weight = weight;
        this.height = height;
    }
    Box(double size){
        this(size, size, size);
    }

    Box increase(Box box){
        return new Box(length*2, weight*2, height*2);
    }

    void showInfo(){
        System.out.println(length*weight*height);
    }
}
