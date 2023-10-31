package testSuites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import screen.MainMenuScreen;
import screen.NewCardScreen;
import screen.YourPileScreen;
import session.Session;

public class NewCardYourPileTest {
    MainMenuScreen mainMenuScreen = new MainMenuScreen();
    YourPileScreen yourPileScreen = new YourPileScreen();
    NewCardScreen newCardScreen = new NewCardScreen();


    @Test
    public void createACard() {
        String frontCard = "Say my name!";
        String backCard = "Happy Birthday Huguito!";
        mainMenuScreen.yourPileButton.click();

        yourPileScreen.newCardButton.click();

        newCardScreen.frontInput.setText(frontCard);
        newCardScreen.backInput.setText(backCard);
        newCardScreen.confirmButton.click();

        Assertions.assertTrue(yourPileScreen.getCardTextName(frontCard).isControlDisplayed(), "Error! no se introdujo el frontCard");
        Assertions.assertTrue(yourPileScreen.getCardTextName(backCard).isControlDisplayed(), "Error! no se introdujo el backCard");

    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeApp();
    }
}
