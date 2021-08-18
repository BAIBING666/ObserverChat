/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:43
 **/
public class OberverMain {

    public static void main(String[] args) {
        RequestClient client = new RequestClient();
        String result = client.sayHello();
        System.out.println("final result =" + result);
    }
}
