public class FizzBuzz {
    public FizzBuzz(){
    }
    public void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 2 == 0) {
                System.out.println("2");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
