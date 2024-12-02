package views;

import core.utils.Util;
import java.beans.PropertyVetoException;

public class ViewMenuPrincipal extends javax.swing.JFrame {

    Util util = new Util();
    ViewAcercaDe viewAcercaDe = new ViewAcercaDe();
    ViewReserva viewReserva = new ViewReserva();
    ViewMantenimientoCliente viewMantenimientoCliente = new ViewMantenimientoCliente();
    ViewMantenimientoHabitacion viewMantenimientoHabitacion = new ViewMantenimientoHabitacion();
//    ViewMantenimientoEmpleado viewMantenimientoEmpleado = new ViewMantenimientoEmpleado();
    ViewMantenimientoProducto viewMantenimientoProducto = new ViewMantenimientoProducto();
    ViewVentaProducto viewVentaProducto = new ViewVentaProducto();

    /**
     * Creates new form Principal
     *
     * @throws java.beans.PropertyVetoException
     */
    public ViewMenuPrincipal() throws PropertyVetoException {
        initComponents();
//        viewReserva.setMaximum(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuArchivo = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();
        jmenuHotel = new javax.swing.JMenu();
        menuItemReservar = new javax.swing.JMenuItem();
        menuItemVentaProducto = new javax.swing.JMenuItem();
        jmenuMantenimiento = new javax.swing.JMenu();
        menuItemMantenimientoCliente = new javax.swing.JMenuItem();
        menuItemMantenimientoHabitacion = new javax.swing.JMenuItem();
        menuItemMantenimientoEmpleado = new javax.swing.JMenuItem();
        menuItemMantenimientoProducto = new javax.swing.JMenuItem();
        jmenuAyuda = new javax.swing.JMenu();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa");

        escritorio.setBackground(new java.awt.Color(255, 255, 204));
        escritorio.setAutoscrolls(true);
        escritorio.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenuBar1.setAutoscrolls(true);

        jmenuArchivo.setText("Archivo");

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jmenuArchivo.add(menuItemSalir);

        jMenuBar1.add(jmenuArchivo);

        jmenuHotel.setText("Hotel");

        menuItemReservar.setText("Reservar");
        menuItemReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReservarActionPerformed(evt);
            }
        });
        jmenuHotel.add(menuItemReservar);

        menuItemVentaProducto.setText("Venta productos");
        menuItemVentaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVentaProductoActionPerformed(evt);
            }
        });
        jmenuHotel.add(menuItemVentaProducto);

        jMenuBar1.add(jmenuHotel);

        jmenuMantenimiento.setText("Mantenimiento");

        menuItemMantenimientoCliente.setText("Cliente");
        menuItemMantenimientoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMantenimientoClienteActionPerformed(evt);
            }
        });
        jmenuMantenimiento.add(menuItemMantenimientoCliente);

        menuItemMantenimientoHabitacion.setText("Habitación");
        menuItemMantenimientoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMantenimientoHabitacionActionPerformed(evt);
            }
        });
        jmenuMantenimiento.add(menuItemMantenimientoHabitacion);

        menuItemMantenimientoEmpleado.setText("Empleado");
        menuItemMantenimientoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMantenimientoEmpleadoActionPerformed(evt);
            }
        });
        jmenuMantenimiento.add(menuItemMantenimientoEmpleado);

        menuItemMantenimientoProducto.setText("Producto");
        menuItemMantenimientoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMantenimientoProductoActionPerformed(evt);
            }
        });
        jmenuMantenimiento.add(menuItemMantenimientoProducto);

        jMenuBar1.add(jmenuMantenimiento);

        jmenuAyuda.setText("Ayuda");

        menuItemAcercaDe.setText("Acerca de");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        jmenuAyuda.add(menuItemAcercaDe);

        jMenuBar1.add(jmenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewMenuPrincipal().setVisible(true);
//            }
//        });
//    }

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed

        util.centerOnScreen(viewAcercaDe, true);

        if (viewAcercaDe.isVisible()) {
        } else {
            viewAcercaDe.setVisible(true);
        }
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

    private void menuItemMantenimientoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMantenimientoClienteActionPerformed
        // TODO add your handling code here:

        if (viewMantenimientoCliente.isShowing()) {
            viewMantenimientoCliente.toFront();
        } else {
            if (viewMantenimientoCliente.isSelected()) {
                escritorio.setSelectedFrame(viewMantenimientoCliente);
            } else {
                escritorio.add(viewMantenimientoCliente);
                viewMantenimientoCliente.show();
            }
        }
    }//GEN-LAST:event_menuItemMantenimientoClienteActionPerformed

    private void menuItemReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReservarActionPerformed
        // TODO add your handling code here:

        if (viewReserva.isShowing()) {
            viewReserva.toFront();
        } else {
            if (viewReserva.isSelected()) {
                escritorio.setSelectedFrame(viewReserva);
            } else {
                escritorio.add(viewReserva);
                viewReserva.show();
            }
        }
    }//GEN-LAST:event_menuItemReservarActionPerformed

    private void menuItemMantenimientoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMantenimientoHabitacionActionPerformed
        // TODO add your handling code here:

        if (viewMantenimientoHabitacion.isShowing()) {
            viewMantenimientoHabitacion.toFront();
        } else {
            if (viewMantenimientoHabitacion.isSelected()) {
                escritorio.setSelectedFrame(viewMantenimientoHabitacion);
            } else {
                escritorio.add(viewMantenimientoHabitacion);
                viewMantenimientoHabitacion.show();
            }
        }
    }//GEN-LAST:event_menuItemMantenimientoHabitacionActionPerformed

    private void menuItemMantenimientoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMantenimientoEmpleadoActionPerformed
        // TODO add your handling code here:

//        if (viewMantenimientoEmpleado.isShowing()) {
//            viewMantenimientoEmpleado.toFront();
//        } else {
//            if (viewMantenimientoEmpleado.isSelected()) {
//                escritorio.setSelectedFrame(viewMantenimientoEmpleado);
//            } else {
//                escritorio.add(viewMantenimientoEmpleado);
//                viewMantenimientoEmpleado.show();
//            }
//        }
    }//GEN-LAST:event_menuItemMantenimientoEmpleadoActionPerformed

    private void menuItemVentaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVentaProductoActionPerformed
        // TODO add your handling code here:

        if (viewVentaProducto.isShowing()) {
            viewVentaProducto.toFront();
        } else {
            if (viewVentaProducto.isSelected()) {
                escritorio.setSelectedFrame(viewVentaProducto);
            } else {
                escritorio.add(viewVentaProducto);
                viewVentaProducto.show();
            }
        }
    }//GEN-LAST:event_menuItemVentaProductoActionPerformed

    private void menuItemMantenimientoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMantenimientoProductoActionPerformed
        // TODO add your handling code here:

        if (viewMantenimientoProducto.isShowing()) {
            viewMantenimientoProducto.toFront();
        } else {
            if (viewMantenimientoProducto.isSelected()) {
                escritorio.setSelectedFrame(viewMantenimientoProducto);
            } else {
                escritorio.add(viewMantenimientoProducto);
                viewMantenimientoProducto.show();
            }
        }
    }//GEN-LAST:event_menuItemMantenimientoProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jmenuArchivo;
    private javax.swing.JMenu jmenuAyuda;
    private javax.swing.JMenu jmenuHotel;
    private javax.swing.JMenu jmenuMantenimiento;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemMantenimientoCliente;
    private javax.swing.JMenuItem menuItemMantenimientoEmpleado;
    private javax.swing.JMenuItem menuItemMantenimientoHabitacion;
    private javax.swing.JMenuItem menuItemMantenimientoProducto;
    private javax.swing.JMenuItem menuItemReservar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemVentaProducto;
    // End of variables declaration//GEN-END:variables
}
