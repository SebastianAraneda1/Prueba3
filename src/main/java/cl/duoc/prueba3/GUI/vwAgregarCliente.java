/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cl.duoc.prueba3.GUI;

import cl.duoc.prueba3.DTO.Cliente;
import cl.duoc.prueba3.Services.Implements.listaCliente;
import cl.duoc.prueba3.Utils.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class vwAgregarCliente extends javax.swing.JInternalFrame {
    
    Validaciones validar = new Validaciones();
    listaCliente listac;
    
    /**
     * Creates new form vwAgregarCliente
     */
    public vwAgregarCliente(listaCliente listac) {
        initComponents();
        this.listac = listac;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rutTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        correoTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarCliente = new javax.swing.JTextArea();
        botonEnviar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        comboComuna = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar cliente");

        jLabel1.setText("Rut:");

        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Bienvenido por favor registrese");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Comuna:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Correo electronico:");

        mostrarCliente.setColumns(20);
        mostrarCliente.setRows(5);
        jScrollPane1.setViewportView(mostrarCliente);

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        comboComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Macul", "San Joaquin", "Ñuñoa", "Providencia", "Grecia", "Vitacura" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboComuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreTxt)
                                .addComponent(rutTxt)
                                .addComponent(direccionTxt)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonEnviar)
                                    .addComponent(jLabel7)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(correoTxt)
                                .addComponent(telefonoTxt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rutTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEnviar)
                    .addComponent(botonLimpiar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
        try{
            int rut = Integer.parseInt(rutTxt.getText());
            String nombre = nombreTxt.getText();
            String direccion = direccionTxt.getText();
            String comuna = String.valueOf(comboComuna.getSelectedIndex());
            int telefono = Integer.parseInt(telefonoTxt.getText());
            String correo = correoTxt.getText();

            if(validar.largoMinimoPalabra(7, String.valueOf(rut))){
                Cliente cliente = new Cliente();
                cliente.setRut(rut);
                if(validar.largoMinimoPalabra(3, nombre)){
                cliente.setNombre(nombre);
                cliente.setDireccion(direccion);
                    if(comboComuna.getSelectedIndex() != 0){
                        cliente.setComuna(comuna);
                        cliente.setTelefono(telefono);
                        cliente.setCorreo(correo);
                        listac.agregarCliente(cliente);
                        mostrarCliente.setText(listac.imprimirListaCliente());
                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione una comuna");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un rut valido");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido el siguiente error: "+e.getMessage());
        }
    }//GEN-LAST:event_botonEnviarActionPerformed
    public void limpiarCliente(){
        rutTxt.setText("");
        nombreTxt.setText("");
        direccionTxt.setText("");
        comboComuna.setSelectedIndex(0);
        telefonoTxt.setText("");
        correoTxt.setText("");
        mostrarCliente.setText("");
    }
    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCliente();
    }//GEN-LAST:event_botonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JComboBox<String> comboComuna;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarCliente;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField rutTxt;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
