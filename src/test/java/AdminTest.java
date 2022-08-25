import org.testng.annotations.Test;

public class AdminTest extends TestBase{ //extends beforemethod (start browser) and aftermethod from TestBase

    @Test
    public void Test002() {
        startLoginPage()
                .loginToPIMPage()
                .navigateToAdminPage()
                .searchUserName("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");
        
    }
}
