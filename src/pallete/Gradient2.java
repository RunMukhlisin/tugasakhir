/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pallete;

/**
 *
 * @author user
 */

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
        

public class Gradient2 extends JPanel{
    private Color colorStart =Color.RED;
    private Color colorMid =Color.GREEN;
    private Color colorEnd =Color.BLUE;

    public Color getColorStart() {
        return colorStart;
    }

    public void setColorStart(Color colorStart) {
        this.colorStart = colorStart;
    }

    public Color getColorMid() {
        return colorMid;
    }

    public void setColorMid(Color colorMid) {
        this.colorMid = colorMid;
    }

    public Color getColorEnd() {
        return colorEnd;
    }

    public void setColorEnd(Color colorEnd) {
        this.colorEnd = colorEnd;
    }
    
    public Gradient2(){

    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, colorStart, getWidth(), getHeight(), colorEnd);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
