package com.dennysesay.view;

import javax.swing.*;
import java.awt.*;

public class Kalikani extends JFrame {
    public Kalikani() {
        setTitle("Kalikani");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ApiKeyPanel apiKeyPanel = new ApiKeyPanel();
        add(apiKeyPanel, BorderLayout.CENTER);
    }
}
