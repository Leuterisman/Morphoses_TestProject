import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CurriculaPage;
import pages.CurriculumDetailsPage;
import pages.DashBoardPage;
import pages.LoginPage;


/**
 * QA_Jira_001 is a test class that extends BaseTest. It contains two test methods:
 * step1 and step2, which verify login, course selection for enrollment,
 * and the successful enrollment of a user.
 */

public class QA_Jira_001 extends BaseTest{
    public LoginPage loginPage = new LoginPage();
    public DashBoardPage dashBoardPage = new DashBoardPage();
    public CurriculaPage curriculaPage = new CurriculaPage();
    public CurriculumDetailsPage curriculumDetailsPage = new CurriculumDetailsPage();

    /**
     * Verifies login, course selection for enrollment, and checks if a specific checkbox is disabled.
     */

    @Test(description = "Verifies login, course selection for enrollment, and checks if a specific checkbox is disabled", alwaysRun = true)
    public void step1(){
        loginPage.Login("leuterismanioudakis@hotmail.com", "LEman1996");
        dashBoardPage.curriculaButtonClick();
        curriculaPage.selectCourseToEnroll();
        curriculumDetailsPage.FirstEnrollButtonClick();
        Assert.assertTrue(curriculumDetailsPage.IsCheckboxDisabled(),"Check is enabled");
    }

    /**
     * Verifies the successful enrollment of a user and checks the success message.
     * This method depends on the execution of step1.
     */

    @Test(description = "Verifies the successful enrollment of a user and checks the success message", dependsOnMethods = "step1", alwaysRun = true)
    public void step2(){
        curriculumDetailsPage.enrollmentOfUserSelection().SecondEnrollButtonClick();
        Assert.assertEquals(curriculumDetailsPage.getTextEnrollmentSuccessful(),"Your enrollment was successful!","Enrollment was not successful");

    }

}
