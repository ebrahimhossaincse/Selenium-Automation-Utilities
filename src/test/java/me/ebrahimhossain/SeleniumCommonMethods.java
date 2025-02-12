package me.ebrahimhossain;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class SeleniumCommonMethods {

    private WebDriver driver;
    private WebDriverWait wait;

    public SeleniumCommonMethods(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // 1. Open URL
    public void openURL(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Click Element
    public void clickElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Send Keys
    public void sendKeys(By locator, String text) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4. Get Text
    public String getText(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 5. Get Attribute
    public String getAttribute(By locator, String attribute) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getAttribute(attribute);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 6. Is Element Displayed
    public boolean isElementDisplayed(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 7. Is Element Enabled
    public boolean isElementEnabled(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 8. Is Element Selected
    public boolean isElementSelected(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isSelected();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 9. Clear Text
    public void clearText(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 10. Submit Form
    public void submitForm(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.submit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 11. Select Dropdown by Visible Text
    public void selectDropdownByVisibleText(By locator, String visibleText) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 12. Select Dropdown by Value
    public void selectDropdownByValue(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.selectByValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 13. Select Dropdown by Index
    public void selectDropdownByIndex(By locator, int index) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.selectByIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 14. Deselect Dropdown by Visible Text
    public void deselectDropdownByVisibleText(By locator, String visibleText) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.deselectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 15. Deselect Dropdown by Value
    public void deselectDropdownByValue(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.deselectByValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 16. Deselect Dropdown by Index
    public void deselectDropdownByIndex(By locator, int index) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.deselectByIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 17. Deselect All Dropdown Options
    public void deselectAllDropdownOptions(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            dropdown.deselectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 18. Get All Dropdown Options
    public List<WebElement> getAllDropdownOptions(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            return dropdown.getOptions();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 19. Get All Selected Dropdown Options
    public List<WebElement> getAllSelectedDropdownOptions(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            return dropdown.getAllSelectedOptions();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 20. Get First Selected Dropdown Option
    public WebElement getFirstSelectedDropdownOption(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select dropdown = new Select(element);
            return dropdown.getFirstSelectedOption();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 21. Move to Element
    public void moveToElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 22. Drag and Drop
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        try {
            WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(sourceLocator));
            WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(sourceElement, targetElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 23. Double Click
    public void doubleClick(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 24. Right Click
    public void rightClick(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            Actions actions = new Actions(driver);
            actions.contextClick(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 25. Click and Hold
    public void clickAndHold(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.clickAndHold(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 26. Release Click
    public void releaseClick(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.release(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 27. Send Keys with Actions
    public void sendKeysWithActions(By locator, String text) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.sendKeys(element, text).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 28. Scroll to Element
    public void scrollToElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 29. Scroll by Pixels
    public void scrollByPixels(int x, int y) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(" + x + "," + y + ");");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 30. Scroll to Top
    public void scrollToTop() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 0);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 31. Scroll to Bottom
    public void scrollToBottom() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 32. Take Screenshot
    public void takeScreenshot(String filePath) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 33. Wait for Element to be Clickable
    public void waitForElementToBeClickable(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 34. Wait for Element to be Visible
    public void waitForElementToBeVisible(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 35. Wait for Element to be Invisible
    public void waitForElementToBeInvisible(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 36. Wait for Alert
    public void waitForAlert(int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 37. Accept Alert
    public void acceptAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 38. Dismiss Alert
    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 39. Get Alert Text
    public String getAlertText() {
        try {
            return driver.switchTo().alert().getText();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 40. Send Keys to Alert
    public void sendKeysToAlert(String text) {
        try {
            driver.switchTo().alert().sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 41. Switch to Frame by Index
    public void switchToFrameByIndex(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 42. Switch to Frame by Name or ID
    public void switchToFrameByNameOrID(String nameOrID) {
        try {
            driver.switchTo().frame(nameOrID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 43. Switch to Frame by WebElement
    public void switchToFrameByWebElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.switchTo().frame(element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 44. Switch to Default Content
    public void switchToDefaultContent() {
        try {
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 45. Switch to Parent Frame
    public void switchToParentFrame() {
        try {
            driver.switchTo().parentFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 46. Switch to Window by Title
    public void switchToWindowByTitle(String title) {
        try {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
                if (driver.getTitle().equals(title)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 47. Switch to Window by URL
    public void switchToWindowByURL(String url) {
        try {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
                if (driver.getCurrentUrl().equals(url)) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 48. Switch to Last Window
    public void switchToLastWindow() {
        try {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 49. Close Current Window
    public void closeCurrentWindow() {
        try {
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 50. Quit Browser
    public void quitBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 51. Get Page Title
    public String getPageTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 52. Get Page URL
    public String getPageURL() {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 53. Get Page Source
    public String getPageSource() {
        try {
            return driver.getPageSource();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 54. Refresh Page
    public void refreshPage() {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 55. Navigate to URL
    public void navigateToURL(String url) {
        try {
            driver.navigate().to(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 56. Navigate Back
    public void navigateBack() {
        try {
            driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 57. Navigate Forward
    public void navigateForward() {
        try {
            driver.navigate().forward();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 58. Execute JavaScript
    public Object executeJavaScript(String script, Object... args) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return js.executeScript(script, args);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 59. Highlight Element
    public void highlightElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 60. Get CSS Value
    public String getCssValue(By locator, String propertyName) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getCssValue(propertyName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 61. Get Tag Name
    public String getTagName(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getTagName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 62. Get Window Handle
    public String getWindowHandle() {
        try {
            return driver.getWindowHandle();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 63. Get Window Handles
    public List<String> getWindowHandles() {
        try {
            return driver.getWindowHandles().stream().toList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 64. Maximize Window
    public void maximizeWindow() {
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 65. Set Implicit Wait
    public void setImplicitWait(int seconds) {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 66. Delete All Cookies
    public void deleteAllCookies() {
        try {
            driver.manage().deleteAllCookies();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 67. Get Cookie by Name
    public String getCookieByName(String name) {
        try {
            Cookie cookie = driver.manage().getCookieNamed(name);
            return cookie != null ? cookie.getValue() : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 68. Add Cookie
    public void addCookie(String name, String value) {
        try {
            Cookie cookie = new Cookie(name, value);
            driver.manage().addCookie(cookie);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 69. Delete Cookie by Name
    public void deleteCookieByName(String name) {
        try {
            driver.manage().deleteCookieNamed(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 70. Capture Full Page Screenshot
    public void captureFullPageScreenshot(String filePath) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 71. Get Current Window Position
    public Point getCurrentWindowPosition() {
        try {
            return driver.manage().window().getPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 72. Set Window Position
    public void setWindowPosition(int x, int y) {
        try {
            driver.manage().window().setPosition(new Point(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 73. Get Current Window Size
    public Dimension getCurrentWindowSize() {
        try {
            return driver.manage().window().getSize();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 74. Set Window Size
    public void setWindowSize(int width, int height) {
        try {
            driver.manage().window().setSize(new Dimension(width, height));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 75. Switch to New Window
    public void switchToNewWindow() {
        try {
            String currentWindowHandle = driver.getWindowHandle();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(currentWindowHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 76. Switch to Window by Index
    public void switchToWindowByIndex(int index) {
        try {
            List<String> windowHandles = driver.getWindowHandles().stream().toList();
            if (index < windowHandles.size()) {
                driver.switchTo().window(windowHandles.get(index));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 77. Upload File
    public void uploadFile(By locator, String filePath) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 78. Download File
    public void downloadFile(By locator, String downloadPath) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
            // Additional code might be needed to handle the download dialog
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 79. Get Element Size
    public Dimension getElementSize(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getSize();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 80. Get Element Location
    public Point getElementLocation(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getLocation();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 81. Clear Cookies
    public void clearCookies() {
        try {
            driver.manage().deleteAllCookies();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 82. Set Page Load Timeout
    public void setPageLoadTimeout(int seconds) {
        try {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 83. Set Script Timeout
    public void setScriptTimeout(int seconds) {
        try {
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(seconds));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 84. Check if Element Exists
    public boolean doesElementExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    // 85. Wait for Element to be Selected
    public void waitForElementToBeSelected(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.elementToBeSelected(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 86. Wait for Element to be Unselected
    public void waitForElementToBeUnselected(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(locator)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 87. Wait for Element to be Present
    public void waitForElementToBePresent(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 89. Wait for Element to be Stale
    public void waitForElementToBeStale(By locator, int timeout) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.stalenessOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 90. Wait for Number of Windows to be (for example, 2 windows)
    public void waitForNumberOfWindowsToBe(int numberOfWindows, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindows));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 91. Wait for URL to Contain
    public void waitForURLToContain(String partialURL, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.urlContains(partialURL));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 92. Wait for URL to be
    public void waitForURLToBe(String url, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.urlToBe(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 93. Wait for Title to Contain
    public void waitForTitleToContain(String partialTitle, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.titleContains(partialTitle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 94. Wait for Title to be
    public void waitForTitleToBe(String title, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.titleIs(title));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 95. Wait for Text to be Present in Element
    public void waitForTextToBePresentInElement(By locator, String text, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 96. Wait for Text to be Present in Value
    public void waitForTextToBePresentInValue(By locator, String text, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.textToBePresentInElementValue(locator, text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 97. Wait for Frame to be Available and Switch to It
    public void waitForFrameToBeAvailableAndSwitchToIt(By locator, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 98. Wait for Alert to be Present
    public void waitForAlertToBePresent(int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 99. Accept Alert if Present
    public void acceptAlertIfPresent() {
        try {
            waitForAlertToBePresent(10);
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 100. Change Element Display Style Using JavaScript
    public void changeElementDisplayStyleUsingJS(By locator, String displayStyle) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display = arguments[1];", element, displayStyle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 101. Get Element Text Using JavaScript
    public String getElementTextUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return arguments[0].innerText;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 102. Click Element Using JavaScript
    public void clickElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 103. Scroll to Element Using JavaScript
    public void scrollToElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 104. Scroll to Bottom Using JavaScript
    public void scrollToBottomUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 105. Scroll to Top Using JavaScript
    public void scrollToTopUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 0);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 106. Hover Over Element
    public void hoverOverElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 107. Drag and Drop Using JavaScript
    public void dragAndDropUsingJS(By sourceLocator, By targetLocator) {
        try {
            WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(sourceLocator));
            WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String script = "function createEvent(typeOfEvent) {" +
                    "var event = document.createEvent('CustomEvent');" +
                    "event.initCustomEvent(typeOfEvent, true, true, null);" +
                    "event.dataTransfer = {" +
                    "data: {}," +
                    "setData: function (key, value) {" +
                    "this.data[key] = value;" +
                    "}," +
                    "getData: function (key) {" +
                    "return this.data[key];" +
                    "}" +
                    "};" +
                    "return event;" +
                    "}" +
                    "function dispatchEvent(element, event, transferData) {" +
                    "if (transferData !== undefined) {" +
                    "event.dataTransfer = transferData;" +
                    "}" +
                    "if (element.dispatchEvent) {" +
                    "element.dispatchEvent(event);" +
                    "} else if (element.fireEvent) {" +
                    "element.fireEvent('on' + event.type, event);" +
                    "}" +
                    "}" +
                    "function simulateHTML5DragAndDrop(element, target) {" +
                    "var dragStartEvent = createEvent('dragstart');" +
                    "dispatchEvent(element, dragStartEvent);" +
                    "var dropEvent = createEvent('drop');" +
                    "dispatchEvent(target, dropEvent, dragStartEvent.dataTransfer);" +
                    "var dragEndEvent = createEvent('dragend');" +
                    "dispatchEvent(element, dragEndEvent, dropEvent.dataTransfer);" +
                    "}" +
                    "simulateHTML5DragAndDrop(arguments[0], arguments[1]);";
            js.executeScript(script, sourceElement, targetElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 108. Get Element Rectangle
    public Rectangle getElementRectangle(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.getRect();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 109. Get Element Screenshot
    public void getElementScreenshot(By locator, String filePath) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            File screenshot = element.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 110. Wait for Element to be Visible Using Fluent Wait
    public void waitForElementToBeVisibleUsingFluentWait(By locator, int timeout, int pollingTime) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofSeconds(pollingTime))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 111. Wait for Element to be Clickable Using Fluent Wait
    public void waitForElementToBeClickableUsingFluentWait(By locator, int timeout, int pollingTime) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofSeconds(pollingTime))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 112. Wait for Alert Using Fluent Wait
    public void waitForAlertUsingFluentWait(int timeout, int pollingTime) {
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofSeconds(pollingTime))
                    .ignoring(NoAlertPresentException.class);
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 113. Double Click Using JavaScript
    public void doubleClickUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = document.createEvent('MouseEvents');" +
                    "evt.initEvent('dblclick', true, true);" +
                    "arguments[0].dispatchEvent(evt);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 114. Right Click Using JavaScript
    public void rightClickUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = document.createEvent('MouseEvents');" +
                    "evt.initEvent('contextmenu', true, true);" +
                    "arguments[0].dispatchEvent(evt);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 115. Check Checkbox Using JavaScript
    public void checkCheckboxUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].checked = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 116. Uncheck Checkbox Using JavaScript
    public void uncheckCheckboxUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].checked = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 117. Set Attribute Using JavaScript
    public void setAttributeUsingJS(By locator, String attributeName, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 118. Remove Attribute Using JavaScript
    public void removeAttributeUsingJS(By locator, String attributeName) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].removeAttribute(arguments[1]);", element, attributeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 119. Get Element Style Property Using JavaScript
    public String getElementStylePropertyUsingJS(By locator, String propertyName) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue(arguments[1]);", element, propertyName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 120. Highlight Element Using JavaScript
    public void highlightElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='2px solid red'", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 121. Remove Highlight from Element Using JavaScript
    public void removeHighlightFromElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border=''", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 122. Drag and Drop By Offset Using Actions
    public void dragAndDropByOffset(By locator, int xOffset, int yOffset) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions actions = new Actions(driver);
            actions.dragAndDropBy(element, xOffset, yOffset).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 123. Reload Page Using JavaScript
    public void reloadPageUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("location.reload()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 124. Open New Tab Using JavaScript
    public void openNewTabUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.open()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 125. Close Current Tab Using JavaScript
    public void closeCurrentTabUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.close()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 126. Scroll Horizontally Using JavaScript
    public void scrollHorizontallyUsingJS(int pixels) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(" + pixels + ",0)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 127. Upload File Using JavaScript
    public void uploadFileUsingJS(By locator, String filePath) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display='block'; arguments[0].value=arguments[1];", element, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 128. Scroll to Element and Click Using JavaScript
    public void scrollToElementAndClickUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 129. Set Value Using JavaScript
    public void setValueUsingJS(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='" + value + "';", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 130. Get Browser Console Logs
    public List<LogEntry> getBrowserConsoleLogs() {
        try {
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            return logEntries.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 131. Clear Local Storage Using JavaScript
    public void clearLocalStorageUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.localStorage.clear();");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 132. Clear Session Storage Using JavaScript
    public void clearSessionStorageUsingJS() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.sessionStorage.clear();");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 133. Get Local Storage Item Using JavaScript
    public String getLocalStorageItemUsingJS(String key) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.localStorage.getItem(arguments[0]);", key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 134. Get Session Storage Item Using JavaScript
    public String getSessionStorageItemUsingJS(String key) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.sessionStorage.getItem(arguments[0]);", key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 135. Set Local Storage Item Using JavaScript
    public void setLocalStorageItemUsingJS(String key, String value) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.localStorage.setItem(arguments[0], arguments[1]);", key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 136. Set Session Storage Item Using JavaScript
    public void setSessionStorageItemUsingJS(String key, String value) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.sessionStorage.setItem(arguments[0], arguments[1]);", key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 137. Remove Local Storage Item Using JavaScript
    public void removeLocalStorageItemUsingJS(String key) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.localStorage.removeItem(arguments[0]);", key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 138. Remove Session Storage Item Using JavaScript
    public void removeSessionStorageItemUsingJS(String key) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.sessionStorage.removeItem(arguments[0]);", key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 139. Change Element Background Color Using JavaScript
    public void changeElementBackgroundColorUsingJS(By locator, String color) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.backgroundColor = arguments[1];", element, color);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 140. Change Element Font Size Using JavaScript
    public void changeElementFontSizeUsingJS(By locator, String fontSize) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.fontSize = arguments[1];", element, fontSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 141. Get Element Inner HTML Using JavaScript
    public String getElementInnerHTMLUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return arguments[0].innerHTML;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 142. Get Element Outer HTML Using JavaScript
    public String getElementOuterHTMLUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return arguments[0].outerHTML;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 143. Trigger Keyboard Event Using JavaScript
    public void triggerKeyboardEventUsingJS(By locator, String eventType) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = new KeyboardEvent(arguments[1], {bubbles: true}); arguments[0].dispatchEvent(evt);", element, eventType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 144. Trigger Mouse Event Using JavaScript
    public void triggerMouseEventUsingJS(By locator, String eventType) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = new MouseEvent(arguments[1], {bubbles: true}); arguments[0].dispatchEvent(evt);", element, eventType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 145. Trigger Custom Event Using JavaScript
    public void triggerCustomEventUsingJS(By locator, String eventType) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = new CustomEvent(arguments[1], {bubbles: true}); arguments[0].dispatchEvent(evt);", element, eventType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 146. Get Element Shadow Root Using JavaScript
    public WebElement getElementShadowRootUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return arguments[0].shadowRoot;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 147. Get Shadow DOM Element Using JavaScript
    public WebElement getShadowDOMElementUsingJS(WebElement shadowRoot, By locator) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return arguments[0].querySelector(arguments[1]);", shadowRoot, locator);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 148. Get Element By XPath Using JavaScript
    public WebElement getElementByXPathUsingJS(String xpath) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpath);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 149. Wait for Text To Be Present Using JavaScript
    public void waitForTextToBePresentUsingJS(By locator, String text, int timeout) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(driver -> {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                return js.executeScript("return arguments[0].textContent;", element).equals(text);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 150. Wait for Attribute To Be Present Using JavaScript
    public void waitForAttributeToBePresentUsingJS(By locator, String attribute, String value, int timeout) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(driver -> {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                return js.executeScript("return arguments[0].getAttribute(arguments[1]);", element, attribute).equals(value);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 151. Get Element By Class Name Using JavaScript
    public WebElement getElementByClassNameUsingJS(String className) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.getElementsByClassName(arguments[0])[0];", className);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 152. Get Elements By Class Name Using JavaScript
    public List<WebElement> getElementsByClassNameUsingJS(String className) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return document.getElementsByClassName(arguments[0]);", className);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 153. Get Element By Tag Name Using JavaScript
    public WebElement getElementByTagNameUsingJS(String tagName) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.getElementsByTagName(arguments[0])[0];", tagName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 154. Get Elements By Tag Name Using JavaScript
    public List<WebElement> getElementsByTagNameUsingJS(String tagName) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return document.getElementsByTagName(arguments[0]);", tagName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 155. Get Element By Name Using JavaScript
    public WebElement getElementByNameUsingJS(String name) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.getElementsByName(arguments[0])[0];", name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 156. Get Elements By Name Using JavaScript
    public List<WebElement> getElementsByNameUsingJS(String name) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return document.getElementsByName(arguments[0]);", name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 157. Get Element By ID Using JavaScript
    public WebElement getElementByIDUsingJS(String id) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.getElementById(arguments[0]);", id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 158. Get Elements By Selector Using JavaScript
    public List<WebElement> getElementsBySelectorUsingJS(String selector) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return document.querySelectorAll(arguments[0]);", selector);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 159. Get Element By Selector Using JavaScript
    public WebElement getElementBySelectorUsingJS(String selector) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return document.querySelector(arguments[0]);", selector);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 160. Get Element Children Using JavaScript
    public List<WebElement> getElementChildrenUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return arguments[0].children;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 161. Get Element Parent Using JavaScript
    public WebElement getElementParentUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return arguments[0].parentElement;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 162. Get Element Siblings Using JavaScript
    public List<WebElement> getElementSiblingsUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (List<WebElement>) js.executeScript("return Array.from(arguments[0].parentElement.children).filter(child => child !== arguments[0]);", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 163. Get Element Next Sibling Using JavaScript
    public WebElement getElementNextSiblingUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return arguments[0].nextElementSibling;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 164. Get Element Previous Sibling Using JavaScript
    public WebElement getElementPreviousSiblingUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (WebElement) js.executeScript("return arguments[0].previousElementSibling;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 165. Highlight Element Temporarily Using JavaScript
    public void highlightElementTemporarilyUsingJS(By locator, int duration) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String originalStyle = (String) js.executeScript("return arguments[0].style.border;", element);
            js.executeScript("arguments[0].style.border='3px solid red';", element);
            Thread.sleep(duration);
            js.executeScript("arguments[0].style.border='" + originalStyle + "';", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 166. Scroll Element Into View Using JavaScript
    public void scrollElementIntoViewUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 167. Click Element in Shadow DOM Using JavaScript
    public void clickElementInShadowDOMUsingJS(By shadowHostLocator, By shadowElementLocator) {
        try {
            WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHostLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot;", shadowHost);
            WebElement shadowElement = shadowRoot.findElement(shadowElementLocator);
            js.executeScript("arguments[0].click();", shadowElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 168. Get Text from Shadow DOM Using JavaScript
    public String getTextFromShadowDOMUsingJS(By shadowHostLocator, By shadowElementLocator) {
        try {
            WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHostLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot;", shadowHost);
            WebElement shadowElement = shadowRoot.findElement(shadowElementLocator);
            return shadowElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 169. Set Value in Shadow DOM Using JavaScript
    public void setValueInShadowDOMUsingJS(By shadowHostLocator, By shadowElementLocator, String value) {
        try {
            WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHostLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot;", shadowHost);
            WebElement shadowElement = shadowRoot.findElement(shadowElementLocator);
            js.executeScript("arguments[0].value = arguments[1];", shadowElement, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 170. Execute Script in Shadow DOM Using JavaScript
    public void executeScriptInShadowDOMUsingJS(By shadowHostLocator, By shadowElementLocator, String script) {
        try {
            WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHostLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot;", shadowHost);
            WebElement shadowElement = shadowRoot.findElement(shadowElementLocator);
            js.executeScript(script, shadowElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 171. Get Shadow DOM Element Count Using JavaScript
    public int getShadowDOMElementCountUsingJS(By shadowHostLocator, By shadowElementLocator) {
        try {
            WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHostLocator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot;", shadowHost);
            return (Integer) js.executeScript("return arguments[0].querySelectorAll(arguments[1]).length;", shadowRoot, shadowElementLocator);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 172. Check if Element is in Viewport Using JavaScript
    public boolean isElementInViewportUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (Boolean) js.executeScript(
                    "var rect = arguments[0].getBoundingClientRect();" +
                            "return (" +
                            "rect.top >= 0 &&" +
                            "rect.left >= 0 &&" +
                            "rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&" +
                            "rect.right <= (window.innerWidth || document.documentElement.clientWidth)" +
                            ");", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 173. Get Element's Computed Style Using JavaScript
    public String getElementComputedStyleUsingJS(By locator, String styleProperty) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript(
                    "return window.getComputedStyle(arguments[0]).getPropertyValue(arguments[1]);",
                    element, styleProperty);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 174. Get Element's Bounding Client Rect Using JavaScript
    public Rectangle getElementBoundingClientRectUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (Rectangle) js.executeScript(
                    "var rect = arguments[0].getBoundingClientRect();" +
                            "return {x: rect.left, y: rect.top, width: rect.width, height: rect.height};",
                    element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 175. Get Element's Offset Position Using JavaScript
    public Point getElementOffsetPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (Point) js.executeScript(
                    "return {x: arguments[0].offsetLeft, y: arguments[0].offsetTop};",
                    element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 176. Check if Element is Focused Using JavaScript
    public boolean isElementFocusedUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (Boolean) js.executeScript("return document.activeElement === arguments[0];", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 177. Focus on Element Using JavaScript
    public void focusOnElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].focus();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 178. Blur Element Using JavaScript
    public void blurElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].blur();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 179. Scroll Element into View Center Using JavaScript
    public void scrollElementIntoViewCenterUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "var elementTop = arguments[0].getBoundingClientRect().top;" +
                            "var elementCenter = elementTop - (window.innerHeight / 2);" +
                            "window.scrollBy(0, elementCenter);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 180. Execute Asynchronous JavaScript
    public void executeAsyncJavaScript(String script, Object... args) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeAsyncScript(script, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 181. Get Element's Dimensions Using JavaScript
    public Dimension getElementDimensionsUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Long width = (Long) js.executeScript("return arguments[0].offsetWidth;", element);
            Long height = (Long) js.executeScript("return arguments[0].offsetHeight;", element);
            return new Dimension(width.intValue(), height.intValue());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 182. Get Element's Position Using JavaScript
    public Point getElementPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Long x = (Long) js.executeScript("return arguments[0].offsetLeft;", element);
            Long y = (Long) js.executeScript("return arguments[0].offsetTop;", element);
            return new Point(x.intValue(), y.intValue());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 183. Get Element's Z-Index Using JavaScript
    public int getElementZIndexUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String zIndex = (String) js.executeScript("return window.getComputedStyle(arguments[0]).zIndex;", element);
            return Integer.parseInt(zIndex);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 184. Set Element's Z-Index Using JavaScript
    public void setElementZIndexUsingJS(By locator, int zIndex) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.zIndex = arguments[1];", element, zIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 185. Check if Element is Visible in Viewport Using JavaScript
    public boolean isElementVisibleInViewportUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (Boolean) js.executeScript(
                    "var rect = arguments[0].getBoundingClientRect();" +
                            "return (" +
                            "rect.top >= 0 &&" +
                            "rect.left >= 0 &&" +
                            "rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&" +
                            "rect.right <= (window.innerWidth || document.documentElement.clientWidth)" +
                            ");", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 186. Get Element's Background Color Using JavaScript
    public String getElementBackgroundColorUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).backgroundColor;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 187. Get Element's Font Size Using JavaScript
    public String getElementFontSizeUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).fontSize;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 188. Get Element's Text Color Using JavaScript
    public String getElementTextColorUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).color;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 189. Get Element's Border Style Using JavaScript
    public String getElementBorderStyleUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).borderStyle;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 190. Get Element's Margin Using JavaScript
    public String getElementMarginUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).margin;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 191. Get Element's Padding Using JavaScript
    public String getElementPaddingUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).padding;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 192. Get Element's Display Style Using JavaScript
    public String getElementDisplayStyleUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).display;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 193. Get Element's Visibility Using JavaScript
    public String getElementVisibilityUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).visibility;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 194. Get Element's Overflow Using JavaScript
    public String getElementOverflowUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).overflow;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 195. Set Element Title Using JavaScript
    public void setElementTitleUsingJS(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].title = arguments[1];", element, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 196. Get Element's Top Position Using JavaScript
    public String getElementTopPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).top;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 197. Get Element's Left Position Using JavaScript
    public String getElementLeftPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).left;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 198. Get Element's Right Position Using JavaScript
    public String getElementRightPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).right;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 199. Get Element's Bottom Position Using JavaScript
    public String getElementBottomPositionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).bottom;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 200. Get Element's Width Using JavaScript
    public String getElementWidthUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).width;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 201. Get Element's Height Using JavaScript
    public String getElementHeightUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).height;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 202. Get Element's Max Width Using JavaScript
    public String getElementMaxWidthUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).maxWidth;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 203. Get Element's Max Height Using JavaScript
    public String getElementMaxHeightUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).maxHeight;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 204. Get Element's Min Width Using JavaScript
    public String getElementMinWidthUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).minWidth;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 205. Get Element's Min Height Using JavaScript
    public String getElementMinHeightUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).minHeight;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 206. Get Element's Font Family Using JavaScript
    public String getElementFontFamilyUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).fontFamily;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 207. Get Element's Font Weight Using JavaScript
    public String getElementFontWeightUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).fontWeight;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 208. Get Element's Line Height Using JavaScript
    public String getElementLineHeightUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).lineHeight;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 209. Get Element's Text Align Using JavaScript
    public String getElementTextAlignUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).textAlign;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 210. Get Element's Text Decoration Using JavaScript
    public String getElementTextDecorationUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).textDecoration;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 211. Get Element's White Space Using JavaScript
    public String getElementWhiteSpaceUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).whiteSpace;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 212. Get Element's Word Wrap Using JavaScript
    public String getElementWordWrapUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).wordWrap;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 213. Get Element's Opacity Using JavaScript
    public String getElementOpacityUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).opacity;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 214. Get Element's Border Radius Using JavaScript
    public String getElementBorderRadiusUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).borderRadius;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 215. Get Element's Box Shadow Using JavaScript
    public String getElementBoxShadowUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).boxShadow;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 216. Get Element's Transform Using JavaScript
    public String getElementTransformUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).transform;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 217. Get Element's Transition Using JavaScript
    public String getElementTransitionUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).transition;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 218. Get Element's Animation Using JavaScript
    public String getElementAnimationUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).animation;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 219. Get Element's Cursor Using JavaScript
    public String getElementCursorUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).cursor;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 220. Get Element's Pointer Events Using JavaScript
    public String getElementPointerEventsUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).pointerEvents;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 221. Get Element's Resize Using JavaScript
    public String getElementResizeUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).resize;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 222. Get Element's User Select Using JavaScript
    public String getElementUserSelectUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).userSelect;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 223. Set Element Access Key Using JavaScript
    public void setElementAccessKeyUsingJS(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].accessKey = arguments[1];", element, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 224. Get Element's Title Using JavaScript
    public String getElementTitleUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].title;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 225. Get Element's Vertical Align Using JavaScript
    public String getElementVerticalAlignUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).verticalAlign;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 226. Get Element's Word Spacing Using JavaScript
    public String getElementWordSpacingUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).wordSpacing;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 227. Get Element's Writing Mode Using JavaScript
    public String getElementWritingModeUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).writingMode;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 228. Get Element's Outline Using JavaScript
    public String getElementOutlineUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).outline;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 229. Get Element's Overflow X Using JavaScript
    public String getElementOverflowXUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).overflowX;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 230. Get Element's Overflow Y Using JavaScript
    public String getElementOverflowYUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return (String) js.executeScript("return window.getComputedStyle(arguments[0]).overflowY;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 231. Get Element's Access Key Using JavaScript
    public String getElementAccessKeyUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].accessKey;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 232. Check if Element is Disabled Using JavaScript
    public boolean isElementDisabledUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].disabled;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 233. Enable Element Using JavaScript
    public void enableElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 234. Disable Element Using JavaScript
    public void disableElementUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 235. Check if Element is Read-Only Using JavaScript
    public boolean isElementReadOnlyUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].readOnly;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 236. Make Element Read-Only Using JavaScript
    public void makeElementReadOnlyUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].readOnly = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 237. Make Element Editable Using JavaScript
    public void makeElementEditableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].readOnly = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 238. Get Element's Content Editable Using JavaScript
    public boolean isElementContentEditableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].isContentEditable;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 239. Make Element Content Editable Using JavaScript
    public void makeElementContentEditableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].contentEditable = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 240. Make Element Not Content Editable Using JavaScript
    public void makeElementNotContentEditableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].contentEditable = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 241. Get Element's Spellcheck Using JavaScript
    public boolean isElementSpellcheckUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].spellcheck;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 242. Enable Element Spellcheck Using JavaScript
    public void enableElementSpellcheckUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].spellcheck = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 243. Disable Element Spellcheck Using JavaScript
    public void disableElementSpellcheckUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].spellcheck = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 244. Get Element's Draggable Using JavaScript
    public boolean isElementDraggableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].draggable;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 245. Make Element Draggable Using JavaScript
    public void makeElementDraggableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].draggable = true;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 246. Make Element Not Draggable Using JavaScript
    public void makeElementNotDraggableUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].draggable = false;", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 247. Get Element's Dropzone Using JavaScript
    public String getElementDropzoneUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].dropzone;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 248. Set Element Dropzone Using JavaScript
    public void setElementDropzoneUsingJS(By locator, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].dropzone = arguments[1];", element, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 249. Get Element's Tab Index Using JavaScript
    public int getElementTabIndexUsingJS(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return (Integer) ((JavascriptExecutor) driver).executeScript("return arguments[0].tabIndex;", element);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 250. Set Element Tab Index Using JavaScript
    public void setElementTabIndexUsingJS(By locator, int tabIndex) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].tabIndex = arguments[1];", element, tabIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
