package Baitap2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    void getTriangleClassifierTest1() {
        double canh1 = 2;
        double canh2 = 2;
        double canh3 = 2;
        String expected = "là tam giác đều";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    }
    @Test
    void getTriangleClassifierTest2() {
        double canh1 = 2;
        double canh2 = 2;
        double canh3 = 3;
        String expected = "là tam giác cân";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    }
    @Test
    void getTriangleClassifierTest3() {
        double canh1 = 3;
        double canh2 = 4;
        double canh3 = 5;
        String expected = "là tam giác vuông";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    }
    @Test
    void getTriangleClassifierTest4() {
        double canh1 = 8;
        double canh2 = 2;
        double canh3 = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    }
    @Test
    void getTriangleClassifierTest5() {
        double canh1 = -1;
        double canh2 = 2;
        double canh3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    } @Test
    void getTriangleClassifierTest6() {
        double canh1 = 0;
        double canh2 = 1;
        double canh3 = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.getTriangleClassifier(canh1,canh2,canh3);
        assertEquals(expected,result);
    }
}