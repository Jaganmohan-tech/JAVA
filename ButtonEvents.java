import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.geometry.*;

public class ButtonEvents extends Application
{
	int clrid=0;
	public void start(Stage ps)
	{
		Circle c=new Circle();
		c.setRadius(80);
		c.setFill(Color.GREEN);
		c.setStroke(Color.BLACK);
		Button btn=new Button();
		btn.setText("change color");
		GridPane gp=new GridPane();
		gp.add(c,0,0);
		gp.add(btn,0,1);
		gp.setVgap(15);
		gp.setAlignment(Pos.CENTER);
		gp.setGridLinesVisible(false);
		GridPane.setHalignment(c,HPos.CENTER);
		GridPane.setHalignment(btn,HPos.CENTER);
		Scene s=new Scene(gp,400,300);
		ps.setScene(s);
		ps.setTitle("JAVAFX BUTTON WITH EVENT");
		ps.show();
		
		Color[] clr={Color.RED,Color.BLUE,Color.PINK,Color.YELLOW,Color.BROWN};
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				c.setFill(clr[clrid]);
				clrid++;
				if(clrid==clr.length)
					clrid=0;

			}
		});
	}
	public static void main(String[] args)
	{
		launch(args);
	} 
}