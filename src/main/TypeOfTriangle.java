package main;

/**
 * Created by kasthuri on 9/7/16.
 *
 * Interface: Contains the list of method to be implemented by
 * TypeOfTriangleImp class.
 *
 */
public interface TypeOfTriangle {

    Triangle buildTriangle (int lengthOfSide1,
                        int lengthOfSide2,
                        int lengthOfSide3);

    String getTriangleType(Triangle triangle);

    boolean isEquilateral (Triangle triangle);

    boolean isIsosceles (Triangle triangle);

    boolean isScalene (Triangle triangle);


}
