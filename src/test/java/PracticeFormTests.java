import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class PracticeFormTests {

    @Test
    void formTest() {

        Selenide.open("https://demoqa.com/automation-practice-form");

        Selenide.$("#firstName").setValue("gordon");
        Selenide.$("#lastName").setValue("freeman");
        Selenide.$("#userEmail").setValue("freeman_g@black.mesa");
        Selenide.$("label[for='gender-radio-1']").click();
        Selenide.$("#userNumber").setValue("9998887766");
        Selenide.$("#subjectsInput").setValue("physics").pressEnter();

//    Date of Birth
        Selenide.$("label[for='hobbies-checkbox-1']").click();
        Selenide.$("label[for='hobbies-checkbox-2']").click();
        Selenide.$("label[for='hobbies-checkbox-3']").click();


        Selenide.$("#submit").scrollTo();


//Picture
        Selenide.$("textarea.form-control").setValue("10400 Northeast Fourth Street Floor 14 Bellevue, WA 98004 USA");
////state and city
//        Selenide.$("#userNumber").setValue("9998887766");
//        Selenide.$("#userNumber").setValue("9998887766");


        Selenide.sleep(20000);

    }
}
