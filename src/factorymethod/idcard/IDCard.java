package factorymethod.idcard;

import factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;

    private int serialNumber;

    IDCard(String owner, int serialNumber) { // idcard 패키지 외부에서 new 생성 할 수 없도록 함, IDcard 인스턴스 생성시 IDCardFactory로 생성

        this.owner = owner;
        this.serialNumber = serialNumber;

        System.out.println(owner + "의 카드번호는" + serialNumber + "입니다.");

    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
