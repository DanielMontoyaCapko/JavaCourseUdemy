public class MegaBytesConvert {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaByte = kiloBytes / 1024;
        System.out.println((kiloBytes < 0) ? "Invalid Value" : kiloBytes + " KB = " + megaByte + " MB and " + kiloBytes % 1024 + " KB");
    }
}
