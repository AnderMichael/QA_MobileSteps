package screen;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewCardScreen {
    public TextBox frontInput = new TextBox(By.id("nl.bryanderidder.byheart:id/etCardFront"));
    public TextBox backInput = new TextBox(By.id("nl.bryanderidder.byheart:id/etCardBack"));
    public Button confirmButton = new Button(By.id("nl.bryanderidder.byheart:id/action_confirm_edit_card"));


}
