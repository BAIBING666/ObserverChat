import com.sun.source.tree.NewArrayTree;

/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:27
 **/
public class ResponseServer implements Oberver {

    //绑定的client端requestClient
    private RequestClient client = new RequestClient();


    @Override
    public void onNext(String resp) {
        this.client.resp=resp;
    }

    @Override
    public void addObserver(RequestClient client) {
        this.client = client;
    }

    public void sayHello() {
        System.out.println("server say hello");
        String resp = "server return hello";
        this.onNext(resp);
    }
}
