package pages;

import org.openqa.selenium.By;
import utilities.BaseActions;

/**
 * CurriculumDetailsPage class represents the page object for curriculum details and enrollment functionality.
 * It extends {@link BaseActions}, inheriting common web automation actions.
 *
 * <p>
 * This class provides methods to interact with elements on the curriculum details page,
 * including enrolling in stages, selecting enrollment options, and verifying enrollment status.
 * </p>
 */

public class CurriculumDetailsPage extends BaseActions {

    // Curriculum Details Page Locators

    private By firstStageEnrollButton = By.cssSelector("div.cmp-card-actions button");
    private By enrollmentOfUser = By.cssSelector("div.cmp-checkbox-layout");
    private By disabledCheckBox = By.cssSelector("div.cmp-checkbox.ng-star-inserted.disabled");
    private By secondStageEnrollButton = By.cssSelector("button[color='primary']");
    private By enrollmentConfirmation = By.cssSelector("mat.dialog.content");

    /**
     * Clicks the first stage enroll button on the curriculum details page.
     */

    public CurriculumDetailsPage FirstEnrollButtonClick(){
        waitForElementVisible(firstStageEnrollButton);
        waitForElementIsClickable(firstStageEnrollButton);
        clickJS(firstStageEnrollButton);
        return this;
    }

    /**
     * Selects an eligible user for enrollment on the curriculum details page.
     */

    public CurriculumDetailsPage enrollmentOfUserSelection(){
        waitForElementVisible(enrollmentOfUser);
        waitForElementIsClickable(enrollmentOfUser);
        click(enrollmentOfUser);
        return this;
    }

    /**
     * Checks if the checkbox for a non-eligible user for enrollment is disabled on the curriculum details page.
     */

   public boolean IsCheckboxDisabled(){
        return isElementDisplayed(disabledCheckBox);
    }

    /**
     * Clicks the second stage enroll button on the curriculum details page.
     */

    public CurriculumDetailsPage SecondEnrollButtonClick(){
        waitForElementVisible(secondStageEnrollButton);
        waitForElementIsClickable(secondStageEnrollButton);
        clickJS(secondStageEnrollButton);
        return this;
    }

    /**
     * Retrieves the text message confirming successful enrollment on the curriculum details page.
     */

    public String getTextEnrollmentSuccessful(){
        waitForElementVisible(enrollmentConfirmation);
        return getText(enrollmentConfirmation);
    }
}
