 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return (angle %= 360) >= 0 ? angle : (angle + 360);
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return null;
    }

    public static void main(String[] args){

    }
}
