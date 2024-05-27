package btbai3oop;

public class XeOto {
    private String hangXe;
    private int namSanXuat;
    private float dongCo;

    public XeOto() {
    }

    public XeOto(String hangXe, int namSanXuat, float dongCo) {
        this.hangXe = hangXe;
        this.setNamSanXuat(namSanXuat);
        this.dongCo = dongCo;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        if (namSanXuat > 0){
            this.namSanXuat = namSanXuat;
        }
    }

    public float getDongCo() {
        return dongCo;
    }

    public void setDongCo(float dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return "XeOto{" +
                "hangXe='" + hangXe + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", dongCo=" + dongCo +
                '}';
    }
}
