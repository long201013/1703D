package day717;

import java.util.Date;

public class DateUtil {
	//根据传入的日期获取年龄
	public static int getAge (Date src) {
		int i=0;
		Date date=new Date();
		long time = date.getTime();
		long times = src.getTime();
		long s=time-times;
		i=(int) (s/(1000*60*24*365)/60);
		return i;
		
		}
	//根据传入的参数获取该日期的月初日期
public static Date getDateByMonthInit (Date src) {
	@SuppressWarnings("deprecation")
	Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+1);
	return date;
		
	}
//根据传入的参数获取该日器的月末日期
	public static Date getDateByMonthLast(Date src) {
		if (src.getMonth()+1==2) {
			Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+28);
		}else {
			Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+30);
		} 
		return src;
		//TODO
		}
	//求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		int i=0;
		Date date=new Date();
		long time = date.getTime();
		long times = future.getTime();
		long s=times-time;
		i=(int) (s/(1000*60*24*60));
		return i;
		
		//TODO
		}
	//求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		int i=0;
		Date date=new Date();
		long time = date.getTime();
		long times = departed.getTime();
		long s=time-times;
		i=(int) (s/(1000*60*24*60));
		return i;
		}

	}
