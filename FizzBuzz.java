public class FizzBuzz {
    public static String fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 2 == 0) {
                System.out.println("2");
            }
            else {
                System.out.println(i);
            }
        }
        String done = "Completed FizzBuzz";
        return done;
    }
    public static void main(String[] args) {
        fizzBuzz(150);
    }
}
