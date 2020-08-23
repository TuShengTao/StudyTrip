import java.util.Arrays;

/*
 * @Author: ��ʥ��
 * @Date: 2020-07-25 21:47:17
 * @LastEditTime: 2020-07-27 00:59:14
 * @LastEditors: Please set LastEditors
 * @Description: һά�����Ӧ�ã����������㷨��Ψһ��
 * @FilePath: /StudyTrip/TJJavaSA/01_Array/ch02_01.java
 */
public class Test {
    public static void main(String[] args) {
		// �ҳ�300���ڵ�����
    	final int MAX = 300;
    	// falseΪ��������trueΪ���� 
    	boolean prime[] = new boolean[MAX];
		// ����Ĭ�� prime[] ���涼����������һ��forѭ����ʵ�����
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}

    	prime[0] = false; // 0�Ƿ�����
    	prime[1] = false; // 1�Ƿ�����
    	int num = 2,i;
		// ��1 ~ MAX �в�����������һ���˵��� �Դ˷�ʽ�ҵ���������
		/*
			�����������㷨��
			2����С�����������һ������2�ı���
			��ô�����һ��������������4��6��8��10��12��
			3�ǳ�ȥ2����С�����������һ������3�ı�������ô���϶�Ҳ��������
			��6��9��12��15......�Դ�������һ��������4������һ������ɸѡ��5......
			�ܽ᣺��������ɸѡ����ǰ��С�����ı�����ʣ�µľͶ���������
		*/
		// �����Ǻ��Ĵ��룺
		// �������2��300��ѭ��
    	while(num < MAX){
			//  ��prime[2]��ʼ���жϣ�prime[2] == true��2�ǵ�ǰ��С������
			if(prime[num]){
				// ɸѡ����2�ı���,�ȴ�4��ʼ ��4 = num + num(num == 2)
				for (i = 4; i < MAX ; i += num ) {
					/*
					�������д����Ŀ���ǣ��Ѿ�����Ϊ��������������Ҫ��ִ��������һ�еĴ����ˣ�45�У�
					ֱ��������ǰ���ѭ����ȥִ����һ��ѭ��
					*/
					if(!prime[i]) {
						continue;
					}
					prime[i] = false;// ֻҪ�ǵ�ǰ��С�����ı�����������Ϊfalse (������)
				}
        	}
		}
		// ���Ĵ������

		// ��ӡ�������ĸ�����300���ڵ�����
		int count  = 0;//�����ĸ���
		String str = ""; // ����������ƴ��Ȼ�����
		for (int j = 0; j < prime.length; j++) {
			if(prime[j]){
				count++;
				str = str + "," ;
			}
		}

		System.out.println("����");
		System.out.println(str+"\n");
		System.out.println("����������"+count);
		System.out.println(Arrays.toString(prime));

    }
}
