package com.reflect;

import java.util.ArrayList;
import java.util.List;
 

/**
 * 
* @ClassName: ClassDemo1 
* @Description: TODO( 反射测试 示例) 
* @author 陈一国 786178187@qq.com 
* @date 2017年11月22日 上午11:30:08 
*
 */
public class ClassDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//获取 反射的三种类类型
		Foo f = new Foo();
		
		//第一种 实例.getClass();
		Class  c1 = f.getClass();
		
		//第二种类名.class
		Class c2 = Foo.class;
		
		//第三种通过Class类的静态方法forName('全路径加类名')
		Class c3 = Class.forName("com.reflect.Foo");

		//无论那种方法获取的都是同一个类类型。
//		System.out.println(c1 == c2); true
//		System.out.println(c2 == c3); true
//		System.out.println(c3 == c1); true
		
		//类类型和泛型无关，泛型在编译时的规范，绕过编译就不会报错。
		List list = new ArrayList();
		List<String> list2 = new ArrayList<String>();
//		System.out.println(list.getClass() == list2.getClass()); //true
		
		
		//通过类类型获取该类的 实例，前提必须要一个无参数的构造函数。
		Foo f2 = (Foo) c1.newInstance();//调用的是无参的构造函数
		Foo f3 = (Foo) c2.newInstance();//调用的是无参的构造函数
		Foo f4 = (Foo) c3.newInstance();//调用的是无参的构造函数
		
		f2.getName("张三");
		f3.getName("李四");
		f4.getName("王麻子");
		
		
	}
	
}
