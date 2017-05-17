package test.java;



import org.junit.Test;

//import main.java.TestNewSelenium;
public class JunitTest {

	private int i;
    private int j;
    @Test
    public void equal() throws Exception{
        i=2;
        j=2;
        System.out.println(i==j);
    }
    @Test
    public void chufa() throws Exception{
        i=3;
        j=1;
        int z=i/j;
        System.out.println(z);
    }
//    @Test
//    public void PlayBack() throws Exception{
//    	TestNewSelenium test = new TestNewSelenium();
//    	test.PlayBack();
//
//    }
}
