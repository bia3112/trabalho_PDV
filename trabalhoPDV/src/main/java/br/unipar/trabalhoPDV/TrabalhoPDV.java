

package br.unipar.trabalhoPDV;

import br.unipar.trabalhoPDV.Util.EntityManagerUtil;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import br.unipar.trabalhoPDV.panels.ListarCliente;
import java.awt.event.*;

/**
 *
 * @author Beatr
 */
public class TrabalhoPDV  extends JFrame  {
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
         
           // Criando a barra de menu 
          JMenuBar menuBar = new JMenuBar();
           //Menu de Clientes
          JMenu menuCliente = new JMenu("Cliente");
           //Itens do Menu de Clientes
          JMenuItem ListaClientes = new JMenuItem("Lista Clientes");
          
          //Adiciona os menus itens no menu pai
           menuCliente.add(ListaClientes);
           //Adiciona o menu pai no menubar
            menuBar.add(menuCliente);
            
            listarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ListarClienteFrame().setVisible(true);
            }
        });
          
          

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                   EntityManagerUtil.getEntityManagerFactory();
            }
        });
    }
     @Override
    public void dispose() {
        EntityManagerUtil.closeEntityManagerFactory();
        super.dispose(); 
    }
}
