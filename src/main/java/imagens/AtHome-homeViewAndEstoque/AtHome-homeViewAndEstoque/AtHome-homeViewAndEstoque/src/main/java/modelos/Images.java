/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.awt.Image;
import javax.swing.ImageIcon;
 

/**
 *
 * @author Bruno
 */
public class Images {
    
    public ImageIcon scalar(javax.swing.JLabel label, int width, int heigh){
        ImageIcon imgicon = (ImageIcon) label.getIcon();
      Image img = imgicon.getImage();
      img = img.getScaledInstance(width, heigh, Image.SCALE_SMOOTH);
      
        return new ImageIcon(img);
    }
}
