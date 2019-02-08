 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= value; i++) 
        ans = ans.multiply(BigInteger.valueOf(i));
       
    return ans;
}

}
