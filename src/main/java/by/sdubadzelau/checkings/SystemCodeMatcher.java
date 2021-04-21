package by.sdubadzelau.checkings;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemCodeMatcher {





    int r;
    SystemCodeMatcher () {
        r = 5;

    }

    public static void main(String[] args) {
        Pattern SYSTEM_CODE_PATTERN = Pattern.compile(".*/(([a-fA-F0-9]{4})/[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12})$");
        String internalUrl = "/listings/0000/2bc35da9-1dce-418b-8015-f48c759ee87a";
        Matcher matcher = SYSTEM_CODE_PATTERN.matcher(internalUrl);

        if(matcher.matches()){
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(2));
        }
    }
}
