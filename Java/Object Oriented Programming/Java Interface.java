class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = 0;
        int square = (int) Math.sqrt(n);
        
        for(int i = 1; i <= square; i++) {
            if(n % i == 0) {
                sum += (i + (n / i));
            }
        }
        
        if(square * square == n) {
            sum -= square;
        }
        return sum;
    }
}