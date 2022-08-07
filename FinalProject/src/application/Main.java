/*Name: Long Hoang (preferred name: Ryan)
Date: 12/02/2021

Project description: This program is designed like the memory match game with pre-designed row and column. 
If users math a pair, they get 5 points. If they mismatch it, they will loose a point.

Input: no input
Output: a window with the game 

Comment: 
*/


package application;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	// create constant of number of pairs and rows 
	private static final int PAIRS = 18;
	private static final int ROW = 6;
	
	// check selected tile
	private Tile selected = null;
	// count the click to avoid crash 
	private int clickCount = 2;
	
	// calculate your score 
	private int score = 0;
	// text field for the score
	private Text yourScore = new Text("");
	
	private Parent content() {
		Pane root = new Pane();
		// set the size for the pop-up window
		root.setPrefSize(600, 600);
	
		char c = 'A';
		// create a list
		List<Tile> tiles = new ArrayList<>();
		
		// add tile element into the list
		for (int i = 0; i < PAIRS; i++) {
			tiles.add(new Tile(String.valueOf(c)));
			tiles.add(new Tile(String.valueOf(c)));
			c++;
		}
		
		// shuffle the elements to make it random 
		Collections.shuffle(tiles);
		
		// print the tile element to the pop-up window
		for (int i = 0; i < tiles.size(); i++) {
			Tile tile = tiles.get(i);
			// row
			tile.setTranslateX(60 * (i % ROW));
			//column
			tile.setTranslateY(60 * (i / ROW));
			root.getChildren().add(tile);
		}
		
		// add the score element to the window 
		yourScore.setText("Your Score: " + score);
		yourScore.setX(400);
		yourScore.setY(100);
		// set font and size
		yourScore.setFont(Font.font("Courier", 20));
		root.getChildren().add(yourScore);
		
		return root;
		
	}
	
	private class Tile extends StackPane {
		
		private Text text = new Text();
		public Tile(String value) {
			
			// design the tile
			Rectangle box = new Rectangle(50, 50);
			box.setFill(null);
			box.setStroke(Color.BLACK);
			
			text.setText(value);
			text.setFont(Font.font(30));
			
			setAlignment(Pos.CENTER);
			
			getChildren().addAll(box, text);
			
			// when the tile clicked
			setOnMouseClicked(this::eventOnClick);
			
			close();
			
		}
		
		
		public void eventOnClick(MouseEvent event) {
			if (ifOpen() || clickCount == 0) 
				return;
			clickCount --;
			
			// check if the tile is clicked 
			if (selected == null) {
				selected = this;
				open(() -> {});
			}
			else {
				open(() -> {
					// if mismatch
					if (!rightPair(selected)) {
						selected.close();
						this.close();
						score--;
						yourScore.setText("Score = " + score);
						
						
					}
					// if match 
					else {
						score += 5;
						yourScore.setText("Score = " + score);
					}
					
					selected = null;
					clickCount = 2;
					
				});
				
			}
			
		}
		
		// open the tile value
		public boolean ifOpen() {
			return text.getOpacity() == 1;
			
		}
		
		// check if is the right pair
		public boolean rightPair(Tile other) {
			return text.getText().equals(other.text.getText());
			
		}
		
		// animation on open
		public void open(Runnable action) {

			FadeTransition fd = new FadeTransition(Duration.seconds(0.1), text);
			fd.setToValue(1);
			fd.setOnFinished(e -> action.run());
			
			fd.play();
		}
		// animation on close 
		public void close() {
			FadeTransition fd = new FadeTransition(Duration.seconds(0.4), text);
			fd.setToValue(0);
			fd.play();
			
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// set design 
			primaryStage.setScene(new Scene(content()));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
