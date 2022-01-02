package src.com.example.string;

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        String str = "8F3Z-2e-9-wabcdef";
        int k = 4;
        System.out.println(solve(str, k));

    }

    public static String solve(String s, int k){
        // 1. -del, 대문자
        String newStr = s.replace("-", "").toUpperCase();

        // 2. k개로 파싱, - 넣기
        StringBuilder sb = new StringBuilder(newStr);
        System.out.println("3 : " + newStr);

        int len = sb.length();
        for(int i=k; i<len; i=i+k){
            sb.insert(len-i, '-');
            System.out.println(sb);
        }
        return sb.toString();
    }
}
