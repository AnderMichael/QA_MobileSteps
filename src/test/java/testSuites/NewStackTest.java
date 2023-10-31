package testSuites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import screen.MainMenuScreen;
import screen.NewStackScreen;
import session.Session;

public class NewStackTest {
    MainMenuScreen mainMenuScreen = new MainMenuScreen();
    NewStackScreen newStackScreen = new NewStackScreen();

    @Test
    public void createAStack() {
        String stackName = "Cats Stack";
        mainMenuScreen.newButton.click();

        newStackScreen.nameInput.setText(stackName);
        newStackScreen.confirmButton.click();

        Assertions.assertTrue(mainMenuScreen.getPileName(stackName).isControlDisplayed(), "ERROR no se creo la pila");
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeApp();
    }
}
