package cyoung.lancet.java.fairyland.jvm.runtimec;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: lancet
 * @package: cyoung.lancet.java.fairyland.jvm.runtimec
 * @email: cy880708@163.com
 * @date: 2018/11/1 下午10:34
 * @mofified By:
 */
public class RuntimePractice {


    /**
     * @description：获取当前jvm的内存信息,返回的值是 字节为单位
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/1 下午10:35
     * @mofified By:
     */
    public static void getFreeMemory() {

        //获取内存
        long value = Runtime.getRuntime().freeMemory();
        System.out.println("可用内存为:"+value/1024/1024+"mb");

        //获取jvm的总数量，该值会不断的变化
        long  totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("全部内存为:"+totalMemory/1024/1024+"mb");
        //获取jvm 可以最大使用的内存数量，如果没有被限制 返回 Long.MAX_VALUE;
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("可用最大内存为:"+maxMemory/1024/1024+"mb");

    }

    /**
     * @description：获取jvm可用的处理器核心的数量
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/1 下午10:36
     * @mofified By:
     */
    public static void getAvailableProcessors() {
        int value = Runtime.getRuntime().availableProcessors();
        System.out.println(value);
    }
    
    /**
     * @description：执行系统命令
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2018/11/1 下午10:36
     * @mofified By:
     */
    public static void commend() {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("java --versionxxx");
            System.out.println(process.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getFreeMemory();
        getAvailableProcessors();
        commend();
    }
}
