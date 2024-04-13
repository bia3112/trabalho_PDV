/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.trabalhoPDV;

import br.unipar.trabalhoPDV.Panel.ListarClienteFrame;
import br.unipar.trabalhoPDV.Panel.ListarProdutoFrame;
import br.unipar.trabalhoPDV.Panel.VendaPanel;
import br.unipar.trabalhoPDV.Util.EntityManagerUtil;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beatr
 */
public class TrabalhoPDV extends JFrame{
    
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JPanel panelVenda;
             
     public TrabalhoPDV() {
        
        setTitle("Menu");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    
        
        //panel principal Venda
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        panelVenda = new VendaPanel();
        cardPanel.add(panelVenda, "Venda");
        
        add(cardPanel);
         cardLayout.show(cardPanel, "VENDA");
       
        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();

        //Criar Menu Cadastro
        JMenu menulistas = new JMenu("Listas");
        
        
        //Criar menus de cadastro e lista de clientes
       
        JMenuItem listarCliente = new JMenuItem("Cliente");
        JMenuItem ListarProduto = new JMenuItem("Produto");
        
        
        //Adicionar menus de cadastro no menu Cliente
       
        menulistas.add(listarCliente);
        menulistas.add(ListarProduto);
        
        
        
        menuBar.add(menulistas);
        

         //Adiciona ações menus clientes
      
        listarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ListarClienteFrame().setVisible(true);
               
            }
        });
        ListarProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ListarProdutoFrame().setVisible(true);
               
            }
        });


        setJMenuBar(menuBar);
    }
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
