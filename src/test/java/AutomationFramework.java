import org.testng.annotations.Test;
import tests.TestInit;

public class AutomationFramework extends TestInit {

    @Test

    public void firstGit(){
        OlxHome olxHome = new OlxHome(driver);
        olxHome.visitOlx();
    }
}
