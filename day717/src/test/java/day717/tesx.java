package day717;

import java.util.Date;

import org.junit.Test;

public class tesx {
	@SuppressWarnings("deprecation")
	@Test
public void date(){
	int age = DateUtil.getAge(new Date("2010/1/11"));
	System.out.println("ƒÍ¡‰"+age);
}
	@Test
public void dates(){
	@SuppressWarnings("deprecation")
	Date dateByMonthInit = DateUtil.getDateByMonthInit(new Date("2010/1/11"));
	System.out.println(dateByMonthInit);
}
	@Test
public void date1(){
	DateUtil.getDateByMonthLast(null);
}
	@SuppressWarnings("deprecation")
	@Test
public void datex(){
	int daysByDeparted = DateUtil.getDaysByDeparted(new Date("2010/1/11"));
	System.out.println(daysByDeparted);
}
	@SuppressWarnings("deprecation")
	@Test
public void date6(){
	int daysByFuture = DateUtil.getDaysByFuture(new Date("2021/1/11"));
	System.out.println(daysByFuture);
}
}
