/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tugasakhir1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MenuKue extends javax.swing.JPanel {


    public MenuKue() {
        initComponents();
        cRoti.setSelectedItem(" ");
        tampil_tabel_roti();
        tampil_tabel_Kue();
        tampil_tabel_Paket();
        reset();
    }

    
   private void reset(){
       tNama.setText(null);
       tHarga.setText(null);
       tStok.setText(null);
       tID.setText(null);
       cRoti.setSelectedItem(" ");
   }
    
    private void autonumberroti(){
        try {
            Connection c = KoneksiRoti.ConfigDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM stok ORDER BY ID_Kue DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Kue").substring(3);
                String RT = "" +(Integer.parseInt(NoFaktur)+1);
                String Nol = "";
                
                if(RT.length()==1)
                {Nol = "000";}
                else if(RT.length()==2)
                {Nol = "00";}
                else if(RT.length()==3)
                {Nol = "0";}
                else if(RT.length()==4)
                {Nol = "";}
                tID.setText("RTI" + Nol + RT);
            } else {
                tID.setText("RTI0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void autonumberkue(){
        try {
            Connection c = KoneksiRoti.ConfigDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM stok ORDER BY ID_Kue DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Kue").substring(3);
                String RT = "" +(Integer.parseInt(NoFaktur)+1);
                String Nol = "";
                
                if(RT.length()==1)
                {Nol = "000";}
                else if(RT.length()==2)
                {Nol = "00";}
                else if(RT.length()==3)
                {Nol = "0";}
                else if(RT.length()==4)
                {Nol = "";}
                tID.setText("KUE" + Nol + RT);
            } else {
                tID.setText("KUE0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void autonumberpaket(){
        try {
            Connection c = KoneksiRoti.ConfigDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM stok ORDER BY ID_Kue DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Kue").substring(3);
                String RT = "" +(Integer.parseInt(NoFaktur)+1);
                String Nol = "";
                
                if(RT.length()==1)
                {Nol = "000";}
                else if(RT.length()==2)
                {Nol = "00";}
                else if(RT.length()==3)
                {Nol = "0";}
                else if(RT.length()==4)
                {Nol = "";}
                tID.setText("PKT" + Nol + RT);
            } else {
                tID.setText("PKT0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbRoti = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbKue = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbPaket = new javax.swing.JTable();
        tID = new javax.swing.JTextField();
        tHarga = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tStok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cRoti = new javax.swing.JComboBox<>();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1236, 599));

        jPanel1.setBackground(new java.awt.Color(238, 202, 207));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setText(" cari ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(246, 172, 182));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Daftar Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(494, 494, 494))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Roti");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Kue");

        tbRoti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbRoti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRotiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbRoti);

        tbKue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbKue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKueMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbKue);

        tbPaket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPaketMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbPaket);

        tID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIDActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        jLabel7.setText("HARGA");

        jLabel8.setText("NAMA");

        jLabel9.setText("STOK");

        cRoti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROTI", "KUE", "PAKET" }));
        cRoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRotiActionPerformed(evt);
            }
        });

        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("UBAH");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Paket Hemat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tStok, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(cRoti, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(296, 296, 296)
                                        .addComponent(jLabel10))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bTambah)
                                .addGap(18, 18, 18)
                                .addComponent(bUbah)
                                .addGap(18, 18, 18)
                                .addComponent(bHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bReset)))
                        .addGap(0, 306, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(jLabel5)
                    .addContainerGap(1254, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRoti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(bHapus)
                    .addComponent(bReset))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(jLabel5)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIDActionPerformed

    private void cRotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRotiActionPerformed
        if(cRoti.getSelectedItem().equals("ROTI")){
            autonumberroti();
        } else if(cRoti.getSelectedItem().equals("KUE")){
            autonumberkue();
        } else if(cRoti.getSelectedItem().equals("PAKET")){
            autonumberpaket();
        }
    }//GEN-LAST:event_cRotiActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        String id = tID.getText();
        String nama = tNama.getText();
        String harga = tHarga.getText();
        String stok = tStok.getText();
        String kategori = cRoti.getSelectedItem().toString();
        
        try {
            Connection c = KoneksiRoti.ConfigDB();
            String sql = "INSERT INTO stok(ID_Kue, Nama_Kue, Harga, Kategori, stok) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, id);
            p.setString(2, nama);
            p.setString(3, harga);
            p.setString(4, kategori);
            p.setString(5, stok);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tampil_tabel_roti();
        tampil_tabel_Kue();
        tampil_tabel_Paket();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        String id = tID.getText();
        String nama = tNama.getText();
        String harga = tHarga.getText();
        String stok = tStok.getText();
        String kategori = cRoti.getSelectedItem().toString();
        
        try {
            Connection c = KoneksiRoti.ConfigDB();
            String sql = "UPDATE stok SET Nama_Kue =?, harga = ?, stok = ? WHERE id_kue=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(4, id);
            p.setString(1, nama);
            p.setString(2, harga);
            p.setString(3, stok);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tampil_tabel_roti();
        tampil_tabel_Kue();
        tampil_tabel_Paket();
        reset();
    }//GEN-LAST:event_bUbahActionPerformed

    private void tbRotiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRotiMouseClicked
        // TODO add your handling code here:
        int baris = tbRoti.rowAtPoint(evt.getPoint());
        String id = tbRoti.getValueAt(baris, 0).toString();
        String nama = tbRoti.getValueAt(baris, 1).toString();
        String harga = tbRoti.getValueAt(baris, 2).toString();
        String stok = tbRoti.getValueAt(baris, 3).toString();
        tID.setText(id);
        tNama.setText(nama);
        tHarga.setText(harga);
        tStok.setText(stok);
        cRoti.getSelectedItem().toString();
        tID.setEditable(false);
    }//GEN-LAST:event_tbRotiMouseClicked

    private void tbKueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKueMouseClicked
        int baris = tbKue.rowAtPoint(evt.getPoint());
        String id = tbKue.getValueAt(baris, 0).toString();
        String nama = tbKue.getValueAt(baris, 1).toString();
        String harga = tbKue.getValueAt(baris, 2).toString();
        String stok = tbKue.getValueAt(baris, 3).toString();
        tID.setText(id);
        tNama.setText(nama);
        tHarga.setText(harga);
        tStok.setText(stok);
        cRoti.getSelectedItem().toString();
        tID.setEditable(false);
    }//GEN-LAST:event_tbKueMouseClicked

    private void tbPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPaketMouseClicked
        int baris = tbPaket.rowAtPoint(evt.getPoint());
        String id = tbPaket.getValueAt(baris, 0).toString();
        String nama = tbPaket.getValueAt(baris, 1).toString();
        String harga = tbPaket.getValueAt(baris, 2).toString();
        String stok = tbPaket.getValueAt(baris, 3).toString();
        tID.setText(id);
        tNama.setText(nama);
        tHarga.setText(harga);
        tStok.setText(stok);
        cRoti.getSelectedItem().toString();
        tID.setEditable(false);
    }//GEN-LAST:event_tbPaketMouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String id = tID.getText();
        
        try {
            String sql = "DELETE FROM stok WHERE id_kue = '"+id+"'";
            java.sql.Connection conn = KoneksiRoti.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_tabel_Kue();
        tampil_tabel_Paket();
        tampil_tabel_roti();
          reset();
    }//GEN-LAST:event_bHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cRoti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tHarga;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tStok;
    private javax.swing.JTable tbKue;
    private javax.swing.JTable tbPaket;
    private javax.swing.JTable tbRoti;
    // End of variables declaration//GEN-END:variables






void tampil_tabel_roti(){
        DefaultTableModel model= new  DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("STOK");
        
        try {
            String sql = "SELECT * FROM stok WHERE kategori = 'roti'";
            java.sql.Connection conn = KoneksiRoti.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            model.addRow(new Object[]{resultSet.getString("ID_Kue"),resultSet.getString("Nama_Kue"),resultSet.getString("Harga"),resultSet.getString("Stok")});
            }
            tbRoti.setModel(model);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

void tampil_tabel_Kue(){
        DefaultTableModel model= new  DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("STOK");
        
        try {
            String sql = "SELECT * FROM stok WHERE kategori = 'Kue' ORDER BY ID_Kue";
            java.sql.Connection conn = KoneksiRoti.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            model.addRow(new Object[]{resultSet.getString("ID_Kue"),resultSet.getString("Nama_Kue"),resultSet.getString("Harga"),resultSet.getString("Stok")});
            }
            tbKue.setModel(model);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

void tampil_tabel_Paket(){
        DefaultTableModel model= new  DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("STOK");
        
        try {
            String sql = "SELECT * FROM stok WHERE kategori = 'Paket' ORDER BY ID_Kue";
            java.sql.Connection conn = KoneksiRoti.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            model.addRow(new Object[]{resultSet.getString("ID_Kue"),resultSet.getString("Nama_Kue"),resultSet.getString("Harga"),resultSet.getString("Stok")});
            }
            tbPaket.setModel(model);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
