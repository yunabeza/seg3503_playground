public class fizzbuzz{
    final int nbr = 100;
    String sequence = "";
    public String generator() {
        for (int i = 1; i <= nbr; i++) {
            sequence += FizzBuzzOrNum(i) + ", ";
        }
        return sequence;
    }

    public String generator(int n, int m) {
        for (int i = n; i <= m; i++) {
            sequence += FizzBuzzOrNum(i) + ", ";
        }
        return sequence;
    }

    public String FizzBuzzOrNum(int n){
         if (isMultipleOf3(n) && isMultipleOf5(n)) {
                return "FizzBuzz";
            } else if (isMultipleOf3(n)) {
                return"Fizz";
            } else if (isMultipleOf5(n)) {
                return "Buzz";
            } else {
                return Integer.toString(n);
            }
    }

    public boolean isMultipleOf3(int n) {
        return (n % 3) == 0;
    }

    public boolean isMultipleOf5(int n) {
       return (n % 5) == 0;
    }
}

    
