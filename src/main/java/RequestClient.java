/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:29
 **/
public class RequestClient {

    public String resp;

    public String sayHello(String word) {
        ResponseServer server = new ResponseServer();
        server.addObserver(this);
        server.sayHello(word);
        return this.resp;
    }
}
