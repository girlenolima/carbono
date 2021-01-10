package visualizacao;

import controle.moscovio.Busines;
import java.awt.CardLayout;
import java.awt.Color;
import suporte.moscovio.CaminhoArquivoOrigem;
import java.awt.Cursor;

public class index extends javax.swing.JFrame {

    interfaces.interfaceBusines interfaceB = new Busines();
    private String PLANILHA;
    private String DESTINO;

    public index() {
        initComponents();
    }
    
     //true = arquivo , false = pasta
    public void selecionaArquivoOuPasta(Boolean arquivoOuPasta) {

        String tipoMenssagem = arquivoOuPasta ? "ARQUIVO" : "PASTA";
        String menssagem = "SELECAO : " + tipoMenssagem + " CANCELADA";

        try {

            if (arquivoOuPasta == true) {
                PLANILHA = CaminhoArquivoOrigem.selecionarPath(true);
            } else {
                DESTINO = CaminhoArquivoOrigem.selecionarPath(false);
            }

            atualizarVisualizadores();
            limparAviso();

        } catch (Exception e) {
            limparVisualizadores();
            quadroAviso(menssagem);

        }

    }

    private void atualizarVisualizadores() {
        

        visulizadorPath.setText(PLANILHA);
        visulizadorDestinoRecibos.setText(DESTINO);
    }

    private void limparVisualizadores() {
        PLANILHA = null;
        DESTINO = null;
        atualizarVisualizadores();
    }

    private void limparAviso() {
        quadroDeAvisos.setText("");
    }

    private void quadroAviso(String menssagem) {

        quadroDeAvisos.setForeground(Color.WHITE);
        quadroDeAvisos.setText(menssagem);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Root = new javax.swing.JPanel();
        card4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        card3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        visulizadorPath = new javax.swing.JLabel();
        visulizadorDestinoRecibos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        criarRecibos = new javax.swing.JButton();
        quadroDeAvisos = new javax.swing.JLabel();
        card1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Root.setLayout(new java.awt.CardLayout());

        jButton2.setText("RECIBOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");

        jButton6.setText("jButton1");

        jLabel5.setText("CARBONO");

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4Layout.createSequentialGroup()
                        .addGap(0, 711, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(card4Layout.createSequentialGroup()
                        .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        Root.add(card4, "card4");

        jLabel3.setText("CARD3");

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card3Layout.createSequentialGroup()
                .addContainerGap(777, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        card3Layout.setVerticalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(468, Short.MAX_VALUE))
        );

        Root.add(card3, "card3");

        visulizadorPath.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE PLANILHA"));
        visulizadorPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visulizadorPathMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visulizadorPathMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visulizadorPathMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                visulizadorPathMouseReleased(evt);
            }
        });

        visulizadorDestinoRecibos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASTA"));
        visulizadorDestinoRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visulizadorDestinoRecibosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visulizadorDestinoRecibosMouseEntered(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n    A PLANILHA BASE DEVE SER NO FORMATO .XLS E TER 9 \n    COLUNAS (SEM TITULOS) NA ORDEM:\n  \n\t1 - CODIGO.\n\t2 - VALOR.\n\t3 - NOME DA EMPRESA.\n\t4 - REFERENCIA DO PAGAMENTO.\n\t5 - DATA DO PAGAMENTO.\n\t6 - NOME DO RECEBEDOR.\n\t7 - CPF.\n\t8 - ENDERECO DO RECEBEDOR.\n\t9 - ENDERECO DA EMPRESA.\n\n");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        criarRecibos.setText("GERAR RECIBOS");
        criarRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarRecibosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card2Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quadroDeAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criarRecibos))
                .addGap(169, 169, 169))
            .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card2Layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(visulizadorPath, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addComponent(visulizadorDestinoRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGap(168, 168, 168)))
        );
        card2Layout.setVerticalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(quadroDeAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(criarRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(visulizadorPath, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(visulizadorDestinoRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Root.add(card2, "card2");

        jLabel1.setText("CARD 1");

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card1Layout.createSequentialGroup()
                .addContainerGap(774, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(468, Short.MAX_VALUE))
        );

        Root.add(card1, "card1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        CardLayout cl = (CardLayout) Root.getLayout();
        cl.show(Root, "card2");
        this.setTitle("MOSCOVIO");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void visulizadorPathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorPathMouseClicked

        selecionaArquivoOuPasta(true);
    }//GEN-LAST:event_visulizadorPathMouseClicked

    private void visulizadorPathMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorPathMouseEntered
        // TODO add your handling code here:
        visulizadorPath.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_visulizadorPathMouseEntered

    private void visulizadorPathMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorPathMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_visulizadorPathMouseExited

    private void visulizadorPathMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorPathMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_visulizadorPathMouseReleased

    private void visulizadorDestinoRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorDestinoRecibosMouseClicked

        selecionaArquivoOuPasta(false);
    }//GEN-LAST:event_visulizadorDestinoRecibosMouseClicked

    private void visulizadorDestinoRecibosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visulizadorDestinoRecibosMouseEntered
        // TODO add your handling code here:
        visulizadorDestinoRecibos.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_visulizadorDestinoRecibosMouseEntered

    private void criarRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarRecibosActionPerformed

        if (PLANILHA == null && DESTINO == null) {

            quadroAviso("ARQUIVO E PASTA NAO SELECIONADOS");

        } else if (PLANILHA == null) {

            quadroAviso("PLANILHA NAO SELECIONADA");

        } else if (DESTINO == null) {

            quadroAviso("PASTA NAO SELECIONADA");

        } else {

            interfaceB.CriarPDF(PLANILHA, DESTINO);
        }

    }//GEN-LAST:event_criarRecibosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Root;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JButton criarRecibos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel quadroDeAvisos;
    private javax.swing.JLabel visulizadorDestinoRecibos;
    private javax.swing.JLabel visulizadorPath;
    // End of variables declaration//GEN-END:variables
}
