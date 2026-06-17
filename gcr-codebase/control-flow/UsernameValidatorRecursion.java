public class UsernameValidatorRecursion {
    static boolean isValid(String s, int index) {
        if (index == s.length()) {
            return true;
        }

        char ch = s.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(s, index + 1);
    }

    public static void main(String[] args) {
        String username = "abcdxyz";

        System.out.println(isValid(username, 0));
    }
    
}
