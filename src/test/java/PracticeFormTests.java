import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;

public class PracticeFormTests {

    @Test
    void formTest() {

        Selenide.open("https://demoqa.com/automation-practice-form");


        Selenide.$("#firstName")
                .setValue("gordon");

        Selenide.$("#lastName")
                .setValue("freeman");

        Selenide.$("#userEmail")
                .setValue("freeman_g@black.mesa");

        Selenide.$("label[for='gender-radio-1']")
                .click();

        Selenide.$("#userNumber")
                .setValue("9998887766");

        Selenide.$("#subjectsInput")
                .setValue("physics")
                .pressEnter();

        Selenide.$("#userNumber")
                .setValue("9998887766");

// Date of Birth

        Selenide.$("#dateOfBirthInput")
                .click();

        Selenide.$(".react-datepicker__month-select")
                .selectOptionContainingText("November");

        Selenide.$(".react-datepicker__year-select")
                .selectOptionContainingText("1998");

        Selenide.$$("div[role='option']")
                .findBy(Condition.text("19"))
                .click();


        Selenide.$("label[for='hobbies-checkbox-1']").
                click();
        Selenide.$("label[for='hobbies-checkbox-2']")
                .click();
        Selenide.$("label[for='hobbies-checkbox-3']")
                .click();


// Picture

        File file = new File("static/Gordon.jpg");
        Selenide.$("input[id='uploadPicture']").uploadFile(file);

// State and city

        Selenide.$("textarea.form-control")
                .setValue("10400 Northeast Fourth Street Floor 14 Bellevue, WA 98004 USA");

        Selenide.$("#react-select-3-input")
                .setValue("Rajasthan")
                .pressEnter();

        Selenide.$("#react-select-4-input")
                .setValue("Jaiselmer")
                .pressEnter();

// Send form

        Selenide.$("#submit")
                .scrollTo()
                .click();
        Selenide.sleep(22222);

    }
}
