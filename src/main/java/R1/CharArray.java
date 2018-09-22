package main.java.R1;

public class CharArray {
    private char[] arr;
    private int arrLength;

    public CharArray(char[] arr){
        this.arr = arr;
        this.arrLength = arr.length;
    }

    private void swap(int firstIndex, int secondIndex){
        char temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public void printAllPermutations(){

        int counter = 0;
        for(int i2 = 0; i2 < 4; i2++){

            for (int i1 = 0; i1 < 3; i1++) {
                for (int i0 = 0; i0 < 1; i0++) {
                    System.out.println(arr);
                    counter++;
                    swap(0, 1);
                    System.out.println(arr);
                    counter++;
                }
                swap(1, 2);
            }
            swap(2,3);
        }

        System.out.println(counter + " conversions");

    }

    @Override
    public String toString(){
        return new String(arr);
    }
}
