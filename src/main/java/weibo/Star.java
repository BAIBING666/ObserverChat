package weibo;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: ObserverChat
 * @description:
 * @author: bing.bai
 * @create: 2021-08-18 10:58
 **/
public class Star implements WeiboOberver {

    private List<Fan> fans = new ArrayList<>();

    @Override
    public void addObserver(Fan fan) {
        this.fans.add(fan);
    }

    public void notifyFans(String word) {
        fans.stream().forEach(fan -> fan.getMessage(word));
    }


    public void write(String word) {
        System.out.println("star write message:" + word);
        notifyFans(word);
    }

}
