package cn.bingai.practice01.demo02.chapter16_Java8NEW.MethodReferences;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      和方法引用类似，函数式接口的抽象方法的形参列表和构造器的形参列表一致
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *      可以把数组看做是一个特殊的类，则写法与构造器引用相同。
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    //Emploee的空参构造器：Employee()
    @Test
    public void test1(){

        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());

        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> func1 = id -> new Employee(id);
        Employee emp = func1.apply(1001);
        System.out.println(emp);

        Function<Integer,Employee> func2 = Employee::new;
        System.out.println(func2.apply(1002));

    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> func1 = (id,name) -> new Employee(id,name);
        Employee emp = func1.apply(10000, "斌改");
        System.out.println(emp);

        BiFunction<Integer,String,Employee> func2 = Employee :: new;
        System.out.println(func2.apply(12345, "bingai"));

    }

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,String[]> func1 = length -> new String[length];
        String[] arr = func1.apply(10);
        System.out.println(Arrays.toString(arr));

        Function<Integer,String[]> func2 = String[] :: new;
        String[] arr2 = func2.apply(5);
        System.out.println(Arrays.toString(arr2));


    }
}
