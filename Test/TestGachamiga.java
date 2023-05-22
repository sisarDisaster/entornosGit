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
    @Test
    public void testFor8(){
        result= g.cocinar(8);
        Assertions.assertEquals("8",result);
    }
    @Test
    public void testFor9(){
        result= g.cocinar(9);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor10(){
        result= g.cocinar(10);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void testFor11(){
        result= g.cocinar(11);
        Assertions.assertEquals("11",result);
    }
    @Test
    public void testFor12(){
        result= g.cocinar(12);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor13(){
        result= g.cocinar(13);
        Assertions.assertEquals("13",result);
    }
    @Test
    public void testFor14(){
        result= g.cocinar(14);
        Assertions.assertEquals("14",result);
    }
    @Test
    public void testFor15(){
        result= g.cocinar(15);
        Assertions.assertEquals("Gachamiga",result);
    }
}
