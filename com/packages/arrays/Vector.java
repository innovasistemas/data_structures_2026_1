package com.packages.arrays;

public class Vector 
{
    private final int T = 100;
    private int n;
    private int vec[] = new int[T];

    public Vector()
    {
        n = 0;
    }

    public int getT()
    {
        return T;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }


    public int searchSecuencial(int datum)
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }

    public void updateVector(int datum, int pos)
    {
        vec[pos] = datum;
    }

    public void deleteVector(int pos)
    {
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    public void insertVector(int pos, int datum)
    {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }


    public void sortBubble()
    {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
       
    
}
