public class Calculator {
    public int num1;
    public int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public int getAddition(){
        return (this.num1 + this.num2);
    }
    public int getSubtraction(){
        return (this.num1 - this.num2);
    }
    public int getMultiply(){
        return (this.num1 * this.num2);
    }
    public int getDivide(){
        return (this.num1 / this.num2);
    }
}
