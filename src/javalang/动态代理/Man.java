package javalang.动态代理;

/**
 * @author J
 * @time 2018/10/24 22:24
 * @description
 **/
public class Man implements Eat, Dress {

    @Override
    public void eatFood(String food) {
        System.out.println("男人吃: " + food);
    }

    @Override
    public void dressClothes(String clothes) {
        System.out.println("男人穿上了: " + clothes);
    }
}
