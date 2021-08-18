/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:24
 **/
//观察者接口
public interface Oberver {

    //模拟grpc的onNext()方法
    public void onNext(String resp);

    public void addObserver(RequestClient client);

}
