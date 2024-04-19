package com.ejercicios.ejercicio10;

public class Media {
    /*
     * public float media(int x1, int x2) { return (x1 + x2) / 2; }
     * 
     * public float media(int x1, int x2, int x3) { return (x1 + x2 + x3) / 3; }
     * 
     * public float media(int x1, int x2, int x3, int x4) { return (x1 + x2 + x3 +
     * x4) / 4; }
     */

    public float media(int... nums) {
            int sum = 0;
            float resultado = 0;
            if (nums.length > 0) {
                    for (int x : nums) {
                            sum += x;
                    }
                    resultado = (float) sum / nums.length;
            }
            return resultado;
    }
}

