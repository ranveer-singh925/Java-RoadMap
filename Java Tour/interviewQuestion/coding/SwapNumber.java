package interviewQuestion.coding;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int sum = 0;
        sum = a + b;
        b = sum - b;
        a = sum - b;
        System.out.println(a + " - " + b);
    }
}
