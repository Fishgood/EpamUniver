package task5.ex1.controller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionCheck {

    private ArrayList<Pattern> patterns;

    public RegularExpressionCheck() {
        this.patterns = new ArrayList<>();
        patterns.add(Pattern.compile("^[A-Z]{1}[a-z]{1,14}( )?$"));
        patterns.add(Pattern.compile("^[A-Z]{1}[a-z]{1,42}( )?$"));
        patterns.add(Pattern.compile("^[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}$"));
        patterns.add(Pattern.compile("^\\+380\\d{3}\\d{2}\\d{2}\\d{2}$"));
        patterns.add(Pattern
                .compile("^[A-Z]{1}[a-z]{2,18}, [0-9]{1,3}, [0-9]{1,3}$"));
    }

    public boolean checkAll(String param, int paramIndex){

        Matcher m = patterns.get(paramIndex).matcher(param);
        return m.matches();

    }
}
