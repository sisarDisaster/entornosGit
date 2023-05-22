public class Gachamiga {
    String resultado;
    public String hacerGachamiga(int n){
        if(n%3==0 && n%5==0){
            resultado= "Gachamiga";
        }else if(n%3==0){
            resultado= "Gacha";
        }else if(n%5==0){
            resultado= "Miga";
        }else{
        resultado= "" +n;
        }

        return resultado;
    }


}
