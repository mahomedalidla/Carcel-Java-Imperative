/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminales;

import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author el_be
 */
public class FramePrincipal extends javax.swing.JFrame {
    Criminal c;
    Socio s;
    Delito de;
    RedCriminal rc;
    Congreso cg;
    Prision p;
    ServicioRespuesta sr;
    NotificacionInterpol n;
    SeguridadFronteriza sf;
    DVI div;
    File folderCriminal, folderSocio, folderDelito, folderCongreso, folderRedCriminal, folderPrision, folderServicio, folderNotificacion, DIV;
    public FramePrincipal(String nombre) {
        initComponents();
        
        c = new Criminal();
        s = new Socio();
        de = new Delito();
        rc = new RedCriminal();
        cg = new Congreso();
        p = new Prision();
        sr = new ServicioRespuesta();
        n = new NotificacionInterpol();
        sf = new SeguridadFronteriza();
        div=new DVI();

        folderCriminal = new File("C:\\Users\\lenovo\\Desktop\\Criminal");
        folderCriminal.mkdir();

        folderSocio = new File("C:\\Users\\lenovo\\Desktop\\Socio");
        folderSocio.mkdir();

        folderDelito = new File("C:\\Users\\lenovo\\Desktop\\Delito");
        folderDelito.mkdir();

        folderRedCriminal = new File("C:\\Users\\lenovo\\Desktop\\Red Criminal");
        folderRedCriminal.mkdir();

        folderCongreso = new File("C:\\Users\\lenovo\\Desktop\\Congreso");
        folderCongreso.mkdir();

        folderPrision = new File("C:\\Users\\lenovo\\Desktop\\Prision");
        folderPrision.mkdir();

        folderServicio = new File("C:\\Users\\lenovo\\Desktop\\Servicio de Respuesta");
        folderServicio.mkdir();

        folderNotificacion = new File("C:\\Users\\lenovo\\Desktop\\Notificaciones de Interpol");
        folderNotificacion.mkdir();
        
        DIV = new File("C:\\Users\\lenovo\\Desktop\\DVI");
        DIV.mkdir();
        
        ImageIcon img = new  ImageIcon("src\\img\\fondo-01.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(jlFondo.getWidth(), jlFondo.getHeight(), Image.SCALE_DEFAULT));
        jlFondo.setIcon(icono);
       
        /// Lupas
        
        ImageIcon DVI;
        DVI = new  ImageIcon("src\\img\\lupa-01.PNG");
        
        Icon DEL = new ImageIcon(DVI.getImage().getScaledInstance(buscarDvi.getWidth(), buscarDvi.getHeight(), Image.SCALE_DEFAULT));
        buscarDvi.setIcon(DEL);
        
        Icon con = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa2.getWidth(), jlLupa2.getHeight(), Image.SCALE_DEFAULT));
        jlLupa2.setIcon(con);
        
        
        Icon red = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa7.getWidth(), jlLupa7.getHeight(), Image.SCALE_DEFAULT));
        jlLupa7.setIcon(red);
        
        Icon noti = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa4.getWidth(), jlLupa4.getHeight(), Image.SCALE_DEFAULT));
        jlLupa4.setIcon(noti);
        
        Icon delit = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa12.getWidth(), jlLupa12.getHeight(), Image.SCALE_DEFAULT));
        jlLupa12.setIcon(delit);
        
        Icon seguridad = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa14.getWidth(), jlLupa14.getHeight(), Image.SCALE_DEFAULT));
        jlLupa14.setIcon(seguridad);
        
        Icon soci = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa6.getWidth(), jlLupa6.getHeight(), Image.SCALE_DEFAULT));
        jlLupa6.setIcon(soci);
        
        Icon pri = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa3.getWidth(), jlLupa3.getHeight(), Image.SCALE_DEFAULT));
        jlLupa3.setIcon(pri);
        
        Icon cri = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa.getWidth(), jlLupa.getHeight(), Image.SCALE_DEFAULT));
        jlLupa.setIcon(cri);
        
        Icon ser = new ImageIcon(DVI.getImage().getScaledInstance(jlLupa10.getWidth(), jlLupa10.getHeight(), Image.SCALE_DEFAULT));
        jlLupa10.setIcon(ser);
        
        this.repaint();
        
        ///
        
        setLocationRelativeTo(null);
        
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);
        
        
        if(nombre.equalsIgnoreCase("pri")){
            panelPrision.setVisible(true);  
            panelMenuPrision.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("notificaciones")){
            panelNotificacion.setVisible(true);  
            panelMenuNotificacion.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("congreso")){
            panelCongreso.setVisible(true);  
            panelMenuCongreso.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("socio")){
            panelSocio.setVisible(true);  
            panelMenuSocio.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("criminal")){
            panelCriminal.setVisible(true);  
            panelMenuCriminal.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("red")){
            panelRed.setVisible(true);  
            panelMenuRed.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("servicio")){
            panelServicio.setVisible(true);  
            panelMenuServicio.setVisible(true);
        }
        
        if(nombre.equalsIgnoreCase("delito")){
            panelDelito.setVisible(true);  
            panelMenuDelito.setVisible(true);
        }
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuNotificacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dvi = new javax.swing.JButton();
        historialNotificacion1 = new javax.swing.JButton();
        panelMenudo = new javax.swing.JPanel();
        notificaciones = new javax.swing.JButton();
        prisiones = new javax.swing.JButton();
        congreso = new javax.swing.JButton();
        socio = new javax.swing.JButton();
        btnRedCriminal = new javax.swing.JButton();
        servicio = new javax.swing.JButton();
        delito = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        INICIO = new javax.swing.JButton();
        INICIO1 = new javax.swing.JButton();
        panelMenuDVI = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        historialDelito1 = new javax.swing.JButton();
        panelMenuDelito = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        historialDelito = new javax.swing.JButton();
        panelMenuSeguridadFronteriza = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        historialDelito2 = new javax.swing.JButton();
        panelMenuServicio = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        historialServicios = new javax.swing.JButton();
        panelMenuRed = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        historialRed = new javax.swing.JButton();
        panelMenuPrision = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        historialPrisiones = new javax.swing.JButton();
        panelMenuCongreso = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        historialCongreso = new javax.swing.JButton();
        panelMenuCriminal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        historialRostros = new javax.swing.JButton();
        criminalesCriminal = new javax.swing.JButton();
        panelMenuSocio = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        historialSocio = new javax.swing.JButton();
        historialSocio1 = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        panelDVI = new javax.swing.JPanel();
        buscarDvi = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        adn = new javax.swing.JTextField();
        huella = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        aceptarDelito1 = new javax.swing.JButton();
        jlLupa13 = new javax.swing.JLabel();
        buscarDIV = new javax.swing.JTextField();
        registroDental = new javax.swing.JTextField();
        panelCongreso = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        infromacionDerivada = new java.awt.TextArea();
        ubicacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        aceptarCongreso = new javax.swing.JButton();
        jlLupa2 = new javax.swing.JLabel();
        busquedaCongreso = new javax.swing.JTextField();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        panelRed = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        datosExtrasRed = new java.awt.TextArea();
        ubicacionRed = new javax.swing.JTextField();
        nombreLiderRed = new javax.swing.JTextField();
        nacionalidadRed = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        numeroSeguidoresRed = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        nombreRed = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jlLupa7 = new javax.swing.JLabel();
        aceptarRed = new javax.swing.JButton();
        busquedaRed = new javax.swing.JTextField();
        jlLupa8 = new javax.swing.JLabel();
        panelNotificacion = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        descripcionNoti = new java.awt.TextArea();
        asuntoNoti = new javax.swing.JTextField();
        paisNoti = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        aceptarNotificaciones = new javax.swing.JButton();
        jlLupa4 = new javax.swing.JLabel();
        busquedaNoti = new javax.swing.JTextField();
        panelDelito = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        caracteristicasDelito = new java.awt.TextArea();
        codigoDelito = new javax.swing.JTextField();
        tipoDelito = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        nombreDelito = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jlLupaDelito = new javax.swing.JLabel();
        aceptarDelito = new javax.swing.JButton();
        jlLupa12 = new javax.swing.JLabel();
        barritaDelito = new javax.swing.JTextField();
        panelSeguridadFronteriza = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        idAvion = new javax.swing.JTextField();
        tipoAereopuerto = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        aereopuerto = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jlLupaSeguridad = new javax.swing.JLabel();
        aceptarSeguridad = new javax.swing.JButton();
        jlLupa14 = new javax.swing.JLabel();
        barritaSeguridad = new javax.swing.JTextField();
        puerto = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        panelSocio = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pais = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        presidente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jlLupa5 = new javax.swing.JLabel();
        aceptarSocio = new javax.swing.JButton();
        jlLupa6 = new javax.swing.JLabel();
        busquedaSocio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        oficialesSocio = new javax.swing.JTextArea();
        panelPrision = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        idPrision = new javax.swing.JTextField();
        tipoPrision = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nombrePrision = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ubicacionPrision = new javax.swing.JTextField();
        aceptarPrision = new javax.swing.JButton();
        jlLupa3 = new javax.swing.JLabel();
        busquedaPrision = new javax.swing.JTextField();
        panelCriminal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        caracteristicasBiologicas = new java.awt.TextArea();
        caracteristicasFisicas = new java.awt.TextArea();
        codigoHuella = new javax.swing.JTextField();
        codigoADN = new javax.swing.JTextField();
        fechaNacimiento = new javax.swing.JTextField();
        busquedaCriminal = new javax.swing.JTextField();
        nacionalidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        redCriminal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlLupa = new javax.swing.JLabel();
        aceptarCriminal = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        analisisPsicologico = new java.awt.TextArea();
        panelServicio = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ubicacionServicio = new javax.swing.JTextField();
        horaServicio = new javax.swing.JTextField();
        asuntoServicio = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        unidadesServicio = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        nombreServicio = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jlLupa9 = new javax.swing.JLabel();
        aceptarServicio = new javax.swing.JButton();
        jlLupa10 = new javax.swing.JLabel();
        busquedaServicio = new javax.swing.JTextField();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuNotificacion.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuNotificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Hero Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NOTIFICACIONES");
        panelMenuNotificacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 40, 200, -1));

        dvi.setBackground(new java.awt.Color(204, 204, 204));
        dvi.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dvi.setForeground(new java.awt.Color(102, 102, 102));
        dvi.setText("D V I");
        dvi.setBorder(null);
        dvi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dvi.setFocusable(false);
        dvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dviActionPerformed(evt);
            }
        });
        panelMenuNotificacion.add(dvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 210, 40));

        historialNotificacion1.setBackground(new java.awt.Color(204, 204, 204));
        historialNotificacion1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialNotificacion1.setForeground(new java.awt.Color(102, 102, 102));
        historialNotificacion1.setText("HISTORIAL DE NOTIFICACIONES");
        historialNotificacion1.setBorder(null);
        historialNotificacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialNotificacion1.setFocusable(false);
        historialNotificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialNotificacion1ActionPerformed(evt);
            }
        });
        panelMenuNotificacion.add(historialNotificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 40));

        getContentPane().add(panelMenuNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 210));

        panelMenudo.setBackground(new java.awt.Color(215, 215, 215));
        panelMenudo.setForeground(new java.awt.Color(153, 153, 153));

        notificaciones.setBackground(new java.awt.Color(215, 215, 215));
        notificaciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        notificaciones.setForeground(new java.awt.Color(102, 102, 102));
        notificaciones.setText("NOTIFICACIONES");
        notificaciones.setBorder(null);
        notificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notificaciones.setFocusable(false);
        notificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificacionesActionPerformed(evt);
            }
        });

        prisiones.setBackground(new java.awt.Color(215, 215, 215));
        prisiones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        prisiones.setForeground(new java.awt.Color(102, 102, 102));
        prisiones.setText("PRISIONES");
        prisiones.setBorder(null);
        prisiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prisiones.setFocusable(false);
        prisiones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisionesActionPerformed(evt);
            }
        });

        congreso.setBackground(new java.awt.Color(215, 215, 215));
        congreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        congreso.setForeground(new java.awt.Color(102, 102, 102));
        congreso.setText("CONGRESO");
        congreso.setBorder(null);
        congreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        congreso.setFocusable(false);
        congreso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        congreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congresoActionPerformed(evt);
            }
        });

        socio.setBackground(new java.awt.Color(215, 215, 215));
        socio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        socio.setForeground(new java.awt.Color(102, 102, 102));
        socio.setText("SOCIO");
        socio.setBorder(null);
        socio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socio.setFocusable(false);
        socio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        socio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioActionPerformed(evt);
            }
        });

        btnRedCriminal.setBackground(new java.awt.Color(215, 215, 215));
        btnRedCriminal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRedCriminal.setForeground(new java.awt.Color(102, 102, 102));
        btnRedCriminal.setText("RED CRIMINAL");
        btnRedCriminal.setBorder(null);
        btnRedCriminal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedCriminal.setFocusable(false);
        btnRedCriminal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRedCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedCriminalActionPerformed(evt);
            }
        });

        servicio.setBackground(new java.awt.Color(215, 215, 215));
        servicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        servicio.setForeground(new java.awt.Color(102, 102, 102));
        servicio.setText("SERVICIO 24HRS");
        servicio.setBorder(null);
        servicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        servicio.setFocusable(false);
        servicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioActionPerformed(evt);
            }
        });

        delito.setBackground(new java.awt.Color(215, 215, 215));
        delito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        delito.setForeground(new java.awt.Color(102, 102, 102));
        delito.setText("DELITOS");
        delito.setBorder(null);
        delito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delito.setFocusable(false);
        delito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        delito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delitoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Hero Light", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("MENÙ");

        INICIO.setBackground(new java.awt.Color(215, 215, 215));
        INICIO.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        INICIO.setForeground(new java.awt.Color(102, 102, 102));
        INICIO.setText("CRIMINAL");
        INICIO.setBorder(null);
        INICIO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INICIO.setFocusable(false);
        INICIO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });

        INICIO1.setBackground(new java.awt.Color(215, 215, 215));
        INICIO1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        INICIO1.setForeground(new java.awt.Color(102, 102, 102));
        INICIO1.setText("INICIO");
        INICIO1.setBorder(null);
        INICIO1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INICIO1.setFocusable(false);
        INICIO1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        INICIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIO1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenudoLayout = new javax.swing.GroupLayout(panelMenudo);
        panelMenudo.setLayout(panelMenudoLayout);
        panelMenudoLayout.setHorizontalGroup(
            panelMenudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenudoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelMenudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INICIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(congreso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenudoLayout.setVerticalGroup(
            panelMenudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenudoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(congreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRedCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(INICIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(panelMenudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 203, 210, 500));

        panelMenuDVI.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuDVI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Hero Light", 0, 34)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("DVI");
        panelMenuDVI.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, -1));

        historialDelito1.setBackground(new java.awt.Color(204, 204, 204));
        historialDelito1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialDelito1.setForeground(new java.awt.Color(102, 102, 102));
        historialDelito1.setText("HISTORIAL DE DVI");
        historialDelito1.setBorder(null);
        historialDelito1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialDelito1.setFocusable(false);
        historialDelito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialDelito1ActionPerformed(evt);
            }
        });
        panelMenuDVI.add(historialDelito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 110, 226, 40));

        getContentPane().add(panelMenuDVI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 210));

        panelMenuDelito.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuDelito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Hero Light", 0, 34)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("DELITOS");
        panelMenuDelito.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));

        historialDelito.setBackground(new java.awt.Color(204, 204, 204));
        historialDelito.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialDelito.setForeground(new java.awt.Color(102, 102, 102));
        historialDelito.setText("HISTORIAL DE DELITOS");
        historialDelito.setBorder(null);
        historialDelito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialDelito.setFocusable(false);
        historialDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialDelitoActionPerformed(evt);
            }
        });
        panelMenuDelito.add(historialDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 226, 40));

        getContentPane().add(panelMenuDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 210));

        panelMenuSeguridadFronteriza.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuSeguridadFronteriza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Hero Light", 0, 30)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 102, 102));
        jLabel71.setText("FRONTERA");
        panelMenuSeguridadFronteriza.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        historialDelito2.setBackground(new java.awt.Color(204, 204, 204));
        historialDelito2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialDelito2.setForeground(new java.awt.Color(102, 102, 102));
        historialDelito2.setText("HISTORIAL DE FRONTERAS");
        historialDelito2.setBorder(null);
        historialDelito2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialDelito2.setFocusable(false);
        historialDelito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialDelito2ActionPerformed(evt);
            }
        });
        panelMenuSeguridadFronteriza.add(historialDelito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 40));

        getContentPane().add(panelMenuSeguridadFronteriza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 210));

        panelMenuServicio.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Hero Light", 0, 23)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("SERVICIO 24 HRS");
        panelMenuServicio.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        historialServicios.setBackground(new java.awt.Color(204, 204, 204));
        historialServicios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialServicios.setForeground(new java.awt.Color(102, 102, 102));
        historialServicios.setText("HISTORIAL DE SERVICIOS");
        historialServicios.setBorder(null);
        historialServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialServicios.setFocusable(false);
        historialServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialServiciosActionPerformed(evt);
            }
        });
        panelMenuServicio.add(historialServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 226, 40));

        getContentPane().add(panelMenuServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelMenuRed.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuRed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Hero Light", 0, 34)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("RED");
        panelMenuRed.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, -1));

        historialRed.setBackground(new java.awt.Color(204, 204, 204));
        historialRed.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialRed.setForeground(new java.awt.Color(102, 102, 102));
        historialRed.setText("HISTORIAL DE REDES");
        historialRed.setBorder(null);
        historialRed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialRed.setFocusable(false);
        historialRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialRedActionPerformed(evt);
            }
        });
        panelMenuRed.add(historialRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 226, 40));

        getContentPane().add(panelMenuRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelMenuPrision.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuPrision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Hero Light", 0, 34)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setText("PRISIONES");
        panelMenuPrision.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        historialPrisiones.setBackground(new java.awt.Color(204, 204, 204));
        historialPrisiones.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialPrisiones.setForeground(new java.awt.Color(102, 102, 102));
        historialPrisiones.setText("HISTORIAL DE PRISIONES");
        historialPrisiones.setBorder(null);
        historialPrisiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialPrisiones.setFocusable(false);
        historialPrisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialPrisionesActionPerformed(evt);
            }
        });
        panelMenuPrision.add(historialPrisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 210, 40));

        getContentPane().add(panelMenuPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelMenuCongreso.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuCongreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Hero Light", 0, 34)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setText("CONGRESO");
        panelMenuCongreso.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        historialCongreso.setBackground(new java.awt.Color(204, 204, 204));
        historialCongreso.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialCongreso.setForeground(new java.awt.Color(102, 102, 102));
        historialCongreso.setText("HISTORIAL DE CONGRESOS");
        historialCongreso.setBorder(null);
        historialCongreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialCongreso.setFocusable(false);
        historialCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialCongresoActionPerformed(evt);
            }
        });
        panelMenuCongreso.add(historialCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 226, 40));

        getContentPane().add(panelMenuCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelMenuCriminal.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuCriminal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Hero Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CRIMINAL");
        panelMenuCriminal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 174, -1));

        historialRostros.setBackground(new java.awt.Color(204, 204, 204));
        historialRostros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        historialRostros.setForeground(new java.awt.Color(102, 102, 102));
        historialRostros.setText("HISTORIAL DE ROSTROS");
        historialRostros.setBorder(null);
        historialRostros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialRostros.setFocusable(false);
        historialRostros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialRostrosActionPerformed(evt);
            }
        });
        panelMenuCriminal.add(historialRostros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 226, 40));

        criminalesCriminal.setBackground(new java.awt.Color(204, 204, 204));
        criminalesCriminal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        criminalesCriminal.setForeground(new java.awt.Color(102, 102, 102));
        criminalesCriminal.setText("CRIMINALES");
        criminalesCriminal.setBorder(null);
        criminalesCriminal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criminalesCriminal.setFocusable(false);
        criminalesCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criminalesCriminalActionPerformed(evt);
            }
        });
        panelMenuCriminal.add(criminalesCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 127, 40));

        getContentPane().add(panelMenuCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelMenuSocio.setBackground(new java.awt.Color(204, 204, 204));
        panelMenuSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Hero Light", 0, 36)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("SOCIO");
        panelMenuSocio.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, -1));

        historialSocio.setBackground(new java.awt.Color(204, 204, 204));
        historialSocio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialSocio.setForeground(new java.awt.Color(102, 102, 102));
        historialSocio.setText("HISTORIAL DE SOCIOS");
        historialSocio.setBorder(null);
        historialSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialSocio.setFocusable(false);
        historialSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialSocioActionPerformed(evt);
            }
        });
        panelMenuSocio.add(historialSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 226, 40));

        historialSocio1.setBackground(new java.awt.Color(204, 204, 204));
        historialSocio1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        historialSocio1.setForeground(new java.awt.Color(102, 102, 102));
        historialSocio1.setText("FRONTERA");
        historialSocio1.setBorder(null);
        historialSocio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialSocio1.setFocusable(false);
        historialSocio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialSocio1ActionPerformed(evt);
            }
        });
        panelMenuSocio.add(historialSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 100, 210, 40));

        getContentPane().add(panelMenuSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDVI.setBackground(new java.awt.Color(255, 255, 255));
        panelDVI.setOpaque(false);
        panelDVI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarDvi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarDvi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarDviMouseClicked(evt);
            }
        });
        panelDVI.add(buscarDvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        jLabel62.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(153, 153, 153));
        jLabel62.setText("REGISTRO");
        panelDVI.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel63.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("ADN");
        jLabel63.setToolTipText("");
        panelDVI.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel64.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 102));
        jLabel64.setText("REGISTRO DENTAL");
        panelDVI.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        adn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDVI.add(adn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 354, 28));

        huella.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDVI.add(huella, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 354, 28));

        jLabel67.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("CODIGO DE HUELLA");
        panelDVI.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        aceptarDelito1.setBackground(new java.awt.Color(153, 153, 153));
        aceptarDelito1.setForeground(new java.awt.Color(51, 51, 51));
        aceptarDelito1.setText("ACEPTAR");
        aceptarDelito1.setFocusable(false);
        aceptarDelito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarDelito1ActionPerformed(evt);
            }
        });
        panelDVI.add(aceptarDelito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDVI.add(jlLupa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        buscarDIV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDVI.add(buscarDIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        registroDental.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDVI.add(registroDental, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 354, 28));

        panelPrincipal.add(panelDVI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        panelCongreso.setBackground(new java.awt.Color(255, 255, 255));
        panelCongreso.setOpaque(false);
        panelCongreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("REGISTRO");
        panelCongreso.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("INFORMACIÓN DERIVADA");
        panelCongreso.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));
        panelCongreso.add(infromacionDerivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 412, 750, 157));

        ubicacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCongreso.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 354, 28));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("UBICACIÓN");
        panelCongreso.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        nombre2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCongreso.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 354, 28));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("FECHA");
        panelCongreso.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("NOMBRE");
        panelCongreso.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));

        aceptarCongreso.setBackground(new java.awt.Color(153, 153, 153));
        aceptarCongreso.setForeground(new java.awt.Color(51, 51, 51));
        aceptarCongreso.setText("ACEPTAR");
        aceptarCongreso.setFocusable(false);
        aceptarCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCongresoActionPerformed(evt);
            }
        });
        panelCongreso.add(aceptarCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa2MouseClicked(evt);
            }
        });
        panelCongreso.add(jlLupa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        busquedaCongreso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCongreso.add(busquedaCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));
        panelCongreso.add(jCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 270, 170));

        panelPrincipal.add(panelCongreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5260, 702));

        panelRed.setBackground(new java.awt.Color(255, 255, 255));
        panelRed.setOpaque(false);
        panelRed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("REGISTRO");
        panelRed.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("NUMERO DE SEGUIDORES");
        panelRed.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 211, -1, -1));

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("NACIONALIDAD");
        panelRed.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 141, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("UBICACIÓN");
        panelRed.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 287, -1, -1));

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("DATOS EXTRAS");
        panelRed.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 378, -1, -1));
        panelRed.add(datosExtrasRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 412, 750, 157));

        ubicacionRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelRed.add(ubicacionRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 317, 354, 28));

        nombreLiderRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelRed.add(nombreLiderRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 241, 354, 28));

        nacionalidadRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nacionalidadRed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa del Sur ", "Angola ", "Argelia ", "Benin ", "Botswana ", "Burkina Faso ", "Burundi ", "Camerun ", "Cape Verde ", "Chad ", "Comoros ", "Congo ", "Costa de Marfíl ", "Djibouti ", "Egipto ", "Eritrea ", "Etiopia ", "Gabon ", "Gambia ", "Ghana ", "Guinea ", "Guinea-Bissau ", "Guinea Equatorial ", "Kenia ", "Lesotho ", "Liberia ", "Libia ", "Madagascar ", "Malawi ", "Mali ", "Marruecos ", "Mauricio ", "Mauritania ", "Mozambique ", "Namibia ", "Niger ", "Nigeria ", "Rep.Centroafricana ", "Rep.Dem.Congo ", "Reunion ", "Ruanda ", "Sahara ", "Santa Helena ", "Sao Tome & Principe ", "Senegal ", "Seychelles ", "Sierra Leona ", "Somalia ", "Sudan ", "Sur Africa ", "Swaziland ", "Tanzania ", "Togo ", "Tunisia ", "Uganda ", "Zambia ", "Zimbabwe ", "Belice ", "Costa Rica ", "El Salvador ", "Guatemala ", "Honduras ", "Mexico ", "Nicaragua ", "Panama ", "Canada ", "Estados Unidos ", "Groenlandia ", "Mexico ", "Argentina ", "Bolivia ", "Brasil ", "Chile ", "Colombia ", "Ecuador ", "Guayana Francesa ", "Guyana ", "Islas Malvinas ", "Paraguay ", "Peru ", "Surinam ", "Uruguay ", "Venezuela ", "Afganistan ", "Armenia ", "Azerbaijan ", "Bangladesh ", "Bhutan ", "Brunei Darussulam ", "Camboya ", "Corea del Norte ", "Corea del Sur ", "China ", "Filipinas ", "Georgia ", "Hong Kong ", "India ", "Indonesia ", "Japon ", "Kazakhstan ", "Kyrgyzstan ", "Laos ", "Macao ", "Malasia ", "Maldivas ", "Mongolia ", "Myanmar (Burma) ", "Nepal ", "Pakistan ", "Singapur ", "Sri Lanka (Ceilan) ", "Tailandia ", "Taiwan ", "Tajikistan ", "Timor Oriental ", "Turkmenistan ", "Uzbekistan ", "Vietnam ", "Antillas Holandesas ", "Antigua y Barbuda ", "Aruba ", "Bahamas ", "Barbados ", "Bermudas ", "Cuba ", "Dominica ", "Granada ", "Guadalupe ", "Haiti ", "Islas Caiman ", "Islas Virgenes (GB) ", "Islas Virgenes (US) ", "Jamaica ", "Martinica ", "Puerto Rico ", "Republica Dominicana ", "San Cristobal-Nevis ", "San Vincente y las Granadinas ", "Santa Lucia ", "Trinidad & Tobago  ", "Albania ", "Andorra ", "Belarusia ", "Bosnia ", "Bulgaria ", "Croasia ", "Chipre ", "Eslovenia ", "Estonia ", "Guerney ", "Hungria ", "Islandia ", "Islas Faroe ", "Jersey ", "Latvia ", "Liechtenstein ", "Lituania ", "Macedionia ", "Malta ", "Moldova ", "Monaco ", "Noruega ", "Polonia ", "Republica Checa ", "Republica Eslovaca ", "Rumania ", "Rusia ", "San Marino ", "Santa Sede (Vaticano) ", "Suiza ", "Ucrania ", "Union Europea ", "Yugoslavia ", "Alemania ", "Austria ", "Belgica ", "Dinamarca ", "España ", "Finlandia ", "Francia ", "Grecia ", "Holanda ", "Irlanda ", "Italia ", "Luxemburgo ", "Portugal ", "Reino Unido ", "Suecia ", "Arabia Saudita ", "Bahrain ", "Emiratos Arabes Unidos ", "Irak ", "Iran ", "Israel ", "Jordania ", "Kuwait ", "Libano ", "Oman ", "Palestina ", "Qatar ", "Siria ", "Turquia ", "Yemen ", "Australia ", "Fiji ", "Guam ", "Islas Marshall ", "Islas Solomon ", "Kiribati ", "Micronesia ", "Nueva Caledonia ", "Nueva Zealandia ", "Papua Nueva Guinea ", "Polinesia Francesa ", "Samoa ", "Tonga ", "Vanuatu" }));
        panelRed.add(nacionalidadRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 171, 354, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("NOMBRE DE LIDER");
        panelRed.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 211, -1, -1));

        numeroSeguidoresRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelRed.add(numeroSeguidoresRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 241, 354, 28));
        panelRed.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        nombreRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelRed.add(nombreRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 172, 354, 28));

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("NOMBRE DE RED");
        panelRed.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));

        jlLupa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa7MouseClicked(evt);
            }
        });
        panelRed.add(jlLupa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarRed.setBackground(new java.awt.Color(153, 153, 153));
        aceptarRed.setForeground(new java.awt.Color(51, 51, 51));
        aceptarRed.setText("ACEPTAR");
        aceptarRed.setFocusable(false);
        aceptarRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRedActionPerformed(evt);
            }
        });
        panelRed.add(aceptarRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        busquedaRed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelRed.add(busquedaRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        jlLupa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa8MouseClicked(evt);
            }
        });
        panelRed.add(jlLupa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        panelPrincipal.add(panelRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 706));

        panelNotificacion.setBackground(new java.awt.Color(255, 255, 255));
        panelNotificacion.setOpaque(false);
        panelNotificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("NOTIFICACIONES INTERPOL");
        panelNotificacion.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("PAIS");
        panelNotificacion.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("DESCRIPCION");
        panelNotificacion.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        panelNotificacion.add(descripcionNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 750, 157));

        asuntoNoti.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelNotificacion.add(asuntoNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 354, 28));

        paisNoti.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        paisNoti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa del Sur ", "Angola ", "Argelia ", "Benin ", "Botswana ", "Burkina Faso ", "Burundi ", "Camerun ", "Cape Verde ", "Chad ", "Comoros ", "Congo ", "Costa de Marfíl ", "Djibouti ", "Egipto ", "Eritrea ", "Etiopia ", "Gabon ", "Gambia ", "Ghana ", "Guinea ", "Guinea-Bissau ", "Guinea Equatorial ", "Kenia ", "Lesotho ", "Liberia ", "Libia ", "Madagascar ", "Malawi ", "Mali ", "Marruecos ", "Mauricio ", "Mauritania ", "Mozambique ", "Namibia ", "Niger ", "Nigeria ", "Rep.Centroafricana ", "Rep.Dem.Congo ", "Reunion ", "Ruanda ", "Sahara ", "Santa Helena ", "Sao Tome & Principe ", "Senegal ", "Seychelles ", "Sierra Leona ", "Somalia ", "Sudan ", "Sur Africa ", "Swaziland ", "Tanzania ", "Togo ", "Tunisia ", "Uganda ", "Zambia ", "Zimbabwe ", "Belice ", "Costa Rica ", "El Salvador ", "Guatemala ", "Honduras ", "Mexico ", "Nicaragua ", "Panama ", "Canada ", "Estados Unidos ", "Groenlandia ", "Mexico ", "Argentina ", "Bolivia ", "Brasil ", "Chile ", "Colombia ", "Ecuador ", "Guayana Francesa ", "Guyana ", "Islas Malvinas ", "Paraguay ", "Peru ", "Surinam ", "Uruguay ", "Venezuela ", "Afganistan ", "Armenia ", "Azerbaijan ", "Bangladesh ", "Bhutan ", "Brunei Darussulam ", "Camboya ", "Corea del Norte ", "Corea del Sur ", "China ", "Filipinas ", "Georgia ", "Hong Kong ", "India ", "Indonesia ", "Japon ", "Kazakhstan ", "Kyrgyzstan ", "Laos ", "Macao ", "Malasia ", "Maldivas ", "Mongolia ", "Myanmar (Burma) ", "Nepal ", "Pakistan ", "Singapur ", "Sri Lanka (Ceilan) ", "Tailandia ", "Taiwan ", "Tajikistan ", "Timor Oriental ", "Turkmenistan ", "Uzbekistan ", "Vietnam ", "Antillas Holandesas ", "Antigua y Barbuda ", "Aruba ", "Bahamas ", "Barbados ", "Bermudas ", "Cuba ", "Dominica ", "Granada ", "Guadalupe ", "Haiti ", "Islas Caiman ", "Islas Virgenes (GB) ", "Islas Virgenes (US) ", "Jamaica ", "Martinica ", "Puerto Rico ", "Republica Dominicana ", "San Cristobal-Nevis ", "San Vincente y las Granadinas ", "Santa Lucia ", "Trinidad & Tobago  ", "Albania ", "Andorra ", "Belarusia ", "Bosnia ", "Bulgaria ", "Croasia ", "Chipre ", "Eslovenia ", "Estonia ", "Guerney ", "Hungria ", "Islandia ", "Islas Faroe ", "Jersey ", "Latvia ", "Liechtenstein ", "Lituania ", "Macedionia ", "Malta ", "Moldova ", "Monaco ", "Noruega ", "Polonia ", "Republica Checa ", "Republica Eslovaca ", "Rumania ", "Rusia ", "San Marino ", "Santa Sede (Vaticano) ", "Suiza ", "Ucrania ", "Union Europea ", "Yugoslavia ", "Alemania ", "Austria ", "Belgica ", "Dinamarca ", "España ", "Finlandia ", "Francia ", "Grecia ", "Holanda ", "Irlanda ", "Italia ", "Luxemburgo ", "Portugal ", "Reino Unido ", "Suecia ", "Arabia Saudita ", "Bahrain ", "Emiratos Arabes Unidos ", "Irak ", "Iran ", "Israel ", "Jordania ", "Kuwait ", "Libano ", "Oman ", "Palestina ", "Qatar ", "Siria ", "Turquia ", "Yemen ", "Australia ", "Fiji ", "Guam ", "Islas Marshall ", "Islas Solomon ", "Kiribati ", "Micronesia ", "Nueva Caledonia ", "Nueva Zealandia ", "Papua Nueva Guinea ", "Polinesia Francesa ", "Samoa ", "Tonga ", "Vanuatu" }));
        panelNotificacion.add(paisNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 354, -1));
        panelNotificacion.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("ASUNTO");
        panelNotificacion.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        aceptarNotificaciones.setBackground(new java.awt.Color(153, 153, 153));
        aceptarNotificaciones.setForeground(new java.awt.Color(51, 51, 51));
        aceptarNotificaciones.setText("ACEPTAR");
        aceptarNotificaciones.setFocusable(false);
        aceptarNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarNotificacionesActionPerformed(evt);
            }
        });
        panelNotificacion.add(aceptarNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa4MouseClicked(evt);
            }
        });
        panelNotificacion.add(jlLupa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        busquedaNoti.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelNotificacion.add(busquedaNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        panelPrincipal.add(panelNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 706));

        panelDelito.setBackground(new java.awt.Color(255, 255, 255));
        panelDelito.setOpaque(false);
        panelDelito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setText("REGISTRO");
        panelDelito.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setText("TIPO");
        jLabel51.setToolTipText("");
        panelDelito.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 141, -1, -1));

        jLabel52.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("CODIGO");
        panelDelito.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel53.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("CARACTERISTICAS DEL DELITO");
        panelDelito.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));
        panelDelito.add(caracteristicasDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 412, 760, 157));

        codigoDelito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDelito.add(codigoDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 354, 28));

        tipoDelito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipoDelito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delitos contra la vida humana independiente", "Delitos contra la vida humana dependiente. Aborto", "Delitos contra la salud y la integridad corporal: lesiones", "Delitos contra la libertad", "Torturas y otros delitos contra la integridad moral.", "Delitos contra el patrimonio y el orden socioeconómico", "Delitos contra la salud pública", "Delitos contra la seguridad vial", "Delitos contra las relaciones familiares", "Delitos de falsedad", "Delitos contra el honor", "Delitos contra la Administración Pública", "Delitos contra la Administración de Justicia", "Delitos contra la ordenación del territorio", "Delitos contra el patrimonio histórico", "Delitos contra los recursos naturales", "Delitos relativos a la protección de la flora y la fauna", "Delitos relativos a la caza y la pesca", "Otros" }));
        panelDelito.add(tipoDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 354, -1));
        panelDelito.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        nombreDelito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDelito.add(nombreDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 354, 28));

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("NOMBRE DE DELITO");
        panelDelito.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));
        panelDelito.add(jlLupaDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarDelito.setBackground(new java.awt.Color(153, 153, 153));
        aceptarDelito.setForeground(new java.awt.Color(51, 51, 51));
        aceptarDelito.setText("ACEPTAR");
        aceptarDelito.setFocusable(false);
        aceptarDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarDelitoActionPerformed(evt);
            }
        });
        panelDelito.add(aceptarDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa12MouseClicked(evt);
            }
        });
        panelDelito.add(jlLupa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        barritaDelito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelDelito.add(barritaDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        panelPrincipal.add(panelDelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 706));

        panelSeguridadFronteriza.setBackground(new java.awt.Color(255, 255, 255));
        panelSeguridadFronteriza.setOpaque(false);
        panelSeguridadFronteriza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(153, 153, 153));
        jLabel65.setText("REGISTRO");
        panelSeguridadFronteriza.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel69.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("TIPO");
        jLabel69.setToolTipText("");
        panelSeguridadFronteriza.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 141, -1, -1));

        jLabel70.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("idAvion");
        panelSeguridadFronteriza.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        idAvion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSeguridadFronteriza.add(idAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 354, 28));

        tipoAereopuerto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipoAereopuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Internacional" }));
        panelSeguridadFronteriza.add(tipoAereopuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 354, -1));
        panelSeguridadFronteriza.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        aereopuerto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSeguridadFronteriza.add(aereopuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 354, 28));

        jLabel73.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("AEROPUERTO");
        panelSeguridadFronteriza.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));
        panelSeguridadFronteriza.add(jlLupaSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarSeguridad.setBackground(new java.awt.Color(153, 153, 153));
        aceptarSeguridad.setForeground(new java.awt.Color(51, 51, 51));
        aceptarSeguridad.setText("ACEPTAR");
        aceptarSeguridad.setFocusable(false);
        aceptarSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSeguridadActionPerformed(evt);
            }
        });
        panelSeguridadFronteriza.add(aceptarSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa14MouseClicked(evt);
            }
        });
        panelSeguridadFronteriza.add(jlLupa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        barritaSeguridad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSeguridadFronteriza.add(barritaSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        puerto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSeguridadFronteriza.add(puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 354, 28));

        jLabel74.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("PUERTO");
        panelSeguridadFronteriza.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        panelPrincipal.add(panelSeguridadFronteriza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelSocio.setBackground(new java.awt.Color(255, 255, 255));
        panelSocio.setOpaque(false);
        panelSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("REGISTRO");
        panelSocio.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("PAÍS");
        panelSocio.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 141, -1, -1));

        pais.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa del Sur ", "Angola ", "Argelia ", "Benin ", "Botswana ", "Burkina Faso ", "Burundi ", "Camerun ", "Cape Verde ", "Chad ", "Comoros ", "Congo ", "Costa de Marfíl ", "Djibouti ", "Egipto ", "Eritrea ", "Etiopia ", "Gabon ", "Gambia ", "Ghana ", "Guinea ", "Guinea-Bissau ", "Guinea Equatorial ", "Kenia ", "Lesotho ", "Liberia ", "Libia ", "Madagascar ", "Malawi ", "Mali ", "Marruecos ", "Mauricio ", "Mauritania ", "Mozambique ", "Namibia ", "Niger ", "Nigeria ", "Rep.Centroafricana ", "Rep.Dem.Congo ", "Reunion ", "Ruanda ", "Sahara ", "Santa Helena ", "Sao Tome & Principe ", "Senegal ", "Seychelles ", "Sierra Leona ", "Somalia ", "Sudan ", "Sur Africa ", "Swaziland ", "Tanzania ", "Togo ", "Tunisia ", "Uganda ", "Zambia ", "Zimbabwe ", "Belice ", "Costa Rica ", "El Salvador ", "Guatemala ", "Honduras ", "Mexico ", "Nicaragua ", "Panama ", "Canada ", "Estados Unidos ", "Groenlandia ", "Mexico ", "Argentina ", "Bolivia ", "Brasil ", "Chile ", "Colombia ", "Ecuador ", "Guayana Francesa ", "Guyana ", "Islas Malvinas ", "Paraguay ", "Peru ", "Surinam ", "Uruguay ", "Venezuela ", "Afganistan ", "Armenia ", "Azerbaijan ", "Bangladesh ", "Bhutan ", "Brunei Darussulam ", "Camboya ", "Corea del Norte ", "Corea del Sur ", "China ", "Filipinas ", "Georgia ", "Hong Kong ", "India ", "Indonesia ", "Japon ", "Kazakhstan ", "Kyrgyzstan ", "Laos ", "Macao ", "Malasia ", "Maldivas ", "Mongolia ", "Myanmar (Burma) ", "Nepal ", "Pakistan ", "Singapur ", "Sri Lanka (Ceilan) ", "Tailandia ", "Taiwan ", "Tajikistan ", "Timor Oriental ", "Turkmenistan ", "Uzbekistan ", "Vietnam ", "Antillas Holandesas ", "Antigua y Barbuda ", "Aruba ", "Bahamas ", "Barbados ", "Bermudas ", "Cuba ", "Dominica ", "Granada ", "Guadalupe ", "Haiti ", "Islas Caiman ", "Islas Virgenes (GB) ", "Islas Virgenes (US) ", "Jamaica ", "Martinica ", "Puerto Rico ", "Republica Dominicana ", "San Cristobal-Nevis ", "San Vincente y las Granadinas ", "Santa Lucia ", "Trinidad & Tobago  ", "Albania ", "Andorra ", "Belarusia ", "Bosnia ", "Bulgaria ", "Croasia ", "Chipre ", "Eslovenia ", "Estonia ", "Guerney ", "Hungria ", "Islandia ", "Islas Faroe ", "Jersey ", "Latvia ", "Liechtenstein ", "Lituania ", "Macedionia ", "Malta ", "Moldova ", "Monaco ", "Noruega ", "Polonia ", "Republica Checa ", "Republica Eslovaca ", "Rumania ", "Rusia ", "San Marino ", "Santa Sede (Vaticano) ", "Suiza ", "Ucrania ", "Union Europea ", "Yugoslavia ", "Alemania ", "Austria ", "Belgica ", "Dinamarca ", "España ", "Finlandia ", "Francia ", "Grecia ", "Holanda ", "Irlanda ", "Italia ", "Luxemburgo ", "Portugal ", "Reino Unido ", "Suecia ", "Arabia Saudita ", "Bahrain ", "Emiratos Arabes Unidos ", "Irak ", "Iran ", "Israel ", "Jordania ", "Kuwait ", "Libano ", "Oman ", "Palestina ", "Qatar ", "Siria ", "Turquia ", "Yemen ", "Australia ", "Fiji ", "Guam ", "Islas Marshall ", "Islas Solomon ", "Kiribati ", "Micronesia ", "Nueva Caledonia ", "Nueva Zealandia ", "Papua Nueva Guinea ", "Polinesia Francesa ", "Samoa ", "Tonga ", "Vanuatu" }));
        panelSocio.add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 354, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("OFICIALES");
        panelSocio.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        panelSocio.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        presidente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSocio.add(presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 354, 28));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("PRESIDENTE");
        panelSocio.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));
        panelSocio.add(jlLupa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarSocio.setBackground(new java.awt.Color(153, 153, 153));
        aceptarSocio.setForeground(new java.awt.Color(51, 51, 51));
        aceptarSocio.setText("ACEPTAR");
        aceptarSocio.setFocusable(false);
        aceptarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSocioActionPerformed(evt);
            }
        });
        panelSocio.add(aceptarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa6MouseClicked(evt);
            }
        });
        panelSocio.add(jlLupa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        busquedaSocio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelSocio.add(busquedaSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        oficialesSocio.setColumns(20);
        oficialesSocio.setRows(5);
        jScrollPane1.setViewportView(oficialesSocio);

        panelSocio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 350, 130));

        panelPrincipal.add(panelSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 3298));

        panelPrision.setBackground(new java.awt.Color(255, 255, 255));
        panelPrision.setOpaque(false);
        panelPrision.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("REGISTRO");
        panelPrision.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("TIPO");
        panelPrision.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 141, -1, -1));

        idPrision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelPrision.add(idPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 354, 28));

        tipoPrision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipoPrision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MUNICIPAL", "ESTATAL", "FEDERAL", "FEDERAL SEGURIDAD MEDIA", "FEDERAL SEGURIDAD ALTA", "CORREDOR DE LA MUERTE", "CORRECCIONAL DE MENORES", "FEDERAL FEMENIL", "PSIQUIATRICA", "MILITAR" }));
        panelPrision.add(tipoPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 354, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("ID PRISIÓN");
        panelPrision.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        panelPrision.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        nombrePrision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelPrision.add(nombrePrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 354, 28));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("NOMBRE DE PRISIÓN");
        panelPrision.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, -1, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("UBICACIÓN");
        panelPrision.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        ubicacionPrision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelPrision.add(ubicacionPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 354, 28));

        aceptarPrision.setBackground(new java.awt.Color(153, 153, 153));
        aceptarPrision.setForeground(new java.awt.Color(51, 51, 51));
        aceptarPrision.setText("ACEPTAR");
        aceptarPrision.setFocusable(false);
        aceptarPrision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarPrisionActionPerformed(evt);
            }
        });
        panelPrision.add(aceptarPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa3MouseClicked(evt);
            }
        });
        panelPrision.add(jlLupa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        busquedaPrision.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelPrision.add(busquedaPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        panelPrincipal.add(panelPrision, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 705));

        panelCriminal.setBackground(new java.awt.Color(255, 255, 255));
        panelCriminal.setOpaque(false);
        panelCriminal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("REGISTRO");
        panelCriminal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CARACTERISTICAS BIOLOGICAS");
        panelCriminal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("RED CRIMINAL");
        panelCriminal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("NACIONALIDAD");
        panelCriminal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CODIGO ADN");
        panelCriminal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("CODIGO HUEGA DIGITAL");
        panelCriminal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("CARACTERISTICAS FISICAS");
        panelCriminal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        panelCriminal.add(caracteristicasBiologicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 354, 157));
        panelCriminal.add(caracteristicasFisicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 354, 157));

        codigoHuella.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCriminal.add(codigoHuella, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 354, 28));

        codigoADN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCriminal.add(codigoADN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 354, 28));

        fechaNacimiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCriminal.add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 354, 28));

        busquedaCriminal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCriminal.add(busquedaCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        nacionalidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa del Sur ", "Angola ", "Argelia ", "Benin ", "Botswana ", "Burkina Faso ", "Burundi ", "Camerun ", "Cape Verde ", "Chad ", "Comoros ", "Congo ", "Costa de Marfíl ", "Djibouti ", "Egipto ", "Eritrea ", "Etiopia ", "Gabon ", "Gambia ", "Ghana ", "Guinea ", "Guinea-Bissau ", "Guinea Equatorial ", "Kenia ", "Lesotho ", "Liberia ", "Libia ", "Madagascar ", "Malawi ", "Mali ", "Marruecos ", "Mauricio ", "Mauritania ", "Mozambique ", "Namibia ", "Niger ", "Nigeria ", "Rep.Centroafricana ", "Rep.Dem.Congo ", "Reunion ", "Ruanda ", "Sahara ", "Santa Helena ", "Sao Tome & Principe ", "Senegal ", "Seychelles ", "Sierra Leona ", "Somalia ", "Sudan ", "Sur Africa ", "Swaziland ", "Tanzania ", "Togo ", "Tunisia ", "Uganda ", "Zambia ", "Zimbabwe ", "Belice ", "Costa Rica ", "El Salvador ", "Guatemala ", "Honduras ", "Mexico ", "Nicaragua ", "Panama ", "Canada ", "Estados Unidos ", "Groenlandia ", "Mexico ", "Argentina ", "Bolivia ", "Brasil ", "Chile ", "Colombia ", "Ecuador ", "Guayana Francesa ", "Guyana ", "Islas Malvinas ", "Paraguay ", "Peru ", "Surinam ", "Uruguay ", "Venezuela ", "Afganistan ", "Armenia ", "Azerbaijan ", "Bangladesh ", "Bhutan ", "Brunei Darussulam ", "Camboya ", "Corea del Norte ", "Corea del Sur ", "China ", "Filipinas ", "Georgia ", "Hong Kong ", "India ", "Indonesia ", "Japon ", "Kazakhstan ", "Kyrgyzstan ", "Laos ", "Macao ", "Malasia ", "Maldivas ", "Mongolia ", "Myanmar (Burma) ", "Nepal ", "Pakistan ", "Singapur ", "Sri Lanka (Ceilan) ", "Tailandia ", "Taiwan ", "Tajikistan ", "Timor Oriental ", "Turkmenistan ", "Uzbekistan ", "Vietnam ", "Antillas Holandesas ", "Antigua y Barbuda ", "Aruba ", "Bahamas ", "Barbados ", "Bermudas ", "Cuba ", "Dominica ", "Granada ", "Guadalupe ", "Haiti ", "Islas Caiman ", "Islas Virgenes (GB) ", "Islas Virgenes (US) ", "Jamaica ", "Martinica ", "Puerto Rico ", "Republica Dominicana ", "San Cristobal-Nevis ", "San Vincente y las Granadinas ", "Santa Lucia ", "Trinidad & Tobago  ", "Albania ", "Andorra ", "Belarusia ", "Bosnia ", "Bulgaria ", "Croasia ", "Chipre ", "Eslovenia ", "Estonia ", "Guerney ", "Hungria ", "Islandia ", "Islas Faroe ", "Jersey ", "Latvia ", "Liechtenstein ", "Lituania ", "Macedionia ", "Malta ", "Moldova ", "Monaco ", "Noruega ", "Polonia ", "Republica Checa ", "Republica Eslovaca ", "Rumania ", "Rusia ", "San Marino ", "Santa Sede (Vaticano) ", "Suiza ", "Ucrania ", "Union Europea ", "Yugoslavia ", "Alemania ", "Austria ", "Belgica ", "Dinamarca ", "España ", "Finlandia ", "Francia ", "Grecia ", "Holanda ", "Irlanda ", "Italia ", "Luxemburgo ", "Portugal ", "Reino Unido ", "Suecia ", "Arabia Saudita ", "Bahrain ", "Emiratos Arabes Unidos ", "Irak ", "Iran ", "Israel ", "Jordania ", "Kuwait ", "Libano ", "Oman ", "Palestina ", "Qatar ", "Siria ", "Turquia ", "Yemen ", "Australia ", "Fiji ", "Guam ", "Islas Marshall ", "Islas Solomon ", "Kiribati ", "Micronesia ", "Nueva Caledonia ", "Nueva Zealandia ", "Papua Nueva Guinea ", "Polinesia Francesa ", "Samoa ", "Tonga ", "Vanuatu" }));
        panelCriminal.add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 354, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("FECHA DE NACIMIENTO");
        panelCriminal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        redCriminal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelCriminal.add(redCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 354, 28));
        panelCriminal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        nombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        panelCriminal.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 354, 28));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("NOMBRE");
        panelCriminal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jlLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupaMouseClicked(evt);
            }
        });
        panelCriminal.add(jlLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarCriminal.setBackground(new java.awt.Color(153, 153, 153));
        aceptarCriminal.setForeground(new java.awt.Color(51, 51, 51));
        aceptarCriminal.setText("ACEPTAR");
        aceptarCriminal.setFocusable(false);
        aceptarCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCriminalActionPerformed(evt);
            }
        });
        panelCriminal.add(aceptarCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, 111, 34));

        jLabel66.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("ANALISÍS PSICOLOGICO");
        panelCriminal.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));
        panelCriminal.add(analisisPsicologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 750, 157));

        panelPrincipal.add(panelCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 706));

        panelServicio.setBackground(new java.awt.Color(255, 255, 255));
        panelServicio.setOpaque(false);
        panelServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("REGISTRO");
        panelServicio.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("UNIDADES NECESARIAS");
        panelServicio.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("HORA DE REGISTRO");
        panelServicio.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("UBICACIÓN");
        panelServicio.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        ubicacionServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(ubicacionServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 354, 28));

        horaServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(horaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 354, 28));

        asuntoServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(asuntoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 354, 28));

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("ASUNTO");
        panelServicio.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        unidadesServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(unidadesServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 354, 28));
        panelServicio.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 5260, 2590));

        nombreServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(nombreServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 354, 28));

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("NOMBRE");
        panelServicio.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        panelServicio.add(jlLupa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        aceptarServicio.setBackground(new java.awt.Color(153, 153, 153));
        aceptarServicio.setForeground(new java.awt.Color(51, 51, 51));
        aceptarServicio.setText("ACEPTAR");
        aceptarServicio.setFocusable(false);
        aceptarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarServicioActionPerformed(evt);
            }
        });
        panelServicio.add(aceptarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 598, 111, 34));

        jlLupa10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLupa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLupa10MouseClicked(evt);
            }
        });
        panelServicio.add(jlLupa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        busquedaServicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panelServicio.add(busquedaServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 40, 300, 28));

        panelPrincipal.add(panelServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 706));
        panelPrincipal.add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 710));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 930, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesActionPerformed
        panelNotificacion.setVisible(true);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(true);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_notificacionesActionPerformed

    private void prisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisionesActionPerformed
        
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(true);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(true);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_prisionesActionPerformed

    private void congresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congresoActionPerformed
          //        new FrameCongreso().setVisible(true);
        //        this.dispose();        // TODO add your handling code here:
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(true); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(true);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);
    }//GEN-LAST:event_congresoActionPerformed

    private void socioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioActionPerformed
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(true); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(true);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_socioActionPerformed

    private void btnRedCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedCriminalActionPerformed
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(true); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(true);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_btnRedCriminalActionPerformed

    private void servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioActionPerformed
       
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(true);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(true);
        panelMenuDelito.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_servicioActionPerformed

    private void delitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delitoActionPerformed
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(true);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_delitoActionPerformed

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
        
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(true);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(true);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_INICIOActionPerformed

    private void aceptarCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCongresoActionPerformed
        cg.setLugar(ubicacion.getText());
        cg.setNombre(nombre2.getText());
        cg.setInformacionDerivada(infromacionDerivada.getText());
        cg.escribe("Congreso");
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(jCalendar2.getDate());
        cg.setFecha(fecha);
    }//GEN-LAST:event_aceptarCongresoActionPerformed

    private void aceptarCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCriminalActionPerformed
        try {
            c.setAnalisis(analisisPsicologico.getText());
            c.setNombre(nombre1.getText());
            c.setFechaNacimiento(fechaNacimiento.getText());
            c.setNacionalidad((String) nacionalidad.getSelectedItem());
            c.setCarFisicas(caracteristicasFisicas.getText());
            c.setCarBiologicas(caracteristicasBiologicas.getText());
            c.setADN(codigoADN.getText());
            c.setHuella(codigoHuella.getText());
            c.setRedCriminal(redCriminal.getText());
            c.escribe("Criminal");
            
        } catch (Exception e) {
            showMessageDialog(null, "Error al crear el archivo");
        }
        nombre1.setText("");
        fechaNacimiento.setText("");
        caracteristicasFisicas.setText("");
        caracteristicasBiologicas.setText("");
        codigoADN.setText("");
        codigoHuella.setText("");
        redCriminal.setText("");
    }//GEN-LAST:event_aceptarCriminalActionPerformed

    private void aceptarNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarNotificacionesActionPerformed
        n.setAsunto(asuntoNoti.getText());
        n.setDescripcion(descripcionNoti.getText());
        n.setPais((String) paisNoti.getSelectedItem());
        n.escribe("Notificaciones de Interpol");
    }//GEN-LAST:event_aceptarNotificacionesActionPerformed

    private void aceptarPrisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarPrisionActionPerformed
        p.setIdPrision(idPrision.getText());
        p.setNombrePrision(nombrePrision.getText());
        p.setUbicacion(ubicacionPrision.getText());
        p.setTipo((String) tipoPrision.getSelectedItem());
        p.escribe("Prision");
    }//GEN-LAST:event_aceptarPrisionActionPerformed

    private void aceptarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSocioActionPerformed
        try {
            s.setGobernante(presidente.getText());
            s.setOficial(oficialesSocio.getText());
            s.setPais((String) pais.getSelectedItem());
            s.escribe("Socio");
        } catch (Exception e) {
            showMessageDialog(null, "Error al crear el archivo");
        }
    }//GEN-LAST:event_aceptarSocioActionPerformed

    private void aceptarRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRedActionPerformed
        rc.setNombreLider(nombreLiderRed.getText());
        rc.setNombreRed(nombreRed.getText());
        rc.setNumeroSeguidores(Integer.parseInt(numeroSeguidoresRed.getText()));
        rc.setUbicacion(ubicacionRed.getText());
        rc.setDatosExtra(datosExtrasRed.getText());
        rc.escribe("Red Criminal");
    }//GEN-LAST:event_aceptarRedActionPerformed

    private void aceptarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarServicioActionPerformed
        sr.setAsunto(asuntoServicio.getText());
        sr.setHora(horaServicio.getText());
        sr.setUbicacion(ubicacionServicio.getText());
        sr.setUnidadesNecesarias(unidadesServicio.getText());
        sr.escribe("Servicio de Respuesta");
    }//GEN-LAST:event_aceptarServicioActionPerformed

    private void aceptarDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarDelitoActionPerformed
        de.setNombreDelito(nombreDelito.getText());
        de.setTipo((String) tipoDelito.getSelectedItem());
        de.setCaracteristicas(caracteristicasDelito.getText());
        de.setCodigo(codigoDelito.getText());
        de.escribe("Delito");
    }//GEN-LAST:event_aceptarDelitoActionPerformed

    private void INICIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIO1ActionPerformed
       new FrameEmpresa().setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_INICIO1ActionPerformed

    private void aceptarDelito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarDelito1ActionPerformed
        div.setADN(adn.getText());
        div.setHuella(huella.getText());
        div.setRegistroDental(registroDental.getText());
        div.escribe("DVI");
    }//GEN-LAST:event_aceptarDelito1ActionPerformed

    private void aceptarSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSeguridadActionPerformed
        sf.setAereopuerto(aereopuerto.getText());
        sf.setAvion(idAvion.getText());
        sf.setPuertosNavales(puerto.getText());
        sf.setTipo((String)tipoAereopuerto.getSelectedItem());
        sf.escribe("Socio");
    }//GEN-LAST:event_aceptarSeguridadActionPerformed

    private void dviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dviActionPerformed
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(true);
        panelSeguridadFronteriza.setVisible(false);
        panelMenuDVI.setVisible(true);
        panelMenuSeguridadFronteriza.setVisible(false);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);                  // TODO add your handling code here:
    }//GEN-LAST:event_dviActionPerformed

    private void historialSocio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialSocio1ActionPerformed
        panelNotificacion.setVisible(false);
        panelCriminal.setVisible(false);
        panelPrision.setVisible(false);  
        panelCongreso.setVisible(false); 
        panelSocio.setVisible(false); 
        panelRed.setVisible(false); 
        panelServicio.setVisible(false);
        panelDelito.setVisible(false);
        
        panelDVI.setVisible(false);
        panelSeguridadFronteriza.setVisible(true);
        panelMenuDVI.setVisible(false);
        panelMenuSeguridadFronteriza.setVisible(true);
        
        panelMenuNotificacion.setVisible(false);
        panelMenuCriminal.setVisible(false);
        panelMenuPrision.setVisible(false);
        panelMenuCongreso.setVisible(false);
        panelMenuSocio.setVisible(false);
        panelMenuRed.setVisible(false);
        panelMenuServicio.setVisible(false);
        panelMenuDelito.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_historialSocio1ActionPerformed

    private void buscarDviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarDviMouseClicked
                                              
        showMessageDialog(null, div.leer(buscarDIV.getText(), "DVI"));
        buscarDIV.setText("");
          // TODO add your handling code here:
    }//GEN-LAST:event_buscarDviMouseClicked
    
   
    
    private void historialDelito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialDelito1ActionPerformed
       div.cosas("DVI");        // TODO add your handling code here:
    }//GEN-LAST:event_historialDelito1ActionPerformed

    private void historialNotificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialNotificacion1ActionPerformed
       n.cosas("Notificaciones de Interpol");          // TODO add your handling code here:
    }//GEN-LAST:event_historialNotificacion1ActionPerformed

    private void historialDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialDelitoActionPerformed
       de.cosas("Delito");            // TODO add your handling code here:
    }//GEN-LAST:event_historialDelitoActionPerformed

    private void historialDelito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialDelito2ActionPerformed
       sf.cosas("Frontera");         // TODO add your handling code here:
    }//GEN-LAST:event_historialDelito2ActionPerformed

    private void historialServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialServiciosActionPerformed
       s.cosas("Servicio de respuesta");        // TODO add your handling code here:
    }//GEN-LAST:event_historialServiciosActionPerformed

    private void historialRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialRedActionPerformed
      rc.cosas("Red criminal");        // TODO add your handling code here:
    }//GEN-LAST:event_historialRedActionPerformed

    private void historialPrisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialPrisionesActionPerformed
      p.cosas("Prision");        // TODO add your handling code here:
    }//GEN-LAST:event_historialPrisionesActionPerformed

    private void historialCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialCongresoActionPerformed
     cg.cosas("Congreso");        // TODO add your handling code here:
    }//GEN-LAST:event_historialCongresoActionPerformed

    private void historialRostrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialRostrosActionPerformed
// Historial rostros
//d.cosas("Delito");        // TODO add your handling code here:
    }//GEN-LAST:event_historialRostrosActionPerformed

    private void criminalesCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criminalesCriminalActionPerformed
    c.cosas("Criminal");        // TODO add your handling code here:
    }//GEN-LAST:event_criminalesCriminalActionPerformed

    private void historialSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialSocioActionPerformed
    s.cosas("Socio");        // TODO add your handling code here:
    }//GEN-LAST:event_historialSocioActionPerformed

    private void jlLupa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa2MouseClicked
        showMessageDialog(null, cg.leer(busquedaCongreso.getText(), "Congreso"));
        busquedaCongreso.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa2MouseClicked

    private void jlLupa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa7MouseClicked
     
            
    showMessageDialog(null, rc.leer(busquedaRed.getText(), "Red Criminal"));
        busquedaRed.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jlLupa7MouseClicked

    private void jlLupa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa4MouseClicked
       showMessageDialog(null, n.leer(busquedaNoti.getText(), "Notificaciones de Interpol"));
        busquedaNoti.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa4MouseClicked

    private void jlLupa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa8MouseClicked
 showMessageDialog(null, cg.leer(busquedaRed.getText(), "Red Criminal"));
        busquedaRed.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa8MouseClicked

    private void jlLupa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa12MouseClicked
 showMessageDialog(null, cg.leer(barritaDelito.getText(), "Delito"));
        barritaDelito.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa12MouseClicked

    private void jlLupa14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa14MouseClicked
     showMessageDialog(null, cg.leer(barritaSeguridad.getText(), "Seguridad Fronteriza"));
        barritaSeguridad.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa14MouseClicked

    private void jlLupa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa6MouseClicked
 showMessageDialog(null, cg.leer(busquedaSocio.getText(), "Socio"));
        busquedaSocio.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa6MouseClicked

    private void jlLupa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa3MouseClicked
    showMessageDialog(null, cg.leer(busquedaPrision.getText(), "Prision"));
        busquedaPrision.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa3MouseClicked

    private void jlLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupaMouseClicked
showMessageDialog(null, cg.leer(busquedaCriminal.getText(), "Criminal"));
        busquedaCriminal.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupaMouseClicked

    private void jlLupa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLupa10MouseClicked
showMessageDialog(null, cg.leer(busquedaServicio.getText(), "Servicio"));
        busquedaServicio.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jlLupa10MouseClicked

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

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
                if ("DarkWindows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INICIO;
    private javax.swing.JButton INICIO1;
    private javax.swing.JButton aceptarCongreso;
    private javax.swing.JButton aceptarCriminal;
    private javax.swing.JButton aceptarDelito;
    private javax.swing.JButton aceptarDelito1;
    private javax.swing.JButton aceptarNotificaciones;
    private javax.swing.JButton aceptarPrision;
    private javax.swing.JButton aceptarRed;
    private javax.swing.JButton aceptarSeguridad;
    private javax.swing.JButton aceptarServicio;
    private javax.swing.JButton aceptarSocio;
    private javax.swing.JTextField adn;
    private javax.swing.JTextField aereopuerto;
    private java.awt.TextArea analisisPsicologico;
    private javax.swing.JTextField asuntoNoti;
    private javax.swing.JTextField asuntoServicio;
    private javax.swing.JTextField barritaDelito;
    private javax.swing.JTextField barritaSeguridad;
    private javax.swing.JButton btnRedCriminal;
    private javax.swing.JTextField buscarDIV;
    private javax.swing.JLabel buscarDvi;
    private javax.swing.JTextField busquedaCongreso;
    private javax.swing.JTextField busquedaCriminal;
    private javax.swing.JTextField busquedaNoti;
    private javax.swing.JTextField busquedaPrision;
    private javax.swing.JTextField busquedaRed;
    private javax.swing.JTextField busquedaServicio;
    private javax.swing.JTextField busquedaSocio;
    private java.awt.TextArea caracteristicasBiologicas;
    private java.awt.TextArea caracteristicasDelito;
    private java.awt.TextArea caracteristicasFisicas;
    private javax.swing.JTextField codigoADN;
    private javax.swing.JTextField codigoDelito;
    private javax.swing.JTextField codigoHuella;
    private javax.swing.JButton congreso;
    private javax.swing.JButton criminalesCriminal;
    private java.awt.TextArea datosExtrasRed;
    private javax.swing.JButton delito;
    private java.awt.TextArea descripcionNoti;
    private javax.swing.JButton dvi;
    private javax.swing.JTextField fechaNacimiento;
    private javax.swing.JButton historialCongreso;
    private javax.swing.JButton historialDelito;
    private javax.swing.JButton historialDelito1;
    private javax.swing.JButton historialDelito2;
    private javax.swing.JButton historialNotificacion1;
    private javax.swing.JButton historialPrisiones;
    private javax.swing.JButton historialRed;
    private javax.swing.JButton historialRostros;
    private javax.swing.JButton historialServicios;
    private javax.swing.JButton historialSocio;
    private javax.swing.JButton historialSocio1;
    private javax.swing.JTextField horaServicio;
    private javax.swing.JTextField huella;
    private javax.swing.JTextField idAvion;
    private javax.swing.JTextField idPrision;
    private java.awt.TextArea infromacionDerivada;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlLupa;
    private javax.swing.JLabel jlLupa10;
    private javax.swing.JLabel jlLupa12;
    private javax.swing.JLabel jlLupa13;
    private javax.swing.JLabel jlLupa14;
    private javax.swing.JLabel jlLupa2;
    private javax.swing.JLabel jlLupa3;
    private javax.swing.JLabel jlLupa4;
    private javax.swing.JLabel jlLupa5;
    private javax.swing.JLabel jlLupa6;
    private javax.swing.JLabel jlLupa7;
    private javax.swing.JLabel jlLupa8;
    private javax.swing.JLabel jlLupa9;
    private javax.swing.JLabel jlLupaDelito;
    private javax.swing.JLabel jlLupaSeguridad;
    private javax.swing.JComboBox<String> nacionalidad;
    private javax.swing.JComboBox<String> nacionalidadRed;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombreDelito;
    private javax.swing.JTextField nombreLiderRed;
    private javax.swing.JTextField nombrePrision;
    private javax.swing.JTextField nombreRed;
    private javax.swing.JTextField nombreServicio;
    private javax.swing.JButton notificaciones;
    private javax.swing.JTextField numeroSeguidoresRed;
    private javax.swing.JTextArea oficialesSocio;
    private javax.swing.JComboBox<String> pais;
    private javax.swing.JComboBox<String> paisNoti;
    private javax.swing.JPanel panelCongreso;
    private javax.swing.JPanel panelCriminal;
    private javax.swing.JPanel panelDVI;
    private javax.swing.JPanel panelDelito;
    private javax.swing.JPanel panelMenuCongreso;
    private javax.swing.JPanel panelMenuCriminal;
    private javax.swing.JPanel panelMenuDVI;
    private javax.swing.JPanel panelMenuDelito;
    private javax.swing.JPanel panelMenuNotificacion;
    private javax.swing.JPanel panelMenuPrision;
    private javax.swing.JPanel panelMenuRed;
    private javax.swing.JPanel panelMenuSeguridadFronteriza;
    private javax.swing.JPanel panelMenuServicio;
    private javax.swing.JPanel panelMenuSocio;
    private javax.swing.JPanel panelMenudo;
    private javax.swing.JPanel panelNotificacion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelPrision;
    private javax.swing.JPanel panelRed;
    private javax.swing.JPanel panelSeguridadFronteriza;
    private javax.swing.JPanel panelServicio;
    private javax.swing.JPanel panelSocio;
    private javax.swing.JTextField presidente;
    private javax.swing.JButton prisiones;
    private javax.swing.JTextField puerto;
    private javax.swing.JTextField redCriminal;
    private javax.swing.JTextField registroDental;
    private javax.swing.JButton servicio;
    private javax.swing.JButton socio;
    private javax.swing.JComboBox<String> tipoAereopuerto;
    private javax.swing.JComboBox<String> tipoDelito;
    private javax.swing.JComboBox<String> tipoPrision;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField ubicacionPrision;
    private javax.swing.JTextField ubicacionRed;
    private javax.swing.JTextField ubicacionServicio;
    private javax.swing.JTextField unidadesServicio;
    // End of variables declaration//GEN-END:variables
}
