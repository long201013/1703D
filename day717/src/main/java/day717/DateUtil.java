package day717;

import java.util.Date;

public class DateUtil {
	//���ݴ�������ڻ�ȡ����
	public static int getAge (Date src) {
		int i=0;
		Date date=new Date();
		long time = date.getTime();
		long times = src.getTime();
		long s=time-times;
		i=(int) (s/(1000*60*24*365)/60);
		return i;
		
		}
	//���ݴ���Ĳ�����ȡ�����ڵ��³�����
public static Date getDateByMonthInit (Date src) {
	@SuppressWarnings("deprecation")
	Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+1);
	return date;
		
	}
//���ݴ���Ĳ�����ȡ����������ĩ����
	public static Date getDateByMonthLast(Date src) {
		if (src.getMonth()+1==2) {
			Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+28);
		}else {
			Date date=new Date(src.getYear()+"/"+src.getMonth()+1+"/"+30);
		} 
		return src;
		//TODO
		}
	//��δ����������컹ʣ������
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
	//���ȥ����������ȥ������
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
