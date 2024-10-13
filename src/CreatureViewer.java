import javax.swing.*;

public class CreatureViewer {

    public static void main(String[] args){
        JFrame frame = new JFrame("Dragon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreatureComponent component = new CreatureComponent();
        frame.add(component);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}