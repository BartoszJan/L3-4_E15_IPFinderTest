package com.mojafirma;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpFinder {

    private Pattern IpPattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");

    public boolean hasIp(String text){
        Matcher ipMatcher = IpPattern.matcher(text);
      return ipMatcher.find();
    }

    public String getIp(String text){
        Matcher ipMatcher = IpPattern.matcher(text);
        if (ipMatcher.find())
            return ipMatcher.group();
        else
            return  null;
    }
}
