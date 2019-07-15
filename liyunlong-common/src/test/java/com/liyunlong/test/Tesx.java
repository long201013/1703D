package com.liyunlong.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.liyunlong.utils.AssertUtils;

public class Tesx {
	//测试类
	//测试断言为真
@Test
public void isTure(){
	AssertUtils.isTrue(true, "这不是true");
}
//测试断言为假
@Test
public void isFalse(){
AssertUtils.isFalse(false, "这不是false");
}
//测试断言对象不为空
@Test
public void notNull(){
AssertUtils.notNull(new Tesx(), "对象为空");
}
//测试断言对象为空
@Test
public void isNull(){
AssertUtils.isNull(null, "对象不为空");
}
//测试断言集合不为空
@Test
public void notEmpty(){
	List<Integer> coll=new ArrayList<Integer>();
	coll.add(1);
AssertUtils.notEmpty(coll, "集合为空");
}
//测试断言集合不为空
@Test
public void notEmptys(){
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	map.put(1, 1);
AssertUtils.notEmpty(map, "Map集合为空");
}
//测试断言字符串必须有值
@Test
public void hasText(){
AssertUtils.hasText("ssssss", "字符串的值空");
}
//测试断言值必须大于0
@Test
public void greaterThanZero(){
AssertUtils.greaterThanZero(1,"值小于或等于0");
}
}
