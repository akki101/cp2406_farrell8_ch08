import javax.swing.*;

public class TwelveInts {
    public static void main(String[] args) {
        int[] num = new int[12];
        int i;
        for (i = 0; i < 12; ++i) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter some number: "));
        }
        JOptionPane.showMessageDialog(null, "Number from first to last:");
        for (i = 0; i < 12; ++i) {
            System.out.println(num[i]);
        }
        JOptionPane.showMessageDialog(null, "Number from last to first:");
        for (i = 11; i > 0; ++i) {
            System.out.println(num[i]);
        }
    }
}







