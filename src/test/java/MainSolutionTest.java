import org.junit.Test;

import static org.junit.Assert.*;

public class MainSolutionTest {


    MainSolution ms = new MainSolution();


    @Test
    public void shoulReturn1WhenOnlyOneNumberInArray() {

        //given
        int[][] A = {{1, 1}, {1, 1}};

        //when

        int actual = ms.solution(A);
        //then
        assertEquals(1, actual);
    }

    @Test
    public void shoulReturn1WhenOnly1x1DimensionOfArray() {

        //given
        int[][] A = {{1}};
        //when
        int actual = ms.solution(A);
        //then
        assertEquals(1, actual);
    }

    @Test
    public void shoulReturn1WhenOnlyOneRowWithOneValue() {

        //given
        int[][] A = {{1, 1, 1}};
        //when

        int actual = ms.solution(A);
        //then
        assertEquals(1, actual);
    }

    @Test
    public void shoulReturn1WhenOnlyOneColumnWithOneValue() {

        //given
        int[][] A = {{1}, {1}, {1}, {1}};
        //when

        int actual = ms.solution(A);
        //then
        assertEquals(1, actual);
    }

    @Test
    public void randomTest() {

        int[][] A15 = {{1, 1, 1, 1, 1}, {1, 2, 5, 1, 1}, {1, 3, 5, 3, 1}, {2, 3, 2, 3, 1}, {2, 3, 2, 1, 1}};

        int expected15 = 7;
        int actual15 = ms.solution(A15);
        assertEquals(expected15, actual15);


        int[][] A14 = {{1, 1, 2, 3, 5, 4}, {2, 3, 1, 3, 4, 4}, {2, 2, 2, 5, 4, 3}, {5, 5, 5, 5, 4, 4}, {1, 1, 2, 3, 1, 4}, {1, 2, 1, 4, 4, 4}, {1, 1, 1, 4, 2, 1}};

        int expected14 = 18;
        int actual14 = ms.solution(A14);
        assertEquals(expected14, actual14);


        int[][] A9 = {{2, 2, 2, 2, 2, 2, 2}, {2, 1, 1, 1, 1, 1, 2}, {2, 1, 2, 2, 2, 1, 2}, {2, 1, 2, 1, 2, 1, 2}, {2, 1, 2, 2, 2, 1, 2}, {2, 1, 1, 1, 1, 1, 2}, {2, 2, 2, 2, 2, 2, 2}};
        int expected9 = 4;
        int actual9 = ms.solution(A9);
        assertEquals(expected9, actual9);

        int[][] A12 = {{1, 1, 1}, {1, 2, 1}};
        int expected12 = 2;
        int actual12 = ms.solution(A12);
        assertEquals(expected12, actual12);


        int[][] A13 = {{3, 3, 3, 3, 3}, {3, 1, 1, 1, 3}, {3, 1, 2, 1, 3}, {3, 1, 1, 1, 3}, {7, 3, 3, 3, 3}};
        int expected13 = 4;
        int actual13 = ms.solution(A13);
        assertEquals(expected13, actual13);

        int[][] A2 = {{1, 2, 1}, {1, 1, 1}};
        int expected2 = 2;
        int actual2 = ms.solution(A2);
        assertEquals(expected2, actual2);


        int[][] A10 = {{1, 1, 2, 2, 3, 3}, {1, 1, 2, 2, 3, 3}, {1, 1, 2, 2, 3, 3}};
        int expected10 = 3;
        int actual10 = ms.solution(A10);
        assertEquals(expected10, actual10);


        int[][] A0 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected0 = 9;
        int actual0 = ms.solution(A0);
        assertEquals(expected0, actual0);

        int[][] A1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}, {9, 10, 8}};
        int expected1 = 10;
        int actual1 = ms.solution(A1);
        assertEquals(expected1, actual1);


        int[][] A3 = {{3, 1, 2, 1, 1}, {1, 1, 2, 1, 1}, {2, 2, 2, 2, 2}};
        int expected3 = 4;
        int actual3 = ms.solution(A3);
        assertEquals(expected3, actual3);


        int[][] A4 = {{2, 1, 2, 1, 1}, {1, 1, 2, 1, 1}, {2, 2, 2, 2, 2}, {1, 1, 2, 1, 1}, {1, 1, 2, 1, 1}};
        int expected4 = 6;
        int actual4 = ms.solution(A4);
        assertEquals(expected4, actual4);


        int[][] A5 = {{1, 2, 2, 1, 1}, {1, 1, 2, 1, 1}, {2, 2, 2, 2, 2}, {1, 1, 2, 6, 5}, {1, 1, 2, 3, 4}};
        int expected5 = 8;
        int actual5 = ms.solution(A5);
        assertEquals(expected5, actual5);

        int[][] A6 = {{1, 3, 3, 3}, {3, 1, 3, 3}, {3, 3, 1, 3}, {3, 3, 3, 1}};
        int expected6 = 6;
        int actual6 = ms.solution(A6);
        assertEquals(expected6, actual6);

        int[][] A7 = {{1, 3, 3, 3}, {3, 3, 3, 3}, {3, 3, 1, 3}, {3, 3, 3, 1}};
        int expected7 = 4;
        int actual7 = ms.solution(A7);
        assertEquals(expected7, actual7);

        int[][] A8 = {{1, 2}, {2, 1}};
        int expected8 = 4;
        int actual8 = ms.solution(A8);
        assertEquals(expected8, actual8);

        int[][] A11 = {{1, 1, 1, 1}, {1, 1, 2, 1}, {1, 1, 1, 1}};
        int expected11 = 2;
        int actual11 = ms.solution(A11);

        assertEquals(expected11, actual11);

        int[][] A16 = {{1}, {2}};
        int expected16 = 2;
        int actual16 = ms.solution(A16);

        assertEquals(expected16, actual16);

        int[][] A17 = {{1}, {2}, {2},{2}};
        int expected17 = 2;
        int actual17 = ms.solution(A16);

        assertEquals(expected17, actual17);


    }




}