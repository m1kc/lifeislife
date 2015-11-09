/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 18.02.2011, 15:52:40
 */

package lifeislife;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author m1kc
 */
public class MainFrame extends javax.swing.JFrame {

    final int w = 40;
    final int h = 25;
    final int tilesize = 16;
    boolean paused = false;
    World world;
    BufferedImage screen;
    int hlx = -1, hly = -1;

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
        world = new World(w,h);
        screen = new BufferedImage(w*tilesize,h*tilesize,BufferedImage.TYPE_INT_RGB);
        setSize(900,600);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner1.setValue(10000);
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start simulation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Grass");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cow");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Rock");

        jToggleButton1.setText("Pause");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Wolf");

        jButton2.setText("cycles: go!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jToggleButton1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);

        new Thread(){
            @Override
            public void run()
            {
                while(true)
                {
                    if (!paused) world.step(true);

                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run()
            {
                while(true)
                {
                    drawWorld();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int x = evt.getX()/tilesize;
        int y = evt.getY()/tilesize;
        System.out.println("Click at: "+x+","+y);
        if (jRadioButton1.isSelected()) world.world[x][y] = World.GRASS;
        if (jRadioButton2.isSelected()) world.animals.addElement(new Animal(x,y,Animal.GRASSEATER));
        if (jRadioButton3.isSelected()) world.animals.addElement(new Animal(x,y,Animal.MEATEATER));
        if (jRadioButton4.isSelected()) world.world[x][y] = World.ROCK;
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        hlx = evt.getX()/tilesize;
        hly = evt.getY()/tilesize;
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        hlx = hly = -1;
    }//GEN-LAST:event_jLabel1MouseExited

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        paused = jToggleButton1.isSelected();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int z = Integer.parseInt(jSpinner1.getValue().toString());
        for (int i=0; i<z; i++)
        {
            world.step(false);
            System.out.println("Fast forward: "+i+" cycles done.");
        }
        drawWorld();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Throwable ex)
        {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void drawWorld()
    {
        Graphics2D g = screen.createGraphics();

        for (int x=0; x<w; x++)
        {
            for (int y=0; y<h; y++)
            {
                int z = world.world[x][y];

                g.setColor(Color.red); // Признак ошибки
                if (z==World.NOTHING) g.setColor(Color.white);
                if (z==World.ROCK) g.setColor(Color.black);
                if (z==World.GRASS) g.setColor(Color.green);

                g.fillRect(x*tilesize, y*tilesize, tilesize, tilesize);
            }
        }

        for (int i=0; i<world.animals.size(); i++)
        {
            Animal a = (Animal) world.animals.elementAt(i);
            g.setColor(Color.red); // Признак ошибки
            if (a.type == Animal.GRASSEATER) g.setColor(Color.yellow);
            if (a.type == Animal.MEATEATER) g.setColor(Color.pink);
            g.fillRect(a.x * tilesize, a.y * tilesize, tilesize, tilesize);
        }

        if ((hlx != -1) && (hly != -1))
        {
            g.setColor(Color.red);
            g.drawRect(hlx * tilesize, hly * tilesize, tilesize - 1, tilesize - 1);
        }
        jLabel1.setIcon(new ImageIcon(screen));
        jLabel1.setSize(w*tilesize,h*tilesize);
    }

}
