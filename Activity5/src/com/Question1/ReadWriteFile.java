package com.Question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
	
	static void readWrite() throws IOException
	{
		System.out.println("Enter the choice 1 for write and 2 for read");
		Scanner s=new Scanner(System.in);
		int Choice=s.nextInt();
		
		if(Choice==1)
		{
			try
			{
			FileOutputStream fout=new FileOutputStream("D:\\v.txt");
			String a="welcome to pune";
			byte b[]=a.getBytes(); //changing string to Byte array
			fout.write(b);         //write() is used to write in the file
			fout.close();               //closing the file
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		else if(Choice==2)
		{
			try
			{
			FileInputStream fin=new FileInputStream("D:\\v1.txt");
			
			while(( Choice-fin.read())!=-1)  //read the file
			{
				System.out.print((char)Choice);
			}
			fin.close();
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("done");
	}
	
	public static void main(String[] args)
	{
		try
		{
			readWrite();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
