package screen;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class YourPileScreen {
    public Button newCardButton = new Button(By.id("nl.bryanderidder.byheart:id/buttonAdd"));

    public Label getCardTextName(String name){
        return new Label(By.xpath(String.format("//android.widget.TextView[@text=\"%s\"]", name)));
    }
}
