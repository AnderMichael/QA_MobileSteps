package screen;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewStackScreen {
    public TextBox nameInput =  new TextBox(By.id("nl.bryanderidder.byheart:id/etPileName"));

    public Button confirmButton = new Button(By.id("nl.bryanderidder.byheart:id/action_confirm_edit_pile"));
}
