package main.java.R1;

// Author: Mihkel Tiganik
// Date created: 20-09.2018
// Description:
// Write a short Java function, isOdd, that takes an int i and returns true if and
// only if i is odd. Your function cannot use the multiplication, modulus, or
// division operators, however.
//
// Exercise taken from book
// Data Structures and Algorithms in Java, Michael T. Goodrich,  Roberto Tamassia
// Exercise R-1.9 from page 85
//

public class DataManipulator {
    public DataManipulator(){};

    public boolean isOdd(Integer i){
        if(i == null){
            throw new IllegalArgumentException("Value cannot be null");
        }
        if(i >= 2) {
            do {
                i = i - 2;
            } while (i >= 2);
        }else if(i < 0){
            do{
                i = i +2;
            }while(i < 0);
        }
        if(i == 0){
            return true;
        }else return false;
    }
}
