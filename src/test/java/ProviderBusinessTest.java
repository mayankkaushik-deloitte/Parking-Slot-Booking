import Pages.Baseclass;
import Pages.ProviderBusinessTracker;
import org.testng.annotations.Test;

public class ProviderBusinessTest extends Baseclass {
    ProviderBusinessTracker obj = new ProviderBusinessTracker();

    @Test(priority = 4)
    public void HoverProfile(){
        try {
            obj.HoverProfileButton();
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
    @Test(priority = 8)
    public void ProfileHover(){
        try {
            obj.ProfileHovering();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 9)
    public void signout(){
        try {
            obj.out();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
