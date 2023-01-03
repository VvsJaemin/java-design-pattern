package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;
import prototype.framework.ProductCl;

public class PrototypeMain3 {
    public static void main(String[] args) {
        //준비
        Manager manager = new Manager();
        UnderlinePen3 upen = new UnderlinePen3('-');
        MessageBox3 mbox = new MessageBox3('*');
        MessageBox3 sbox = new MessageBox3('/');

        //등록
        manager.register2("Strong Message", upen );
        manager.register2("Waring Box", mbox );
        manager.register2("Slash Box", sbox );

        //생성과 사용
        ProductCl productCl = manager.create2("Strong Message");
        productCl.use("강한 메시지");

        ProductCl p2 = manager.create2("Waring Box");
        p2.use("경고 박스");

        ProductCl p3 = manager.create2("Slash Box");
        p3.use("슬래쉬 박스");

    }
}
