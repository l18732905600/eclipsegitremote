package cn.zkt.com.api;

public class Danli {
    private static Danli ourInstance = new Danli();

    public static Danli getInstance() {
        return ourInstance;
    }

    private Danli() {
    }
}
