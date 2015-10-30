/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Main.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Higor
 */
public class Saida_Veiculo extends javax.swing.JDialog {

     double troco;
    public Saida_Veiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pesquisar();
    }

    public Saida_Veiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLresultado = new javax.swing.JLabel();
        jBAcessar = new javax.swing.JButton();
        jBAcessar2 = new javax.swing.JButton();
        jBAcessar1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLValor = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTHora = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTValorRecebido = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTPlaca = new javax.swing.JTextField();
        jTData = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTGrupo = new javax.swing.JTextField();
        jTMensalista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saída de Veículo");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Troco"));

        jLresultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLresultado.setForeground(new java.awt.Color(204, 0, 0));
        jLresultado.setText("[TROCO]");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLresultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLresultado)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jBAcessar.setText("Cancelar");
        jBAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessarActionPerformed(evt);
            }
        });

        jBAcessar2.setText("Limpar");
        jBAcessar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessar2ActionPerformed(evt);
            }
        });

        jBAcessar1.setText("Salvar");
        jBAcessar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessar1ActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total a Pagar"));

        jLValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLValor.setText("[TOTAL A PAGAR]");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLValor)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Entrada"));

        jLabel20.setText("Placa:");

        jLabel21.setText("Data/Entrada:");

        jTHora.setEditable(false);
        jTHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jTHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setText("Hora/Entrada:");

        jLabel23.setText("Grupo:");

        jLabel24.setText("Nome do Veículo:");

        jTValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTValorRecebidoKeyReleased(evt);
            }
        });

        jLabel25.setText("Mensalista:");

        jTPlaca.setEditable(false);

        jTData.setEditable(false);

        jLabel26.setText("Valor Recebido:");

        jTNome.setEditable(false);

        jTGrupo.setEditable(false);

        jTMensalista.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTGrupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNome))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTHora, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTMensalista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValorRecebido)
                        .addGap(176, 176, 176))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jTHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTMensalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jTValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Veiculo", "Data/Entrada", "Hora/Entrada"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAcessar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAcessar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAcessar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAcessar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(851, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAcessar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessar1ActionPerformed
       salvar();
    }//GEN-LAST:event_jBAcessar1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selecao();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessarActionPerformed
     dispose();
    }//GEN-LAST:event_jBAcessarActionPerformed

    private void jTValorRecebidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTValorRecebidoKeyReleased
        troco();
    }//GEN-LAST:event_jTValorRecebidoKeyReleased

    private void jBAcessar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessar2ActionPerformed
       jTData.setText("");
       jTGrupo.setText("");
       jTHora.setText("");
       jTMensalista.setText("");
       jTNome.setText("");
       jTValorRecebido.setText("");
       jTPlaca.setText("");
       jLValor.setText("[TOTAL A PAGAR]");
       jLresultado.setText("[TROCO]");
    }//GEN-LAST:event_jBAcessar2ActionPerformed

    private void pesquisar (){
        try{
              Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection   
               ("jdbc:mysql://localhost/tcc","root","root");
       
       String query = "select * from entrada_veiculo where placa like?";
        PreparedStatement stmp = con.prepareStatement (query);
        
        stmp.setString(1,"%"+jTPlaca.getText()+"%");
        ResultSet rs =  stmp.executeQuery();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        
        while(rs.next()){
            model.addRow(new Object[]{
            
         
                rs.getString("placa"),
                rs.getString("nome"),
                rs.getString("data"),    
                rs.getString("hora"),
                
          
              
            });}
           
        
        }   catch(ClassNotFoundException EX){
            JOptionPane.showMessageDialog(null, "DRIVER NÃO ENCONTRADO" +EX);
            } catch(SQLException E) {
            JOptionPane.showMessageDialog(null, "ERRO DE GRAVAÇÃO"+E);
      } }
    private void selecao(){
    int row = jTable1.getSelectedRow();
           String table_click =(jTable1.getModel().getValueAt(row,0).toString());
                      
           try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conexao = DriverManager.getConnection
                   ("jdbc:mysql://localhost/tcc","root","root");
           String query = "Select * from entrada_veiculo where placa ='"+table_click+"'";
           ResultSet rs;
           PreparedStatement pst= conexao.prepareStatement(query);
           rs=pst.executeQuery();
             
           while(rs.next()){
                      String add1= rs.getString("placa");
                      jTPlaca.setText(add1);
                      String add2= rs.getString("nome");
                      jTNome.setText(add2);
                      String add3= rs.getString("data");
                      jTData.setText(add3);
                      String add4= rs.getString("hora");
                      jTHora.setText(add4);
                      String add5= rs.getString("grupo");
                      jTGrupo.setText(add5);
                      String add6= rs.getString("tipo");
                      jTMensalista.setText(add6);
                      String add7= rs.getString("valor");
                      jLValor.setText(add7);
                      
                  troco = Double.valueOf(add7).doubleValue();
                  
                  
             }
           } catch (SQLException e) {JOptionPane.showMessageDialog(null,"ERRO DE SQL " +e);
           } catch (ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null,"driver não encontrado"+ ex);
           }
    }
    public void troco(){
       
      if(jTValorRecebido.getText().isEmpty()){
           jLresultado.setText("[TROCO]");
      }else{
          
           try{
            double recebe =  Double.parseDouble(jTValorRecebido.getText());
            double resultado = recebe - troco;
            String r1 = Double.toString(resultado);
            jLresultado.setText(r1);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
      }
   }
    
    public void salvar(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tcc","root","root");
    String query = "Insert into Saida_Veiculo(placa,data,hora,grupo,nome,tipo,valorrecebido,valor,resultado) "
            + "values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmp = (PreparedStatement) con.prepareStatement(query);
        stmp.setString(1, jTPlaca.getText());
        stmp.setString(2, jTData.getText());
        stmp.setString(3, jTHora.getText());
        stmp.setString(4, jTGrupo.getText());
        stmp.setString(5, jTNome.getText());
        stmp.setString(6, jTMensalista.getText());
        stmp.setString(7, jTValorRecebido.getText());
        stmp.setString(8, jLValor.getText());
        stmp.setString(9, jLresultado.getText());
        stmp.executeUpdate();
        JOptionPane.showMessageDialog(null,"Entrada de Veiculo cadastrado!","Entrada de Veiculo",JOptionPane.INFORMATION_MESSAGE);
        stmp.close();
        con.close();
        
    }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null,"ERRO DE DRIVER"+ex);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"ERRO DE SQL"+e);
    }}
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
            java.util.logging.Logger.getLogger(Saida_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Saida_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Saida_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Saida_Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Saida_Veiculo dialog = new Saida_Veiculo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAcessar;
    private javax.swing.JButton jBAcessar1;
    private javax.swing.JButton jBAcessar2;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTData;
    private javax.swing.JTextField jTGrupo;
    private javax.swing.JFormattedTextField jTHora;
    private javax.swing.JTextField jTMensalista;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTextField jTValorRecebido;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
