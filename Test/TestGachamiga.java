import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiga {

    Gachamiga g = new Gachamiga(); //creo un objeto gachamiga para poder usar su función multiplos.
    String result;

    @Test
    public void testFor1(){
         result= g.cocinar(1);
        Assertions.assertEquals("1",result);
    }

    @Test
    public void  testFor2(){
        result= g.cocinar(2);
        Assertions.assertEquals("2",result);
    }

}
