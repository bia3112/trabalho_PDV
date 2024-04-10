/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.trabalhoPDV;

import br.unipar.trabalhoPDV.Panels.CadastrarClientePanel;
import br.unipar.trabalhoPDV.Panels.ListarClienteFrame;
import br.unipar.trabalhoPDV.Util.EntityManagerUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beatr
 */
public class TrabalhoPDV extends JFrame {
     private JPanel panelCadastrarCliente;

   
    private void abrirPanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel);
        revalidate();
        repaint();
    }      

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                EntityManagerUtil.getEntityManagerFactory();
                TrabalhoPDV menu = new TrabalhoPDV();
                menu.setVisible(true);
            }
        });
    }
    
     @Override
    public void dispose() {
        EntityManagerUtil.closeEntityManagerFactory();
        super.dispose();
    }
}

