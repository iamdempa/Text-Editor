package texteditor;

//import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Last Kings
 */
public class Editor extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        keyWords();
        setLocationRelativeTo(null);
        jTextPane1.requestFocusInWindow();
//        buttonPressed();
        clicks();
        jButton6.setEnabled(false);
//        pateButtonDisableorEnable();// to check if the Clipboard has something catched so paste button will show up or disabled
//        pateButtonDisableorEnableThread();
        pasteShit();
        copyButtonDisableorEnable();
        cutButtonDisableorEnable();
        setFileFormatsInJFileChooser();
//        isAnyKeyWasPressed(); //to check if any keys are pressed/types in textarea so to pop-up the "Don't you wanna save?" window
//        checkIfSavedBeforeClosing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor - Jaanu Lab");

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\New.png")); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 35, 35));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Open.png")); // NOI18N
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 35, 35));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Save.png")); // NOI18N
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, 35, 35));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Save-As.png")); // NOI18N
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 5, 35, 35));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Cut.png")); // NOI18N
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 5, 35, 35));

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Copy.png")); // NOI18N
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 5, 35, 35));

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Paste.png")); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 5, 35, 35));

        jButton8.setBackground(new java.awt.Color(0, 102, 204));
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Undo.png")); // NOI18N
        jButton8.setOpaque(false);
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, 35, 35));

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Core i3\\Desktop\\Text Editor\\Redo.png")); // NOI18N
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 5, 35, 35));

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 21));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.setAlignmentX(0.0F);
        jMenuItem1.setAlignmentY(0.0F);
        jMenuItem1.setName(""); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save As...");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Undo");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Redo");
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Cut");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Copy");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Paste");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem12.setText("Delete");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Select All");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Find");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Replace");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFrame newEditor = new Editor();
        newEditor.setVisible(true);
        newEditor.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//        String filename = JOptionPane.showInputDialog("Name this file");
        JFileChooser savefile = new JFileChooser();

//        savefile.setSelectedFile(new File(filename));
        savefile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt/*.text)", "txt", "text");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Java File(*.java)", "JAVA");

        savefile.setFileFilter(filter);
        savefile.setFileFilter(filter2);

        BufferedWriter writer;
        int sf = savefile.showSaveDialog(null);

        if (sf == JFileChooser.APPROVE_OPTION) {
            try {
                File f = savefile.getSelectedFile();
                String java = f.getName();

//                StringBuilder sb=new StringBuilder(java);
//                System.out.println(java.substring(0, java.indexOf(".")));
                String[] parts = java.split("\\.");
                String part1 = parts[0];
                String part2 = parts[1];
                System.out.println(part1);

                String textContent = jTextPane1.getText();

                System.out.println("fill1");
                writer = new BufferedWriter(new FileWriter(savefile.getSelectedFile() + ".txt"));
                writer.write(textContent);

                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (sf == JFileChooser.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt/*.text)", "txt", "text");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Java File(*.java)", "JAVA");
        fileChooser.setFileFilter(filter);
        fileChooser.setFileFilter(filter2);

        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String all = "";
                String line;
                System.out.println(fileName);
                while ((line = reader.readLine()) != null) {
                    all += line + "\n";

                }
                System.out.println(all);
                jTextPane1.setText(all);
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.fillInStackTrace());
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            fileChooser.show(false);
        } else {
            System.out.println("Oops");
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame newEditor = new Editor();
        newEditor.setVisible(true);
        newEditor.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt/*.text)", "txt", "text");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Java File(*.java)", "JAVA");
        fileChooser.setFileFilter(filter);
        fileChooser.setFileFilter(filter2);

        int returnVal = fileChooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                String fileName = fileChooser.getSelectedFile().getAbsolutePath();
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String all = "";
                String line;
                System.out.println(fileName);
                while ((line = reader.readLine()) != null) {
                    all += line + "\n";

                }
                System.out.println(all);
                jTextPane1.setText(all);
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.fillInStackTrace());
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            fileChooser.show(false);
        } else {
            System.out.println("Oops");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    int clicked = 0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        clicked++;

        final JFileChooser savefile = new JFileChooser();

        final FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt/*.text)", "txt", "text");
        final FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Java File(*.java)", "JAVA");
//        FileNameExtensionFilter filter3=new FileNameExtensionFilter(("C programming"), ".c");

        savefile.addChoosableFileFilter(filter);
        savefile.addChoosableFileFilter(filter2);
//        savefile.setSelectedFile(new File(""));
        savefile.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                new Thread() {
                    public void run() {
                        while (true) {
                            try {
                                Thread.sleep(100);

                                savefile.addPropertyChangeListener(new PropertyChangeListener() {
                                    public void propertyChange(PropertyChangeEvent evt) {
                                        if (JFileChooser.FILE_SELECTION_MODE_CHANGED_PROPERTY
                                                .equals(evt.getPropertyName())) {
                                            JFileChooser chooser = (JFileChooser) evt.getSource();
                                            File oldFile = (File) evt.getOldValue();
                                            File newFile = (File) evt.getNewValue();
                                            System.out.println("ok");

                                            // The selected file should always be the same as newFile
                                            File curFile = chooser.getSelectedFile();
                                        } else if (JFileChooser.ACCEPT_ALL_FILE_FILTER_USED_CHANGED_PROPERTY.equals(
                                                evt.getPropertyName())) {
                                            JFileChooser chooser = (JFileChooser) evt.getSource();
                                            File[] oldFiles = (File[]) evt.getOldValue();
                                            File[] newFiles = (File[]) evt.getNewValue();
                                            System.out.println(chooser);

                                            // Get list of selected files
                                            // The selected files should always be the same as newFiles
                                            File[] files = chooser.getSelectedFiles();
                                        }
                                    }
                                });
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }.start();
            }
        });

//        savefile.addChoosableFileFilter(filter3);
        FileWriter writer;

        if (clicked == 1) { //this will always check if user have saved the document at very first place. 
            //if he has saved, the file chooser won't pop again

            int sf = savefile.showSaveDialog(null);

            if (sf == JFileChooser.APPROVE_OPTION) {

                try {
                    if (savefile.getSelectedFile().toString().endsWith(".java")) {

//                      String path = savefile.getSelectedFile() + ".java";
                        String path = savefile.getSelectedFile().toString();

                        System.out.println(path);

                        File oldName = new File(path);
                        File newName = new File(path);
                        oldName.renameTo(newName);

                        Path path2 = Paths.get(path);

                        String saveName = (path2.getFileName().toString());
                        System.out.println(saveName);
//                        System.out.println(saveName);

                        if (saveName.endsWith(".java")) {
                            System.out.println("It has");
                        } else {
                            System.out.println("Nop");
                        }

//                        System.out.println(afterSplit[0]);
                        File file = new File(path);
                        writer = new FileWriter(file, false);

                        writer.write(jTextPane1.getText());

                        writer.close();
                    } else if (savefile.getSelectedFile().toString().endsWith("")) {

                        System.out.println("2");
                        String path = savefile.getSelectedFile() + ".txt";
                        File file = new File(path);
                        writer = new FileWriter(file, false);

                        writer.write(jTextPane1.getText());

                        writer.close();
                    } else if (savefile.getSelectedFile().toString().endsWith(".c")) {
                        System.out.println("3");
                        String path = savefile.getSelectedFile() + ".c";
                        File file = new File(path);
                        writer = new FileWriter(file, false);

                        writer.write(jTextPane1.getText());

                        writer.close();
                    } else if (savefile.getFileFilter().equals(filter2)) {

                    } else if (savefile.getFileFilter().equals(filter)) {

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (sf == JFileChooser.CANCEL_OPTION) {

                clicked = 0;

            }

        } else {

            try {

                if (savefile.getFileFilter().equals(filter2)) {

                    String path = savefile.getSelectedFile() + ".java";
                    File file = new File(path);
                    writer = new FileWriter(file, false);
                    System.out.println(savefile.getFileFilter());
                    writer.write(jTextPane1.getText());

                    writer.close();
                } else if (savefile.getFileFilter().equals(filter)) {

                    String path = savefile.getSelectedFile() + ".txt";
                    File file = new File(path);
                    writer = new FileWriter(file, false);

                    writer.write(jTextPane1.getText());

                    writer.close();

                } else {
                    System.out.println("No format");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        JFileChooser savefile = new JFileChooser();
        savefile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Documents(*.txt/*.text)", "txt", "text");
        savefile.setFileFilter(filter);
        BufferedWriter writer;

        int sf = savefile.showSaveDialog(null);

        if (sf == JFileChooser.APPROVE_OPTION) {
            try {
                String textContent = jTextPane1.getText();
                String fileName = savefile.getSelectedFile().getAbsolutePath();
                StringSelection stringSelection = new StringSelection(fileName);
                Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
                clpbrd.setContents(stringSelection, null);
                writer = new BufferedWriter(new FileWriter(savefile.getSelectedFile() + ".txt"));
                writer.write(textContent);

                writer.close();
                JOptionPane.showMessageDialog(null, "File has been saved", "File Saved", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (sf == JFileChooser.CANCEL_OPTION) {

        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String selected = jTextPane1.getSelectedText();
        jTextPane1.replaceSelection("");
        jTextPane1.requestFocusInWindow();
        StringSelection stringSelection = new StringSelection(selected);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        StringSelection stringSelection = new StringSelection(jTextPane1.getSelectedText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        jTextPane1.requestFocusInWindow();


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        StringSelection stringSelection = new StringSelection(jTextPane1.getSelectedText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        clipboard.setContents(stringSelection, stringSelection);

        Transferable contents = clipboard.getContents(null);

        if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            String data;
            try {
                data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                jTextPane1.setText(jTextPane1.getText().concat(data));
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (contents.isDataFlavorSupported(DataFlavor.imageFlavor)) {
            System.out.println("It is an Image");
            jButton7.setEnabled(false);
        } else if (contents.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            System.out.println("It is a File");
            jButton7.setEnabled(false);
        } else {
            System.out.println("Nothing");
            jButton7.setEnabled(false);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        findWord();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased


    }//GEN-LAST:event_jTextPane1KeyReleased


    private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
        String keywordsList[] = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

        if (jTextPane1.getText().trim().length() != 0) {
            String spliitedWord[] = StringUtils.split(jTextPane1.getText());
            for (int i = 0; i < spliitedWord.length; i++) {
                for (int j = 0; j < keywordsList.length; j++) {
                    if (keywordsList[j].equals(spliitedWord[i])) {

                        SimpleAttributeSet set = new SimpleAttributeSet();
                        jTextPane1.setCharacterAttributes(set, true);
                        StyleConstants.setForeground(set, Color.red);
                        StyleConstants.setBold(set, true);

                    } else {
//                        System.out.println("not yet");
                    }
                }
            }
        } else {
//            System.out.println("no no no");
        }


    }//GEN-LAST:event_jTextPane1KeyTyped

    public static void main(String args[]) {

//        try {
//            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
////            WebLookAndFeel.install();
////            UIManager.setLookAndFeel (new WebLookAndFeel ());
////            UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            // select Look and Feel
////            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
////            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//            // start application
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void buttonPressed() {
        jButton9.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed");
            }
        });
    }

    private void clicks() {
    }

//    private void pateButtonDisableorEnable() {
//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        Transferable contents = clipboard.getContents(null);
//        if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
//            new Thread() {
//                public void run() {
//                    while (true) {
//                        try {
//                            Thread.sleep(100);
//
////                        StringSelection stringSelection = new StringSelection(jTextPane1.getSelectedText());
//                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
////                        clipboard.setContents(stringSelection, stringSelection);
//
//                            Transferable contents = clipboard.getContents(null);
//
//                            if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
//                                String data;
//                                try {
//                                    data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
//                                    if (data.trim().length() == 0) {
//                                        jButton7.setEnabled(false);
//                                    } else {
//                                        jButton7.setEnabled(true);
//                                    }
////                                System.out.println(data);
//
//                                } catch (UnsupportedFlavorException ex) {
//                                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
//                                } catch (IOException ex) {
//                                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
//                                }
//
//                            } else if (contents.isDataFlavorSupported(DataFlavor.imageFlavor)) {
////                                System.out.println("It is an Image");
//                                jButton7.setEnabled(false);
//                            } else if (contents.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
////                                System.out.println("It is a File");
//                                jButton7.setEnabled(false);
//                            } else {
////                                System.out.println("Nothing");
//                                jButton7.setEnabled(false);
//                            }
//                        } catch (InterruptedException ex) {
//                            ex.printStackTrace();
//                        }
//                    }
//                }
//            }.start();
//        } else {
////            System.out.println("Different thing");
//        }
//
//    }
    private void copyButtonDisableorEnable() {
        
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(100);

                    copyButtonDisableorEnableAlgo();
                    jTextPane1.setSelectedTextColor(Color.red);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    public void copyButtonDisableorEnableAlgo() {
        jTextPane1.addCaretListener(new CaretListener() {
            String selectedText;

            public void caretUpdate(CaretEvent ce) {
                int dot = ce.getDot();
                int mark = ce.getMark();

                if (dot != mark) {
                    selectedText = jTextPane1.getSelectedText();
                    jButton6.setEnabled(true);

                } else {
                    selectedText = null;
                    jButton6.setEnabled(false);
                }

            }
        });
    }

    private void findWord() {
        Object[] options1 = {"search", "cancel"};

        JPanel panel = new JPanel();

        panel.add(new JLabel("Enter a word to Search"));
        JTextField textField = new JTextField(15);
        panel.add(textField);

        int result = JOptionPane.showOptionDialog(null, panel, "Search Word!",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);

        if (result == JOptionPane.YES_OPTION) {
            System.out.println("Okay");

        }

//            String string = "I will come and meet you at the 123woods";
//            String keyword = "123woods";
//            Boolean found = Arrays.asList(jTextPane1.getText().split(" ")).contains(textField.getText());
//            if (found) {
//                
//            }
    }

    private void isAnyKeyWasPressed() {
        int previousHashcode = jTextPane1.getText().hashCode();
        if (previousHashcode != jTextPane1.getText().hashCode()) {
            System.out.println("Different");

//            JFrame close = new Editor();
//            close.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//            close.addWindowListener(new WindowAdapter() {
//                public void windowClosing(WindowEvent e) {
//
//                    Object[] options = {"Yes, please",
//                        "No way!"};
//                    int n = JOptionPane.showOptionDialog(new Editor(),
//                            "Would you like green eggs and ham?",
//                            "A Silly Question",
//                            JOptionPane.YES_NO_CANCEL_OPTION,
//                            JOptionPane.INFORMATION_MESSAGE,
//                            null, //do not use a custom Icon
//                            options, //the titles of buttons
//                            options[0]); //default button title
//                }
//
//            });
        } else {
            System.out.println("Same");
        }

    }

//    private void pateButtonDisableorEnableThread() {
//        new Thread() {
//            public void run() {
//                while (true) {
//                    try {
//                        Thread.sleep(100);
//
//                        Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() {
//                            @Override
//                            public void flavorsChanged(FlavorEvent e) {
//                                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//                                Transferable contents = clipboard.getContents(null);
//                                System.out.println("changed!!! " + e.getSource() + " " + e.toString());
//                                if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
//                                        System.out.println("It is a String");
//                                        pateButtonDisableorEnable();
//                                }else if(contents.isDataFlavorSupported(DataFlavor.imageFlavor)){
//                                    System.out.println("It is an image");
//                                }else if(contents.isDataFlavorSupported(DataFlavor.javaFileListFlavor)){
//                                    System.out.println("It is a file");
//                                }else{
//                                    System.out.println("Different thing");
//                                }
//
//                            }
//                        });
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }.start();
//
//    }
    private void pasteShit() {
        Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() {
            @Override
            public void flavorsChanged(FlavorEvent e) {
                Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    System.out.println("String");
                    jButton7.setEnabled(true);
                } else if (contents.isDataFlavorSupported(DataFlavor.imageFlavor)) {
                    System.out.println("an Image");
                    jButton7.setEnabled(false);
                } else if (contents.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                    System.out.println("File");
                    jButton7.setEnabled(false);
                } else {
                    System.out.println("Different");
                    jButton7.setEnabled(false);
                }
//                System.out.println("ClipBoard UPDATED: " + e.getSource() + " " + e.toString());
            }
        });
    }

    private void cutButtonDisableorEnable() {
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                        if (jTextPane1.getSelectedText() == null) {
                            jButton5.setEnabled(false);
                        } else {
                            jButton5.setEnabled(true);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }

    private void setFileFormatsInJFileChooser() {

    }

    public void keyWords() {
        final String keywordsList[] = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized",
            "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws",
            "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

        jTextPane1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == e.VK_SPACE) {

                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == e.VK_SPACE && jTextPane1.getText().trim().length() != 0) {
                    for (int i = 0; i < keywordsList.length; i++) {
                        if (jTextPane1.getText().contains(keywordsList[i])) {
                            System.out.println("Ok");
                        } else {
                            System.out.println("no");
                        }

                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == e.VK_SPACE) {

                }
            }
        });

    }
}
