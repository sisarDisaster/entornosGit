import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiga {

    Gachamiga g = new Gachamiga();
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

    @Test
    public void testFor3(){
        result= g.cocinar(3);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor4(){
        result= g.cocinar(4);
        Assertions.assertEquals("4",result);
    }
    @Test
    public void testFor5(){
        result= g.cocinar(5);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void testFor6(){
        result= g.cocinar(6);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor7(){
        result= g.cocinar(7);
        Assertions.assertEquals("7",result);
    }

}
