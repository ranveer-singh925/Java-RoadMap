package interviewQuestion.coding;

public class FindLengthOfString {
    public static void main(String[] args) throws Exception {
        String str = "nulll";
        char[] chars = str.toCharArray();
        int size = 0;
        if (!str.isEmpty()) {
            for (char i : chars) size++;
        } else {
            throw new Exception("Given string must not be null");
        }
        System.out.println(size);
    }
}
