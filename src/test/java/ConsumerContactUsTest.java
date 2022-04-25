package Utils;

import Pages.Baseclass;
import Pages.ConsumerContactUs;
import org.testng.annotations.Test;

public class ConsumerContactUsTest extends Baseclass {
    ConsumerContactUs obj = new ConsumerContactUs();
    @Test(priority = 7)
    public void ValidateContactUs(){
        try {
            obj.ClickContactUS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 8)
    public void ValidateHomeButton(){
        try {
            obj.ClickHomeHyperlink();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 9)
    public void ValidateditProfile(){
        try {
            obj.ClickEditProfile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("The ContactUs Part is not implemented by Developer team");
            System.out.println("So there are no test cases to implement");
            System.out.println("Every field in the ContactUs part should be implemented first");
        }
        System.out.println("The ContactUs Part is not implemented by Developer team");
        System.out.println("So there are no test cases to implement");
        System.out.println("Even if we implement it will work but will not show any results it will return to home page ");
        System.out.println("Every field in the ContactUs part should be implemented first");
    }

}
