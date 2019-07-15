package com.liyunlong.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AssertUtils {
//���Թ����෽��
	//����Ϊ��
	public static void isTrue(boolean condition, String message){
		if (condition!=true) {
			throw new AssertUtil(message);
		}
		}
	//����Ϊ��
	public static void isFalse(boolean condition, String message){
		if (condition!=false) {
			throw new AssertUtil(message);
		}
		}
	//���Զ���Ϊ��
	public static void notNull(Object obj, String message){
		if (obj==null) {
			throw new AssertUtil(message);
		}
		}
	//���Զ���Ϊ��
		public static void isNull(Object obj, String message){
			if (obj!=null) {
				throw new AssertUtil(message);
			}
			}
	//���Լ��ϲ�Ϊ��
		public static void notEmpty(Collection<?> coll, String message){
			if (coll==null || coll.size()==0) {
				throw new AssertUtil(message);
			}
			}
	//����Map���ϲ�Ϊ��
		public static void notEmpty(Map<?,?> map, String message){
			if (map==null || map.size()==0) {
				throw new AssertUtil(message);
			}
			}
	//�����ַ���������ֵ
		public static void hasText(String condition, String message){
			if (condition.trim().length()==0) {
				throw new AssertUtil(message);
			}
			}
	//����ֵ�������0
		public static void greaterThanZero(int value, String message){
			if (value<=0) {
				throw new AssertUtil(message);
			}
			}

}
