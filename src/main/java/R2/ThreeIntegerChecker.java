package main.java.R2;

public class ThreeIntegerChecker {
    private Integer a,b,c;
    private boolean additionCheck, multiplicationCheck;

    public ThreeIntegerChecker(Integer a, Integer b, Integer c){
        this(a,b,c,true);
    }
    public ThreeIntegerChecker(Integer a, Integer b, Integer c, boolean additionCheck){
        this(a,b,c,additionCheck,true);
    }
    public ThreeIntegerChecker(Integer a, Integer b, Integer c, boolean additionCheck, boolean multiplicationCheck){
        this.a = a;
        this.b = b;
        this.c = c;
        this.additionCheck = additionCheck;
        this.multiplicationCheck = multiplicationCheck;
    }


    public boolean checkFormula(){
        if(a == null || b == null || c == null){
            throw new NullPointerException("Values cannot be null");
        }

        if(additionCheck && checkAddition()){
            return true;
        }
        if(multiplicationCheck && checkMultiplication()){
            return true;
        }

        return false;
    }

    private boolean checkAddition(){
        if(a + b == c || a + c == b || b + c == a){
            return true;
        }else return false;
    }

    private boolean checkMultiplication(){
        if(a*b==c || a*c == b || b*c == a){
            return true;
        }else{
            return false;
        }
    }

}
