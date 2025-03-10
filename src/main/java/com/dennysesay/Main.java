package com.dennysesay;

import com.dennysesay.view.Kalikani;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Kalikani().setVisible(true));
    }
}