package com.liyunlong.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AssertUtils {
//断言工具类方法
	//断言为真
	public static void isTrue(boolean condition, String message){
		if (condition!=true) {
			throw new AssertUtil(message);
		}
		}
	//断言为假
	public static void isFalse(boolean condition, String message){
		if (condition!=false) {
			throw new AssertUtil(message);
		}
		}
	//断言对象不为空
	public static void notNull(Object obj, String message){
		if (obj==null) {
			throw new AssertUtil(message);
		}
		}
	//断言对象为空
		public static void isNull(Object obj, String message){
			if (obj!=null) {
				throw new AssertUtil(message);
			}
			}
	//断言集合不为空
		public static void notEmpty(Collection<?> coll, String message){
			if (coll==null || coll.size()==0) {
				throw new AssertUtil(message);
			}
			}
	//断言Map集合不为空
		public static void notEmpty(Map<?,?> map, String message){
			if (map==null || map.size()==0) {
				throw new AssertUtil(message);
			}
			}
	//断言字符串必须有值
		public static void hasText(String condition, String message){
			if (condition.trim().length()==0) {
				throw new AssertUtil(message);
			}
			}
	//断言值必须大于0
		public static void greaterThanZero(int value, String message){
			if (value<=0) {
				throw new AssertUtil(message);
			}
			}

}
