package task5.ex3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, String> dataSet(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("and", "и");
        hashMap.put("watch","посмотреть");
        hashMap.put("truth","правда");
        hashMap.put("main","главный");
        hashMap.put("country","страна");
        hashMap.put("light","свет");
        hashMap.put("wait","ждать");
        hashMap.put("mother","мать");
        hashMap.put("never","никогда");
        hashMap.put("comrade","товарищ");
        hashMap.put("road","дорога");
        hashMap.put("however","однако");
        hashMap.put("lie","лежать");
        hashMap.put("window","окно");
        hashMap.put("I","я");
        hashMap.put("was","был");
        hashMap.put("none","никакой");
        hashMap.put("find","найти");
        hashMap.put("write","писать");
        hashMap.put("room","комната");
        hashMap.put("part","часть");

        return hashMap;
    }

    private static String inputStringValue(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNext()){
                sc.nextLine();
                return sc.nextLine();
            }
            System.out.println("bad input");
        }
    }

    public static void main(String... args) throws IOException {

        Translator translator = new Translator();
        translator.setDictionary(dataSet());

        translator.addWord("count", "подсчитывать");

        String str = inputStringValue();
        //System.out.println("start");

        System.out.println(translator.translateString(str));




    }
}
