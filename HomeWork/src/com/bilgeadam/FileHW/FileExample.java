package com.bilgeadam.FileHW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	

	public static void dosyaYarat(File file) throws IOException
	{
			
			if(file.exists())
			{
				System.out.println("Dosya zaten var!!!");
			}
			else
			{
				if (!file.createNewFile())
				{
					System.out.println("Dosya oluşturulurken hata olluştu!!!");
				}
				else
				{
					System.out.println("Dosya oluşturuldu!");
				}
			}

	}
	public static void dosyayaYaz(File file) throws IOException, FileNotFoundException
	{
		
			if(file.exists())//bu file dosyası bu adreste varsa
			{
				FileWriter fileWriter = new FileWriter(file,true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
				bufferedWriter.write("Merhaba Dünya");
				bufferedWriter.close(); //açık olan bağlantıyı kapatmak için
				
				System.out.println("Dosyaya yazma işlemi başarılı");
			}
			else
			{
				System.out.println("Böyle bir dosya bulunamadı!!!");
			}

	}
	
	public static void dosyaOku(File file) throws IOException, FileNotFoundException
	{
		if(file.exists())
		{
			 
		    FileReader fileReader = new FileReader(file);
			String line;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) !=null)
			{
				System.out.println(line);
			}
		}
		else
		{
			System.out.println("Dosya okunamadı");
		}
	}
}
