package day716;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class Tsex {
	@Test
public void sxs() throws IOException{
	
	FileInputStream fis=new FileInputStream("E:/file.txt");
	StreamUtil.colse(fis);
	System.out.println(1000);
}
	@Test
public void sxs1() throws IOException{
		FileInputStream fis=new FileInputStream("E:/file.txt");
	StreamUtil.copy(fis, null, true, true);
}
	@Test
public void sxs6(){
	StreamUtil.readIntFromSystemIn("");
}
	@Test
public void s(){
	StreamUtil.readStringFromSystemIn("");
}
	@Test
public void sx() throws FileNotFoundException, IOException{
	String readTextFile = StreamUtil.readTextFile(new File("E:/file.txt"));
	System.out.println(readTextFile);
}
	@Test
public void xs() throws FileNotFoundException, IOException{
	String readTextFile = StreamUtil.readTextFile(new FileInputStream("E:/file.txt"));
	System.out.println(readTextFile);
}


}
