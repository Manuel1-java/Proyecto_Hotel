package Vista;

import Controlador.Habitacion;
import Controlador.TipoHabitacion;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 1151641 - 1151646
 */
public class Checkin extends javax.swing.JDialog implements ActionListener {

    Frame frame;
    Object datosC[];
    Habitacion lista[];
    
    public Checkin(java.awt.Frame parent, boolean modal, Object datos[], Habitacion lista[]) {
        super(parent, modal);
        frame = parent;
        this.datosC = datos;
        initComponents();
        T1.addActionListener(this);
        T2.addActionListener(this);
        T3.addActionListener(this);
        T4.addActionListener(this);        
        this.lista = lista;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        T2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        T3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        T4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_back_chekin = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Habitaciones");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));

        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habEjecutiva.jpg"))); // NOI18N
        T1.setName("EJECUTIVA"); // NOI18N
        T1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habEjecutiva2.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("1 Huésped");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setText("HABITACIÓN");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel7.setText("Tipo Ejecutiva");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel8.setText("MXN$684 ");

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel9.setText("Capacidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 500));

        T2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habDoble.jpg"))); // NOI18N
        T2.setName("DOBLE"); // NOI18N
        T2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habDoble2.jpg"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel11.setText("Tipo Doble");

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel12.setText("MXN$1,113");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel13.setText("Capacidad");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel2.setText("2 Huéspedes");

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel22.setText("HABITACIÓN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel13))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel22)
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 500));

        T3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habSuite.jpg"))); // NOI18N
        T3.setName("SUITE"); // NOI18N
        T3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habSuite2.jpg"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel15.setText("Tipo Suite");

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel16.setText("MXN$1,850");

        jLabel17.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel17.setText("Capacidad");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setText("5 Huéspedes");

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel23.setText("HABITACIÓN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel23))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel15))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel16))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel17))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel23)
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 500));

        T4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habPresidencial.jpg"))); // NOI18N
        T4.setName("PRESIDENCIAL"); // NOI18N
        T4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habPresidencial2.jpg"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel19.setText(" Tipo Presidencial");

        jLabel20.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel20.setText("MXN$2,720");

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel21.setText("Capacidad");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setText("10 Huéspedes");

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel24.setText("HABITACIÓN");

        btn_back_chekin.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_chekin.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btn_back_chekin.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_chekin.setText("Back");
        btn_back_chekin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_chekinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24))
                    .addComponent(jLabel19)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_back_chekin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addGap(11, 11, 11)
                .addComponent(jLabel19)
                .addGap(21, 21, 21)
                .addComponent(jLabel20)
                .addGap(31, 31, 31)
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_back_chekin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/resort.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("OASIS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_chekinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_chekinActionPerformed
        dispose();
    }//GEN-LAST:event_btn_back_chekinActionPerformed

    public boolean isFull(String tipoS){
        TipoHabitacion tipoH = TipoHabitacion.valueOf(tipoS);
        boolean activo = true; 
        
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].getCategoria().equals(tipoH) && lista[i].isDisponible()){
                activo = false;
                i = lista.length;
            }
        }        
        return activo;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento){
        
        JButton button = (JButton) evento.getSource();
        
        if(isFull(button.getName())){
                JOptionPane.showMessageDialog(null, "NO HAY HABITACION " +button.getName()+ " DISPONIBLE");            
        }
        else{
            Object datosR[] = new Object[5];
            Registro1 ventana = new Registro1(frame, true, datosR, button.getName(), lista);        
            ventana.setVisible(true);
            if(datosR[0]!=null){
                datosC[0] = datosR[0];
                datosC[1] = datosR[1];
                datosC[2] = datosR[2];
                datosC[3] = button.getName();
                datosC[4] = datosR[3];
                dispose();
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton T1;
    private javax.swing.JButton T2;
    private javax.swing.JButton T3;
    private javax.swing.JButton T4;
    private javax.swing.JButton btn_back_chekin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
