 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int lrgNum = integers[0];
        for (int i = 1; i <integers.length; i++){
            if (integers[i] > lrgNum) {
                lrgNum = integers[i];
            }
        }
        return lrgNum;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int lrgNum = integers[0];
        for (int i = 1; i <integers.length; i++){
            if (integers[i] > lrgNum) {
                lrgNum = Math.max(lrgNum, integers[i]);
            }
        }
        return lrgNum;
    }
}
