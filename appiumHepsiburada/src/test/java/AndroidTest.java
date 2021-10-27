import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Assertions;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.launcher.DefaultLauncherAlias");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("version", "4.4");

        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        Thread.sleep(5000);

        //Ana sayfada konum alanına tıkanır
        driver.findElement(By.id("com.pozitron.hepsiburada:id/textViewLocation")).click();

        Thread.sleep(1000);

        //İl seçim alanına tıklanır
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"İl seçin\"]")).click();

        Thread.sleep(1000);

        //İl texti alınır ve ekrana bastırılır
        String location1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")).getText();
        System.out.println(location1);

        //il seçilir
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")).click();

        Thread.sleep(2000);

        //İlçe alanına tıklanır
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"İlçe seçin\"]")).click();

        Thread.sleep(2000);

        //ilçe seçilir
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")).click();

        Thread.sleep(2000);

        //Mahalle alanına tıklanır
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Mahalle seçin\"]")).click();

        Thread.sleep(2000);

        //Mahalle seçilir
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")).click();

        Thread.sleep(2000);

        //Kaydet butonuna tıklanır
        driver.findElement(By.id("com.pozitron.hepsiburada:id/button")).click();

        Thread.sleep(5000);

        //reklam kapatılır
        driver.findElement(By.id("com.pozitron.hepsiburada:id/com_appboy_inappmessage_modal_close_button")).click();

        Thread.sleep(5000);

        //Tab bardaki kategorilere tıklanır
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView")).click();

        Thread.sleep(2000);

        //Telefon, tablet ve aksesuarlar kategori tabına tıklanır
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.ImageView")).click();

        Thread.sleep(2000);

        //IOS telefonlar kategorisine tıklanır
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.ImageView")).click();

        Thread.sleep(2000);

        //Açılan ekrandaki konum texti tutulur ve ekrana bastırılır
        String location2 = driver.findElement(By.id("com.pozitron.hepsiburada:id/textViewLocation")).getText();
        System.out.println(location2);

        Thread.sleep(2000);

        //Konum bilgisi kontrolü yapılır
        Assertions.assertEquals(location1, location2, "Wrong URL");

    }

}