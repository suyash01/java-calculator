import java.math.BigDecimal;

public class History {

    private String expression;
    private BigDecimal result;

    History(String expression, BigDecimal result){
        this.expression = expression;
        this.result = result;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return expression + " = " + result;
    }
}
