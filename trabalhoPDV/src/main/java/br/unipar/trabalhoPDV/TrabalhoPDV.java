/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.trabalhoPDV;

import br.unipar.trabalhoPDV.Panel.CadastrarClientePanel;
import br.unipar.trabalhoPDV.Panel.ListarClienteFrame;
import br.unipar.trabalhoPDV.Util.EntityManagerUtil;
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
    
      private JPanel panelCadastrarCliente;
      
             
     public TrabalhoPDV() {
        
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
         
        panelCadastrarCliente = new CadastrarClientePanel();
       
        // Criando a barra de menu
        JMenuBar menuBar = new JMenuBar();

        //Criar Menu Cadastro
        JMenu menuCadastro = new JMenu("Cadastros");
        
        //Criar Menu Cliente dentro do Menu Cadastro
        JMenu menuCliente = new JMenu("Cliente");
        
        //Criar menus de cadastro e lista de clientes
        JMenuItem cadastrarCliente = new JMenuItem("Cadastrar");
        JMenuItem listarCliente = new JMenuItem("Listar");
        
        
        //Adicionar menus de cadastro no menu Cliente
        menuCliente.add(cadastrarCliente);
        menuCliente.add(listarCliente);
        
        //Adicionar o menu Cliente no menu Cadastro
        menuCadastro.add(menuCliente);
        
        menuBar.add(menuCadastro);
        

         //Adiciona ações menus clientes
        cadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPanel(panelCadastrarCliente);
            }
        });
        
        listarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ListarClienteFrame().setVisible(true);
               
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
