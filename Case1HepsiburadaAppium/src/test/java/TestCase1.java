import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class TestCase1 {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities capabilities;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.launcher.DefaultLauncherAlias");
        capabilities.setCapability("deviceName", "emulator-5554");


        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        Thread.sleep(15000);

        //Ana sayfada Süper Fiyat, Süper Teklife tıklanır
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.cardview.widget.CardView/android.widget.ImageView")).click();

        Thread.sleep(5000);

        //Ürünün adı değişkende tutuldu
        String textcontrol1 = driver.findElement(By.id("com.pozitron.hepsiburada:id/tv_product_list_item_name")).getText();
        System.out.println(textcontrol1);

        Thread.sleep(2000);

        //Reklam kapatıldı
        driver.findElement(By.id("com.pozitron.hepsiburada:id/com_appboy_inappmessage_modal_close_button")).click();

        //Ürüne tıklandı
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"]")).click();

        Thread.sleep(5000);

        //Ürünün fotoğrafı açıldı
        driver.findElement(By.id("com.pozitron.hepsiburada:id/productImage")).click();

        //Swipe işlemi yapıldı
        Thread.sleep(10000);

        TouchAction tAction = new TouchAction(driver);
        tAction.press(PointOption.point(920,1010)).waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(224,1005)).release().perform();


        Thread.sleep(5000);

        //Fotoğraf penceresi kapatıldı
        driver.findElement(By.id("com.pozitron.hepsiburada:id/leftIcon")).click();

        Thread.sleep(2000);

        //Beğendiklerime tıklandı
        driver.findElement(By.id("com.pozitron.hepsiburada:id/product_detail_favourites")).click();


        Thread.sleep(15000);

        //Login sayfası açıldı ve e-mail alanına tıklandı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText")).click();

        Thread.sleep(1000);

        //E-mail girişi yapıldı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("buradahepsi.test@gmail.com");

        Thread.sleep(3000);

        //Şifre alanına tıklandı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.EditText")).click();

        Thread.sleep(1000);

        //Şifre girişi yapıldı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.EditText")).sendKeys("Hepsiburada1");

        Thread.sleep(3000);

        //Giriş yap butonuna tıklandı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button")).click();

        Thread.sleep(4000);

        //Gelen pop-up için Tamam'a tıklandı
        driver.findElement(By.id("android:id/button1")).click();

        Thread.sleep(4000);

        //Geriye dön butonuna tıklandı
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Geri\"]")).click();

        Thread.sleep(4000);

        //Hesabım ikonuna tıklandı
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Hesabım\"]")).click();

        Thread.sleep(4000);

        //Beğendiklerime tıklandı
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]")).click();

        Thread.sleep(4000);

        //Beğendiklerim sayfasında ürünün adı değişkende tutuldu
        String textcontrol2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.ListView/android.view.View/android.view.View[5]")).getText();
        System.out.println(textcontrol2);

        Thread.sleep(4000);

        //İki değişkenin karşılaştırılması yapıldı
        Assertions.assertEquals(textcontrol1, textcontrol2, "Wrong URL");

        Thread.sleep(4000);


    }

}