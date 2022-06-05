// abstract class only give access to those classes that are inherited from it.

abstract class rectangle{
    int l ;
    int b;
    void area(int l,int b){
        int a = l*b;
        System.out.println("area is "+a);
    }
    public abstract void perimeter();

}
 class square extends rectangle{
    public void perimeter(){//square is not abstract and does not override abstract method perimeter() in rectangle
        l = 4;
        b =5;
        int p = 2*(l+b);
        System.out.println("perimeter is "+p);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        //rectangle rt = new rectangle(); //can not be used as this abstraction class isnot inherited from abstract class
        System.out.println("Buddhi Sagar Poudel 019-309");
        square sq = new square();
        sq.area(10, 4);
        sq.perimeter();

    }
}