package com.dennysesay.view;

import com.dennysesay.controller.ApiClient;
import com.dennysesay.model.User;

import javax.swing.*;
import java.awt.*;

public class ApiKeyPanel extends JPanel {
    private JLabel label;
    private JButton fetchButton;

    public ApiKeyPanel() {
        setLayout(new FlowLayout());

        label = new JLabel("Click 'Fetch User' to load data");
        fetchButton = new JButton("Fetch User");

        fetchButton.addActionListener(e -> fetchUser());

        add(label);
        add(fetchButton);
    }

    private void fetchUser() {
        label.setText("Loading...");
        ApiClient.fetchUser(new ApiClient.ApiCallback() {
            @Override
            public void onSuccess(User user) {
                SwingUtilities.invokeLater(() -> label.setText(user.toString()));
            }

            @Override
            public void onFailure(String error) {
                SwingUtilities.invokeLater(() -> label.setText(error));
            }
        });
    }
}
