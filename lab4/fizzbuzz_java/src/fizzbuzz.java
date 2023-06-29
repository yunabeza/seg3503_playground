public class fizzbuzz{
    final int nbr = 100;
    String sequence = "";

    // generates the fizzbuzz sequence from 1 to 100
    public String generator() {
        for (int i = 1; i <= nbr; i++) {
            sequence += FizzBuzzOrNum(i) + " ";
        }
        return sequence;
    }

    //generates the fizzbuzz sequence from n to m
    public String generator(int n, int m) {
        for (int i = n; i <= m; i++) {
            sequence += FizzBuzzOrNum(i) + " ";
        }
        return sequence;
    }

    //detects is the number is fizz, buzz, fizzbuzz, or none of those
    public String FizzBuzzOrNum(int n){
         if ((n % 3) == 0 && (n % 5) == 0) {
                return "FizzBuzz";
            } else if ((n % 3) == 0) {
                return"Fizz";
            } else if ((n % 5) == 0) {
                return "Buzz";
            } else {
                return Integer.toString(n);
            }
    }

}

    
