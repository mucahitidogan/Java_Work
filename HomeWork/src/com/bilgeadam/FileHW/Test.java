package com.bilgeadam.FileHW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws Exception {
		
		String dosyaYolu="C:\\Deneme\\deneme.txt";
		File file =new File(dosyaYolu);
		try
		{
			FileExample.dosyaYarat(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		try
		{
			FileExample.dosyayaYaz(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();	
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		
		
		try
		{
			FileExample.dosyaOku(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
			
		
		
	}

}
