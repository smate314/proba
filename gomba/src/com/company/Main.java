package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int k=0; k<N;k++)
        {
            int size=s.nextInt();
            int n=s.nextInt();
            boolean [][] t=new boolean[size][size];
            for(int i=0; i<size;i++)
                for(int j=0; j<size;j++) t[i][j]=false;
        }
    }

    public static boolean bennevan(int x, int y, int r, int a, int b)
    {
        boolean o=false;
        if((a<x&&x<a+1)||(b<y&&y<b+1))
        {
            if(a<x&&x<a+1)
            {
                if((y<b&&y+r>b)||(b<=y&&y<=b+1)||(b+1<y&&y-r<b+1)) o=true;
            }
            else
            {
                if((x<a&&x+r>a)||(a<=x&&x<=a+1)||(a+1<x&&x-r<a+1)) o=true;
            }
        }
        else
        {
            if(x<)
        }
        return o;
    }
}
