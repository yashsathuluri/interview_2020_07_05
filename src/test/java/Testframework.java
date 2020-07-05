import CommonFunction.FunctionLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Testframework {
    FunctionLibrary Fn= new FunctionLibrary();

    @Before
    public void open()
    {
        Fn.openBrowser();
    }
    @After
    public void close()
    {
        Fn.closeBrowser();
    }
}