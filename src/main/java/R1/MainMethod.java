package main.java.R1;

// Author: Mihkel Tiganik
// Date created: 20-09.2018
// Description:
// Write a short Java program that outputs all possible strings formed by using the
// characters 'c', 'a', 'r', ' b', ' o', and 'n' exactly once.
//
// Exercise taken from book
// Data Structures and Algorithms in Java, Michael T. Goodrich,  Roberto Tamassia
// Exercise C-1.4 from page 86
//

public class MainMethod {
    public static void main(String[] args) {

        // lets try with 4 chars
        char[] a = {'a','b','c','d'};

        CharArray charArr = new CharArray(a);

        charArr.printAllPermutations();

        int index = Integer.MAX_VALUE;
        String[] shoppingList = {"hi", "im", "Mihkel"};
        try{
            String toBuy = shoppingList[index];

        }catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
            //System.out.println("Index was out of bounds");
        }

        System.out.println("Things go on");



    }




}
