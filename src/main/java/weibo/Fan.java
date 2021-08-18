package weibo;

/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:58
 **/
public class Fan {

    private String name;

    public Fan(String name) {
        this.name = name;

    }

    public void getMessage(String word) {
        System.out.println(this.name + "receive star message:" + word);
    }
}
