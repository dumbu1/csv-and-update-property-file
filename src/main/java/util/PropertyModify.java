package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyModify {

	public void propertyModify(String path,String key,String value) {
		
		FileInputStream obj_FileInputStream=null;
		FileOutputStream obj_FileOutputStream=null;
		
		try {
			obj_FileInputStream=new FileInputStream(System.getProperty("user.dir")+path);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		
		Properties obj_Properties=new Properties();
		try {
			obj_Properties.load(obj_FileInputStream);
			obj_FileInputStream.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		obj_Properties.setProperty(key, value);
		
		try {
			obj_FileOutputStream=new FileOutputStream(System.getProperty("user.dir")+path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			obj_Properties.store(obj_FileOutputStream, "data changed");
			obj_FileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
