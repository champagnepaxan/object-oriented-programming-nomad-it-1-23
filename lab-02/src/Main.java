import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(4,10);
        arrayList.add(0);

        //Implement custom sort
        //Implement custom insert at specific index V

        System.out.println(arrayList.toString());



    }
}
