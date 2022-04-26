import Pages.Baseclass;
import Pages.ConsumerDashboard;
import Pages.ConsumerSignup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ConsumerDashboardTest extends Baseclass{
        ConsumerDashboard dashboard = new ConsumerDashboard();

    public ConsumerDashboardTest() throws IOException {
    }

    @Test(priority = 10)
        public void profile() {
            try {
                dashboard.Hoverprofile();
            }catch (Exception e){
                System.out.println("Problem in Hovering ...  " + e.getMessage());
            }
        }
        @Test(priority = 11)
        public void dashboard()
        {
            try{
                dashboard.ClickDashBoardButton();

            }catch (Exception e){
                System.out.println("Problem in clicking dashboard.."+e.getMessage());
            }
        }
    @Test(priority = 12)
    public void bookinghistory()
    {
        try{
            dashboard.bookinghistory();

        }catch (Exception e){
            System.out.println("Problem in clicking bookinghistory.."+e.getMessage());
        }
    }
    @Test(priority = 13)
    public void review()
    {
        try{
            dashboard.givereview();

        }catch (Exception e){
            System.out.println("Problem in giving review"+e.getMessage());
        }
    }
    @Test(priority = 14)
    public void track()
    {
        try{
            dashboard.bookingtracker();

        }catch (Exception e){
            System.out.println("Problem in giving review"+e.getMessage());
        }
    }
    @Test(priority = 15)
    public void myprofile()
    {
        try{
            dashboard.myprofile();

        }catch (Exception e){
            System.out.println("Problem in giving review"+e.getMessage());
        }
    }

}

