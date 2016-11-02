package com.tnz.test.beanutils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Before;
import org.junit.Test;

import com.tnz.test.bean.People;
import com.tnz.test.bean.Person;

/**
 * populate、copyProperties、cloneBean、describe(bean转map)
 * 
 * @author Jerrik
 */
public class BeanUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCloneBean() throws Exception {
		Person person1 = new Person();
		person1.setId(1L);
		person1.setUserName("jerrik");
		person1.setPasswd("123321");

		Person person2 = (Person) BeanUtils.cloneBean(person1);
		System.out.println("person2: " + person2);
		System.out.println(person1 == person2);
	}

	@Test
	public void testCopyProperties() throws Exception {
		Person person1 = new Person();
		person1.setId(1L);
		person1.setUserName("jerrik");
		person1.setPasswd("123321");
		person1.setBirthday(new Date());

		People people = new People();
		BeanUtils.copyProperties(people, person1);
		System.out.println("people: " + people);
	}

	@Test
	public void testPopulate() throws Exception {
		Person person1 = new Person();
		person1.setId(1L);
		person1.setUserName("jerrik");
		person1.setPasswd("123321");
		person1.setBirthday(new Date());

		People people = new People();
		// describe
		BeanUtils.populate(people, BeanUtils.describe(person1));// attention:describe转成了Map<String,String>
		System.out.println("people: " + people);
	}

	@Test
	public void testBeanMap() throws Exception {
		Person person1 = new Person();
		person1.setId(1L);
		person1.setUserName("jerrik");
		person1.setPasswd("123321");
		person1.setBirthday(new Date());

		BeanMap beanMap = new BeanMap(person1);
		System.out.println("size() " + beanMap.size());
		System.out.println(beanMap.containsKey("userName"));
		System.out.println(beanMap.get("userName"));

		System.out.println("===============================");

		BeanMap beanMap2 = new BeanMap();
		beanMap2.setBean(person1);
		System.out.println(beanMap2.containsKey("userName"));
		System.out.println(beanMap2.get("userName"));
		System.out.println("size() " + beanMap2.size());
		
		Person person2 = new Person();
		person2.setId(2L);
		person2.setUserName("linda");
		person2.setPasswd("4243234");
		person2.setBirthday(new Date());
		
		List list = new ArrayList();
		list.add(person1);
		list.add(person2);
		
		for(Object obj : list){
			BeanMap bm = new BeanMap(obj);
			System.out.println("bm: " + bm.get("userName"));
		}
		
	}

}
