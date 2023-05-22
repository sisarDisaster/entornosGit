public class Gachamiga {
    public String cocinar(int n){
        if(n%3==0){
            return "Gacha";
        }else if(n%5==0){
            return "Miga";
        }else
        return "" +n;
    }

}
