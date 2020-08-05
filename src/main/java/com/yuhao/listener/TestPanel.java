package com.yuhao.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("java");
        Panel panel = new Panel(null);
        frame.setLayout(null); // 设置窗体的布局
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255)); // 设置颜

        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(255,0,255));

        frame.add(panel);
        frame.setVisible(true);
        // 监听关闭事件
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("open");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("closing");
                System.exit(1);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("activate");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("deactivate");
            }
        });

    }
}
