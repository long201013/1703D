package day716;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class StreamUtil {
//批量关流	
public static void colse(Closeable... cone) throws IOException{ 
	for (Closeable closeable : cone) {
		closeable.close();
	}
	}
//拷贝流
public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
	
	if (isCloseOutputStream==true&&out!=null) {
		StreamUtil.colse(out);
	}
	if (isCloseInputStream==true&&src!=null) {
		StreamUtil.colse(src);
	}
	}
//文件对象
public static String readTextFile(InputStream src) throws IOException{
	InputStreamReader isr=new InputStreamReader(src);
	BufferedReader br=new BufferedReader(isr);
	String s="";
	String x="";
	while((s=br.readLine())!=null){
		x+=s;
	}
	StreamUtil.copy(src, null, true, true);
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
