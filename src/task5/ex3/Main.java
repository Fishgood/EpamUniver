package task5.ex3;

import task2.ex1.view.BooksView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static String inputStringValue(){
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

        Translator translator = new Translator(dataSet());
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Enter string. Enter '.' to exit");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.toLowerCase().equals("."));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());*/

        //Pattern p = Pattern.compile("^[A-Za-z]{1}([a-z]{0,16})?$");
        //Matcher m = p.matcher();


        String str = inputStringValue();

        System.out.println(translator.translateString(str));




    }
}
