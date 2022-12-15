/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bingogame;

import java.lang.Math;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class GUI extends javax.swing.JFrame {
    
    ArrayList<bingoSet> bingoSetList = new ArrayList<>();
    ArrayList<String> bList = new ArrayList<>();
    ArrayList<String> iList = new ArrayList<>();
    ArrayList<String> nList = new ArrayList<>();
    ArrayList<String> gList = new ArrayList<>();
    ArrayList<String> oList = new ArrayList<>();
    
    int lang = 0;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        Toolkit a = Toolkit.getDefaultToolkit();
        int xSize = (int) a.getScreenSize().getWidth();
        int ySize = (int) a.getScreenSize().getHeight();
        this.setSize(xSize, ySize);
        
        tableEdit();
        
        
    }
    
    private int stringToInt(String str){
        return Integer.parseInt(str.substring(1));
    }
    
    private int randomInt(int max){ 
       double x = Math.random() * max;
       int rand = (int) x;
       return rand;
    }
    
    private void tableEdit(){
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) bingoList.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0); // Alligning Table Header to Center. (0 = CENTER)

        bingoList.getTableHeader().setFont(new Font("Cocogoose", Font.BOLD , 50)); // Table Header Font
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Defining DefaultTableCellRenderer
        centerRenderer.setHorizontalAlignment(gameTitle.CENTER);
        
        
        
        bingoList.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); //Column 0 = CENTERED
        bingoList.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        bingoList.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        bingoList.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        bingoList.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        languageButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        bingoBallJLabel = new javax.swing.JLabel();
        chooseWinnerButton = new javax.swing.JLabel();
        newNumberButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bingoList = new javax.swing.JTable();
        bingoBall = new javax.swing.JLabel();
        gameTitle = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lets Play Bingo!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setLayout(null);

        languageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/usaflag.png"))); // NOI18N
        languageButton.setText("jButton1");
        languageButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        languageButton.setContentAreaFilled(false);
        languageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(languageButton);
        languageButton.setBounds(30, 980, 70, 70);

        resetButton.setFont(new java.awt.Font("Gameplay", 0, 40)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 51, 51));
        resetButton.setText("Reset");
        resetButton.setBorder(null);
        resetButton.setContentAreaFilled(false);
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        resetButton.setBounds(1590, 670, 330, 80);

        bingoBallJLabel.setFont(new java.awt.Font("Heavitas", 0, 200)); // NOI18N
        bingoBallJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(bingoBallJLabel);
        bingoBallJLabel.setBounds(240, 550, 530, 250);

        chooseWinnerButton.setFont(new java.awt.Font("Gameplay", 0, 24)); // NOI18N
        chooseWinnerButton.setForeground(new java.awt.Color(102, 255, 102));
        chooseWinnerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseWinnerButton.setText("CHOOSE WINNER");
        chooseWinnerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseWinnerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseWinnerButtonMouseClicked(evt);
            }
        });
        jPanel1.add(chooseWinnerButton);
        chooseWinnerButton.setBounds(1590, 860, 330, 110);

        newNumberButton.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.icon.disabledBackground"));
        newNumberButton.setFont(new java.awt.Font("Gameplay", 0, 36)); // NOI18N
        newNumberButton.setText("New Ball");
        newNumberButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 5, true));
        newNumberButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNumberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newNumberButton);
        newNumberButton.setBounds(300, 270, 380, 80);

        jScrollPane1.setColumnHeaderView(null);

        bingoList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bingoList.setFont(new java.awt.Font("Gameplay", 0, 48)); // NOI18N
        bingoList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null}
            },
            new String [] {
                "B", "I", "N", "G", "O"
            }
        ));
        bingoList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        bingoList.setEnabled(false);
        bingoList.setGridColor(new java.awt.Color(0, 0, 0));
        bingoList.setName(""); // NOI18N
        bingoList.setRowHeight(60);
        bingoList.setRowSelectionAllowed(false);
        bingoList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bingoList.setShowGrid(false);
        bingoList.setShowVerticalLines(true);
        bingoList.getTableHeader().setResizingAllowed(false);
        bingoList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bingoList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(860, 260, 730, 710);

        bingoBall.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        bingoBall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/bingo ball.png"))); // NOI18N
        bingoBall.setText("TEXTTEXTTEXTTEXT");
        jPanel1.add(bingoBall);
        bingoBall.setBounds(170, 340, 650, 650);

        gameTitle.setFont(new java.awt.Font("QUARTZO demo", 0, 70)); // NOI18N
        gameTitle.setForeground(new java.awt.Color(255, 255, 255));
        gameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTitle.setText("LETS PLAY BINGO!");
        jPanel1.add(gameTitle);
        gameTitle.setBounds(480, 100, 1050, 130);

        quitButton.setBackground(new java.awt.Color(51, 51, 255));
        quitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/xbutton.png"))); // NOI18N
        quitButton.setBorder(null);
        quitButton.setBorderPainted(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton.setDefaultCapable(false);
        quitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quitButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/xbuttonClick.png"))); // NOI18N
        quitButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/xbutton.png"))); // NOI18N
        quitButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/xbutton.png"))); // NOI18N
        quitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitButtonMouseClicked(evt);
            }
        });
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quitButton);
        quitButton.setBounds(1880, 10, 32, 34);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/Blue Checkerboard.png"))); // NOI18N
        backGround.setText("jLabel2");
        jPanel1.add(backGround);
        backGround.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitButtonActionPerformed

    private void quitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_quitButtonMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void newNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNumberButtonActionPerformed
       DefaultTableModel tblModel = (DefaultTableModel)bingoList.getModel();
       int number = randomInt(74) + 1;
       char letter = bingoSet.toLetter(randomInt(5) + 1);
       String letterNum = letter + String.valueOf(number);
       
       if (bingoSetList.isEmpty()){
           bingoSetList.add(new bingoSet(letter, number)); 
       } else {
           
           boolean isDuplicate = true;
           while (isDuplicate){
               for (int i = 0; i < bingoSetList.size(); i++){
                   bingoSet bingo = bingoSetList.get(i);
                   if (bingo.bingoBall().equals(letterNum)){
                       number = randomInt(74) + 1;
                       letter = bingoSet.toLetter(randomInt(5) + 1);
                       letterNum = letter + String.valueOf(number);
                   } else {
                       isDuplicate = false;
                   }
               }
           }
           
           
           
           bingoSetList.add(new bingoSet(letter, number));
           
       }
       
       switch (letter){
               case 'B' -> bList.add(letter + String.valueOf(number));
               case 'I' -> iList.add(letter + String.valueOf(number));
               case 'N' -> nList.add(letter + String.valueOf(number));
               case 'G' -> gList.add(letter + String.valueOf(number));
               case 'O' -> oList.add(letter + String.valueOf(number));
           }
       
       bingoBallJLabel.setText(letterNum);
       
       
       
       for (int i = 0; i < bingoSetList.size(); i++){
           bingoSet bingo = bingoSetList.get(i);
           System.out.println(bingoSetList.size() + " " + bingo.bingoBall());
       }
       
      // tblModel.setValueAt(String.valueOf(number), 0, 1); // - example of setting row 0, column 0 to number
      
      if (tblModel.getRowCount() < bList.size() || 
          tblModel.getRowCount() < iList.size() || 
          tblModel.getRowCount() < nList.size() ||
          tblModel.getRowCount() < gList.size() ||
          tblModel.getRowCount() < oList.size()){
          
          tblModel.addRow(new Object[]{"", "", "", "", ""});
          
          for (int i = 0; i < tblModel.getRowCount(); i++){
            if (bList.size() - i > 0){
                tblModel.setValueAt(stringToInt(bList.get(i)),i,0);
            }
            
            if (iList.size() - i > 0){
                tblModel.setValueAt(stringToInt(iList.get(i)),i,1);
            }
            
            if (nList.size() - i > 0){
                tblModel.setValueAt(stringToInt(nList.get(i)),i,2);
            }
            
            if (gList.size() - i > 0){
                tblModel.setValueAt(stringToInt(gList.get(i)),i,3);
            }
            
            if (oList.size() - i > 0){
                tblModel.setValueAt(stringToInt(oList.get(i)),i,4);
            }
        
        }
      } else {
          for (int i = 0; i < tblModel.getRowCount(); i++){
            if (bList.size() - i > 0){
                tblModel.setValueAt(stringToInt(bList.get(i)),i,0);
            }
            
            if (iList.size() - i > 0){
                tblModel.setValueAt(stringToInt(iList.get(i)),i,1);
            }
            
            if (nList.size() - i > 0){
                tblModel.setValueAt(stringToInt(nList.get(i)),i,2);
            }
            
            if (gList.size() - i > 0){
                tblModel.setValueAt(stringToInt(gList.get(i)),i,3);
            }
            
            if (oList.size() - i > 0){
                tblModel.setValueAt(stringToInt(oList.get(i)),i,4);
            }
        
        }
        
        
        
      }
       
       System.out.print(String.valueOf(bList.size()) + String.valueOf(iList.size()) + String.valueOf(nList.size()) + String.valueOf(gList.size()) + String.valueOf(oList.size()));
       System.out.println(" " + tblModel.getRowCount());
    }//GEN-LAST:event_newNumberButtonActionPerformed

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)bingoList.getModel();
        
        bList.clear();
        iList.clear();
        nList.clear();
        gList.clear();
        oList.clear();
        
        bingoSetList.clear();
        
        int rowCount = tblModel.getRowCount();
        
        for (int i = 0; i < rowCount; i++){
            tblModel.removeRow(tblModel.getRowCount()-1);
            System.out.println(i);
        }
        
        tblModel.addRow(new Object[]{"", "", "", "", ""});
        bingoBallJLabel.setText("");
        
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void chooseWinnerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseWinnerButtonMouseClicked
       // TODO add your handling code here:
       ChooseWinnerScreen chooseWinner = new ChooseWinnerScreen();
       chooseWinner.show();
       dispose();
    }//GEN-LAST:event_chooseWinnerButtonMouseClicked

    private void languageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageButtonActionPerformed
        // TODO add your handling code here:
        lang++;
        
        switch (lang){
            case 0: {
               gameTitle.setText("LETS PLAY BINGO!");
               resetButton.setText("RESET");
               chooseWinnerButton.setText("CHOOSE WINNER");
               newNumberButton.setText("NEW BALL");
               languageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/usaflag.png")));
               break;
            }
            
            case 1: {
                gameTitle.setText("¡VAMOS A JUGAR BINGO!");
                resetButton.setText("REINICIAR");
                chooseWinnerButton.setText("ELEGIR GANADOR");
                newNumberButton.setText("NUEVO BOLA");
                languageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/spanishflag.png")));
                break;
            }
            
            case 2:{
                gameTitle.setText("VAMOS JOGAR BINGO!");
                resetButton.setText("REDEFINR");
                chooseWinnerButton.setText("ESCOLHA VENCEDOR");
                newNumberButton.setText("NOVA BOLA");
                languageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/brazilflag.png")));
                break;
            }
            
            default:{
                lang = -1;
                gameTitle.setText("JOUONS AU BINGO!");
                resetButton.setText("REINITIALISER");
                chooseWinnerButton.setText("CHOISISSEZ GAGNANT");
                newNumberButton.setText("NOUVELLE BALLE");
                languageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingogame/frenchflag.png")));
                break;
            }
        }
        
    }//GEN-LAST:event_languageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel bingoBall;
    private javax.swing.JLabel bingoBallJLabel;
    private javax.swing.JTable bingoList;
    private javax.swing.JLabel chooseWinnerButton;
    private javax.swing.JLabel gameTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton languageButton;
    private javax.swing.JButton newNumberButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables

    class bingoSet {
        
        char letter = 'A';
        int number = 0;
        

        public bingoSet(char letter, int number) {
            
            this.letter = letter;
            this.number = number;
            
        }
        
        
        public static char toLetter(int letterNum){
           char BINGO = 'A';
           switch (letterNum){
            case 1 -> BINGO = 'B';
            case 2 -> BINGO = 'I';
            case 3 -> BINGO = 'N';
            case 4 -> BINGO = 'G';
            case 5 -> BINGO = 'O';
       } return BINGO;
      }
        public String bingoBall(){
            return (letter + String.valueOf(number));
        }
        
      
    }

}
