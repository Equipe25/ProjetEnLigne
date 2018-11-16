package amzevent.UI;
import amzevent.Domaine.LarmanController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame
{
    public LarmanController larmanController;
    private CameraHandler cameraHandler;
    
    public MainWindow()
    {
        initComponents();
        
        this.setFocusable(true);
        cameraHandler = new CameraHandler(this);
        this.addMouseWheelListener(cameraHandler);
        this.addKeyListener(cameraHandler);
        
        larmanController = new LarmanController();
        
        drawingPanel.setMainWindow(this);
        updateMenuFields();
    }
    
    public void PlanSalleUpdated()
    {
        dessinerPlanSalle();
    }
    
    private void dessinerPlanSalle() {
        updateMenuFields();
        drawingPanel.repaint();
    }
    
    private void updateMenuFields() {
        updateSalleFields();
        updateSceneFields();
        updateSectionFields();
        
    }
    
    private void updateSalleFields() {
        salleNomField.setText(larmanController.getSalleNom());
        salleLargeurField.setText(Float.toString(larmanController.getSalleDimension().x));
        salleProfondeurField.setText(Float.toString(larmanController.getSalleDimension().y));
        salleEspaceVitalLargeurField.setText(Float.toString(larmanController.getSalleEspaceVital().x));
        salleEspaceVitalProfondeurField.setText(Float.toString(larmanController.getSalleEspaceVital().y));
    }
    
    private void updateSceneFields() {
        sceneLargeurField.setText(Float.toString(larmanController.getSceneDimension().x));
        sceneProfondeurField.setText(Float.toString(larmanController.getSceneDimension().y));
        scenePositionXField.setText(Float.toString(larmanController.getScenePosition().x));
        scenePositionYField.setText(Float.toString(larmanController.getScenePosition().y));
        sceneOrientationField.setText(Float.toString(larmanController.getSceneOrientation()));
    }
    private void updateSectionFields() {
        
    }
    
    public int getDrawingPanelWidth()
    {
        return drawingPanel.getWidth();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        sallePanel = new javax.swing.JPanel();
        salleLargeurLabel = new javax.swing.JLabel();
        salleLargeurField = new javax.swing.JTextField();
        salleProfondeurLabel = new javax.swing.JLabel();
        salleProfondeurField = new javax.swing.JTextField();
        salleEspaceVitalPanel = new javax.swing.JPanel();
        salleEspaceVitalProfondeurLabel = new javax.swing.JLabel();
        salleEspaceVitalLargeurLabel = new javax.swing.JLabel();
        salleEspaceVitalLargeurField = new javax.swing.JTextField();
        salleEspaceVitalProfondeurField = new javax.swing.JTextField();
        salleNomLabel = new javax.swing.JLabel();
        salleNomField = new javax.swing.JTextField();
        scenePanel = new javax.swing.JPanel();
        sceneLargeurLabel = new javax.swing.JLabel();
        sceneLargeurField = new javax.swing.JTextField();
        sceneProfondeurLabel = new javax.swing.JLabel();
        sceneProfondeurField = new javax.swing.JTextField();
        scenePositionXLabel = new javax.swing.JLabel();
        scenePositionXField = new javax.swing.JTextField();
        scenePositionYLabel = new javax.swing.JLabel();
        scenePositionYField = new javax.swing.JTextField();
        sceneOrientationLabel = new javax.swing.JLabel();
        sceneOrientationField = new javax.swing.JTextField();
        sectionPanel = new javax.swing.JPanel();
        sectionNomLabel = new javax.swing.JLabel();
        sectionNomField = new javax.swing.JTextField();
        sectionColonnesLabel = new javax.swing.JLabel();
        sectionColonnesField = new javax.swing.JTextField();
        sectionRangeesLabel = new javax.swing.JLabel();
        sectionRangeesField = new javax.swing.JTextField();
        sectionPositionXLabel = new javax.swing.JLabel();
        sectionPositionXField = new javax.swing.JTextField();
        sectionPositionYLabel = new javax.swing.JLabel();
        sectionPositionYField = new javax.swing.JTextField();
        sectionOrientationLabel = new javax.swing.JLabel();
        sectionOrientationField = new javax.swing.JTextField();
        sectionElevationLabel = new javax.swing.JLabel();
        sectionElevationField = new javax.swing.JTextField();
        sectionDistributionSiege = new java.awt.Checkbox();
        sectionEspaceVitalPanel = new javax.swing.JPanel();
        sectionEspaceVitalProfondeurLabel = new javax.swing.JLabel();
        sectionEspaceVitalProfondeurField = new javax.swing.JTextField();
        sectionEspaceVitalLargeurLabel = new javax.swing.JLabel();
        sectionEspaceVitalLargeurField = new javax.swing.JTextField();
        offrePanel = new javax.swing.JPanel();
        sectionNomField1 = new javax.swing.JTextField();
        sectionNomLabel1 = new javax.swing.JLabel();
        sectionNomLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sectionsPanel = new javax.swing.JScrollPane();
        sectionList = new javax.swing.JList<>();
        offresPanel = new javax.swing.JScrollPane();
        offreList = new javax.swing.JList<>();
        drawingPanel = new amzevent.UI.DrawingPanel();
        topMenuBar = new javax.swing.JMenuBar();
        planDeSalleMenu = new javax.swing.JMenu();
        nouveauButton = new javax.swing.JMenuItem();
        ouvrirButton = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sauvegarderButton = new javax.swing.JMenuItem();
        exporterButton = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        quitButton = new javax.swing.JMenuItem();
        EditionMenu = new javax.swing.JMenu();
        annulerButton = new javax.swing.JMenuItem();
        repeterButton = new javax.swing.JMenuItem();
        creerUneSectionMenu = new javax.swing.JMenu();
        assiseButton = new javax.swing.JMenuItem();
        admissionGeneralButton = new javax.swing.JMenuItem();
        prixMenu = new javax.swing.JMenu();
        assignationButton = new javax.swing.JMenuItem();
        automatiqueButton = new javax.swing.JMenuItem();
        offreMenu = new javax.swing.JMenu();
        creerOffreButton = new javax.swing.JMenuItem();
        consulterOffreButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sallePanel.setBackground(new java.awt.Color(255, 255, 255));
        sallePanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salleLargeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salleLargeurLabel.setText("Largeur :");

        salleLargeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleLargeurFieldActionPerformed(evt);
            }
        });

        salleProfondeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salleProfondeurLabel.setText("Profondeur :");

        salleProfondeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleProfondeurFieldActionPerformed(evt);
            }
        });

        salleEspaceVitalPanel.setBackground(new java.awt.Color(255, 255, 255));
        salleEspaceVitalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espace vital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        salleEspaceVitalProfondeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salleEspaceVitalProfondeurLabel.setText("Profondeur :");

        salleEspaceVitalLargeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salleEspaceVitalLargeurLabel.setText("Largeur :");

        salleEspaceVitalLargeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleEspaceVitalLargeurFieldActionPerformed(evt);
            }
        });

        salleEspaceVitalProfondeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleEspaceVitalProfondeurFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salleEspaceVitalPanelLayout = new javax.swing.GroupLayout(salleEspaceVitalPanel);
        salleEspaceVitalPanel.setLayout(salleEspaceVitalPanelLayout);
        salleEspaceVitalPanelLayout.setHorizontalGroup(
            salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salleEspaceVitalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salleEspaceVitalLargeurLabel)
                    .addComponent(salleEspaceVitalLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salleEspaceVitalProfondeurLabel)
                    .addComponent(salleEspaceVitalProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        salleEspaceVitalPanelLayout.setVerticalGroup(
            salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salleEspaceVitalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleEspaceVitalLargeurLabel)
                    .addComponent(salleEspaceVitalProfondeurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(salleEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleEspaceVitalLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salleEspaceVitalProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        salleNomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salleNomLabel.setText("Nom :");

        salleNomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleNomFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sallePanelLayout = new javax.swing.GroupLayout(sallePanel);
        sallePanel.setLayout(sallePanelLayout);
        sallePanelLayout.setHorizontalGroup(
            sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sallePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sallePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sallePanelLayout.createSequentialGroup()
                                .addComponent(salleLargeurLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salleProfondeurLabel)
                                .addGap(66, 66, 66))
                            .addGroup(sallePanelLayout.createSequentialGroup()
                                .addComponent(salleLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salleProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(sallePanelLayout.createSequentialGroup()
                        .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salleEspaceVitalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sallePanelLayout.createSequentialGroup()
                                .addComponent(salleNomLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salleNomField)))
                        .addContainerGap())))
        );
        sallePanelLayout.setVerticalGroup(
            sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sallePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleNomLabel)
                    .addComponent(salleNomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleLargeurLabel)
                    .addComponent(salleProfondeurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salleProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(salleEspaceVitalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Salle", sallePanel);

        scenePanel.setBackground(new java.awt.Color(255, 255, 255));
        scenePanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sceneLargeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sceneLargeurLabel.setText("Largeur :");

        sceneLargeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceneLargeurFieldActionPerformed(evt);
            }
        });

        sceneProfondeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sceneProfondeurLabel.setText("Profondeur :");

        sceneProfondeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceneProfondeurFieldActionPerformed(evt);
            }
        });

        scenePositionXLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scenePositionXLabel.setText("Position X :");

        scenePositionXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scenePositionXFieldActionPerformed(evt);
            }
        });

        scenePositionYLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scenePositionYLabel.setText("Position Y :");

        scenePositionYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scenePositionYFieldActionPerformed(evt);
            }
        });

        sceneOrientationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sceneOrientationLabel.setText("Orientation :");

        sceneOrientationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceneOrientationFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scenePanelLayout = new javax.swing.GroupLayout(scenePanel);
        scenePanel.setLayout(scenePanelLayout);
        scenePanelLayout.setHorizontalGroup(
            scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scenePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scenePanelLayout.createSequentialGroup()
                        .addComponent(sceneOrientationLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(scenePanelLayout.createSequentialGroup()
                        .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sceneOrientationField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(sceneLargeurLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sceneLargeurField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scenePositionXLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scenePositionXField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sceneProfondeurLabel)
                            .addComponent(sceneProfondeurField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(scenePositionYLabel)
                            .addComponent(scenePositionYField))
                        .addGap(44, 44, 44))))
        );
        scenePanelLayout.setVerticalGroup(
            scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scenePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sceneLargeurLabel)
                    .addComponent(sceneProfondeurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sceneLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sceneProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scenePositionXLabel)
                    .addComponent(scenePositionYLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scenePositionXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scenePositionYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sceneOrientationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sceneOrientationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Scène", scenePanel);

        sectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        sectionPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sectionNomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionNomLabel.setText("Nom :");

        sectionNomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionNomFieldActionPerformed(evt);
            }
        });

        sectionColonnesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionColonnesLabel.setText("Colonnes :");

        sectionRangeesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionRangeesLabel.setText("Rangées :");

        sectionPositionXLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionPositionXLabel.setText("Position X :");

        sectionPositionYLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionPositionYLabel.setText("Position Y :");

        sectionOrientationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionOrientationLabel.setText("Orientation :");

        sectionElevationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionElevationLabel.setText("Élévation :");

        sectionDistributionSiege.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sectionDistributionSiege.setLabel("Redistribution automatique des sièges");

        sectionEspaceVitalPanel.setBackground(new java.awt.Color(255, 255, 255));
        sectionEspaceVitalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espace vital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        sectionEspaceVitalProfondeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionEspaceVitalProfondeurLabel.setText("Profondeur :");

        sectionEspaceVitalProfondeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionEspaceVitalProfondeurFieldActionPerformed(evt);
            }
        });

        sectionEspaceVitalLargeurLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionEspaceVitalLargeurLabel.setText("Largeur :");

        sectionEspaceVitalLargeurField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionEspaceVitalLargeurFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sectionEspaceVitalPanelLayout = new javax.swing.GroupLayout(sectionEspaceVitalPanel);
        sectionEspaceVitalPanel.setLayout(sectionEspaceVitalPanelLayout);
        sectionEspaceVitalPanelLayout.setHorizontalGroup(
            sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionEspaceVitalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionEspaceVitalLargeurLabel)
                    .addComponent(sectionEspaceVitalLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionEspaceVitalProfondeurLabel)
                    .addComponent(sectionEspaceVitalProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        sectionEspaceVitalPanelLayout.setVerticalGroup(
            sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionEspaceVitalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionEspaceVitalLargeurLabel)
                    .addComponent(sectionEspaceVitalProfondeurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sectionEspaceVitalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionEspaceVitalLargeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionEspaceVitalProfondeurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sectionPanelLayout = new javax.swing.GroupLayout(sectionPanel);
        sectionPanel.setLayout(sectionPanelLayout);
        sectionPanelLayout.setHorizontalGroup(
            sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionPositionXLabel)
                            .addComponent(sectionPositionXField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionPositionYLabel)
                            .addComponent(sectionPositionYField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sectionPanelLayout.createSequentialGroup()
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionOrientationLabel)
                            .addComponent(sectionOrientationField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionElevationLabel)
                            .addComponent(sectionElevationField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionNomLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionNomField))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionColonnesLabel)
                            .addComponent(sectionColonnesField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionRangeesLabel)
                            .addComponent(sectionRangeesField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sectionEspaceVitalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sectionPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sectionDistributionSiege, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        sectionPanelLayout.setVerticalGroup(
            sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionNomLabel)
                    .addComponent(sectionNomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionColonnesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionColonnesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionRangeesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionRangeesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionPositionXLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionPositionXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionPositionYLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionPositionYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionOrientationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionOrientationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(sectionElevationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionElevationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(sectionDistributionSiege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectionEspaceVitalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Section", sectionPanel);

        offrePanel.setBackground(new java.awt.Color(255, 255, 255));
        offrePanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sectionNomField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionNomField1ActionPerformed(evt);
            }
        });

        sectionNomLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionNomLabel1.setText("Nom :");

        sectionNomLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sectionNomLabel2.setText("Rabais % :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Appliquer");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout offrePanelLayout = new javax.swing.GroupLayout(offrePanel);
        offrePanel.setLayout(offrePanelLayout);
        offrePanelLayout.setHorizontalGroup(
            offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionNomLabel2)
                    .addComponent(sectionNomLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectionNomField1)
                    .addGroup(offrePanelLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(offrePanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        offrePanelLayout.setVerticalGroup(
            offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionNomLabel1)
                    .addComponent(sectionNomField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionNomLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(offrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Offre", offrePanel);

        sectionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        sectionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sections", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        sectionList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sectionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "section1", "section2", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sectionsPanel.setViewportView(sectionList);

        offresPanel.setBackground(new java.awt.Color(255, 255, 255));
        offresPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        offreList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        offreList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Offre1", "Offre2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        offresPanel.setViewportView(offreList);

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        planDeSalleMenu.setText("Plan de salle");

        nouveauButton.setText("Nouveau");
        nouveauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauButtonActionPerformed(evt);
            }
        });
        planDeSalleMenu.add(nouveauButton);

        ouvrirButton.setText("Ouvrir");
        planDeSalleMenu.add(ouvrirButton);
        planDeSalleMenu.add(jSeparator1);

        sauvegarderButton.setText("Sauvegarder");
        planDeSalleMenu.add(sauvegarderButton);

        exporterButton.setText("Exporter");
        planDeSalleMenu.add(exporterButton);
        planDeSalleMenu.add(jSeparator2);

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        planDeSalleMenu.add(quitButton);

        topMenuBar.add(planDeSalleMenu);

        EditionMenu.setText("Édition");

        annulerButton.setText("Annuler");
        EditionMenu.add(annulerButton);

        repeterButton.setText("Répéter");
        EditionMenu.add(repeterButton);

        topMenuBar.add(EditionMenu);

        creerUneSectionMenu.setText("Créer une section");
        creerUneSectionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creerUneSectionMenuMouseClicked(evt);
            }
        });
        creerUneSectionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerUneSectionMenuActionPerformed(evt);
            }
        });

        assiseButton.setText("Assise");
        creerUneSectionMenu.add(assiseButton);

        admissionGeneralButton.setText("Admission générale");
        creerUneSectionMenu.add(admissionGeneralButton);

        topMenuBar.add(creerUneSectionMenu);

        prixMenu.setText("Prix");

        assignationButton.setText("Assignation");
        prixMenu.add(assignationButton);

        automatiqueButton.setText("Automatique");
        prixMenu.add(automatiqueButton);

        topMenuBar.add(prixMenu);

        offreMenu.setText("Offre");

        creerOffreButton.setText("Créer une nouvelle offre");
        offreMenu.add(creerOffreButton);

        consulterOffreButton.setText("Consulter les offres");
        offreMenu.add(consulterOffreButton);

        topMenuBar.add(offreMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(offresPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Salle");
        jTabbedPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void salleEspaceVitalLargeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleEspaceVitalLargeurFieldActionPerformed
        larmanController.setSalleEspaceVital(Float.parseFloat(evt.getActionCommand()), larmanController.getSalleEspaceVital().y);
        dessinerPlanSalle();
    }//GEN-LAST:event_salleEspaceVitalLargeurFieldActionPerformed

    private void salleEspaceVitalProfondeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleEspaceVitalProfondeurFieldActionPerformed
        larmanController.setSalleEspaceVital(larmanController.getSalleEspaceVital().x, Float.parseFloat(evt.getActionCommand()));
        dessinerPlanSalle();
    }//GEN-LAST:event_salleEspaceVitalProfondeurFieldActionPerformed

    private void sceneLargeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceneLargeurFieldActionPerformed
        larmanController.setSceneDimension(Float.parseFloat(evt.getActionCommand()), larmanController.getSceneDimension().y);
        dessinerPlanSalle();
    }//GEN-LAST:event_sceneLargeurFieldActionPerformed

    private void sceneProfondeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceneProfondeurFieldActionPerformed
        larmanController.setSceneDimension(larmanController.getSceneDimension().x, Float.parseFloat(evt.getActionCommand()));
        dessinerPlanSalle();
    }//GEN-LAST:event_sceneProfondeurFieldActionPerformed

    private void scenePositionXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scenePositionXFieldActionPerformed
        larmanController.setScenePosition(Float.parseFloat(evt.getActionCommand()), larmanController.getScenePosition().y);
        dessinerPlanSalle();
    }//GEN-LAST:event_scenePositionXFieldActionPerformed

    private void scenePositionYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scenePositionYFieldActionPerformed
        larmanController.setScenePosition(larmanController.getScenePosition().x, Float.parseFloat(evt.getActionCommand()));
        dessinerPlanSalle();
    }//GEN-LAST:event_scenePositionYFieldActionPerformed

    private void sceneOrientationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceneOrientationFieldActionPerformed
        larmanController.setSceneOrientation(Float.parseFloat(evt.getActionCommand()));
        dessinerPlanSalle();
    }//GEN-LAST:event_sceneOrientationFieldActionPerformed

    private void salleProfondeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleProfondeurFieldActionPerformed
        larmanController.setSalleDimension(larmanController.getSalleDimension().x, Float.parseFloat(evt.getActionCommand()));
        dessinerPlanSalle();
    }//GEN-LAST:event_salleProfondeurFieldActionPerformed

    private void salleLargeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleLargeurFieldActionPerformed
        larmanController.setSalleDimension(Float.parseFloat(evt.getActionCommand()), larmanController.getSalleDimension().y);
        dessinerPlanSalle();
    }//GEN-LAST:event_salleLargeurFieldActionPerformed

    private void sectionNomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionNomFieldActionPerformed

    }//GEN-LAST:event_sectionNomFieldActionPerformed

    private void sectionEspaceVitalProfondeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionEspaceVitalProfondeurFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionEspaceVitalProfondeurFieldActionPerformed

    private void sectionEspaceVitalLargeurFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionEspaceVitalLargeurFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionEspaceVitalLargeurFieldActionPerformed

    private void sectionNomField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionNomField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionNomField1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nouveauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauButtonActionPerformed

    }//GEN-LAST:event_nouveauButtonActionPerformed

    private void salleNomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleNomFieldActionPerformed
        larmanController.setSalleNom(evt.getActionCommand());
        dessinerPlanSalle();
    }//GEN-LAST:event_salleNomFieldActionPerformed

    private void creerUneSectionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerUneSectionMenuActionPerformed

    }//GEN-LAST:event_creerUneSectionMenuActionPerformed

    private void creerUneSectionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerUneSectionMenuMouseClicked
        //drawingPanel.add(new DrawRect());
        //drawingPanel.revalidate();
        //drawingPanel.repaint(); // to repaint the components    
       // drawingPanel.add(new DrawRect());
        /* Graphics2D g2d = (Graphics2D)g;
         g2d.draw(rect);
         g2d.fill(rect);
        
         g2d.setColor(Color.GREEN);
        
         g2d.draw(rect);
         drawingPanel.add(new Rectangle(500, 500, 15, 200));
       drawingPanel.repaint();
       */
       DrawRect rect = new DrawRect();
       drawingPanel.add(rect);
       drawingPanel.repaint();

    }//GEN-LAST:event_creerUneSectionMenuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditionMenu;
    private javax.swing.JMenuItem admissionGeneralButton;
    private javax.swing.JMenuItem annulerButton;
    private javax.swing.JMenuItem assignationButton;
    private javax.swing.JMenuItem assiseButton;
    private javax.swing.JMenuItem automatiqueButton;
    private javax.swing.JMenuItem consulterOffreButton;
    private javax.swing.JMenuItem creerOffreButton;
    private javax.swing.JMenu creerUneSectionMenu;
    private amzevent.UI.DrawingPanel drawingPanel;
    private javax.swing.JMenuItem exporterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem nouveauButton;
    private javax.swing.JList<String> offreList;
    private javax.swing.JMenu offreMenu;
    private javax.swing.JPanel offrePanel;
    private javax.swing.JScrollPane offresPanel;
    private javax.swing.JMenuItem ouvrirButton;
    private javax.swing.JMenu planDeSalleMenu;
    private javax.swing.JMenu prixMenu;
    private javax.swing.JMenuItem quitButton;
    private javax.swing.JMenuItem repeterButton;
    private javax.swing.JTextField salleEspaceVitalLargeurField;
    private javax.swing.JLabel salleEspaceVitalLargeurLabel;
    private javax.swing.JPanel salleEspaceVitalPanel;
    private javax.swing.JTextField salleEspaceVitalProfondeurField;
    private javax.swing.JLabel salleEspaceVitalProfondeurLabel;
    private javax.swing.JTextField salleLargeurField;
    private javax.swing.JLabel salleLargeurLabel;
    private javax.swing.JTextField salleNomField;
    private javax.swing.JLabel salleNomLabel;
    private javax.swing.JPanel sallePanel;
    private javax.swing.JTextField salleProfondeurField;
    private javax.swing.JLabel salleProfondeurLabel;
    private javax.swing.JMenuItem sauvegarderButton;
    private javax.swing.JTextField sceneLargeurField;
    private javax.swing.JLabel sceneLargeurLabel;
    private javax.swing.JTextField sceneOrientationField;
    private javax.swing.JLabel sceneOrientationLabel;
    private javax.swing.JPanel scenePanel;
    private javax.swing.JTextField scenePositionXField;
    private javax.swing.JLabel scenePositionXLabel;
    private javax.swing.JTextField scenePositionYField;
    private javax.swing.JLabel scenePositionYLabel;
    private javax.swing.JTextField sceneProfondeurField;
    private javax.swing.JLabel sceneProfondeurLabel;
    private javax.swing.JTextField sectionColonnesField;
    private javax.swing.JLabel sectionColonnesLabel;
    private java.awt.Checkbox sectionDistributionSiege;
    private javax.swing.JTextField sectionElevationField;
    private javax.swing.JLabel sectionElevationLabel;
    private javax.swing.JTextField sectionEspaceVitalLargeurField;
    private javax.swing.JLabel sectionEspaceVitalLargeurLabel;
    private javax.swing.JPanel sectionEspaceVitalPanel;
    private javax.swing.JTextField sectionEspaceVitalProfondeurField;
    private javax.swing.JLabel sectionEspaceVitalProfondeurLabel;
    private javax.swing.JList<String> sectionList;
    private javax.swing.JTextField sectionNomField;
    private javax.swing.JTextField sectionNomField1;
    private javax.swing.JLabel sectionNomLabel;
    private javax.swing.JLabel sectionNomLabel1;
    private javax.swing.JLabel sectionNomLabel2;
    private javax.swing.JTextField sectionOrientationField;
    private javax.swing.JLabel sectionOrientationLabel;
    private javax.swing.JPanel sectionPanel;
    private javax.swing.JTextField sectionPositionXField;
    private javax.swing.JLabel sectionPositionXLabel;
    private javax.swing.JTextField sectionPositionYField;
    private javax.swing.JLabel sectionPositionYLabel;
    private javax.swing.JTextField sectionRangeesField;
    private javax.swing.JLabel sectionRangeesLabel;
    private javax.swing.JScrollPane sectionsPanel;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables

    private class DrawRect extends JPanel implements MouseListener,
            MouseMotionListener {

        //Coordonnée Click
        private int x1;
        private int y1;
        
        //Coordonnée Drag
        private int x2;
        private int y2;
        
        public DrawRect() {
            addMouseListener(this);
            addMouseMotionListener(this);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
             // DRAWING CODE HERE
            g.setColor(Color.blue);
            g.fillRect(x1, y1, x2, y2);
            Graphics2D g2d = (Graphics2D)g;
            Rectangle rect = new Rectangle(100,200,100,300);
            //g2d.rotate(Math.toRadians(larmanController.getSceneOrientation()),
            //                      (int)(larmanController.getScenePosition().x + width / 2.0f) ,
            //                      (int)(larmanController.getScenePosition().y + height / 2.0f));
            g2d.draw(rect);
            g2d.fill(rect);
            g2d.setColor(Color.GREEN);
            g2d.draw(rect);
            
        }
        public void mousePressed(MouseEvent e) {
            x1 = 45;//e.getX();
            y1 = 420;//e.getY();
            x2 = 420;//0;
            y2 = 45;//0;
        }

        public void mouseReleased(MouseEvent e) {
        }
        public void mouseDragged(MouseEvent e) {
            x2 = e.getX() - x1;
            y2 = e.getY() - y1;
            repaint();
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mouseClicked(MouseEvent e) {
        }
        public void mouseMoved(MouseEvent e) {
        }

    }

}
