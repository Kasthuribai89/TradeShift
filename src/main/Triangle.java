package main;

/**
 * Created by kasthuri on 9/7/16.
 *
 * Getter and Setter of Triangle Object.
 *
 */
public class Triangle {

    int lengthOfSide1;
    int lengthOfSide2;
    int lengthOfSide3;

    public int getLengthOfSide1() {
        return lengthOfSide1;
    }

    public void setLengthOfSide1(int lengthOfSide1) {
        this.lengthOfSide1 = lengthOfSide1;
    }

    public int getLengthOfSide2() {
        return lengthOfSide2;
    }

    public void setLengthOfSide2(int lengthOfSide2) {
        this.lengthOfSide2 = lengthOfSide2;
    }

    public int getLengthOfSide3() {
        return lengthOfSide3;
    }

    public void setLengthOfSide3(int lengthOfSide3) {
        this.lengthOfSide3 = lengthOfSide3;
    }

    // Custom equal method
    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Triangle)) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return Integer.compare(lengthOfSide1, triangle.getLengthOfSide1()) == 0
                && Integer.compare(lengthOfSide2, triangle.getLengthOfSide2()) == 0
                && Integer.compare(lengthOfSide3, triangle.getLengthOfSide3()) == 0;


    }



}
