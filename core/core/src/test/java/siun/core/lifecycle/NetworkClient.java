package siun.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);

    }

    public void setUrl(String url){
        this.url = url;
    }

    public void connect(){
        System.out.println("connect: " + url);
    }

    public void call(String message){
        System.out.println("call: "+ url + " message = " + message);
    }

    public void disconnect(){
        System.out.println("close: "+ url);
    }

    //의존 관계 주입이 끝나면.

    public void init() {
        connect();
        call("init connect message");
    }


    public void close()  {
        disconnect();
    }
}
