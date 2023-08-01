package interviewQuestion.coding;

public class StringReverse {
    public static void main(String[] args) {


        //reverse a given string
        String str= "null";
        char[] chars= str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        if (!str.isEmpty()){
            for (int i=chars.length-1;i>=0;i--){
                stringBuilder.append(chars[i]);
                System.out.println(stringBuilder);
            }
        }else {
            throw new NullPointerException("string must not be null!!");
        }

        System.out.println("after perform operation- "+ stringBuilder);
    }
}
