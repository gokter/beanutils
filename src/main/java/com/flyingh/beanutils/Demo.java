package com.flyingh.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Assert;
import org.junit.Test;

public class Demo {
	@Test
	public void test3() {
		Assert.assertTrue(int.class.isPrimitive());
		Assert.assertTrue(Integer.TYPE.isPrimitive());
		Assert.assertFalse(Integer.class.isPrimitive());
		Assert.assertTrue(void.class.isPrimitive());
		Assert.assertTrue(void.class == Void.TYPE);
		Assert.assertFalse(Void.class.isPrimitive());
	}

	@Test
	public void test2() throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("name", "flyingh");
		map.put("age", 22);
		Person person = new Person();
		PropertyUtils.copyProperties(person, map);
		System.out.println(person.getName());
	}

	@Test
	public void test() throws IllegalAccessException, InstantiationException,
			InvocationTargetException, NoSuchMethodException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "b");
		System.out.println(map);
		System.out.println(BeanUtils.cloneBean(map));
	}
}
