/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.DadosAluno;
import dados.DadosProfessor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import model.Professor;
import model.Usuario;

/**
 *
 * @author jadson
 */
public class GuiInicio extends javax.swing.JFrame 
{
    /**
     * Creates new form GuiInicio
     */
    private static Usuario usuario;
    private Aluno aluno;
    private Professor professor;
    
    public GuiInicio(Usuario user) 
    {
        initComponents();
        usuario = user;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDiretor = new javax.swing.JPanel();
        BtnDisciplina = new javax.swing.JToggleButton();
        BtnCurso = new javax.swing.JButton();
        BtnUsuario = new javax.swing.JButton();
        BtnProfessor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PainelAluno = new javax.swing.JPanel();
        BtnConsultarTurma = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PainelSecretaria = new javax.swing.JPanel();
        BtnAluno = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PainelProfessor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BtnFTurma = new javax.swing.JButton();
        PainelCoordenador = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnCTurma = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio - Bem Vindo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelDiretor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnDisciplina.setText("Disciplinas");
        BtnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDisciplinaActionPerformed(evt);
            }
        });
        PainelDiretor.add(BtnDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        BtnCurso.setText("Cursos");
        BtnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCursoActionPerformed(evt);
            }
        });
        PainelDiretor.add(BtnCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        BtnUsuario.setText("Usuários");
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });
        PainelDiretor.add(BtnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 91, -1));

        BtnProfessor.setText("Professores");
        BtnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfessorActionPerformed(evt);
            }
        });
        PainelDiretor.add(BtnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jLabel3.setText("Diretor");
        PainelDiretor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, -1, -1));

        getContentPane().add(PainelDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 16, 132, 224));

        PainelAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnConsultarTurma.setText("Turmas");
        BtnConsultarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarTurmaActionPerformed(evt);
            }
        });
        PainelAluno.add(BtnConsultarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, -1, -1));

        jLabel2.setText("Aluno");
        PainelAluno.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 0, -1, -1));

        getContentPane().add(PainelAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 24, -1, -1));

        PainelSecretaria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAluno.setText("Alunos");
        BtnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlunoActionPerformed(evt);
            }
        });
        PainelSecretaria.add(BtnAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 27, 79, -1));

        jLabel4.setText("Secretaria");
        PainelSecretaria.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 6, -1, -1));

        getContentPane().add(PainelSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 22, 114, 85));

        PainelProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Professor");
        PainelProfessor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        BtnFTurma.setText("Turmas");
        BtnFTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFTurmaActionPerformed(evt);
            }
        });
        PainelProfessor.add(BtnFTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(PainelProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 16, 118, 71));

        PainelCoordenador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Coordenador");
        PainelCoordenador.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 6, -1, -1));

        BtnCTurma.setText("Turmas");
        BtnCTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCTurmaActionPerformed(evt);
            }
        });
        PainelCoordenador.add(BtnCTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 33, -1, -1));

        getContentPane().add(PainelCoordenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 16, 141, 106));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 196, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try 
        {
            // TODO add your handling code here:
            liberar();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(GuiInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void BtnCTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCTurmaActionPerformed
        // TODO add your handling code here:
        try
        {
            GuiTurmas guiTurma = new GuiTurmas();
            guiTurma.setVisible(true);
        }
        catch (Exception e)
        {
        }
    }//GEN-LAST:event_BtnCTurmaActionPerformed

    private void BtnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlunoActionPerformed
        // TODO add your handling code here:
        try
        {
            GuiAlunos g = new GuiAlunos();
            g.setVisible(true);
        }
        catch (Exception e)
        {
        }
    }//GEN-LAST:event_BtnAlunoActionPerformed

    private void BtnConsultarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarTurmaActionPerformed
        // TODO add your handling code here:  
        new GuiInscricaoTurma(this.aluno).setVisible(true);
    }//GEN-LAST:event_BtnConsultarTurmaActionPerformed

    private void BtnFTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFTurmaActionPerformed
        // TODO add your handling code here:
        new GuiTurmaProfessor(professor).setVisible(true);
    }//GEN-LAST:event_BtnFTurmaActionPerformed

    private void BtnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfessorActionPerformed
        // TODO add your handling code here:
        new GuiProfessores().setVisible(true);
    }//GEN-LAST:event_BtnProfessorActionPerformed

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:
        try
        {
            GuiUsuarios gui = new GuiUsuarios();
            gui.setVisible(true);
        }
        catch (Exception ex)
        {
            Logger.getLogger(GuiInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCursoActionPerformed
        // TODO add your handling code here:
        new GuiCursos().setVisible(true);
    }//GEN-LAST:event_BtnCursoActionPerformed

    private void BtnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDisciplinaActionPerformed
        // TODO add your handling code here:
        new GuiDisciplinas().setVisible(true);
    }//GEN-LAST:event_BtnDisciplinaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        new GuiLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(GuiInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GuiInicio(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAluno;
    private javax.swing.JButton BtnCTurma;
    private javax.swing.JButton BtnConsultarTurma;
    private javax.swing.JButton BtnCurso;
    private javax.swing.JToggleButton BtnDisciplina;
    private javax.swing.JButton BtnFTurma;
    private javax.swing.JButton BtnProfessor;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JPanel PainelAluno;
    private javax.swing.JPanel PainelCoordenador;
    private javax.swing.JPanel PainelDiretor;
    private javax.swing.JPanel PainelProfessor;
    private javax.swing.JPanel PainelSecretaria;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void liberar() throws Exception 
    {
        switch (usuario.getTipo()) 
        {
            case Aluno:
                liberarAluno();
                break;
            case Professor:
                liberarProfessor();
                break;
            case Coordenador:
                liberarCoordenador();
                break;
            case Diretor:
                liberarDiretor();
                break;
            case Secretaria:
                liberarSecretaria();
                break;
            default:
                break;
        }
    }

    private void liberarAluno() throws Exception 
    {
        List<Aluno> alunos = new DadosAluno().listar();
        for(Aluno alu: alunos)
        {
            if(alu.getUsuario().equals(usuario))
            {
                this.aluno = alu;
            }
        }
        
        PainelCoordenador.setVisible(false);
        PainelDiretor.setVisible(false);
        PainelProfessor.setVisible(false);
        PainelSecretaria.setVisible(false);
        PainelAluno.setVisible(true);
    }

    private void liberarProfessor() throws Exception
    {        
        List<Professor> professores = new DadosProfessor().listar();
        for(Professor prof: professores)
        {
            if(prof.getUsuario().equals(usuario))
            {
                this.professor = prof;
            }
        }
        
        PainelCoordenador.setVisible(false);
        PainelDiretor.setVisible(false);
        PainelAluno.setVisible(false);
        PainelSecretaria.setVisible(false);
        PainelProfessor.setVisible(true);
    }

    private void liberarCoordenador() 
    {
        PainelCoordenador.setVisible(true);
        PainelDiretor.setVisible(false);
        PainelAluno.setVisible(false);
        PainelSecretaria.setVisible(false);
        PainelProfessor.setVisible(false);
    }

    private void liberarDiretor() 
    {
        PainelCoordenador.setVisible(false);
        PainelDiretor.setVisible(true);
        PainelAluno.setVisible(false);
        PainelSecretaria.setVisible(false);
        PainelProfessor.setVisible(false);
    }

    private void liberarSecretaria() 
    {
        PainelCoordenador.setVisible(false);
        PainelDiretor.setVisible(false);
        PainelAluno.setVisible(false);
        PainelSecretaria.setVisible(true);
        PainelProfessor.setVisible(false);
    }
}