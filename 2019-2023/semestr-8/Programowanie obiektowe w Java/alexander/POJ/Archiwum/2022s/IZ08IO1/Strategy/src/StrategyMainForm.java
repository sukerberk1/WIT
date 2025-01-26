
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class StrategyMainForm extends javax.swing.JFrame
{
   private final DefaultComboBoxModel<String> jumpModel=new DefaultComboBoxModel<>();

   public StrategyMainForm()
   {
      initComponents();
      CbStrategyJump.setModel(jumpModel);
      for(String key:SportsmenStrategyJumpFactory.keys) jumpModel.addElement(key);
      CbStrategyJump.setSelectedIndex(0);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jScrollPane1 = new javax.swing.JScrollPane();
      LbCommands = new javax.swing.JList<>();
      jScrollPane2 = new javax.swing.JScrollPane();
      LbTraining = new javax.swing.JList<>();
      BtnAddToTraining = new javax.swing.JButton();
      BtnRemoveFromTraining = new javax.swing.JButton();
      TfTrainingName = new javax.swing.JTextField();
      BtnAddTreningToCommands = new javax.swing.JButton();
      BtnRemoveFromCommands = new javax.swing.JButton();
      jSpinner1 = new javax.swing.JSpinner();
      BtnAddMultipłyToCommands = new javax.swing.JButton();
      BtnExecute = new javax.swing.JButton();
      TfSportsmenName = new javax.swing.JTextField();
      jScrollPane3 = new javax.swing.JScrollPane();
      TaLog = new javax.swing.JTextArea();
      CbStrategyJump = new javax.swing.JComboBox<>();
      jComboBox2 = new javax.swing.JComboBox<>();
      jComboBox3 = new javax.swing.JComboBox<>();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jScrollPane1.setViewportView(LbCommands);

      jScrollPane2.setViewportView(LbTraining);

      BtnAddToTraining.setText("=>");

      BtnRemoveFromTraining.setText("X");

      TfTrainingName.setText("Base");

      BtnAddTreningToCommands.setText("<=");
      BtnAddTreningToCommands.setToolTipText("Add trainig");

      BtnRemoveFromCommands.setText("X");

      BtnAddMultipłyToCommands.setText("<=");
      BtnAddMultipłyToCommands.setToolTipText("Add multiply");

      BtnExecute.setText("Execute");

      TfSportsmenName.setText("Smith");

      TaLog.setEditable(false);
      TaLog.setColumns(20);
      TaLog.setRows(5);
      jScrollPane3.setViewportView(TaLog);

      CbStrategyJump.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane3)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnRemoveFromCommands)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRemoveFromTraining))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(BtnAddToTraining)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(BtnAddMultipłyToCommands)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnAddTreningToCommands)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfTrainingName, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(TfSportsmenName)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(BtnExecute))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(CbStrategyJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(BtnAddToTraining)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(TfTrainingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(BtnAddTreningToCommands))))
                  .addGap(8, 8, 8)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(BtnAddMultipłyToCommands))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(BtnRemoveFromTraining)
                     .addComponent(BtnRemoveFromCommands))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(CbStrategyJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(BtnExecute)
               .addComponent(TfSportsmenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

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
      try
      {
         for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels())
            if("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
      }
      catch(ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(StrategyMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(StrategyMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(StrategyMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      catch(javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(StrategyMainForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new StrategyMainForm().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton BtnAddMultipłyToCommands;
   private javax.swing.JButton BtnAddToTraining;
   private javax.swing.JButton BtnAddTreningToCommands;
   private javax.swing.JButton BtnExecute;
   private javax.swing.JButton BtnRemoveFromCommands;
   private javax.swing.JButton BtnRemoveFromTraining;
   private javax.swing.JComboBox<String> CbStrategyJump;
   private javax.swing.JList<String> LbCommands;
   private javax.swing.JList<String> LbTraining;
   private javax.swing.JTextArea TaLog;
   private javax.swing.JTextField TfSportsmenName;
   private javax.swing.JTextField TfTrainingName;
   private javax.swing.JComboBox<String> jComboBox2;
   private javax.swing.JComboBox<String> jComboBox3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JSpinner jSpinner1;
   // End of variables declaration//GEN-END:variables
}
