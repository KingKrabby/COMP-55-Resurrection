import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SceneSwitch extends JFrame {

    private JPanel currentScene;

    public SceneSwitch() {
        setTitle("Scene Switcher");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initial scene
	        currentScene = new Scene1();
	        add(currentScene);

        // Show the window
        setVisible(true);
    }

    // Switch to a new scene
    public void switchScene(JPanel newScene) {
        getContentPane().removeAll();
        currentScene = newScene;
        add(currentScene);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SceneSwitch();
        });
    }
}

class Scene1 extends JPanel {

    public Scene1() {
        JButton switchButton = new JButton("Switch to Scene 2");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to Scene 2
                ((SceneSwitch) SwingUtilities.getWindowAncestor(Scene1.this)).switchScene(new Scene2());
            }
        });

        add(switchButton);
    }
}

class Scene2 extends JPanel {

    public Scene2() {
        JButton switchButton = new JButton("Switch to Scene 1");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to Scene 1
                ((SceneSwitch) SwingUtilities.getWindowAncestor(Scene2.this)).switchScene(new Scene1());
            }
        });

        add(switchButton);
    }
}
