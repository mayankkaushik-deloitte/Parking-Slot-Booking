import Pages.ProviderProfileCompleting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ProfilecompletingTest {
    ProviderProfileCompleting profile = new ProviderProfileCompleting();




    @Test(priority = 14)
    public void ClickAlreadyAcc(){
        try {
            profile.AlreadyHaveAnAccount();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test(priority = 15)
    public void ClickEmail(){
        try {
            profile.EnterMail();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test(priority = 16)
    public void ClickPassword(){
        try {
            profile.EnterPassword();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test(priority = 17)
    public void ClickLogin(){
        try {
            profile.EnterLogin();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test(priority = 18)
    public void ClickFname(){
        try {
            profile.EnterFname();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("It is accepting Integer values also");
        }

    }
    @Test(priority = 19)
    public void Clicklname(){
        try {
            profile.Enterlname();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("It is accepting Integer values also");
        }

    }
    @Test(priority = 20)
    public void ClickMobile() {
        try {
            profile.MobileNumber();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        @Test(priority = 21)
        public void ClickAddress(){
            try {
                profile.Address();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        @Test(priority = 22)
        public void ClickPincode(){
            try {
                profile.PinCode();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("It is accepting String values also");
            }

        }
        @Test(priority = 23)
        public void ClickDistrict(){
            try {
                profile.District();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("It is accepting Integer values also");
            }

        }
        @Test(priority = 24)
        public void ClickState(){
            try {
                profile.State();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("It is accepting Integer values also");
            }

        }
        @Test(priority = 25)
        public void ClickCountry(){
            try {
                profile.Country();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("It is accepting Integer values also");
            }

        }
    @Test(priority = 26)
    public void ClickSaveProfile(){
        try {
            profile.SaveProfile();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

