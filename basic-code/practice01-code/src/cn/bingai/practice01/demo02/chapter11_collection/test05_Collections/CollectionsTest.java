package cn.bingai.practice01.demo02.chapter11_collection.test05_Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections:操作Collection、Map的工具类
 * <p>
 * 面试题：Collection 和 Collections 的区别？
 * Collection：存储单列集合的接口，有子类List和Set
 * Collections:操作集合的工具类。所有集合都可以操作。
 *
 * @author bingai
 * @create 2019-11-06 11:37
 */
public class CollectionsTest {
    /*
        排序操作： （均为static方法）
            reverse(List)： 反转 List 中元素的顺序
            shuffle(List)： 对 List 集合元素进行随机排序
            sort(List)： 根据元素的自然顺序对指定 List 集合元素按升序排序
            sort(List， Comparator)： 根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
            swap(List， int， int)： 将指定 list 集合中的 i 处元素和 j 处元素进行交换

        查找、替换
            Object max(Collection)： 根据元素的自然顺序，返回给定集合中的最大元素
            Object max(Collection， Comparator)： 根据 Comparator 指定的顺序，返回给定集合中的最大元素
            Object min(Collection)
            Object min(Collection， Comparator)
            int frequency(Collection， Object)： 返回指定集合中指定元素的出现次数
            void copy(List dest,List src)：将src中的内容复制到dest中
            boolean replaceAll(List list， Object oldVal， Object newVal)： 使用新值替换List 对象的所有旧值
     */
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(-47);
        list.add(888);
        list.add(0);

        //错误的：IndexOutOfBoundsException: Source does not fit in dest
//        ArrayList destList = new ArrayList();
//        Collections.copy(destList,list);

        //正确的
        //void copy(List dest,List src)
        List destList = Arrays.asList(new Object[list.size()]);
        Collections.copy(destList,list);
        System.out.println(destList);

        /*
            Collections 类中提供了多个 synchronizedXxx() 方法，
            该方法可使将指定集合包装成线程同步的集合，
            从而可以解决多线程并发访问集合时的线程安全问题
         */
        //返回的list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);



    }


        @Test
        public void test () {
            List list = new ArrayList();
            list.add(123);
            list.add(43);
            list.add(-47);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(888);
            list.add(0);
            System.out.println(list);

            //Collections.reverse(List)
            Collections.reverse(list);
            System.out.println(list);

            //Collections.shuffle(List)
            Collections.shuffle(list);
            System.out.println(list);

            //Collections.sort(List)：
            Collections.sort(list);
            System.out.println(list);

            //swap(List， int， int)
            Collections.swap(list, 1, 2);
            System.out.println(list);

            //frequency(Collection， Object)
            int frequency = Collections.frequency(list, 888);
            System.out.println(frequency);//8

        }


    }
