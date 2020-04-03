/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.DadosCurso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Curso;

/**
 *
 * @author jadson
 */
public class GuiCursos extends javax.swing.JFrame 
{
    /**
     * Creates new form GuiCursos
     */
    public GuiCursos() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCurso = new javax.swing.JTable();
        BtnExcluir = new javax.swing.JButton();
        BtnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cursos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Cursos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 6, -1, -1));

        TblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane1.setViewportView(TblCurso);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 271, 192));

        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 257, -1, -1));

        BtnNovo.setText("Novo");
        BtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoActionPerformed
        // TODO add your handling code here:
        GuiCurso gui = new GuiCurso(null, true);
        gui.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_BtnNovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        preencherTabela();
    }//GEN-LAST:event_formWindowActivated

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        // TODO add your handling code here:
        Curso curso = (Curso)  TblCurso.getValueAt(TblCurso.getSelectedRow(), 0);
        try 
        {
            new DadosCurso().excluir(curso);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        
        preencherTabela();
    }//GEN-LAST:event_BtnExcluirActionPerformed
    
    private void preencherTabela() 
    {
        try 
        {
            // TODO add your handling code here:
            List<Curso> cursos = new DadosCurso().listar();
            
            DefaultTableModel table = (DefaultTableModel) TblCurso.getModel();
            
            int linhas = table.getRowCount();
            
            for (int i=0;i<linhas;i++) 
            {
                table.removeRow(0);
            }
            
            for (Curso curso: cursos) 
            {
                Object linha[] = {curso, curso.getNome()};
                table.addRow(linha);
            }            
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GuiCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnNovo;
    private javax.swing.JTable TblCurso;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
