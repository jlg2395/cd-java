package com.campusdual.exercisespoo.exercise12;

public class Arrays03 {
    public static void main(String[] args) {
//        Declaración e inicialización de Array unidimensional
        int[] intArrayUNI = {1, 2, 3, 4, 5};
//        Declaración e inicialización de Array bidimensional
        int[][] intArrayBi = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

//        Declaración e inicialización de Array tridimensional
        int[][][] intArrayTri = {{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}

        }, {
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2}

        }, {
                {3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3},
                {3, 3, 3, 3, 3}

        }, {
                {4, 4, 4, 4, 4},
                {4, 4, 4, 4, 4},
                {4, 4, 4, 4, 4},
                {4, 4, 4, 4, 4},
                {4, 4, 4, 4, 4}

        }, {
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5},
                {5, 5, 5, 5, 5}

        }};

//        Recorremos el array unidimeensional con for
        System.out.println("Array unidimensional");
        for (int i = 0; i < intArrayUNI.length; i++) {
            System.out.print(intArrayUNI[i] + " ");
        }
        System.out.println(" ");

//        Recorremos el array bidimensional
        System.out.println("Array bidimensional");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(intArrayBi[i][j] + " ");
                ;
            }
            System.out.println();
        }
//Recorremos el array tridimensional
        System.out.println("Array Suma Tridimnsional");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = 0;
                for (int k = 0; k < 5; k++) {
                    val += intArrayTri[i][j][k];
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}

