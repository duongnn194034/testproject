package baithuchanh5;

public class NhaBao extends Nhanvien {
    private int soBaiDaDang;

    @Override
    public void inThe () {
        super.inThe();
        System.out.println("So bai da dang: " + soBaiDaDang);
    }
}
