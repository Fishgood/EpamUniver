package task5.ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translator {
    private HashMap<String, String> dictionary;

    Translator(){}

    Translator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    boolean addWord(String englishWord, String russianWord) {
        Pattern englishWordCheck = Pattern.compile("^[A-Za-z]{1}[a-z]{1,15}$");
        Pattern russianWordCheck = Pattern.compile("^[А-Яа-я]{1}[а-я]{1,14}$");
        Matcher englishM = englishWordCheck.matcher(englishWord);
        Matcher russianM = russianWordCheck.matcher(russianWord);

        if (englishM.matches() && russianM.matches() &&
                !isInDictionary(englishWord) && !dictionary.containsValue(russianWord)) {
            dictionary.put(englishWord, russianWord);
            return true;
        } else return false;
    }

    private boolean isInDictionary(String word){
        return dictionary.containsKey(word);
    }

    private String translateWord(String word){
        return isInDictionary(word) ? dictionary.get(word) : word;
    }

    String translateString(String sentence) {
        StringBuilder sb = new StringBuilder();

        String[] splitedStrings = sentence.trim().split(" ");

        Arrays.stream(splitedStrings).forEach(s ->
                    sb.append(translateWord(s)).append(" ")
        );

        return sb.toString();














        //StringReader sr = new StringReader(word);




        /*Stream<String> s = Stream.<String>builder().add(word.).build();

        s.
        hashMap.forEach((k,v) -> );
        s.forEach(s, dictionary.forEach((k, v) -> {s.map()}));
        s.findAny()*/

        //int occurenes = 0;
        /*Pattern englishWordCheck = Pattern.compile("^[A-Za-z]{1}[a-z]{1,15}$");
        Matcher englishM = englishWordCheck.matcher(word);*/

        //dictionary.forEach((key, value) -> res = word.replace(key,value));
        //String res = "";

        
        /*while (dictionary.keySet().iterator().hasNext()) {
            res = word.replace(dictionary.keySet().iterator().next(), dictionary.values().iterator().next());
        }*/



        /*dictionary.forEach((key, value) ->);
        dictionary.forEach((key, value) -> {

            if ((word.length() - word.replace(key, "").length()) == (word.length() - key.length())) {
                sb.replace(sb.indexOf(key), sb.lastIndexOf(key), value);
            } else {
                while (sb.)
            }

            (word.length() - word.replace(key, "").length()) == (word.length() - key.length()) ?
                     :


        });*/

        /*if (englishM.matches() && dictionary.containsKey(word)){
            return dictionary.get(word);
        }*/

    }
}
