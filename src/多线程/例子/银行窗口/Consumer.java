package 多线程.例子.银行窗口;

/**
 * @Description
 * @Author J
 * @Date 2018/6/19 16:59
 **/
public class Consumer {
    private String name;
    public boolean isVip;

    public Consumer(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.isVip + "]";
    }
}
