package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args)
        throws IOException
    {
        int i;
        byte[] temp = new byte[10];
        String tmps = new String();
        while((i=System.in.read(temp)) != -1)
        {
            System.out.println(i);
            for(int j=0;j<temp.length;j++)
            {
                System.out.print((char)temp[j]);
                System.out.write((char)temp[j]);
            }

//            i=Character.toLowerCase((char)i);
//            System.out.write(i);
        }
        System.out.println("hello!!");
    }
}
