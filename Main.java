package academy.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RWOnly rw=new RWOnly();

       // System.out.println(rw.x);  //x has private access in academy.javaprogramming.RWOnly

        rw.setX(5);
        System.out.println(rw.getX());


    }
}
