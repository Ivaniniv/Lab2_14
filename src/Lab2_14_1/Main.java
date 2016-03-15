package Lab2_14_1;

/**
 * Created by Alex on 14.03.2016.
 */
public class Main {
    public static void main (String[] args){
        MyTup <String, Integer, Long> tuple1 = new MyTup<>("message", 4, 21L);
        MyTup <Double, String, String> tuple2 = new MyTup<>(5.0, "message1", "message2");


        System.out.print(tuple1.getA() + " ");
        System.out.print(tuple1.getB() + " ");
        System.out.print(tuple1.getC()+ " ");

        System.out.print("\n" + tuple2.getA() + " ");
        System.out.print(tuple2.getB() + " ");
        System.out.print(tuple2.getC()+ " ");
    }
}
