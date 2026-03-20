import java.util.Arrays;

public class CustomArrayList implements Comparable<CustomArrayList> {
    private int[] arr;
    private int index;
    private int size;

    public CustomArrayList() {
        arr = new int[10];
        index = 0;
        size = 4;
    }
    public void add(Integer value){
        if(index >= arr.length){
            arr = getNewArray();
        }

        arr[index] = value;
        index++;

    }

    public void add(int index, int value) {
        if (this.index <= index || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        arr[index] = value;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.stream(arr).takeWhile( x -> x!= 0).toArray());
    }

    public Integer get(int index){
        return arr[index];
    }

    private int[] getNewArray(){
        int[] newArr = new int[size * 2];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];

        }
       return  newArr;
    }

    @Override
    public int compareTo(CustomArrayList o) {
        return o.get(index).compareTo(index);
    }
}
