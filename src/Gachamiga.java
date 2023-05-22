public class Gachamiga {
    public String hacerGachamiga(int n){
        if(n%3==0 && n%5==0){
            return "Gachamiga";
        }else if(n%3==0){
            return "Gacha";
        }else if(n%5==0){
            return "Miga";
        }else
        return "" +n;
    }

}
