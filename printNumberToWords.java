package assignmentEdyoda2;
import java.util.Scanner;

public class printNumberToWords {

    private static final String[] ones = {null, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {null, null, "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String printNumberToWords(int n) {
        if (n < 10) {
            return ones[n];
        }
        else if (n < 20) {
            return teens[n % 10];
        }
        else if(n<100){
            return tens[n / 10] +((n % 10 > 0) ? " " +printNumberToWords(n % 10) : "");
        }
        else if(n<1000){
        return ones[n / 100] +" Hundred"+((n % 100 > 0) ? " " +printNumberToWords(n % 100) : "");
        }

        return printNumberToWords(n / 1000)+" Thousand"+((n % 1000 > 0) ? " " +printNumberToWords(n % 1000) : "");

}
        public static void main(String[] args) {

            int num;
            do {
                Scanner n = new Scanner(System.in);
                System.out.println("enter a number : ");
                num = n.nextInt();
                if (num >=1 && num<=100000) {
                    System.out.println(printNumberToWords(num));
                }
                else{
                    System.out.println("entered number is out of range ");
                }

            } while (num <= 0 || num > 100000);

    }
}
