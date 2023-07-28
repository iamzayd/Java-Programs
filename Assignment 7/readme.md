Rational Number Java Library This Java library provides an implementation of rational numbers, which are fractions of two integers.

Usage Creating a Rational Number To create a new RationalNumber instance, use the following constructor:

java Copy code RationalNumber rational = new RationalNumber(numerator, denominator); where numerator and denominator are integers representing the numerator and denominator of the fraction, respectively. If the denominator is zero, an IllegalArgumentException will be thrown.

Operations The following operations are supported:

Addition: rational1.add(rational2) Subtraction: rational1.subtract(rational2) Multiplication: rational1.multiply(rational2) Division: rational1.divide(rational2) Equality check: rational1.equals(rational2) Conversion to double: rational.toDouble() Absolute value: rational.abs()
