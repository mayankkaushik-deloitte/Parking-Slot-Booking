import Pages.Baseclass;
import Pages.Provider_BusinessTracker;
import org.testng.annotations.Test;

public class ProviderBusinessTest extends Baseclass {
    Provider_BusinessTracker obj = new Provider_BusinessTracker();

    @Test(priority = 4)
    public void HoverProfile(){
        try {
            obj.ClickProfileButton();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Test(priority = 5)
    public void Dashboard(){
        try {
            obj.ClickDashBoardButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 6)
    public void BusinessTracker(){
        try {
            obj.ClickBusinessTracker();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 7)
    public void HoveringToGraph(){
        try {
            obj.HoverToGraph();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
