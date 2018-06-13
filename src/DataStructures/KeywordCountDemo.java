package DataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class KeywordCountDemo {

    public static void main(String[] args) {

        countKeyWord();

    }

    public static void countKeyWord(){

        final String filName = "/Users/ghaiyurghairet/IdeaProjects/JimmyTestProject/src/DataStructures/ListDemo.java";
        List<String> contentList = ReadFile(filName);
        for (String str: contentList){

            System.out.println(str);
        }

    }

    private static List<String> ReadFile(String fileName){

        List<String> contentList = new ArrayList<>();

        try (
            FileReader freader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(freader);)
        {

            String line = null;
            while((line = reader.readLine())!= null){

                contentList.add(line.trim());

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return contentList;

    }
}
