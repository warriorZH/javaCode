/**
 * Created by warrior on 16-4-11.
 */

import java.io.*;
public class IOtest {

    public static void main(String[] args) throws IOException
    {
        int size;
        //file input stream
        FileInputStream f = new FileInputStream("/home/warrior/Desktop/new01");
        size  = f.available();
        byte[] buf = new byte[size];
        for(int i=0;i<size;i++)
        {
            f.read(buf);
        }
        System.out.println(new String(buf));
        f.close();

        //file output stream
        byte[] b = new byte[100];
        System.out.println("please input :");
        size = System.in.read(b);
        FileOutputStream fileout = new FileOutputStream("/home/warrior/gitFolder/javaCode/iotest/result.txt");
        fileout.write(b,0,size);
        fileout.close();

        //file input reader
        File ff = new File("/home/warrior/Desktop/new01");
        FileReader fr = new FileReader(ff);
        size = (int)ff.length();
        char[] ffb = new char[size];
        for(int i=0;i<size;i++)
        {
            fr.read(ffb);
        }
        System.out.println(new String(ffb));
        fr.close();

        //file output reader
        FileWriter fw = new FileWriter("/home/warrior/gitFolder/javaCode/iotest/fwresult1.txt");
        System.out.println("please input :");
        size = System.in.read(b);
        fw.write(new String(b),0,size);//char[] == String
        fw.close();

        //console input by one char
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input 'q' for out!!");
        byte c;
        do{
            c = (byte) br.read();
            System.out.println((char)c);
        }while (c!='q');

        //console input by oneline
        BufferedReader brl = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'end' to quit.");
        do{
            str = brl.readLine();
            System.out.println(str);
        }while(!str.equals("end"));


    }
}
