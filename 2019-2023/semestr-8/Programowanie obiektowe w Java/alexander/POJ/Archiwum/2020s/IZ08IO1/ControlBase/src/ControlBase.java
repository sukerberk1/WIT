
import com.sun.javafx.font.FontConstants;
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
public class ControlBase extends javax.swing.JFrame {

    private final DefaultComboBoxModel<Animal> animalmodel=new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<String> namemodel=new DefaultComboBoxModel<>();
    public ControlBase() {
        initComponents();
        CbAnimals.setModel(animalmodel);
        CbNames.setModel(namemodel);
        for(String name:AnimalFabric.keys()) animalmodel.addElement(AnimalFabric.make(name,"Fellow"));
        for(String name:AnimalFabric.keys()) namemodel.addElement(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EdLog = new javax.swing.JTextArea();
        CbAnimals = new javax.swing.JComboBox<>();
        CbNames = new javax.swing.JComboBox<>();
        BtnCreate = new javax.swing.JButton();
        EdName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        EdLog.setEditable(false);
        EdLog.setColumns(20);
        EdLog.setRows(5);
        jScrollPane1.setViewportView(EdLog);

        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        EdName.setText("Fellow");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbAnimals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CbNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCreate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CbAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStart)
                    .addComponent(BtnCreate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        /*
        StringBuilder sb=new StringBuilder();
        sb.append("Ala ma kota ");
        sb.append(100);
        sb.append(':');
        sb.append(3.5);
        String str=sb.toString();
        EdLog.setText(str);
        */
        EdLog.setText
        (
            new StringBuilder()
            .append("Ala ma kota ")
            .append(100)
            .append(':')
            .append(3.5)
            .append(System.lineSeparator())
            .toString()
        );
        EdLog.append
        (
            new IdBuilder()
            .setDelimeter(", ")
            .append(100)
            .append(10)
            .append(1)
            .toString()
        );
        EdLog.append(System.lineSeparator());
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        Animal animal_1=(Animal)(CbAnimals.getSelectedItem());
        EdLog.append(animal_1+System.lineSeparator());
        Animal animal_2=AnimalFabric.make((String)(CbNames.getSelectedItem()),EdName.getText());
        EdLog.append(animal_2+System.lineSeparator());
    }//GEN-LAST:event_BtnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(ControlBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnStart;
    private javax.swing.JComboBox<Animal> CbAnimals;
    private javax.swing.JComboBox<String> CbNames;
    private javax.swing.JTextArea EdLog;
    private javax.swing.JTextField EdName;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
