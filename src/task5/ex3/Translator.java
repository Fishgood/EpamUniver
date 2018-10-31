package task5.ex3;

import java.io.StringReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translator {
    private HashMap<String, String> hashMap;

    public Translator(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    public boolean addWord(String englishWord, String russianWord) {
        Pattern englishWordCheck = Pattern.compile("^[A-Za-z]{1}[a-z]{1,15}$");
        Pattern russianWordCheck = Pattern.compile("^[А-Яа-я]{1}[а-я]{1,14}$");
        Matcher englishM = englishWordCheck.matcher(englishWord);
        Matcher russianM = russianWordCheck.matcher(russianWord);

        if (englishM.matches() && russianM.matches() &&
                !hashMap.containsKey(englishWord) && !hashMap.containsValue(russianWord)) {
            hashMap.put(englishWord, russianWord);
            return true;
        } else return false;
    }

    public String translateString(String word) {
        StringBuilder sb = new StringBuilder(word);
        StringReader sr = new StringReader(word);

        int occurenes = 0;
        /*Pattern englishWordCheck = Pattern.compile("^[A-Za-z]{1}[a-z]{1,15}$");
        Matcher englishM = englishWordCheck.matcher(word);*/

        //hashMap.forEach((key, value) -> res = word.replace(key,value));
        String res = "";


        while (hashMap.keySet().iterator().hasNext()) {
            res = word.replace(hashMap.keySet().iterator().next(), hashMap.values().iterator().next());
        }

        /*hashMap.forEach((key, value) ->);
        hashMap.forEach((key, value) -> {

            if ((word.length() - word.replace(key, "").length()) == (word.length() - key.length())) {
                sb.replace(sb.indexOf(key), sb.lastIndexOf(key), value);
            } else {
                while (sb.)
            }

            (word.length() - word.replace(key, "").length()) == (word.length() - key.length()) ?
                     :


        });*/

        /*if (englishM.matches() && hashMap.containsKey(word)){
            return hashMap.get(word);
        }*/
        return res;
    }
}
