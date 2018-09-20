package main.java.R1;

// Author: Mihkel Tiganik
// Date created: 20-09.2018
// Description:
// Write a short Java function, isMultiple, that takes two long values, n and
// m, and returns true if and only if n is a multiple of m, that is, n = mi for some
// integer i.
//
// Exercise taken from book
// Data Structures and Algorithms in Java, Michael T. Goodrich,  Roberto Tamassia
// Exercise R-1.8 from page 85
//
public class LongHolder {

    public LongHolder(){}

    public boolean isMultiple(Long n, Long m){
        if(n == null || m == null || m == 0){
            throw new IllegalArgumentException();
        }
        if(n % m == 0){
            return true;
        }else return false;
    }


}
