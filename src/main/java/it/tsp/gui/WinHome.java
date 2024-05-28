package it.tsp.gui;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import it.tsp.boundary.Bookshop;
import it.tsp.entity.Book;
import java.awt.event.ActionEvent;


public class WinHome extends javax.swing.JFrame {
        private javax.swing.JButton jbtAdd;
        private javax.swing.JButton jbtDelete;
        private javax.swing.JButton jbtExit;
        private javax.swing.JButton jbtReset;
        private javax.swing.JButton jbtUpdate;
        private javax.swing.JPanel jpnlAction;
        private javax.swing.JPanel jpnlMain;
        private javax.swing.JPanel jpnlShowText;
        private javax.swing.JPanel jpnlTitle;
        private javax.swing.JScrollPane jscrBookList;
        private javax.swing.JTable jtbBookList;
        private javax.swing.JTextField jtxBookName;
        private javax.swing.JTextField jtxEdition;
        private javax.swing.JTextField jtxPrice;
        private javax.swing.JLabel lbBookName;
        private javax.swing.JLabel lbEdition;
        private javax.swing.JLabel lbPrice;
        private javax.swing.JLabel lbTitle;
        private JFrame frame;

        ArrayList<Book> listBooks = new ArrayList<Book>();

        public WinHome() {
                initComponents();
                addEventListeners();
                // refreshListBook();
        }

        private void addEventListeners() {
                jbtAdd.addActionListener(this::addBookAE);
                jbtDelete.addActionListener(this::deleteBookTableAE);
                jbtReset.addActionListener(this::resetFieldsAE);
                jbtUpdate.addActionListener(this::updateBookTableAE);
                jbtExit.addActionListener(this::ExitAE);
                
              

        }

        private void addBookAE(ActionEvent evt) {

                String bookName = jtxBookName.getText();
                int edition = Integer.parseInt(jtxEdition.getText());
                int price = Integer.parseInt(jtxPrice.getText());
                Bookshop.addBook(bookName, edition, price);
                
        }

        private void deleteBookTableAE(ActionEvent evt) {
                String bookName = jtxBookName.getText();
                int edition = Integer.parseInt(jtxEdition.getText());
                int price = Integer.parseInt(jtxPrice.getText());
                
                Bookshop.deleteBookTable(bookName,edition,price);

        }

        private void resetFieldsAE(ActionEvent evt) {

                try { 
                        jtxBookName.setText(null);
                        jtxEdition.setText(null);
                        jtxPrice.setText(null);
        
                        
                } catch (Exception e) {
                        System.out.println("reset not done");}
                        
                }

        private void updateBookTableAE(ActionEvent evt) {

        
                String bookName = jtxBookName.getText();
                int edition = Integer.parseInt(jtxEdition.getText());
                int price = Integer.parseInt(jtxPrice.getText());
                Bookshop.updateBookTable(bookName,edition,price);

        }

        private void ExitAE(ActionEvent evt) {
                frame = new JFrame("Exit");

                if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Data Entry For",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

                        System.exit(0);

                }

        }

        private void initComponents() {

                jpnlMain = new javax.swing.JPanel();
                jpnlTitle = new javax.swing.JPanel();
                lbTitle = new javax.swing.JLabel();
                jpnlShowText = new javax.swing.JPanel();
                lbBookName = new javax.swing.JLabel();
                jtxEdition = new javax.swing.JTextField();
                lbEdition = new javax.swing.JLabel();
                lbPrice = new javax.swing.JLabel();
                jtxBookName = new javax.swing.JTextField();
                jtxPrice = new javax.swing.JTextField();
                jpnlAction = new javax.swing.JPanel();
                jbtExit = new javax.swing.JButton();
                jbtUpdate = new javax.swing.JButton();
                jbtDelete = new javax.swing.JButton();
                jscrBookList = new javax.swing.JScrollPane();
                jtbBookList = new javax.swing.JTable();
                jbtAdd = new javax.swing.JButton();
                jbtReset = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jpnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0), 4));

                jpnlTitle.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

                lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
                lbTitle.setText("Book's School");

                javax.swing.GroupLayout jpnlTitleLayout = new javax.swing.GroupLayout(jpnlTitle);
                jpnlTitle.setLayout(jpnlTitleLayout);
                jpnlTitleLayout.setHorizontalGroup(
                                jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlTitleLayout.createSequentialGroup()
                                                                .addGap(379, 379, 379)
                                                                .addComponent(lbTitle,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                476,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jpnlTitleLayout.setVerticalGroup(
                                jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlTitleLayout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(lbTitle)
                                                                .addContainerGap(61, Short.MAX_VALUE)));

                jpnlShowText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0), 4));

                lbBookName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbBookName.setText("BOOK NAME");

                jtxEdition.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

                lbEdition.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbEdition.setText("EDITION");

                lbPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbPrice.setText("PRICE");

                jtxBookName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

                jtxPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

                javax.swing.GroupLayout jpnlShowTextLayout = new javax.swing.GroupLayout(jpnlShowText);
                jpnlShowText.setLayout(jpnlShowTextLayout);
                jpnlShowTextLayout.setHorizontalGroup(
                                jpnlShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlShowTextLayout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jpnlShowTextLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbBookName)
                                                                                .addComponent(lbEdition,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                146,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbPrice,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                110,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jpnlShowTextLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jpnlShowTextLayout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                10,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jtxPrice,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                368,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(160, 160, 160))
                                                                                .addGroup(jpnlShowTextLayout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jpnlShowTextLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jtxEdition,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                370,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jtxBookName,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                370,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                jpnlShowTextLayout.setVerticalGroup(
                                jpnlShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlShowTextLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jpnlShowTextLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lbBookName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                67,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jtxBookName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jpnlShowTextLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lbEdition,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                67,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jtxEdition,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(jpnlShowTextLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lbPrice,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                67,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jtxPrice,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                32,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(66, Short.MAX_VALUE)));

                jpnlAction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0), 4));

                jbtExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jbtExit.setText("EXIT");

                jbtUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jbtUpdate.setText("UPDATE ");

                jbtDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jbtDelete.setText("DELETE");

                javax.swing.GroupLayout jpnlActionLayout = new javax.swing.GroupLayout(jpnlAction);
                jpnlAction.setLayout(jpnlActionLayout);
                jpnlActionLayout.setHorizontalGroup(
                                jpnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlActionLayout.createSequentialGroup()
                                                                .addGroup(jpnlActionLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jpnlActionLayout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jpnlActionLayout.createSequentialGroup()
                                                                                                                                                .addGap(19, 19, 19)
                                                                                                                                                .addComponent(jbtUpdate,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                198,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jbtExit,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jbtDelete,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                198,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(6, 6, 6)));
                jpnlActionLayout.setVerticalGroup(
                                jpnlActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlActionLayout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jbtUpdate,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                68,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jbtDelete,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                68,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jbtExit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                68,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(74, Short.MAX_VALUE)));

                jtbBookList.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null }
                                },
                                new String[] {
                                                "bookName", "edition", "price"
                                }) {
                        Class[] types = new Class[] {
                                        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types[columnIndex];
                        }
                });
                jscrBookList.setViewportView(jtbBookList);

                jbtAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jbtAdd.setText("ADD NEW ");

                jbtReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jbtReset.setText("RESET");

                javax.swing.GroupLayout jpnlMainLayout = new javax.swing.GroupLayout(jpnlMain);
                jpnlMain.setLayout(jpnlMainLayout);
                jpnlMainLayout.setHorizontalGroup(
                                jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpnlMainLayout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addGroup(jpnlMainLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jscrBookList)
                                                                                .addGroup(jpnlMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jpnlShowText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jpnlMainLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jbtAdd,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                198,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jbtReset,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                198,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(34, 34, 34)
                                                                                                .addComponent(jpnlAction,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(37, 37, 37))
                                                .addGroup(jpnlMainLayout.createSequentialGroup()
                                                                .addComponent(jpnlTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jpnlMainLayout.setVerticalGroup(
                                jpnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMainLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jpnlTitle,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jpnlMainLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jpnlMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(75, 75, 75)
                                                                                                .addComponent(jbtAdd,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                68,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(85, 85, 85)
                                                                                                .addComponent(jbtReset,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                68,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jpnlMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jpnlShowText,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jpnlMainLayout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jpnlAction,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                30, Short.MAX_VALUE)
                                                                .addComponent(jscrBookList,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                206,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jpnlMain,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jpnlMain, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();
                setLocationRelativeTo(null);
        }
}


