package HomeWork.HomeWork6;

public class Notebook {
    private int Ram;
    private int Hdd;
    private String Os;
    private String Color;

    public Notebook(int Ram, int Hdd, String Os, String Color) {
        this.Ram = Ram;
        this.Hdd = Hdd;
        this.Os = Os;
        this.Color = Color;
    }

    public int getRam() {
        return Ram;
    }

    public int getHdd() {
        return Hdd;
    }

    public String getOs() {
        return Os;
    }

    public String getColor() {
        return Color;
    }

    @Override
    public String toString() {
        return "Ноутбук: ("  +
                "объем оперативной памяти:" + Ram +
                ", объем жёсткого диска: " + Hdd + 
                ", операционная система: " + Os +
                ", цвет: " + Color+")";
    }
}
