package com.liyunlong.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.liyunlong.utils.AssertUtils;

public class Tesx {
	//������
	//���Զ���Ϊ��
@Test
public void isTure(){
	AssertUtils.isTrue(true, "�ⲻ��true");
}
//���Զ���Ϊ��
@Test
public void isFalse(){
AssertUtils.isFalse(false, "�ⲻ��false");
}
//���Զ��Զ���Ϊ��
@Test
public void notNull(){
AssertUtils.notNull(new Tesx(), "����Ϊ��");
}
//���Զ��Զ���Ϊ��
@Test
public void isNull(){
AssertUtils.isNull(null, "����Ϊ��");
}
//���Զ��Լ��ϲ�Ϊ��
@Test
public void notEmpty(){
	List<Integer> coll=new ArrayList<Integer>();
	coll.add(1);
AssertUtils.notEmpty(coll, "����Ϊ��");
}
//���Զ��Լ��ϲ�Ϊ��
@Test
public void notEmptys(){
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	map.put(1, 1);
AssertUtils.notEmpty(map, "Map����Ϊ��");
}
//���Զ����ַ���������ֵ
@Test
public void hasText(){
AssertUtils.hasText("ssssss", "�ַ�����ֵ��");
}
//���Զ���ֵ�������0
@Test
public void greaterThanZero(){
AssertUtils.greaterThanZero(1,"ֵС�ڻ����0");
}
}
