package Lab2_14_2;

/**
 * Created by Alex on 14.03.2016.
 */
public class MyTestMethod {

    public static <T extends Comparable> int calcNum (T[] array, T element ){
        int counter = 0;
        for (T arrayElement: array){
            if (arrayElement.compareTo(element)>0){
                counter++;
            }
        }
        return counter;
    }
}
