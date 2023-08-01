package interviewQuestion.coding;

public class VowelCheck {
    public static void main(String[] args) {
        String str = "nnnnnnnnn";
        char[] chars = str.toCharArray();
        boolean flag= false;
        if (!str.isEmpty()) {
            for (char i : chars) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                    flag=true;
                    break;
                }
            }
            if (flag){
                System.out.println("Vowel is present in the given string");
            }else {
                System.out.println("Vowel is not present in the given string");
            }
        } else {
            throw new NullPointerException("String must not be null");
        }
    }
}
