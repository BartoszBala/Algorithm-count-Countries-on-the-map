public class MainSolution {

    public int solution(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int possibleCountries = n * m;
        int up = 1;
        int right = 1;


        boolean checkNorth = false;

        for (int i = 0; i < n; i++) {

            if (i != 0)
                checkNorth = true;
            for (int j = 0; j < m; j++) {
//

                if (n != 1 && i != 0 && checkNorth && A[i][j] == A[i - up][j]) {


                    possibleCountries = possibleCountries - 1;
                    if (n - 1 == i && m - 1 == j) {

                        break;
                    }
                    if (i != 0)
                        checkNorth = false;


                }

                if (m != 1 && j != m - 1 && A[i][j] == A[i][j + right]) {
                    possibleCountries = possibleCountries - 1;


                } else {
                    if (!checkNorth && i != 0)
                        checkNorth = true;

                }

                if (n != 1 && m != 1 && i + 1 == n && j + 1 == m && A[i][j] == A[i][j - 1] && A[i - 1][j] == A[i][j]) {


                    if (n == 2) {

                        if (A[i - 1][j] != A[i - 1][j - 1]) {
                            possibleCountries = possibleCountries - 1;

                        }

                    } else if (A[i - 1][j] != A[i - 1][j - 1] && A[i - 1][j] != A[i - 2][j]) {
                        possibleCountries = possibleCountries - 1;

                    }


                }


            }

        }
        return possibleCountries;

    }


}
