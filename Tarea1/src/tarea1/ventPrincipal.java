/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.awt.Color;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Akuseru
 */
public class ventPrincipal extends javax.swing.JFrame {
    //Global variables for the content in its natural and binary forms.
    List<String[]> globalContent = new ArrayList<String[]>();
    List<String[]> globalContentBinary = new ArrayList<String[]>();
    /**
     * Creates new form ventPrincipal
     */
    public ventPrincipal() {
        initComponents();
        JTableHeader header = table1.getTableHeader();
        header.setBackground(Color.decode("#23272a"));
        header.setForeground(Color.white);  
        btnNext.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAX = new javax.swing.JLabel();
        lblBX = new javax.swing.JLabel();
        lblCX = new javax.swing.JLabel();
        lblDX = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblIR = new javax.swing.JLabel();
        lblPC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(44, 47, 51));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Intruccion", "Operacion", "Registro", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setOpaque(false);
        table1.setRowHeight(30);
        table1.setSelectionBackground(new java.awt.Color(213, 205, 213));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 650, 140));

        btnNext.setBackground(new java.awt.Color(153, 170, 181));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Siguiente");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 200, 50));

        btnLoad.setBackground(new java.awt.Color(153, 170, 181));
        btnLoad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoad.setForeground(new java.awt.Color(255, 255, 255));
        btnLoad.setText("Cargar ASM");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 200, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1270, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Memoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registros");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AC");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PC");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DX");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BX");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AX");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CX");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cargue el archivo de entrada");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        lblAX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAX.setForeground(new java.awt.Color(255, 255, 255));
        lblAX.setText("----------------------------------");
        getContentPane().add(lblAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 458, -1, -1));

        lblBX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBX.setForeground(new java.awt.Color(255, 255, 255));
        lblBX.setText("----------------------------------");
        getContentPane().add(lblBX, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 518, -1, -1));

        lblCX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCX.setForeground(new java.awt.Color(255, 255, 255));
        lblCX.setText("----------------------------------");
        getContentPane().add(lblCX, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 578, -1, -1));

        lblDX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDX.setForeground(new java.awt.Color(255, 255, 255));
        lblDX.setText("----------------------------------");
        getContentPane().add(lblDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 638, -1, -1));

        lblAC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAC.setForeground(new java.awt.Color(255, 255, 255));
        lblAC.setText("----------------------------------");
        getContentPane().add(lblAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 548, -1, -1));

        lblIR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIR.setForeground(new java.awt.Color(255, 255, 255));
        lblIR.setText("----------------------------------");
        getContentPane().add(lblIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 608, -1, -1));

        lblPC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPC.setForeground(new java.awt.Color(255, 255, 255));
        lblPC.setText("----------------------------------");
        getContentPane().add(lblPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 488, -1, -1));

        jLabel1.setBackground(new java.awt.Color(44, 47, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Actual index of table in program.
    int index = 0;
    int size=0;
    /**
     * This function is the action for the Next Button, it changes the values on screen according to the operation made.
     * @param evt 
     * Returns data on screen.
     */
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        String[] array2 = globalContent.get(index);
        
        if(index<size-1){
            String[] array = globalContentBinary.get(index+1); 
            table1.setRowSelectionInterval(index, index);
            index +=1;
            lblPC.setText(table1.getValueAt(table1.getSelectedRow()+1,0).toString());
                       
            lblIR.setText(array[1]+" "+array[2]+" "+array[3]);
        }        
        else{
            table1.setRowSelectionInterval(index, index);
            JOptionPane.showMessageDialog(null, "Está en el ultimo ! \n Para ver otro ejemplo cargue otro archivo");
            btnNext.setEnabled(false);
        }        
        if(array2[0].equals("MOV")){
            if(array2[1].equals("AX")){
                lblAX.setText(array2[2]);
            }
            else if(array2[1].equals("BX")){
                lblBX.setText(array2[2]);
            }
            else if(array2[1].equals("CX")){
                lblCX.setText(array2[2]);
            }else{
                lblDX.setText(array2[2]);
            }        
        }
        else if(array2[0].equals("SUB")){
            if(array2[1].equals("AX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())-Integer.parseInt(lblAX.getText())));
            }
            else if(array2[1].equals("BX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())-Integer.parseInt(lblBX.getText())));
            }
            else if(array2[1].equals("CX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())-Integer.parseInt(lblCX.getText())));
            }else{
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())-Integer.parseInt(lblDX.getText())));
            }  
        }
        else if(array2[0].equals("ADD")){
            if(array2[1].equals("AX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())+Integer.parseInt(lblAX.getText())));
            }
            else if(array2[1].equals("BX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())+Integer.parseInt(lblBX.getText())));
            }
            else if(array2[1].equals("CX")){
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())+Integer.parseInt(lblCX.getText())));
            }else{
                lblAC.setText(Integer.toString(Integer.parseInt(lblAC.getText())+Integer.parseInt(lblDX.getText())));
            } 
        }
        else if(array2[0].equals("LOAD")){
            if(array2[1].equals("AX")){
                lblAC.setText(lblAX.getText());
            }
            else if(array2[1].equals("BX")){
                lblAC.setText(lblBX.getText());
            }
            else if(array2[1].equals("CX")){
                lblAC.setText(lblCX.getText());
            }else{
                lblAC.setText(lblDX.getText());
            } 
        }
        else{
            if(array2[1].equals("AX")){
                lblAX.setText(lblAC.getText());
            }
            else if(array2[1].equals("BX")){
                lblBX.setText(lblAC.getText());
            }
            else if(array2[1].equals("CX")){
                lblCX.setText(lblAC.getText());
            }else{
                lblDX.setText(lblAC.getText());
            } 
        }
    }//GEN-LAST:event_btnNextActionPerformed
    /**
     * This function is the load event basically.
     * It calls the necessary file chooser and the other elements to read an asm file.
     * It will use the class Data to parse the content to binary.
     * @param evt 
     */
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        btnNext.setEnabled(true);
        index = 0;
        globalContent=null;
        globalContentBinary=null;
        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("ASM Files","asm");
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(this);
        File file = fileChooser.getSelectedFile();
        System.out.println(fileChooser.getSelectedFile().getPath());
        Path filePath = fileChooser.getSelectedFile().toPath();
        List<String> content = null;
        try {
             content= Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(ventPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<String[]> processedContent = new ArrayList<String[]>();
        globalContent = processedContent;
        size = content.size();
        for(int i=0;i<content.size();i++){            
            String[] parts = content.get(i).split("\\s+|,");
            processedContent.add(parts);
            System.out.println(Arrays.toString(processedContent.get(i)));
        }
        Data obj = new Data();        
        List<String[]> result = obj.transformCode(processedContent);    
        globalContentBinary = result;
        String [][] data={};
        String titles[] = {"Instruccion","Operacion","Registro","Numero"};
        DefaultTableModel model = new DefaultTableModel(data,titles);
        for(int i=0;i<result.size();i++){    
            String[] array = result.get(i);            
            model.addRow(result.get(i));
            System.out.println(Arrays.toString(result.get(i)));
        }
        table1.setModel(model);
        //System.out.println(obj.transformCode(processedContent));
        lblAC.setText("0");
        lblDX.setText("0");
        lblAX.setText("0");
        lblBX.setText("0");
        lblCX.setText("0");
        lblPC.setText("0");
        lblIR.setText("----------------------------------");
    }//GEN-LAST:event_btnLoadActionPerformed

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
            java.util.logging.Logger.getLogger(ventPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblAX;
    private javax.swing.JLabel lblBX;
    private javax.swing.JLabel lblCX;
    private javax.swing.JLabel lblDX;
    private javax.swing.JLabel lblIR;
    private javax.swing.JLabel lblPC;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
