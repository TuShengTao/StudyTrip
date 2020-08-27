package Array;

import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 自己封装一个数组，泛型数组
 * @date 2020-08-23 14:41
 */
public class Array<T> {
    private T[] array;

    // 元素个数
    private int size = 0;

    /**
     * 无参的构造函数 默认大小是10
     */
    public Array(){
        array = (T[]) new Object[10];
    }

    /**
     * 有参的构造函数
     * @param length 长度
     */
    public Array(int length){
        array = (T[]) new Object[length];
    }

    /**
     * 添加一个元素 实现动态扩容
     * @param element 元素
     */
    public void add(T element){
        // 判断是否需要扩容
        if (array.length <= size){
            expand();
        }else {
            array[size] = element;
            // 元素个数加 1
            size++;
        }
    }

    /**
     * 添加元素时，数组动态扩容
     */
    private void expand(){
        // 新建一个数组 长度是之前的2倍
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * 根据索引下标删除一个元素
     * @param index 指数
     */
    public void delete(int index){
        if (index < 0 || index > array.length ){
            throw new RuntimeException("下标越界！");
        }else{
            T[] newArray = (T[]) new Object[array.length];
            for (int i = 0; i < array.length; i++) {
                if (i != index){
                    newArray[i] = array[i];
                }
            }
            array = newArray;
            size--;
        }
    }
    /**
     * 修改index下标的元素
     * @param element 元素
     */
    public void update(int index,T element){
        if (index < 0 || index > array.length){
            throw new RuntimeException("下标越界");
        }else {
            // 实现修改
            array[index] = element;
        }
    }

    /**
     * 获取长度
     *
     * @return int
     */
    public int getLength(){
        return array.length;
    }

    /**
     * 获取元素个数
     *
     * @return int
     */
    public int getSize(){
        return size;
    }

    public String printArray(){
        return Arrays.toString(array);
    }
}
