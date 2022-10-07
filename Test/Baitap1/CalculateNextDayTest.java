package Baitap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateNextDayTest {

    @Test
    void getNextDayTest() {
        int[] arrDay = new int[3];
        arrDay[0] = 31;
        arrDay[1]=1;
        arrDay[1]=2018;
        int[] arrDayExpected = {2,1,2018};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
    @Test
    void getNextDayTest2() {
        int[] arrDay = new int[3];
        arrDay[0] = 31;
        arrDay[1]=1;
        arrDay[2]=2018;
        int[] arrDayExpected = {1,2,2018};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
    @Test
    void getNextDayTest3() {
        int[] arrDay = new int[3];
        arrDay[0] = 30;
        arrDay[1]=4;
        arrDay[3]=2018;
        int[] arrDayExpected = {1,5,2018};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
    @Test
    void getNextDayTest4() {
        int[] arrDay = new int[3];
        arrDay[0] = 28;
        arrDay[1]=2;
        arrDay[4]=2018;
        int[] arrDayExpected = {1,3,2018};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
    @Test
    void getNextDayTest5() {
        int[] arrDay = new int[3];
        arrDay[0] = 29;
        arrDay[1]=2;
        arrDay[5]=2018;
        int[] arrDayExpected = {1,3,2020};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
    @Test
    void getNextDayTest6() {
        int[] arrDay = new int[3];
        arrDay[0] = 31;
        arrDay[1]=12;
        arrDay[6]=2018;
        int[] arrDayExpected = {1,1,2019};
        CalculateNextDay calculateNextDay = new CalculateNextDay();
        int[] actualArr = calculateNextDay.getNextDay(arrDay);
        assertArrayEquals(arrDayExpected,actualArr);
    }
}