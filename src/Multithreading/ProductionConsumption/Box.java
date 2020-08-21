/**
 * @author: tushengtao
 * @Description: 奶箱类
 * @date 2020-08-20 22:47
 */
public class Box {

    /**
     * 表示第x瓶奶
     */
    private int milk;
    /**
     * 表示奶箱的状态
     */
    private boolean state = false;

    /**
     * 存储牛奶的操作
     * @param milk
     */
    public synchronized void put(int milk) {
        // 如果有牛奶，等待消费
        if (state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // 如果没有牛奶，就等待生产
        this.milk = milk;
        System.out.println("送奶工将第"+ this.milk + "瓶奶放入奶箱");
        // 生产完毕之后，修改奶箱的状态
        state = true;
        // 唤醒其他等待线程
        notifyAll();
    }
    /**
     * 取牛奶的操作
     * @param
     */
    public synchronized void get(){
        // 如果没有牛奶，等待生产
        if (!state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // 如果有牛奶就去消费
        System.out.println("用户拿到第"+ this.milk +"瓶奶");
        // 消费完毕后修改奶箱状态
        state = false;
        // 唤醒其他等待线程
        notifyAll();
    }
}
