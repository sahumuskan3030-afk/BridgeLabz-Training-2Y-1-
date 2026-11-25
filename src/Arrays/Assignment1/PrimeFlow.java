package Arrays.Assignment1;


    import java.util.Scanner;

    public class PrimeFlow {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println("Not Prime");
            } else {

                int i = 2;
                boolean isPrime = true;

                while (i <= n / i) {

                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }

                    i++;
                }

                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }

            sc.close();
        }

}
