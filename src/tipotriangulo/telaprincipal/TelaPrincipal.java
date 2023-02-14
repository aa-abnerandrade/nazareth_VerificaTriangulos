
package tipotriangulo.telaprincipal;


public class TelaPrincipal extends javax.swing.JFrame {

	
	public TelaPrincipal() {
		initComponents();
		pnlResultado.setVisible(false);
	}

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHome = new javax.swing.JPanel();
        sldSegmentoA = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLegendaSegA = new javax.swing.JLabel();
        lblLegendaSegB = new javax.swing.JLabel();
        lblLegendaSegC = new javax.swing.JLabel();
        pnlResultado = new javax.swing.JPanel();
        lblResultadoTriangulo = new javax.swing.JLabel();
        lblResultadoTipo = new javax.swing.JLabel();
        lblImagemTriangulo = new javax.swing.JLabel();
        bttVerificar = new javax.swing.JButton();
        pnlImagemIlustrativa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sldSegmentoC = new javax.swing.JSlider();
        sldSegmentoB = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("classificador");
        setBounds(new java.awt.Rectangle(0, 0, 420, 420));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(425, 450));
        setMinimumSize(new java.awt.Dimension(420, 450));
        setName("CLASSIFICADOR"); // NOI18N
        setSize(new java.awt.Dimension(420, 420));

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setAlignmentX(0.0F);
        pnlHome.setAlignmentY(0.0F);
        pnlHome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pnlHome.setInheritsPopupMenu(true);
        pnlHome.setMaximumSize(new java.awt.Dimension(400, 400));
        pnlHome.setMinimumSize(new java.awt.Dimension(400, 400));
        pnlHome.setPreferredSize(new java.awt.Dimension(400, 400));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sldSegmentoA.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        sldSegmentoA.setForeground(new java.awt.Color(0, 102, 102));
        sldSegmentoA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegmentoAStateChanged(evt);
            }
        });
        pnlHome.add(sldSegmentoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 64, 280, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Segmento A");
        pnlHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 70, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Segmento C");
        pnlHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, -1, 20));

        lblLegendaSegA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLegendaSegA.setForeground(new java.awt.Color(0, 153, 153));
        lblLegendaSegA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegendaSegA.setText("50");
        pnlHome.add(lblLegendaSegA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 64, 30, 20));

        lblLegendaSegB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLegendaSegB.setForeground(new java.awt.Color(0, 153, 153));
        lblLegendaSegB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegendaSegB.setText("50");
        pnlHome.add(lblLegendaSegB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 99, 30, 20));

        lblLegendaSegC.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLegendaSegC.setForeground(new java.awt.Color(0, 153, 153));
        lblLegendaSegC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegendaSegC.setText("50");
        pnlHome.add(lblLegendaSegC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 134, 30, 20));

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));
        pnlResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultadoTriangulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblResultadoTriangulo.setForeground(new java.awt.Color(0, 153, 204));
        lblResultadoTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultadoTriangulo.setText("SIM!");
        pnlResultado.add(lblResultadoTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 80, 32));

        lblResultadoTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblResultadoTipo.setForeground(new java.awt.Color(0, 102, 102));
        lblResultadoTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultadoTipo.setText("um triângulo escaleno");
        pnlResultado.add(lblResultadoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 220, 20));

        lblImagemTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangulo_equilatero.png"))); // NOI18N
        pnlResultado.add(lblImagemTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 190));

        pnlHome.add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 410, 220));

        bttVerificar.setBackground(new java.awt.Color(0, 102, 102));
        bttVerificar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bttVerificar.setForeground(new java.awt.Color(255, 255, 255));
        bttVerificar.setText("VERIFICAR");
        bttVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVerificarActionPerformed(evt);
            }
        });
        pnlHome.add(bttVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        pnlImagemIlustrativa.setBackground(new java.awt.Color(255, 255, 255));
        pnlImagemIlustrativa.setMaximumSize(new java.awt.Dimension(380, 120));
        pnlImagemIlustrativa.setMinimumSize(new java.awt.Dimension(380, 120));
        pnlImagemIlustrativa.setPreferredSize(new java.awt.Dimension(380, 120));
        pnlImagemIlustrativa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome_home.png"))); // NOI18N
        pnlImagemIlustrativa.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        pnlHome.add(pnlImagemIlustrativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 400, 170));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Classificação de Triângulos");
        pnlHome.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("É possível formar um triângulo com essas medidas?");
        pnlHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 362, 20));

        sldSegmentoC.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        sldSegmentoC.setForeground(new java.awt.Color(0, 102, 102));
        sldSegmentoC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegmentoCStateChanged(evt);
            }
        });
        pnlHome.add(sldSegmentoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 134, 280, -1));

        sldSegmentoB.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        sldSegmentoB.setForeground(new java.awt.Color(0, 102, 102));
        sldSegmentoB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldSegmentoBStateChanged(evt);
            }
        });
        pnlHome.add(sldSegmentoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 99, 280, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Segmento B");
        pnlHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 99, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldSegmentoAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSegmentoAStateChanged
	int segmentoA = (int) sldSegmentoA.getValue();
	lblLegendaSegA.setText(Integer.toString(segmentoA));
    }//GEN-LAST:event_sldSegmentoAStateChanged

    private void sldSegmentoBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSegmentoBStateChanged
        int segmentoB = (int) sldSegmentoB.getValue();
        lblLegendaSegB.setText(Integer.toString(segmentoB));
    }//GEN-LAST:event_sldSegmentoBStateChanged

    private void sldSegmentoCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldSegmentoCStateChanged
        int segmentoC = (int) sldSegmentoC.getValue();
        lblLegendaSegC.setText(Integer.toString(segmentoC));
    }//GEN-LAST:event_sldSegmentoCStateChanged

    private void bttVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVerificarActionPerformed
	String txtResultadoTriangulo;
	String txtResultadoTipo = "Um triângulo ";
	
		
	int segA = (int) sldSegmentoA.getValue();
	int segB = (int) sldSegmentoB.getValue();
	int segC = (int) sldSegmentoC.getValue();
	
	int somaAB = segA + segB;
	int somaBC = segB + segC;
	int somaCA = segC + segA;
	
	if ((somaAB > segC) && (somaBC > segA) && (somaCA > segB)) {
		txtResultadoTriangulo = "SIM!";
		if ((segA == segB) && (segB == segC)) {
			txtResultadoTipo += "Equilátero.";
			lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangulo_equilatero.png")));
		} else if ((segA == segB) || (segB == segC) || (segC == segA)) {
			txtResultadoTipo += "Isósceles";
			lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangulo_isosceles.png")));
		} else if ((segA != segB) && (segB != segC) || (segC != segA)) {
			txtResultadoTipo += "Escaleno";
			lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangulo_escaleno.png")));
		}
	} else {
		txtResultadoTriangulo = "<html><p color=\"red\">NÃO</p></html>";
		txtResultadoTipo = "<html><p background-color=\"white\">Ops, algo de errado não está certo.</p></html>";
		lblImagemTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nazare-tedesco-nazare-confusa.gif")));
		
	}
	
	lblResultadoTriangulo.setText(txtResultadoTriangulo);
	lblResultadoTipo.setText(txtResultadoTipo);
	
	pnlImagemIlustrativa.setVisible(false);
	pnlResultado.setVisible(true);
	
    }//GEN-LAST:event_bttVerificarActionPerformed
	

	
	
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
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagemTriangulo;
    private javax.swing.JLabel lblLegendaSegA;
    private javax.swing.JLabel lblLegendaSegB;
    private javax.swing.JLabel lblLegendaSegC;
    private javax.swing.JLabel lblResultadoTipo;
    private javax.swing.JLabel lblResultadoTriangulo;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlImagemIlustrativa;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JSlider sldSegmentoA;
    private javax.swing.JSlider sldSegmentoB;
    private javax.swing.JSlider sldSegmentoC;
    // End of variables declaration//GEN-END:variables
}
