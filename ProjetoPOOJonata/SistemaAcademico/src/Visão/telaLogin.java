/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

import javax.swing.JOptionPane;

/**
 *
 * @author ifpb
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
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

        NomeUsuario = new javax.swing.JTextField();
        SenhaDoUsuario = new javax.swing.JPasswordField();
        UsuarioTex = new javax.swing.JLabel();
        SenhaText = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        ImagemIF = new javax.swing.JLabel();
        PlanoDFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");
        getContentPane().setLayout(null);

        NomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NomeUsuario);
        NomeUsuario.setBounds(110, 400, 320, 20);
        getContentPane().add(SenhaDoUsuario);
        SenhaDoUsuario.setBounds(110, 440, 320, 20);

        UsuarioTex.setFont(new java.awt.Font("Txt", 1, 18)); // NOI18N
        UsuarioTex.setText("Usuário:");
        getContentPane().add(UsuarioTex);
        UsuarioTex.setBounds(10, 400, 100, 20);

        SenhaText.setFont(new java.awt.Font("Txt", 1, 18)); // NOI18N
        SenhaText.setText("Senha:");
        getContentPane().add(SenhaText);
        SenhaText.setBounds(10, 440, 80, 19);

        entrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(10, 510, 220, 40);
        entrar.getAccessibleContext().setAccessibleDescription("");

        Sair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(270, 510, 190, 40);

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(200, 590, 90, 23);

        ImagemIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gif.gif"))); // NOI18N
        getContentPane().add(ImagemIF);
        ImagemIF.setBounds(80, 40, 350, 290);

        PlanoDFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.jpg"))); // NOI18N
        getContentPane().add(PlanoDFundo);
        PlanoDFundo.setBounds(10, -10, 490, 760);

        setSize(new java.awt.Dimension(513, 785));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeUsuarioActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
                
		System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // botão acessar
        
        if ( NomeUsuario.getText().equals("admin") && SenhaDoUsuario.getText().equals("123")){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null," Usuario ou senha invalidos ");
            
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
       
        TelaCadastro TC = new TelaCadastro();
            TC.setVisible(true);
            dispose();
    }//GEN-LAST:event_cadastrarActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemIF;
    private javax.swing.JTextField NomeUsuario;
    private javax.swing.JLabel PlanoDFundo;
    private javax.swing.JButton Sair;
    private javax.swing.JPasswordField SenhaDoUsuario;
    private javax.swing.JLabel SenhaText;
    private javax.swing.JLabel UsuarioTex;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton entrar;
    // End of variables declaration//GEN-END:variables
}
