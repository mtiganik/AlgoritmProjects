package main.java.FileParser;

import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class ContentParser {
    private String content;
    private String path;
    private HashMap<Character,Integer> charMap= new HashMap();

    public void setPath(String path){
        this.path = path;
    }

    public void setContentToHashMap(){

        for(Character ch : content.toCharArray()){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch) +1);
            }else{
                charMap.put(ch,1);
            }
        }

        // sort elements in decreasing order
        charMap = charMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .collect(
                        toMap(e -> e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));
    }

    public void printHashMap(){
        for(Character key:charMap.keySet()){
            System.out.println(key+ " " +charMap.get(key));
        }
    }

    public void update() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(this.path));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            this.content = stringBuilder.toString();
        } finally {
            reader.close();
        }
    }


    public String getContent(){
        return content;
    }


}
