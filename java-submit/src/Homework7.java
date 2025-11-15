public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}

abstract class Printer {
    public abstract boolean print();
}

class InkjetPrinter extends Printer {
    private String model;
    private int printedCount;
    private int availableCount;

    public InkjetPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print() {
        printedCount++;
        if (availableCount != 0) {
            availableCount--;
            return true;
        } else {
            System.out.println(model + ": " + printedCount + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
    }
}

class LaserPrinter extends Printer {
    private String model;
    private int printedCount;
    private int availableCount;

    public LaserPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    @Override
    public boolean print() {
        printedCount++;
        if (availableCount != 0) {
            availableCount--;
            return true;
        } else {
            System.out.println(model + ": " + printedCount + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
    }
}
