import javax.swing.JFrame;

public class a {
    public static void main(String[] args) {
        //Declare variables
        JFrame window = new JFrame("Window Name");
        Container container = window.getContentPane();
        int width = 300, height = 150;
        
        //Set up the window
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);

        //Set up the container
        container.add(new CodeFormatting());
    }
}
