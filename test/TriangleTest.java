import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testGetTriangle() {
        int a=2,b=2,c=2;
        String example="equilateral triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
    @Test
    void testGetTriangle1() {
        int a=2,b=2,c=3;
        String example="isosceles triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
    @Test
    void testGetTriangle2() {
        int a=3,b=4,c=5;
        String example="regular triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
    @Test
    void testGetTriangle3() {
        int a=8,b=2,c=3;
        String example="No triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
    @Test
    void testGetTriangle4() {
        int a=-1,b=2,c=1;
        String example="No triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
    @Test
    void testGetTriangle5() {
        int a=0,b=1,c=1;
        String example="No triangle";
        Triangle triangle=new Triangle(a,b,c);
        String result=triangle.getTriangle();
        assertEquals(example,result);
    }
}