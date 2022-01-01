package src.com.example.string;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Address {

    public static void main(String[] args) {
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com" };

        System.out.println();
        System.out.println(solve1(emails));
    }

    // 1. Basic
    public static int solve1(String[] emails){
        // 1. ds
        // "test.email+james@coding.com",
        Set<String> set = new HashSet<>(); // 증복 x

        // for while = charAt()
        for(String email : emails){
            String localName = makeLocalName(email);
            String dName = makeDname(email);

            set.add(localName + "@" + dName);
        }
        return set.size();
    }

    private static String makeLocalName(String email){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='.'){
                continue;
            }
            if(email.charAt(i)=='+' || email.charAt(i)=='@'){
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }
    private static String makeDname(String email){
        return email.substring(email.indexOf("@")+1);
    }


    //2 substring
    public static int solve2_SubString(String[] emails){
        int result = 0;
        Set<String> set = new HashSet<>();
        for(int i=0; i<emails.length; i++){
            String localName = "";
            String domainName = "";
            localName = emails[i].substring(0, emails[i].indexOf("+")).replace(".", "");
            domainName = emails[i].substring(emails[i].indexOf("@"));
            set.add(localName + domainName);

        }
        result = set.size();
        return result;
    }


    // 3. split
    public static int solve3_Split(String[] emails){

        // 1. ds
        Set<String> set = new HashSet<>();

        // 2. for, while
        for(String email : emails){
            // "test.email+james@coding.com",
            String[] parts = email.split("@");  // @ 를 중심으로 앞뒤로 나눈다.
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".", "")+"@"+parts[1]);
        }
        return set.size();
    }

}


