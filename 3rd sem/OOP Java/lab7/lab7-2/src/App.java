import java.awt.GridLayout;
import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        jf.setLayout(new GridLayout(10,1));
        JLabel jl1 = new JLabel("First swing application");
        jf.add(jl1);
        jf.add(jp);
        JLabel jl2 = new JLabel("Choose subject you like: ");
        jp.add(jl2);
        jf.setSize(600, 600);
        jf.setVisible(true);
        JCheckBox jc1 = new JCheckBox("Java");
        jp.add(jc1);
        JCheckBox jc3 = new JCheckBox("Web Tech");
        jp.add(jc3);
        
        JPanel jp2 = new JPanel();
        JLabel jl3 = new JLabel("Choose your best subject:");
        JRadioButton jr1 = new JRadioButton("Java");
        JRadioButton jr2 = new JRadioButton("DSA");
        JRadioButton jr3 = new JRadioButton("Web tech");
        
        ButtonGroup bestSub = new ButtonGroup();
        bestSub.add(jr1);
        bestSub.add(jr2);
        bestSub.add(jr3);

        jf.add(jp2);
        jp2.add(jl3);
        jp2.add(jr1);
        jp2.add(jr2);
        jp2.add(jr3);

        String[] interest = {"Select one", "Singing", "Dance", "Drawing"};
        JComboBox jcb = new JComboBox<>(interest);
        JPanel jp3 = new JPanel();
        jp3.add(jl3);
        jp3.add(jcb);
        jf.add(jp3);


        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
