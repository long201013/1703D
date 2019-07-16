package day716;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;

import javax.naming.directory.InvalidSearchFilterException;

public class StreamUtil {
//批量关流	
public static void colse(Closeable... cone){ 
		cone.clone();
	}
//拷贝流
public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
	if (isCloseOutputStream) {
		colse(out);
	}
	if (isCloseInputStream) {
		colse(src);
	}
	}
//文件对象
public static String readTextFile(InputStream src) throws IOException{
	InputStreamReader isr=new InputStreamReader(src);
	BufferedReader br=new BufferedReader(isr);
	String s=null;
	String x=null;
	while((s=br.readLine())!=null){
		x+=s;
	}
	copy(src, null, true, true);
	return x;
	}

public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
	FileInputStream fis=new FileInputStream(txtFile);
	
	String readTextFile = readTextFile(fis);
	return readTextFile;
	
	}
public static String readStringFromSystemIn(String message){
	
	return message;
	}

public static int readIntFromSystemIn(String message){
	int i=Integer.parseInt(message);
	return i;
	}

}
