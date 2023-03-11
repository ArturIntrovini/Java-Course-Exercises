public class ComplexNumber {

    private double real = 0;
    private double imaginary = 0;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double add(double real, double imaginary) {
        this.real = real + getReal();
        this.imaginary = imaginary + getImaginary();

        return real + imaginary;
    }

    public double add(ComplexNumber complexNumber) {
        return real + imaginary;
    }

    public double subtract(double real, double imaginary) {
        this.real = real - getReal();
        this.imaginary = imaginary - getImaginary();

        return real + imaginary;
    }

    public double subtract(ComplexNumber complexNumber) {
        this.real = real - complexNumber.getReal();
        this.imaginary = imaginary - complexNumber.getImaginary();

        return real + imaginary;
    }



}
