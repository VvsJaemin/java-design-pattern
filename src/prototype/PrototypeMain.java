package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class PrototypeMain {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("Strong Message", upen );
        manager.register("Waring Box", mbox );
        manager.register("Slash Box", sbox );

        //생성과 사용
        Product product = manager.create("Strong Message");
        product.use("강한 메시지");

        Product p2 = manager.create("Waring Box");
        p2.use("경고 박스");

        Product p3 = manager.create("Slash Box");
        p3.use("슬래쉬 박스");

    }
}
