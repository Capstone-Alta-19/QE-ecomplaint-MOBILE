package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static starter.stepdefinitions.DriverHook.driver;

public class StepDefinitions {
    Faker faker = new Faker(new Locale("in-ID"));
    String randomEmail = faker.internet().emailAddress();
    String randomPassword = faker.internet().password();
    String randomFullName = faker.name().fullName();
    String randomTelNum = faker.phoneNumber().phoneNumber();
    String randomProvince = faker.address().state();
    String randomCity = faker.address().cityName();
    String randomAddress = faker.address().fullAddress();
    @Given("User open complaintz app")
    public void userOpenComplaintzApp() {
        assertEquals("com.example.complainz", driver.getCurrentPackage());
    }

    @And("User click Skip button")
    public void userClickSkipButton() {
        WebElement skipButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]"));
        skipButton.click();
    }

    @And("User click Sudah Punya Akun, Masuk button")
    public void userClickSudahPunyaAkunMasukButton() {
        WebElement loginButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sudah Punya Akun, Masuk\"]"));
        loginButton.click();
    }

    @And("User click Masuk button")
    public void userClickMasukButton() {
        WebElement masukButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]"));
        masukButton.click();
    }


    @And("User input login Username or Email {string}")
    public void userInputLoginUsernameOrEmail(String keyword) {
        WebElement usernameLoginFieldInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        usernameLoginFieldInput.click();
        usernameLoginFieldInput.sendKeys(keyword);
        
    }

    @And("User input login Password {string}")
    public void userInputLoginPassword(String keyword) {
        WebElement passwordLoginFieldInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        passwordLoginFieldInput.click();
        passwordLoginFieldInput.sendKeys(keyword);
    }


    @Then("User see login success message")
    public void userSeeLoginSuccessMessage() {
        WebElement loginSucessMessage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Login Berhasil\"]"));
        String successMessage = loginSucessMessage.getAttribute("content-desc");
        assertEquals("Login Berhasil", successMessage);
    }

    @Then("User see login error message")
    public void userSeeLoginErrorMessage() {
        WebElement loginErrorMessage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Username atau password salah\"]"));
        String errorMessage = loginErrorMessage.getAttribute("content-desc");
        assertEquals("Username atau password salah", errorMessage);
    }

    @And("User click Lihat Semua button")
    public void userClickLihatSemuaButton() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1200));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(5),
                PointerInput.Origin.viewport(), 530, 100));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement lihatSemuaButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lihat Semua\"]"));
        lihatSemuaButton.click();
    }

    @And("User click Dosen dan Staf Akademik button")
    public void userClickDosenDanStafAkademikButton() {
        WebElement dosenStafAkademikButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Dosen dan Staff Akademik\"]"));
        dosenStafAkademikButton.click();
    }

    @And("User click Sarana dan Prasarana button")
    public void userClickSaranaDanPrasaranaButton() {
        WebElement saranaPrasaranaButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Sarana dan Prasarana\"]"));
        saranaPrasaranaButton.click();
    }

    @And("User click Sistem Perkuliahan button")
    public void userClickSistemPerkuliahanButton() {
        WebElement sistemPerkuliahanButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Sistem Perkuliahan\"]\n"));
        sistemPerkuliahanButton.click();
    }

    @And("User click Organisasi Mahasiswa button")
    public void userClickOrganisasiMahasiswaButton() {
        WebElement organisasiMahasiswaButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Organisasi Mahasiswa\"]"));
        organisasiMahasiswaButton.click();
    }

    @And("User click Sesama Mahasiswa button")
    public void userClickSesamaMahasiswaButton() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1000));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), 530, 100));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement sesamaMahasiswaButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Sesama Mahasiswa\"]"));
        sesamaMahasiswaButton.click();
    }

    @And("User click Lainnya button")
    public void userClickLainnyaButton() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1000));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), 530, 100));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement lainnyaButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Lainnya\"]"));
        lainnyaButton.click();
    }

    @And("User go to Laporan page")
    public void userGoToLaporanPage() {
        WebElement laporanTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Laporan\"]"));
        String laporan = laporanTitle.getAttribute("content-desc");
        assertEquals("Laporan", laporan);
    }


    @And("User see Kategori section")
    public void userSeeKategoriSection() {
        WebElement kategoriSection = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Kategori\"]"));
        String kategoriTitle = kategoriSection.getAttribute("content-desc");
        assertEquals("Kategori", kategoriTitle);
    }

    @And("User see all category")
    public void userSeeAllCategory() {
        WebElement laporanSection = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Laporan\"]"));
        String laporanTitle = laporanSection.getAttribute("content-desc");
        assertEquals("Laporan", laporanTitle);
    }

    @And("User click Selengkapnya button")
    public void userClickSelengkapnyaButton() {
        WebElement selengkapnyaButton = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Selengkapnya\"])[1]"));
        selengkapnyaButton.click();
    }

    @Then("User see komentar of Laporan")
    public void userSeeKomentarOfLaporan() {
        WebElement laporanDetail = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Komentar\"]"));
        String komentarPage = laporanDetail.getAttribute("content-desc");
        assertEquals("Komentar", komentarPage);
    }

    @And("User click Lihat Berita Terkini button")
    public void userClickLihatBeritaTerkiniButton() {
        WebElement beritaButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lihat Berita Terkini\"]"));
        beritaButton.click();
    }

    @And("User go to Berita page")
    public void userGoToBeritaPage() {
        WebElement beritaSection = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Berita Terkini\"]"));
        String beritaTitle = beritaSection.getAttribute("content-desc");
        assertEquals("Berita Terkini", beritaTitle);
    }

    @And("User click one of the Berita")
    public void userClickOneOfTheBerita() {
        WebElement readButton = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Selengkapnya\"])[1]"));
        readButton.click();
    }

    @Then("User see the Berita")
    public void userSeeTheBerita() {
        WebElement beritaPage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Baca Juga\"]"));
        String bacaJuga = beritaPage.getAttribute("content-desc");
        assertEquals("Baca Juga", bacaJuga);
    }


    @And("User click Buat Akun Baru")
    public void userClickBuatAkunBaru() {
        WebElement registerButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Buat Akun Baru\"]"));
        registerButton.click();
    }

    @And("User input register Username {string}")
    public void userInputRegisterUsername(String args) {
        WebElement usernameRegisterInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        usernameRegisterInput.click();
        usernameRegisterInput.sendKeys(randomFullName);
    }

    @And("User input register Email {string}")
    public void userInputRegisterEmail(String args) {
        WebElement emailRegisterInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        emailRegisterInput.click();
        emailRegisterInput.sendKeys(randomEmail);
        driver.navigate().back();
    }

    @And("User input register Nomor Whatsapp {string}")
    public void userInputRegisterNomorWhatsapp(String keyword) {
        WebElement noWhatsappInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        noWhatsappInput.click();
        noWhatsappInput.sendKeys(keyword);
        driver.navigate().back();
    }

    @And("User input register Password {string}")
    public void userInputRegisterPassword(String keyword) {
        WebElement passwordRegisterInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
        passwordRegisterInput.click();
        passwordRegisterInput.sendKeys(keyword);
        driver.navigate().back();
    }

    @And("User input register Confirm Password {string}")
    public void userInputRegisterConfirmPassword(String keyword) {
        WebElement confirmPasswordInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
        confirmPasswordInput.click();
        confirmPasswordInput.sendKeys(keyword);
        driver.navigate().back();
    }

    @And("User click Daftar button")
    public void userClickDaftarButton() {
        WebElement daftarButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]"));
        daftarButton.click();
    }

    @And("User click Riwayat Laporan Button")
    public void userClickRiwayatLaporanButton() {
        WebElement riwayatLaporanButton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
        riwayatLaporanButton.click();
    }

    @And("User go to Riwayat Laporan Page")
    public void userGoToRiwayatLaporanPage() {
        WebElement riwayatLaporanPage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Riwayat Laporan\"]"));
        String riwayatLaporan = riwayatLaporanPage.getAttribute("content-desc");
        assertEquals("Riwayat Laporan", riwayatLaporan);
    }

    @And("User click Detail Button")
    public void userClickDetailButton() {
        WebElement detailBUtton = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Detail\"])[1]"));
        detailBUtton.click();
    }

    @And("User see Status Complaint")
    public void userSeeStatusComplaint() {
        WebElement statusComplaintPage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Status Complaint\"]"));
        String statusComplaint = statusComplaintPage.getAttribute("content-desc");
        assertEquals("Status Complaint", statusComplaint);
    }

    @And("User click Create Complaint button")
    public void userClickCreateComplaintButton() {
        WebElement createComplaintButton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"));
        createComplaintButton.click();
    }

    @And("User click Pengaduan button")
    public void userClickPengaduanButton() {
        WebElement pengaduanButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Pengaduan\"]"));
        pengaduanButton.click();
    }

    @And("User click Aspirasi button")
    public void userClickAspirasiButton() {
        WebElement aspirasiButton = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Aspirasi\"]"));
        aspirasiButton.click();
    }

    @And("User input complaint message {string}")
    public void userInputComplaintMessage(String keyword) {
        WebElement complaintInput = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
        complaintInput.click();
        complaintInput.sendKeys(keyword);
        driver.navigate().back();
    }

    @And("User click Jenis Laporan Terbuka button")
    public void userClickJenisLaporanTerbukaButton() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1000));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), 530, 100));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement terbukaButton = driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Terbuka\"]"));
        terbukaButton.click();
    }

    @And("User click Jenis Laporan Tertutup button")
    public void userClickJenisLaporanTertutupButton() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                PointerInput.Origin.viewport(), 530, 1000));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), 530, 100));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(dragNDrop));
        WebElement tertutupButton = driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@content-desc=\"Rahasia\"]"));
        tertutupButton.click();
    }

    @And("User click Submit Complaint button")
    public void userClickSubmitComplaintButton() {
        WebElement submitComplaintButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]"));
        submitComplaintButton.click();
    }

    @And("User see success message")
    public void userSeeSuccessMessage() {
        WebElement successComplaint = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lihat Laporan\"]"));
        String successMessage = successComplaint.getAttribute("content-desc");
        assertEquals("Lihat Laporan", successMessage);
    }

    @And("User click Category Dosen dan Staff Akademik button")
    public void userClickCategoryDosenDanStaffAkademikButton() {
        WebElement category1Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Dosen dan Staff Akademik\"]"));
        category1Button.click();
    }

    @And("User click Category Sarana dan Prasarana button")
    public void userClickCategorySaranaDanPrasaranaButton() {
        WebElement category2Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sarana dan Prasarana\"]"));
        category2Button.click();
    }

    @And("User click Category Organisasi Mahasiswa button")
    public void userClickCategoryOrganisasiMahasiswaButton() {
        WebElement category3Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Organisasi Mahasiswa\"]"));
        category3Button.click();
    }

    @And("User click Category Sistem Perkuliahan button")
    public void userClickCategorySistemPerkuliahanButton() {
        WebElement category4Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Sistem Perkuliahan\"]"));
        category4Button.click();
    }

    @And("User click Category Mahasiswa button")
    public void userClickCategoryMahasiswaButton() {
        WebElement category5Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Mahasiswa\"]"));
        category5Button.click();
    }

    @And("User click Category Lainnya button")
    public void userClickCategoryLainnyaButton() {
        WebElement category6Button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lainnya\"]"));
        category6Button.click();
    }
}
