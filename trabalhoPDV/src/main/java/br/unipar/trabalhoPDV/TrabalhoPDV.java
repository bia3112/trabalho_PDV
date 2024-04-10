/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.trabalhoPDV;

import br.unipar.trabalhoPDV.Util.EntityManagerUtil;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beatr
 */
public class TrabalhoPDV extends JFrame{

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                   EntityManagerUtil.getEntityManagerFactory();
            }
        });
    }
}
