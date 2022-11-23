/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import javax.swing.BorderFactory;
public class Ventana extends JFrame {
    
     private List<JPanel> jPanelList;
    
     public Ventana() throws HeadlessException{
         
     this.setTitle("Border Layout");
        this.setSize(300, 200);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);

}

 
      public void iniciarPaneles(){
      
          this.jPanelList= new ArrayList<>();
          
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder
        (BorderFactory.createEtchedBorder(),"BorderLayout"));
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
      }

    public Ventana(List<JPanel> jPanelList) throws HeadlessException {
        this.jPanelList = jPanelList;
    }

    public Ventana(List<JPanel> jPanelList, GraphicsConfiguration gc) {
        super(gc);
        this.jPanelList = jPanelList;
    }

    public Ventana(List<JPanel> jPanelList, String title) throws HeadlessException {
        super(title);
        this.jPanelList = jPanelList;
    }

    public Ventana(List<JPanel> jPanelList, String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.jPanelList = jPanelList;
    }
      
}
