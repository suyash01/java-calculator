import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainWindowController {

    private String input = "";
    private ArrayList<History> history = new ArrayList<>();

    @FXML
    private TextField inputField;
    @FXML
    private Label resultLabel;
    @FXML
    private ListView historyList;

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
        resultLabel.setText("");
    }

    @FXML
    private void equalClicked(){
        com.udojava.evalex.Expression expression = new com.udojava.evalex.Expression(input);
        expression.setPrecision(10);
        BigDecimal result = expression.eval();
        resultLabel.setText(result.toString());
        history.add(new History(input, result));
        historyList.getItems().setAll(history);
        historyList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    private void clearClicked(){
        input = "";
        inputField.setText("0");
        resultLabel.setText("");
    }

    @FXML
    private void inputChanged(){
        input = inputField.getText();
    }

    @FXML
    private void historyClicked(){
        History history = (History) historyList.getSelectionModel().getSelectedItem();
        input = history.getExpression();
        inputField.setText(history.getExpression());
        resultLabel.setText(history.getResult().toString());
    }
}
