package main;

/**
 * Created by kasthuri on 9/7/16.
 *
 * Class to get the Triangle Type.
 *
 */
public class TypeOfTriangleImp implements TypeOfTriangle {

    /**
     * Gets the type of the Triangle.
     *
     * @param triangle
     * @return
     */
    @Override
    public String getTriangleType(Triangle triangle) {

        if (triangle == null)
            return null;

        if (isEquilateral(triangle))
            return  TriangleTypeEnum.Equilateral.name();

        if (isIsosceles(triangle))
            return TriangleTypeEnum.Isosceles.name();

        if (isScalene(triangle))
            return  TriangleTypeEnum.Scalene.name();

        return null;
    }

    /**
     * Builds the triangle with three side of the triangle.
     *
     * @param lengthOfSide1
     * @param lengthOfSide2
     * @param lengthOfSide3
     * @return
     */
    @Override
    public Triangle buildTriangle(int lengthOfSide1,
                              int lengthOfSide2,
                              int lengthOfSide3) {
        if (lengthOfSide1 == 0 ||
                lengthOfSide2 == 0 ||
                lengthOfSide3 == 0) {
            return null;
        }

        Triangle triangle = new Triangle();
        triangle.setLengthOfSide1(lengthOfSide1);
        triangle.setLengthOfSide2(lengthOfSide2);
        triangle.setLengthOfSide3(lengthOfSide3);

        return triangle;

    }

    /**
     * Checks if the triangle is Equilateral.
     *
     * @param triangle
     * @return
     */
    @Override
    public boolean isEquilateral(Triangle triangle) {
        return ((triangle.getLengthOfSide1() == triangle.getLengthOfSide2()) &&
                triangle.getLengthOfSide2() == triangle.getLengthOfSide3());
    }

    /**
     * Checks if the triangle is Isosceles.
     *
     * @param triangle
     * @return
     */
    @Override
    public boolean isIsosceles(Triangle triangle) {
        return (!isEquilateral(triangle) &&
                (          (triangle.getLengthOfSide1() == triangle.getLengthOfSide2()) ||
                           (triangle.getLengthOfSide2() == triangle.getLengthOfSide3()) ||
                           (triangle.getLengthOfSide1() == triangle.getLengthOfSide3())
                ));
    }

    /**
     *
     * Checks if the triangle is Scalene.
     *
     * @param triangle
     * @return
     */
    @Override
    public boolean isScalene(Triangle triangle) {
        return (!isEquilateral(triangle) && !isIsosceles(triangle));
    }
}
