package sample;

import javafx.embed.swing.SwingNode;

import javax.swing.*;

//SwingNode可以将Swing组件转化为JavaFX组件
public class MyButtonSwing extends SwingNode {
    public MyButtonSwing(){
        createSwingContent(this);
    }

    //通过该方法进行转化
    private void createSwingContent(final SwingNode swingNode) {
        SwingUtilities.invokeLater(() -> {
            JButton jButton = new JButton("Swing按钮");
            swingNode.setContent(jButton);
        });
    }

}
