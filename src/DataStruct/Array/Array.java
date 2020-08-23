package Array;

/**
 * @author: tushengtao
 * @Description: 自己封装一个数组，泛型数组
 * @date 2020-08-23 14:41
 */
public class Array<T> {
    private T[] array;

    /**
     * 无参的构造函数
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
     * 添加一个元素
     * @param element 元素
     */
    public void add(T element){
        // 新建一个数组且长度加1
        T[] newArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[i];
        }
        // 在新数组的最后一个位置添加一个新元素
        newArray[array.length] = element;
        // 赋值给原数组
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
            T[] newArray = (T[]) new Object[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (i != index){
                    newArray[i] = array[i];
                }
            }
            // 这样原数组array就删除了index下标的元素
            array = newArray;
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



}
