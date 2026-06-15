public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;
        int originalNum = num;
        int sum = 0;

        while(num > 0) {

            int digit = num % 10;
            sum = sum + (digit * digit * digit);

            num = num / 10;
        }

        if(sum == originalNum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
