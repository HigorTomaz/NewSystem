/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas_000
 */
public class Relatorio_ClienteMensalista extends javax.swing.JDialog {

    /**
     * Creates new form Relatorio_ClienteMensalista
     */
    public Relatorio_ClienteMensalista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
           pesquisa();
        SUM();
    }
    private void pesquisa (){
        try{
              Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection   
               ("jdbc:mysql://localhost/tcc","root","root");
       
       String query = "select * from caixa_mensalista where IDcliente like?";
        PreparedStatement stmp = con.prepareStatement (query);
        String ps ="";
        stmp.setString(1,"%"+ps+"%");
        ResultSet rs =  stmp.executeQuery();
        DefaultTableModel model = (DefaultTableModel) jTRelatorio.getModel();
        model.setNumRows(0);
        while(rs.next()){
            model.addRow(new Object[]{
            
                rs.getString("IDcliente"),
                rs.getString("nome"),
                rs.getString("placa"),
                 rs.getString("grupo"),
                 rs.getString("veiculo"),
                rs.getString("valor"),
            });}
           
        
        } catch(ClassNotFoundException EX){
        JOptionPane.showMessageDialog(null, "DRIVER NÃO ENCONTRADO" +EX);
                    } catch(SQLException E) {
         JOptionPane.showMessageDialog(null, "ERRO DE GRAVAÇÃO"+E);
      } }
    private void SUM (){
        try{
              Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection   
               ("jdbc:mysql://localhost/tcc","root","root");
       
       String query = "SELECT SUM(valor) From caixa_mensalista";
         PreparedStatement stmp = con.prepareStatement (query);
         ResultSet rs = stmp.executeQuery();
         String str=null;
        while(rs.next()){
         
            double soma = rs.getDouble(1);
            str = Double.toString(soma);
        }
        jLtotal.setText(str);
        
           
        
        } catch(ClassNotFoundException EX){
        JOptionPane.showMessageDialog(null, "DRIVER NÃO ENCONTRADO" +EX);
                    } catch(SQLException E) {
         JOptionPane.showMessageDialog(null, "ERRO DE GRAVAÇÃO"+E);
      } }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTRelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Cliente Mensalista");

        jTRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IDcliente", "Nome ", "Placa", "Grupo", "Veiculo", "Valor Pago"
            }
        ));
        jScrollPane3.setViewportView(jTRelatorio);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TOTAL:");

        jLtotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLtotal.setForeground(new java.awt.Color(255, 0, 0));
        jLtotal.setText("[total]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLtotal)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLtotal))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(580, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Relatorio_ClienteMensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio_ClienteMensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio_ClienteMensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio_ClienteMensalista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Relatorio_ClienteMensalista dialog = new Relatorio_ClienteMensalista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLtotal;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTRelatorio;
    // End of variables declaration//GEN-END:variables
}
