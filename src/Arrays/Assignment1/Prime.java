package Arrays.Assignment1;


    import java.util.Scanner;

    public class Prime{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= n / i; i++) {

                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

            sc.close();
        }
    }

