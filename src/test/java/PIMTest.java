import org.testng.annotations.Test;

public class PIMTest extends TestBase{
    @Test
    public void test01() {
        startLoginPage()  //methods from diff class
                .loginToPIMPage()
                .searchEmployeeId("0083")
                .validateFirstAndLastName("Joe", "Root");
//                .navigateToRecruitmentPage()
//                .selectOptionFromDropdown();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test02() {
        System.out.println("Test");
    }
}
