/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Rauan
 */
public class Painel extends JPanel {
	public Painel() {
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(getClass().getResource("/br/clinica/imagens/painel.png")).getImage(),
                0, 0, 400, 300, this);
    }

}
