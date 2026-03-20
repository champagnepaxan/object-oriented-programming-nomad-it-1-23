import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        int[]arr = new int[10];
        int[]arr2 = new int[10*2];

        for (int i=0 ; i< arr.length; i++){
            arr2[i] = arr[i];
        }
        // [1,2,3,4,5,6,7,8,9,0]
        // [1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0]

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<11; i++){
            list.add(2);
        }
        list.add(5,8);
        list.add(15,10);

        list.sort(Integer::compare);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
