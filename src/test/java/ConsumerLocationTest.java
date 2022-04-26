
import Pages.Baseclass;
import Pages.Consumer_Location;
import org.testng.annotations.Test;

public class ConsumerLocationTest extends Baseclass {
    Consumer_Location Consumer = new Consumer_Location();


    @Test(priority = 10)
    public void ValidateLocationButton(){
        try {
            Consumer.ClickLocation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 11)
    public void ValidateZoomin ()
    {
        try
        {
            Consumer.ClickZoomin();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Test(priority = 12)
    public void ValidateZoomOut()
    {
        try
        {
            Consumer.ClickZoomOut();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Test(priority = 13)
    public void ValidateContactUs()
    {
        try
        {
            Consumer.ClickContactUs();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
