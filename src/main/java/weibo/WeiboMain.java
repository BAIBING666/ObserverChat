package weibo;

/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 11:03
 **/
public class WeiboMain {
    public static void main(String[] args) {
        Star star = new Star();
        Fan fan1 = new Fan("张三");
        Fan fan2 = new Fan("李四");
        Fan fan3 = new Fan("王五");
        star.addObserver(fan1);
        star.addObserver(fan2);
        star.addObserver(fan3);
        star.write("大家好");
    }
}
