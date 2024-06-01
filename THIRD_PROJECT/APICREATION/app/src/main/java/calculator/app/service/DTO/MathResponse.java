package calculator.app.service.DTO;

public class MathResponse {

    int number1;
    int number2;
    int result;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathResponse{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", result=" + result +
                '}';
    }
}
