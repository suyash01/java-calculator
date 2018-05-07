import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class MainWindowController {

    private String input = "";

    @FXML
    private TextField inputField;
    @FXML
    private Label resultLabel;

    @FXML
    private void zeroClicked(){
        if(!input.equals("")) {
            input += '0';
            inputField.setText(input);
        }
    }

    @FXML
    private void oneClicked(){
        input += '1';
        inputField.setText(input);
    }

    @FXML
    private void twoClicked(){
        input += '2';
        inputField.setText(input);
    }

    @FXML
    private void threeClicked(){
        input += '3';
        inputField.setText(input);
    }

    @FXML
    private void fourClicked(){
        input += '4';
        inputField.setText(input);
    }

    @FXML
    private void fiveClicked(){
        input += '5';
        inputField.setText(input);
    }

    @FXML
    private void sixClicked(){
        input += '6';
        inputField.setText(input);
    }

    @FXML
    private void sevenClicked(){
        input += '7';
        inputField.setText(input);
    }

    @FXML
    private void eightClicked(){
        input += '8';
        inputField.setText(input);
    }

    @FXML
    private void nineClicked(){
        input += '9';
        inputField.setText(input);
    }

    @FXML
    private void dotClicked(){
        input += '.';
        inputField.setText(input);
    }

    @FXML
    private void plusClicked(){
        input += '+';
        inputField.setText(input);
    }

    @FXML
    private void minusClicked(){
        input += '-';
        inputField.setText(input);
    }

    @FXML
    private void multiplyClicked(){
        input += '*';
        inputField.setText(input);
    }

    @FXML
    private void divideClicked(){
        input += '/';
        inputField.setText(input);
    }

    @FXML
    private void backClicked(){
        if(input!=null && input.length()>0) {
            input = input.substring(0, input.length()-1);
            inputField.setText(input);
        }
    }

    @FXML
    private void equalClicked(){
        com.udojava.evalex.Expression expression = new com.udojava.evalex.Expression(input);
        expression.setPrecision(10);
        BigDecimal result = expression.eval();
        resultLabel.setText(result.toString());
    }

    @FXML
    private void clearClicked(){
        input = "";
        inputField.setText("0");
        resultLabel.setText("");
    }
}
