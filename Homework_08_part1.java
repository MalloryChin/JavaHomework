package Homework;

import java.math.BigInteger;
import java.util.*;

public class Homework_08_part1 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//傳統for迴圈
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println();
		
		//iterator
		Iterator<?> objs = list.iterator();
		while (objs.hasNext()){
			Object obj = objs.next();
			System.out.println(obj);
			if(!(obj instanceof Number))
				objs.remove();//移除不是java.lang.Number家族的物件
		}
		System.out.println();
		
		//增強for迴圈
		for (Object obj : list){
			System.out.println(obj);
		}
		
	}

}
