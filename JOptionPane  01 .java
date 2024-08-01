import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Solution {
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null,"this is useless info","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is useless info","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is useless info","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is useless info","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is useless info","title",JOptionPane.ERROR_MESSAGE);
        System.out.println(JOptionPane.showConfirmDialog(null,"this is useless info?","title",JOptionPane.YES_NO_CANCEL_OPTION));
        String name=JOptionPane.showInputDialog("What's your name");
        ImageIcon icon=new ImageIcon("dog1.png");
        JOptionPane.showOptionDialog(null, icon, name, 0, 0, icon, args, icon);
        String[] res={"No,you are awesome","thank you","*blush*"};
        JOptionPane.showOptionDialog(
            null,
            "you are awesome",
            "secret message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            res,
            0
        );
    }
}
