
public class AsalSayilar {
    public static void main(String[] args) {

                int number = 100;

                for (int num = 2; num <= number; num++) {
                    boolean isPrime = true;

                    // Asal sayı olup olmadığının kontrolü
                    for (int divider = 2; divider < num; divider++) {
                        if (num % divider == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        System.out.print(num + " ");
                    }
                }
            }
        }
