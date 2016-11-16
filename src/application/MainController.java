package application;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController {
	String sign = "";
	String[][] tab = { { "", "", "" }, { "", "", "" }, { "", "", "" }, };
	/*
	 * tab[0][0]=[]""; tab[0][1]=""; tab[0][2]=""; tab[1][0]=""; tab[1][1]="";
	 */
	boolean isPlayer1 = true;
	boolean koniec = false;
	@FXML
	Label la1;
	@FXML
	Button bu1;
	@FXML
	Button bu2;
	@FXML
	Button bu3;
	@FXML
	Button bu4;
	@FXML
	Button bu5;
	@FXML
	Button bu6;
	@FXML
	Button bu7;
	@FXML
	Button bu8;
	@FXML
	Button bu9;

	@FXML
	public void clear1(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true && bu1.getText()=="") {
			bu1.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		}else if (bu1.getText()=="") {
			bu1.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu1.getText();
		tab[0][0] = sign;
		checkWhoWin();
		checkDraw();

	}

	@FXML
	public void clear2(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu2.getText()=="") {
			bu2.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu2.getText()=="") {
			bu2.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu2.getText();
		tab[0][1] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear3(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu3.getText()=="") {
			bu3.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu3.getText()=="") {
			bu3.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu3.getText();
		tab[0][2] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear4(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true && bu4.getText()=="") {
			bu4.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu4.getText()=="") {
			bu4.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu4.getText();
		tab[1][0] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear5(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu5.getText()=="") {
			bu5.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu5.getText()=="") {
			bu5.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu5.getText();
		tab[1][1] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear6(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu6.getText()=="") {
			bu6.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu6.getText()=="") {
			bu6.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu6.getText();
		tab[1][2] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear7(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu7.getText()=="") {
			bu7.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu7.getText()=="") {
			bu7.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu7.getText();
		tab[2][0] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear8(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu8.getText()=="") {
			bu8.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu8.getText()=="") {
			bu8.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu8.getText();
		tab[2][1] = sign;
		checkWhoWin();
		checkDraw();
	}

	@FXML
	public void clear9(ActionEvent event) {
		checkCzyKoniec();
		if (isPlayer1 == true&& bu9.getText()=="") {
			bu9.setText("x");
			isPlayer1 = false;
			la1.setText("Mariusz turn  (O)");
		} else if (bu9.getText()=="") {
			bu9.setText("O");
			isPlayer1 = true;
			la1.setText("Pawe³ turn  (X)");
		}
		sign = bu9.getText();
		tab[2][2] = sign;
		checkWhoWin();
		checkDraw();
	}

	public void checkTab() {
		boolean full = true;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j].equals("")) {
					full = false;
				}
			}
		}
		if (full == true) {
			checkWhoWin();
		}
	}

	public void fullingTab(String[][] g) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				g[i][j] = "";
			}
		}
	}

	public void czyszczenieButtons() {
		bu1.setText("");
		bu2.setText("");
		bu3.setText("");
		bu4.setText("");
		bu5.setText("");
		bu6.setText("");
		bu7.setText("");
		bu8.setText("");
		bu9.setText("");
		
	}
	
	public void cleanTab(){
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = "";
			}
		}
	}
	
	public void checkCzyKoniec(){
		if (koniec == true) {
			cleanTab();
			czyszczenieButtons();
			koniec = false;
		}
	}
	
	public void checkDraw(){
		int count=0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if(tab[i][j]==""){
					count++;
				}
			}
		}
		if (count==0 && koniec==false) {
			la1.setText("Draw!!!");
			koniec=true;
		}
	}
	
	public void checkWhoWin() {
		// if (! ((tab[0][0].equals("null") && tab[1][0].equals("null") &&
		// tab[2][0].equals("null"))))

		if (tab[0][0].equals("x")) {
			if (tab[1][0].equals("x")) {
				if (tab[2][0].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[0][0].equals("O")) {
			if (tab[1][0].equals("O")) {
				if (tab[2][0].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}
		if (tab[0][0].equals("x")) {
			if (tab[0][1].equals("x")) {
				if (tab[0][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}
		if (tab[0][0].equals("O")) {
			if (tab[0][1].equals("O")) {
				if (tab[0][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}
		if (tab[0][2].equals("x")) {
			if (tab[1][2].equals("x")) {
				if (tab[2][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[0][2].equals("O")) {
			if (tab[1][2].equals("O")) {
				if (tab[2][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[2][0].equals("x")) {
			if (tab[2][1].equals("x")) {
				if (tab[2][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}
		if (tab[2][0].equals("O")) {
			if (tab[2][1].equals("O")) {
				if (tab[2][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[0][0].equals("x")) {
			if (tab[1][1].equals("x")) {
				if (tab[2][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}
		if (tab[0][0].equals("O")) {
			if (tab[1][1].equals("O")) {
				if (tab[2][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[2][0].equals("x")) {
			if (tab[1][1].equals("x")) {
				if (tab[0][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}

		if (tab[2][0].equals("O")) {
			if (tab[1][1].equals("O")) {
				if (tab[0][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}
		
		if (tab[0][1].equals("x")) {
			if (tab[1][1].equals("x")) {
				if (tab[2][1].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}
		
		if (tab[0][1].equals("O")) {
			if (tab[1][1].equals("O")) {
				if (tab[2][1].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}
		
		if (tab[1][0].equals("x")) {
			if (tab[1][1].equals("x")) {
				if (tab[1][2].equals("x")) {
					la1.setText("pawe³ wygra³!!");
					koniec = true;
				}
			}
		}
		
		if (tab[1][0].equals("O")) {
			if (tab[1][1].equals("O")) {
				if (tab[1][2].equals("O")) {
					la1.setText("mariusz wygra³!!");
					koniec = true;
				}
			}
		}

	}

}
