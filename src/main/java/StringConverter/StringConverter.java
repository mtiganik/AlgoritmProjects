package main.java.StringConverter;

public class StringConverter {

    public StringConverter(){}

    public String convertString(String input){
        input = input.replace("'","");
        input = input.replace(",","");
        input = input.replace(",","");
        input = input.replace(".","");

        return input;
    }

    public static void main(String[] args) {
        String input = "Let's try, Mike.";
        StringConverter s = new StringConverter();
        System.out.println(s.convertString(input));

    }
}
