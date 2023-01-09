import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AllegroPl {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement cookiesButton = driver.findElement(By.xpath("//button [@class='mgn2_14 mp0t_0a m9qz_yp mp7g_oh mse2_40 mqu1_40 mtsp_ib mli8_k4 mp4t_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 mqen_m6 meqh_en m0qj_5r mh36_16 mvrt_16 mg9e_0 mj7a_0 mjir_sv m2ha_2 m8qd_qh mjt1_n2 b1vf8 mgmw_9u msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp bnpxh mjru_k4 _158e2_4-oWM m3h2_0 m3h2_16_s mryx_24 mryx_0_s mryx_24_x m7er_0k']"));
                cookiesButton.click();

                WebElement link = driver.findElement(By.xpath("//a [@href='https://allegro.pl/strefaokazji/wyprzedaz']"));
                String getlinkParam = link.getAttribute("offsetHeight");
                System.out.println(getlinkParam);

                WebElement text = driver.findElement(By.cssSelector(".mr3m_1.m7er_k4.mj6k_n7.sy40i.mgn2_14.mp0t_0a.mqu1_21.mgmw_wo.mli8_k4"));
                String getTextParam = text.getText();
                System.out.println(getTextParam);

                WebElement getDatasetParam = driver.findElement(By.cssSelector("svg#svg-color-matrix-filters"));
                String getDataPar = getDatasetParam.getAttribute("nodeType");
                System.out.println(getDataPar);

                WebElement getCssVal = driver.findElement(By.cssSelector("[data-role='search-button']"));
                String getCssVals = getCssVal.getCssValue("outline-offset");
                System.out.println(getCssVals);

                WebElement checkInput = driver.findElement(By.cssSelector("[placeholder='czego szukasz?']"));
                checkInput.sendKeys("materac", Keys.ENTER );

                WebElement checkDziecko = driver.findElement(By.cssSelector(".mgn2_14.mp0t_0a.mqu1_21.mgmw_wo.mli8_k4.mpof_ki.mj7a_8"));
                String checkDzieckos = checkDziecko.getText();
                System.out.println(checkDzieckos);




        //driver.close();



    }
}
