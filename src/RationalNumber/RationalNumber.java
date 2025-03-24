package RationalNumber;

public class RationalNumber {
    private int numerator;
    private int denominator;

    private int gcd(int num1, int num2) {
        while (num2 != 0) {
            int t = num2;
            num2 = num1 % num2;
            num1 = t;
        }
        return Math.abs(num1);
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        if (denominator < 0) {
            this.denominator = -denominator;
            this.numerator = -numerator;
        }
    }

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = denominator;

        if (denominator < 0) {
            this.denominator = -denominator;
            this.numerator = -numerator;
        }
        reduce();
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalNumber reciprocal() {
        if (numerator == 0)
            throw new IllegalArgumentException("Khong the lay nghich dao cua 0.");
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber add(RationalNumber op2) {
        int newNumerator = numerator * op2.denominator + op2.numerator * denominator;
        int newDenominator = denominator * op2.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber op2) {
        int newNumerator = numerator * op2.denominator - op2.numerator * denominator;
        int newDenominator = denominator * op2.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber op2) {
        int newNumerator = numerator * op2.numerator;
        int newDenominator = denominator * op2.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber op2) {
        if (op2.numerator == 0) {
            throw new IllegalArgumentException("Không thể chia cho số hữu tỷ bằng 0.");
        }
        return multiply(op2.reciprocal());
    }

    public boolean equals(RationalNumber op2) {
        op2.reduce();
        return (numerator == op2.numerator && denominator == op2.denominator);

    }

    public String toString() {
        return numerator + "/" + denominator;

    }

    public RationalNumber(RationalNumber op2) {
        numerator = op2.numerator;
        denominator = op2.denominator;
    }
}
