package case_study.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validate {
    private static final String PATTERN_ID = "^(NV)-[0-9]{4}$";
    private static final String PATTERN_CUSTOMER = "^(KH)-[0-9]{4}$";
    private static final String PATTERN_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String PATTERN_DAY = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
    private static final String PATTERN_CITIZEN="[0-9]{9,12}";
    private static final String PATTERN_PHONE="0[0-9]{9}";

    public static boolean regexId(String id){
        return Pattern.matches(PATTERN_ID,id);
    }
    public static boolean regexCustomerId(String id){
        return Pattern.matches(PATTERN_CUSTOMER,id);
    }
    public static boolean regexName(String name){
        return Pattern.matches(PATTERN_NAME,name);
    }
    public static boolean regexDay(String dayOfBirth){
        return Pattern.matches(PATTERN_DAY,dayOfBirth);
    }
    public static int regexAge(LocalDate day){
        LocalDate current = LocalDate.now();
        if(day!=null){
            return Period.between(day,current).getYears();
        }
        return -1;
    }
    public static boolean regexCitizen(String citizen){
        return Pattern.matches(PATTERN_CITIZEN,citizen);
    }
    public static boolean regexPhone(String phoneNumber){
        return Pattern.matches(PATTERN_PHONE,phoneNumber);
    }
}
