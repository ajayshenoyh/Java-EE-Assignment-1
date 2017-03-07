package edu.fullerton.cs476.model;

/**
 * Created by ajay on 2/27/17.
 */
public class Operation {
    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    String operation;

    int firstNumber;
    int secondNumber;

    public String getoperation() {
        return operation;
    }

    public void setoperation(String operation) {
        this.operation = operation;
    }


    public void setResult(int result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    double result;

    public Operation() {

    }

    public Operation(String mode, int firstNo, int secondNo) {
        this.setFirstNumber(firstNo);
        this.setSecondNumber(secondNo);
        if (mode == "add") {
            this.setoperation("add");
            this.result = firstNo + secondNo;
        } else if (mode == "subtract") {
            this.setoperation("subtract");
            this.result = firstNo - secondNo;
        } else if (mode == "multiply") {
            this.setoperation("multiply");
            this.result = firstNo * secondNo;
        } else {

            this.setoperation("divide");
            this.result = (double)firstNo / secondNo;
        }
    }
}
