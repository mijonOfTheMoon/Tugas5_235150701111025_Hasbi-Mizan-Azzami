import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
                      
    private void initComponents() {

        formPage = new javax.swing.JPanel();
        formPageHeading = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        labelNomor = new javax.swing.JLabel();
        labelTelepon = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        nomor = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        alamat = new javax.swing.JTextArea();
        email = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        alertNama = new javax.swing.JLabel();
        alertTanggal = new javax.swing.JLabel();
        alertNomor = new javax.swing.JLabel();
        alertTelepon = new javax.swing.JLabel();
        alertAlamat = new javax.swing.JLabel();
        alertEmail = new javax.swing.JLabel();
        hasilPage = new javax.swing.JPanel();
        hasilPageHeading = new javax.swing.JLabel();
        namaLengkap = new javax.swing.JLabel();
        tanggalLahir = new javax.swing.JLabel();
        nomorPendaftaran = new javax.swing.JLabel();
        nomorTelepon = new javax.swing.JLabel();
        alamatRumah = new javax.swing.JLabel();
        alamatEmail = new javax.swing.JLabel();
        dataNama = new javax.swing.JLabel();
        dataNomor = new javax.swing.JLabel();
        dataTanggal = new javax.swing.JLabel();
        dataTelepon = new javax.swing.JLabel();
        dataEmail = new javax.swing.JLabel();
        dataAlamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulir Mahasiswa Baru");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setName("Formulir");
        getContentPane().setLayout(new java.awt.CardLayout());

        formPage.setBackground(new java.awt.Color(255, 250, 245));
        formPage.setForeground(new java.awt.Color(0, 0, 0));
        formPage.setMinimumSize(new java.awt.Dimension(500, 500));
        formPage.setPreferredSize(new java.awt.Dimension(500, 500));

        formPageHeading.setFont(new java.awt.Font("SF Pro Display", 1, 24));
        formPageHeading.setForeground(new java.awt.Color(0, 0, 0));
        formPageHeading.setText("Formulir Pendaftaran Mahasiswa Baru ");
        formPageHeading.setAlignmentX(0.5F);

        labelNama.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelNama.setForeground(new java.awt.Color(0, 0, 0));
        labelNama.setText("Nama Lengkap");

        labelTanggal.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelTanggal.setForeground(new java.awt.Color(0, 0, 0));
        labelTanggal.setText("Tanggal Lahir");

        labelNomor.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelNomor.setForeground(new java.awt.Color(0, 0, 0));
        labelNomor.setText("Nomor Pendaftaran");

        labelTelepon.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelTelepon.setForeground(new java.awt.Color(0, 0, 0));
        labelTelepon.setText("Nomor Telepon");

        labelAlamat.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelAlamat.setForeground(new java.awt.Color(0, 0, 0));
        labelAlamat.setText("Alamat");

        labelEmail.setFont(new java.awt.Font("SF Pro Display", 0, 12));
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");

        nama.setBackground(new java.awt.Color(255, 255, 255));
        nama.setFont(new java.awt.Font("Calibri", 0, 12));
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tanggal.setBackground(new java.awt.Color(255, 255, 255));
        tanggal.setFont(new java.awt.Font("Calibri", 0, 12));
        tanggal.setForeground(new java.awt.Color(0, 0, 0));
        tanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomor.setBackground(new java.awt.Color(255, 255, 255));
        nomor.setFont(new java.awt.Font("Calibri", 0, 12));
        nomor.setForeground(new java.awt.Color(0, 0, 0));
        nomor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        telepon.setBackground(new java.awt.Color(255, 255, 255));
        telepon.setFont(new java.awt.Font("Calibri", 0, 12));
        telepon.setForeground(new java.awt.Color(0, 0, 0));
        telepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        alamat.setBackground(new java.awt.Color(255, 255, 255));
        alamat.setColumns(20);
        alamat.setFont(new java.awt.Font("Calibri", 0, 12));
        alamat.setForeground(new java.awt.Color(0, 0, 0));
        alamat.setLineWrap(true);
        alamat.setRows(5);
        alamat.setWrapStyleWord(true);
        alamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alamat.setMaximumSize(new java.awt.Dimension(202, 77));
        alamat.setMinimumSize(new java.awt.Dimension(202, 77));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Calibri", 0, 12));
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        submitButton.setBackground(new java.awt.Color(245, 225, 185));
        submitButton.setFont(new java.awt.Font("Poppins Light", 1, 10));
        submitButton.setForeground(new java.awt.Color(0, 0, 0));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        alertNama.setFont(new java.awt.Font("Calibri", 0, 10));
        alertNama.setForeground(new java.awt.Color(255, 250, 245));
        alertNama.setText("Nama tidak boleh kosong!");

        alertTanggal.setFont(new java.awt.Font("Calibri", 0, 10));
        alertTanggal.setForeground(new java.awt.Color(255, 250, 245));
        alertTanggal.setText("Tanggal Lahir tidak boleh kosong!");

        alertNomor.setFont(new java.awt.Font("Calibri", 0, 10));
        alertNomor.setForeground(new java.awt.Color(255, 250, 245));
        alertNomor.setText("Nomor Pendaftaran tidak boleh kosong!");

        alertTelepon.setFont(new java.awt.Font("Calibri", 0, 10));
        alertTelepon.setForeground(new java.awt.Color(255, 250, 245));
        alertTelepon.setText("Nomor Telepon tidak boleh kosong!");

        alertAlamat.setFont(new java.awt.Font("Calibri", 0, 10));
        alertAlamat.setForeground(new java.awt.Color(255, 250, 245));
        alertAlamat.setText("Alamat tidak boleh kosong!");

        alertEmail.setFont(new java.awt.Font("Calibri", 0, 10));
        alertEmail.setForeground(new java.awt.Color(255, 250, 245));
        alertEmail.setText("Email tidak boleh kosong!");

        javax.swing.GroupLayout formPageLayout = new javax.swing.GroupLayout(formPage);
        formPage.setLayout(formPageLayout);
        formPageLayout.setHorizontalGroup(
            formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPageLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton)
                    .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(formPageHeading)
                        .addGroup(formPageLayout.createSequentialGroup()
                            .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNomor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTelepon)
                                .addComponent(labelTanggal)
                                .addComponent(labelNama)
                                .addComponent(labelEmail)
                                .addComponent(labelAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(26, 26, 26)
                            .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nama)
                                .addComponent(tanggal)
                                .addComponent(nomor)
                                .addComponent(telepon)
                                .addGroup(formPageLayout.createSequentialGroup()
                                    .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(alertTelepon)
                                        .addComponent(alertTanggal)
                                        .addComponent(alertNama)
                                        .addComponent(alertNomor)
                                        .addComponent(alertAlamat)
                                        .addComponent(alertEmail))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        formPageLayout.setVerticalGroup(
            formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(formPageHeading)
                .addGap(50, 50, 50)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(alertNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTanggal)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(alertTanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomor)
                    .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(alertNomor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelepon)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(alertTelepon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(alertAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(1, 1, 1)
                .addComponent(alertEmail)
                .addGap(25, 25, 25)
                .addComponent(submitButton)
                .addGap(0, 0, 0))
        );

        getContentPane().add(formPage, "card3");

        hasilPage.setBackground(new java.awt.Color(255, 250, 245));
        hasilPage.setForeground(new java.awt.Color(0, 0, 0));
        hasilPage.setMinimumSize(new java.awt.Dimension(500, 500));
        hasilPage.setPreferredSize(new java.awt.Dimension(500, 500));

        hasilPageHeading.setFont(new java.awt.Font("SF Pro Display", 1, 24));
        hasilPageHeading.setForeground(new java.awt.Color(0, 0, 0));
        hasilPageHeading.setText("Rekapitulasi Data Mahasiswa Baru");

        namaLengkap.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        namaLengkap.setForeground(new java.awt.Color(0, 0, 0));
        namaLengkap.setText("Nama Lengkap");

        tanggalLahir.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        tanggalLahir.setForeground(new java.awt.Color(0, 0, 0));
        tanggalLahir.setText("Tanggal Lahir");

        nomorPendaftaran.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        nomorPendaftaran.setForeground(new java.awt.Color(0, 0, 0));
        nomorPendaftaran.setText("Nomor Pendaftaran");

        nomorTelepon.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        nomorTelepon.setForeground(new java.awt.Color(0, 0, 0));
        nomorTelepon.setText("Nomor Telepon");

        alamatRumah.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        alamatRumah.setForeground(new java.awt.Color(0, 0, 0));
        alamatRumah.setText("Alamat");

        alamatEmail.setFont(new java.awt.Font("SF Pro Display", 0, 10));
        alamatEmail.setForeground(new java.awt.Color(0, 0, 0));
        alamatEmail.setText("Email");

        dataNama.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataNama.setForeground(new java.awt.Color(0, 0, 0));
        dataNama.setText("Nama Lengkap");

        dataNomor.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataNomor.setForeground(new java.awt.Color(0, 0, 0));
        dataNomor.setText("Nomor Pendaftaran");

        dataTanggal.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataTanggal.setForeground(new java.awt.Color(0, 0, 0));
        dataTanggal.setText("Tanggal Lahir");

        dataTelepon.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataTelepon.setForeground(new java.awt.Color(0, 0, 0));
        dataTelepon.setText("Nomor Telepon");

        dataEmail.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataEmail.setForeground(new java.awt.Color(0, 0, 0));
        dataEmail.setText("Email");

        dataAlamat.setEditable(false);
        dataAlamat.setBackground(new java.awt.Color(255, 250, 245));
        dataAlamat.setColumns(20);
        dataAlamat.setFont(new java.awt.Font("SansSerif", 0, 12));
        dataAlamat.setForeground(new java.awt.Color(0, 0, 0));
        dataAlamat.setLineWrap(true);
        dataAlamat.setRows(5);
        dataAlamat.setText("Alamat");

        javax.swing.GroupLayout hasilPageLayout = new javax.swing.GroupLayout(hasilPage);
        hasilPage.setLayout(hasilPageLayout);
        hasilPageLayout.setHorizontalGroup(
            hasilPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hasilPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alamatRumah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hasilPageHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomorPendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alamatEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomorTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataEmail)
                    .addComponent(dataTelepon)
                    .addComponent(dataNomor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataTanggal)
                    .addComponent(dataNama)
                    .addComponent(dataAlamat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hasilPageLayout.setVerticalGroup(
            hasilPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilPageLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(hasilPageHeading)
                .addGap(50, 50, 50)
                .addComponent(namaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNama, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tanggalLahir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomorPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomorTelepon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alamatRumah, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alamatEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataEmail)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(hasilPage, "card2");

        pack();
        setLocationRelativeTo(null);
    }                    

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             

        String namaLengkap = nama.getText();
        String tanggalLahir = tanggal.getText();
        String nomorPendaftaran = nomor.getText();
        String nomorTelepon = telepon.getText();
        String alamatRumah = alamat.getText();
        String alamatEmail = email.getText();

        if (namaLengkap.isEmpty()) {
            alertNama.setForeground(new java.awt.Color(255, 51, 51));
            nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertNama.setForeground(new java.awt.Color(255, 250, 245));
            dataNama.setText(namaLengkap);
        }

        if (tanggalLahir.isEmpty()) {
            alertTanggal.setForeground(new java.awt.Color(255, 51, 51));
            tanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            tanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertTanggal.setForeground(new java.awt.Color(255, 250, 245));
            dataTanggal.setText(tanggalLahir);
        }

        if (nomorPendaftaran.isEmpty()) {
            alertNomor.setForeground(new java.awt.Color(255, 51, 51));
            nomor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            nomor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertNomor.setForeground(new java.awt.Color(255, 250, 245));
            dataNomor.setText(nomorPendaftaran);
        }

        if (nomorTelepon.isEmpty()) {
            alertTelepon.setForeground(new java.awt.Color(255, 51, 51));
            telepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            telepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertTelepon.setForeground(new java.awt.Color(255, 250, 245));
            dataTelepon.setText(nomorTelepon);
        }

        if (alamatRumah.isEmpty()) {
            alertAlamat.setForeground(new java.awt.Color(255, 51, 51));
            alamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            alamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertAlamat.setForeground(new java.awt.Color(255, 250, 245));
            dataAlamat.setText(alamatRumah);
        }

        if (alamatEmail.isEmpty()) {
            alertEmail.setForeground(new java.awt.Color(255, 51, 51));
            email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            alertEmail.setForeground(new java.awt.Color(255, 250, 245));
            dataEmail.setText(alamatEmail);
        }

        if (namaLengkap.isEmpty() || tanggalLahir.isEmpty() || nomorPendaftaran.isEmpty() || nomorTelepon.isEmpty()
                || alamatRumah.isEmpty() || alamatEmail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                formPage.setVisible(false);
                hasilPage.setVisible(true);   
            }
        }
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JTextArea alamat;
    private javax.swing.JLabel alamatEmail;
    private javax.swing.JLabel alamatRumah;
    private javax.swing.JLabel alertAlamat;
    private javax.swing.JLabel alertEmail;
    private javax.swing.JLabel alertNama;
    private javax.swing.JLabel alertNomor;
    private javax.swing.JLabel alertTanggal;
    private javax.swing.JLabel alertTelepon;
    private javax.swing.JTextArea dataAlamat;
    private javax.swing.JLabel dataEmail;
    private javax.swing.JLabel dataNama;
    private javax.swing.JLabel dataNomor;
    private javax.swing.JLabel dataTanggal;
    private javax.swing.JLabel dataTelepon;
    private javax.swing.JTextField email;
    private javax.swing.JPanel formPage;
    private javax.swing.JLabel formPageHeading;
    private javax.swing.JPanel hasilPage;
    private javax.swing.JLabel hasilPageHeading;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNomor;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTelepon;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel namaLengkap;
    private javax.swing.JTextField nomor;
    private javax.swing.JLabel nomorPendaftaran;
    private javax.swing.JLabel nomorTelepon;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField tanggal;
    private javax.swing.JLabel tanggalLahir;
    private javax.swing.JTextField telepon;               
}