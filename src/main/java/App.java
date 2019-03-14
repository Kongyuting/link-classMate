import core.provider.InitContext;
import core.provider.ListenerServer;

/**
 * @Author:kongyuting
 * @Date:2019/3/14 10:25
 */
public class App {

    /**
     * 开始监听考试
     */
    public static void main(String[] args) {
        System.out.println("开始监听考试...");
        InitContext.initContext(9999);

    }

}
