/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 15:28
 **/
public class ObserverThreadsMain {
    static RequestClient client = new RequestClient();
    public static void main(String[] args) {
        ObserverThreadsMain threadsMain=new ObserverThreadsMain();
        for (int i=0;i<1000;i++){
            MyThread thread=threadsMain.new MyThread(i+"号线程");
            thread.start();
        }
    }

    class MyThread extends Thread{
        public String word;

        public MyThread(String word){
            this.word=word;
        }
        @Override
        public void run(){
            String result = client.sayHello(word);
            System.out.println(word+"final result =" + result);
            if (!result.contains(word)){
                System.err.println("****************"+word+"final result =" + result);
            }
        }
    }
}
