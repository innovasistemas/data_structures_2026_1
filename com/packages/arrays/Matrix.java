package com.packages.arrays;

public class Matrix 
{
    private final int TR = 50;
    private final int TC = 50;
    private int m, n;
    private int mat[][] = new int[TR][TC];
    private int matSum[][] = new int[TR][TC];

    public Matrix()
    {
        m = 0;
        n = 0;
    }

    public int getTR() 
    {
        return TR;
    }

    public int getTC() 
    {
        return TC;
    }

    public int getM() 
    {
        return m;
    }

    public void setM(int m) 
    {
        this.m = m;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    
    public int[][] getMat() 
    {
        return mat;
    }

    public int[][] getMatSum() 
    {
        return matSum;
    }  

    public void createMatrix()
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int)(Math.random() * 100);
            }
        }
    }

    public void showMatrix(int [][] mat)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void sumMatrix(int [][] mat1, int [][] mat2)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matSum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }

    public void mainDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + "\t");
        }
        System.out.println();
    }

    public void secondaryDiagonal()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][n - i - 1] + "\t");
        }
        System.out.println();
    }

    public void upTriangle()
    {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }
        System.out.println();
    }

    public void rightTriangle()
    { 
        for (int c = n - 1; c >= n / 2 ; c--) {
            for (int f = c; f >= n - c - 1; f--) {
                System.out.println(mat[f][c]);
            }
        }
    }

    public void leftTriangle()
    { 
        for (int c = 0; c <= n / 2; c++) {
            for (int f = c; f < n - c; f++) {
                System.out.println(mat[f][c]);
            }
        }
    }

}
