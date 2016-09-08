package tests;

import junit.framework.Assert;
import main.Triangle;
import main.TriangleTypeEnum;
import main.TypeOfTriangleImp;
import org.junit.Test;

/**
 * Created by kasthuri on 9/7/16.
 */
public class TypeOfTriangleImpTest {

    TypeOfTriangleImp typeOfTriangleImp = new TypeOfTriangleImp();

    /**
     * Test to check buildTriangle()
     */
    @Test
    public void buildTriangleTest () {
        Triangle triangle =
                typeOfTriangleImp.buildTriangle(10,0,0);
        Assert.assertEquals(triangle, null);

        Triangle triangle1 =
                typeOfTriangleImp.buildTriangle(10,10,0);
        Assert.assertEquals(triangle1, null);


        Triangle triangle2 =
                typeOfTriangleImp.buildTriangle(10,12,15);
        Assert.assertEquals(triangle2.getLengthOfSide1(), 10);
        Assert.assertEquals(triangle2.getLengthOfSide2(), 12);
        Assert.assertEquals(triangle2.getLengthOfSide3(), 15);

    }

    /**
     * Test to check getTriangleType()
     */
    @Test
    public void getTriangleTypeTest () {

        Triangle triangle =
                typeOfTriangleImp.buildTriangle(10,0,10);
        Assert.assertEquals(typeOfTriangleImp.getTriangleType(triangle),
                null);

        Triangle triangle1 =
                typeOfTriangleImp.buildTriangle(10,10,10);
        Assert.assertEquals(typeOfTriangleImp.getTriangleType(triangle1),
                TriangleTypeEnum.Equilateral.name());

        Triangle triangle2 =
                typeOfTriangleImp.buildTriangle(10,10,15);
        Assert.assertEquals(typeOfTriangleImp.getTriangleType(triangle2),
                TriangleTypeEnum.Isosceles.name());

        Triangle triangle3 =
                typeOfTriangleImp.buildTriangle(10,12,15);
        Assert.assertEquals(typeOfTriangleImp.getTriangleType(triangle3),
                TriangleTypeEnum.Scalene.name());

    }

    /**
     * Test of check isEquilateral()
     */
    @Test
    public void isEquilateralTest () {
        boolean actual_output;

        Triangle triangle1 =
                typeOfTriangleImp.buildTriangle(10, 10, 10);
        actual_output = typeOfTriangleImp.isEquilateral(triangle1);
        Assert.assertTrue(actual_output);

        Triangle triangle2 =
                typeOfTriangleImp.buildTriangle(10,12,10);
        actual_output = typeOfTriangleImp.isEquilateral(triangle2);
        Assert.assertFalse(actual_output);

        Triangle triangle3 =
                typeOfTriangleImp.buildTriangle(10,12,15);
        actual_output = typeOfTriangleImp.isEquilateral(triangle3);
        Assert.assertFalse(actual_output);

    }

    /**
     * Test of check isIsosceles()
     */
    @Test
    public void isIsoscelesTest () {

        boolean actual_output;

        Triangle triangle1 =
                typeOfTriangleImp.buildTriangle(10, 10, 10);
        actual_output = typeOfTriangleImp.isIsosceles(triangle1);
        Assert.assertFalse(actual_output);

        Triangle triangle2 =
                typeOfTriangleImp.buildTriangle(10,12,10);
        actual_output = typeOfTriangleImp.isIsosceles(triangle2);
        Assert.assertTrue(actual_output);

        Triangle triangle3 =
                typeOfTriangleImp.buildTriangle(10,12,15);
        actual_output = typeOfTriangleImp.isIsosceles(triangle3);
        Assert.assertFalse(actual_output);

    }

    /**
     * Test of check isScalene()
     */
    @Test
    public void isScaleneTest () {

        boolean actual_output;

        Triangle triangle1 =
                typeOfTriangleImp.buildTriangle(10, 10, 10);
        actual_output = typeOfTriangleImp.isScalene(triangle1);
        Assert.assertFalse(actual_output);

        Triangle triangle2 =
                typeOfTriangleImp.buildTriangle(10,12,10);
        actual_output = typeOfTriangleImp.isScalene(triangle2);
        Assert.assertFalse(actual_output);

        Triangle triangle3 =
                typeOfTriangleImp.buildTriangle(10,12,15);
        actual_output = typeOfTriangleImp.isScalene(triangle3);
        Assert.assertTrue(actual_output);

    }

    @Test
    public void similarTriangleTest () {
        Triangle triangle1;
        Triangle triangle2 ;

        triangle1 = typeOfTriangleImp.buildTriangle(10,10,10);
        triangle2 = typeOfTriangleImp.buildTriangle(10,10,10);
        Assert.assertTrue(triangle1.equals(triangle2));

        triangle1 = typeOfTriangleImp.buildTriangle(10,10,10);
        triangle2 = typeOfTriangleImp.buildTriangle(10,12,10);
        Assert.assertFalse(triangle1.equals(triangle2));

        triangle1 = typeOfTriangleImp.buildTriangle(10,12,15);
        triangle2 = typeOfTriangleImp.buildTriangle(10,12,15);
        Assert.assertTrue(triangle1.equals(triangle2));


    }

}
