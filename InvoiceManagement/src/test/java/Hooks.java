import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionLibrary.CommonFunctions;

public class Hooks {
  CommonFunctions functionsObj = new CommonFunctions();

  @Before
  public void beforeScenario() {
      functionsObj.openBrowser();
  }

  @After
  public void afterScenario() {
      functionsObj.closeBrowser();
  }

}

