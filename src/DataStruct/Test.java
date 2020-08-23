import java.util.Arrays;

/*
 * @Author: 屠圣涛
 * @Date: 2020-07-25 21:47:17
 * @LastEditTime: 2020-07-27 00:59:14
 * @LastEditors: Please set LastEditors
 * @Description: 一维数组的应用：求质数（算法不唯一）
 * @FilePath: /StudyTrip/TJJavaSA/01_Array/ch02_01.java
 */
public class Test {
    public static void main(String[] args) {
		// 找出300以内的质数
    	final int MAX = 300;
    	// false为非质数，true为质数 
    	boolean prime[] = new boolean[MAX];
		// 现在默认 prime[] 里面都是质数，用一个for循环来实现这个
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}

    	prime[0] = false; // 0是非质数
    	prime[1] = false; // 1是非质数
    	int num = 2,i;
		// 将1 ~ MAX 中不是质数的逐一过滤掉， 以此方式找到所有质数
		/*
			非质数过滤算法：
			2是最小的质数，如果一个数是2的倍数
			那么这个数一定不是质数，如4、6、8、10、12；
			3是除去2后最小的质数，如果一个数是3的倍数，那么它肯定也不是质数
			如6、9、12、15......以此类推下一个数就是4，再下一个就是筛选掉5......
			总结：就是依次筛选掉当前最小质数的倍数，剩下的就都是质数了
		*/
		// 以下是核心代码：
		// 首先外层2－300次循环
    	while(num < MAX){
			//  从prime[2]开始做判断，prime[2] == true，2是当前最小的质数
			if(prime[num]){
				// 筛选掉是2的倍数,先从4开始 ，4 = num + num(num == 2)
				for (i = 4; i < MAX ; i += num ) {
					/*
					下面这行代码的目的是：已经设置为非质数的数不需要再执行它下面一行的代码了（45行）
					直接跳出当前这次循环，去执行下一个循环
					*/
					if(!prime[i]) {
						continue;
					}
					prime[i] = false;// 只要是当前最小质数的倍数，都设置为false (非质数)
				}
        	}
		}
		// 核心代码结束

		// 打印出质数的个数和300以内的质数
		int count  = 0;//质数的个数
		String str = ""; // 把所有质数拼接然后输出
		for (int j = 0; j < prime.length; j++) {
			if(prime[j]){
				count++;
				str = str + "," ;
			}
		}

		System.out.println("质数");
		System.out.println(str+"\n");
		System.out.println("质数个数："+count);
		System.out.println(Arrays.toString(prime));

    }
}
