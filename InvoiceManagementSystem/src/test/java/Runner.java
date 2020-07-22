import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pavia\\Desktop\\Invoice\\InvoiceManagementSystem\\src\\test\\features\\AddUser.feature",dryRun = false,strict = true)

public class Runner {
}
