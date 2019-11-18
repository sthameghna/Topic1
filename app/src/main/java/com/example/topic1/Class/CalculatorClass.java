package com.example.topic1.Class;

public class CalculatorClass {
    private float firstnumber;

    public float getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(float firstnumber) {
        this.firstnumber = firstnumber;
    }

    public float getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(float secondnumber) {
        this.secondnumber = secondnumber;
    }

    private float secondnumber;

    public CalculatorClass(float firstnumber, float secondnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
    }

    private boolean add;

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isSub() {
        return sub;
    }

    public void setSub(boolean sub) {
        this.sub = sub;
    }

    public boolean isDivide() {
        return divide;
    }

    public void setDivide(boolean divide) {
        this.divide = divide;
    }

    public boolean isMultiply() {
        return multiply;
    }

    public void setMultiply(boolean multiply) {
        this.multiply = multiply;
    }

    private boolean sub;
    private boolean divide;
    private boolean multiply;
}
