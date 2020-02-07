package com.ajr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

	public static void main(String[] args) {

		try {
			Path path =  Paths.get(FileTest.class.getClassLoader().getResource(("bands.txt")).toURI());
			byte[] bytes = Files.readAllBytes(path);
			String fileContent = new String(bytes);
			System.out.println(fileContent);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 public static void main(String[] args) {

		try (InputStream input = FileTest.class.getClassLoader().getResourceAsStream("bands.txt");
				BufferedReader b = new BufferedReader(new InputStreamReader(input));) {
			String line;
			
			while ((line = b.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
*/
}
