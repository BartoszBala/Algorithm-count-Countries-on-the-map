public class MainSolution {

    public int solution(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int possibleCountries = n * m;
        int up = 1;
        int right = 1;


        for (int i = 0; i < n; i++) {


            for (int j = 0; j < m; j++) {

                if (j == 0) {
                    up = 1;
                }


                if (n!=1&&i != 0 && up != 0 && A[i][j] == A[i - up][j]) {

                    possibleCountries = possibleCountries - 1;
                    up = 0;

                } else {
                    up = 1;
                }


                if (m!=1&&j != m - 1 && A[i][j] == A[i][j + right]) {
                    possibleCountries = possibleCountries - 1;


                }else{
                    up=1;
                }


            }

        }
        return possibleCountries;

    }




}
