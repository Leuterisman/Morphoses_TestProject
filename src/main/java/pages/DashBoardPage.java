package pages;

import org.openqa.selenium.By;
import utilities.BaseActions;

/**
 * DashBoardPage class represents the page object for the dashboard functionality.
 * It extends {@link BaseActions}, inheriting common web automation actions.
 *
 * <p>
 * This class provides methods to interact with elements on the dashboard page,
 * including navigation to different sections such as curricula.
 * </p>
 */

public class DashBoardPage extends BaseActions {

    //Dashboard Page Locator

    private By curriculaButton = By.cssSelector("mat-icon#curricula");

    /**
     * Clicks the curricula button on the dashboard page to navigate to the curricula section.
     */

    public DashBoardPage curriculaButtonClick(){
        waitForElementVisible(curriculaButton);
        click(curriculaButton);
        return this;
    }
}
