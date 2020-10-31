package priv.heshun.eight.algorithm;

/**
 * 100以内的质数
 * @author heshun
 * @date 2020-10-29
 */
public class PrimeNumbersInHundred {

    public static void main(String[] args) {

        // 是否为质数 标记
        boolean isPrime = true;

        for(int i = 3; i <= 100; i++) {

            // ** 此处用j去比较根号i(思考为什么)，可以优化质数查找的循环次数
            for(int j = 2; j <= Math.sqrt(i); j++) {
                // 有除1和自己外的其它因数，不是质数
                if(0 == i % j) {
                    isPrime = false;
                    // 此处break，可以优化非质数查找的循环次数
                    break;
                }
            }

            // 是质数，输出
            if(isPrime) {
                System.out.println(i);
            }

            // 重置isPrime
            isPrime = true;
        }
    }

}
