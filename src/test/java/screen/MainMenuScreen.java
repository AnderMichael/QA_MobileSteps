package screen;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainMenuScreen {
    public Button newButton = new Button(By.id("nl.bryanderidder.byheart:id/addPileBtn"));
    public Button yourPileButton = new Button(By.xpath("//android.widget.TextView[@resource-id=\"nl.bryanderidder.byheart:id/tvPileFront\" and @text=\"Your pile\"]"));
    public Label getPileName(String name){
        return new Label(By.xpath(String.format("//android.widget.TextView[@resource-id=\"nl.bryanderidder.byheart:id/tvPileFront\" and @text=\"%s\"]", name)));
    }
}
