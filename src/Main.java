public class Main {
    public static void main(String[] args) {

        String s = "itopinonavevanonipoti";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        boolean palindrome = false;
        String s2 = "";

        s2 = inverti(s, s.length());

        if(s.equals(s2))
            palindrome = true;

        return palindrome;
    }

    public static String inverti(String s, int lenght){
        String st = "";

        if(lenght==0)
            return "";
        st += s.charAt(lenght-1) + inverti(s, lenght-1);

        return st;
    }
}