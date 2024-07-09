package pages;

import org.openqa.selenium.By;
import utilities.BaseActions;

/**
 * CurriculaPage class represents the page object for curricula management and selection functionality.
 * It extends {@link BaseActions}, inheriting common web automation actions.
 *
 * <p>
 * This class provides methods to interact with elements on the curricula page,
 * including filtering options, selecting demo checkboxes, showing results, and selecting specific courses for enrollment.
 * </p>
 */

public class CurriculaPage extends BaseActions {

    //Curricula Page Locators

    private By filtersButton = By.cssSelector("button.filters-button[cmpstrokedbutton][type='button']");
    private By demoCheckbox = By.cssSelector("input[value='DEMO']");
    private By showResults = By.cssSelector("button.primary");
    private By demoCourseSelection = By.cssSelector("a.curriculum-link-card[href='/el/public/curriculum/1']");

    /**
     * Clicks the filters button on the curricula page to open filtering options.
     */

    public CurriculaPage filtersButtonClick(){
        waitForElementVisible(filtersButton);
        waitForElementIsClickable(filtersButton);
        click(filtersButton);
        return this;
    }

    /**
     * Checks the demo checkbox on the curricula page to filter for demo courses.
     */

    public CurriculaPage demoCheckboxCheck(){
        waitForElementVisible(demoCheckbox);
        waitForElementIsClickable(demoCheckbox);
        click(demoCheckbox);
        return this;
    }

    /**
     * Clicks the 'Show Results' button on the curricula page to apply selected filters.
     */

    public CurriculaPage showResultsButtonClick(){
        waitForElementVisible(showResults);
        waitForElementIsClickable(showResults);
        click(showResults);
        return this;
    }

    /**
     * Clicks on a demo course selection link on the curricula page to view course details.
     */

    public CurriculaPage demoCourseSelectionClick(){
        waitForElementVisible(demoCourseSelection);
        waitForElementIsClickable(demoCourseSelection);
        click(demoCourseSelection);
        return this;
    }

    /**
     * Selects a course to enroll by performing a sequence of actions:
     * clicking filters, checking demo checkbox, showing results, and selecting a specific course.
     */

    public CurriculaPage selectCourseToEnroll(){
        filtersButtonClick();
        demoCheckboxCheck();
        showResultsButtonClick();
        demoCourseSelectionClick();
        return this;
    }
}
