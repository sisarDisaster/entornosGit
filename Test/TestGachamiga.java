import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiga {

    Gachamiga g = new Gachamiga();
    String result;

    @Test
    public void testFor1(){
         result= g.hacerGachamiga(1);
        Assertions.assertEquals("1",result);
    }

    @Test
    public void  testFor2(){
        result= g.hacerGachamiga(2);
        Assertions.assertEquals("2",result);
    }

    @Test
    public void testFor3(){
        result= g.hacerGachamiga(3);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor4(){
        result= g.hacerGachamiga(4);
        Assertions.assertEquals("4",result);
    }
    @Test
    public void testFor5(){
        result= g.hacerGachamiga(5);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void testFor6(){
        result= g.hacerGachamiga(6);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor7(){
        result= g.hacerGachamiga(7);
        Assertions.assertEquals("7",result);
    }
    @Test
    public void testFor8(){
        result= g.hacerGachamiga(8);
        Assertions.assertEquals("8",result);
    }
    @Test
    public void testFor9(){
        result= g.hacerGachamiga(9);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor10(){
        result= g.hacerGachamiga(10);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void testFor11(){
        result= g.hacerGachamiga(11);
        Assertions.assertEquals("11",result);
    }
    @Test
    public void testFor12(){
        result= g.hacerGachamiga(12);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void testFor13(){
        result= g.hacerGachamiga(13);
        Assertions.assertEquals("13",result);
    }
    @Test
    public void testFor14(){
        result= g.hacerGachamiga(14);
        Assertions.assertEquals("14",result);
    }
    @Test
    public void testFor15(){
        result= g.hacerGachamiga(15);
        Assertions.assertEquals("Gachamiga",result);
    }
    @Test
    public void testFor30(){
        result= g.hacerGachamiga(30);
        Assertions.assertEquals("Gachamiga",result);
    }
}
