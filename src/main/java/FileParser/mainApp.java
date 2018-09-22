package main.java.FileParser;

import java.io.IOException;

public class mainApp {
    public static void main(String[] args) {
        String FilePath = "document.txt";
        ContentParser parser = new ContentParser();
        parser.setPath(FilePath);
        try{
            parser.update();
        }catch (IOException e){
            throw new RuntimeException("File not found", e);
        }
        parser.setContentToHashMap();
        parser.printHashMap();
    }
}
