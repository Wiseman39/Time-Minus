
package timeMinusMain;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin
 */
public class frmTimeMinus extends javax.swing.JFrame {
    
    /**
     * Creates new form frmTimeMinus
     */
    public frmTimeMinus() {
        initComponents();
        screen_Login.setFocusable(true);
        parentPanel.removeAll();
        parentPanel.add(screen_Login);
        parentPanel.repaint();
        parentPanel.revalidate();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        screen_Login = new javax.swing.JPanel();
        login_AppName = new javax.swing.JLabel();
        login_Logo = new javax.swing.JLabel();
        login_detailsPanel = new javax.swing.JPanel();
        login_detailsHeader = new javax.swing.JLabel();
        login_Username = new javax.swing.JTextField();
        login_Password = new javax.swing.JTextField();
        login_RememberDetails = new javax.swing.JCheckBox();
        login_Button = new javax.swing.JButton();
        login_ExtraPanel = new javax.swing.JPanel();
        login_ForgottenLink = new javax.swing.JLabel();
        login_CookiesLink = new javax.swing.JLabel();
        login_Background = new javax.swing.JLabel();
        screen_studentMain = new javax.swing.JPanel();
        main_BackButton = new javax.swing.JButton();
        main_WelcomeBackMessage = new javax.swing.JLabel();
        main_NextClassLabel = new javax.swing.JPanel();
        main_NextClassHeader = new javax.swing.JLabel();
        main_NextClassNameCode = new javax.swing.JLabel();
        main_nextClassDuration = new javax.swing.JLabel();
        main_NextClassesButton = new javax.swing.JButton();
        main_NavToClassButton = new javax.swing.JButton();
        main_NavigateButton = new javax.swing.JButton();
        main_ChatButton = new javax.swing.JButton();
        main_CalendarScrollPane = new javax.swing.JScrollPane();
        main_CalendarEvents = new javax.swing.JTable();
        main_CalendarButton = new javax.swing.JButton();
        screen_studentSchedule = new javax.swing.JPanel();
        sSchedule_Banner = new javax.swing.JPanel();
        sSchedule_BannerText = new javax.swing.JLabel();
        sSchedule_BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sSchedule_scheduleTable = new javax.swing.JTable();
        screen_StudentCalendar = new javax.swing.JPanel();
        screen_ChatMenu = new javax.swing.JPanel();
        screen_ChatRoom = new javax.swing.JPanel();
        screen_NavMenu = new javax.swing.JPanel();
        screen_NavDirections = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(750, 200, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        screen_Login.setBackground(new java.awt.Color(0, 0, 255));
        screen_Login.setLayout(null);

        login_AppName.setBackground(new java.awt.Color(255, 255, 255));
        login_AppName.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        login_AppName.setForeground(new java.awt.Color(255, 255, 255));
        login_AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_AppName.setText("Time - Minus");
        screen_Login.add(login_AppName);
        login_AppName.setBounds(6, 105, 354, 44);

        login_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pearsonLogoResized.png"))); // NOI18N
        screen_Login.add(login_Logo);
        login_Logo.setBounds(6, 27, 200, 60);

        login_detailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        login_detailsHeader.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        login_detailsHeader.setForeground(new java.awt.Color(0, 0, 0));
        login_detailsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_detailsHeader.setText("Please enter your login details below:");

        login_Username.setBackground(new java.awt.Color(255, 255, 255));
        login_Username.setForeground(new java.awt.Color(153, 153, 153));
        login_Username.setText("Student ID / Pearson Email");
        login_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_UsernameFocusLost(evt);
            }
        });

        login_Password.setBackground(new java.awt.Color(255, 255, 255));
        login_Password.setForeground(new java.awt.Color(153, 153, 153));
        login_Password.setText("Password");
        login_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_PasswordFocusLost(evt);
            }
        });

        login_RememberDetails.setText("Remember Me");

        login_Button.setBackground(new java.awt.Color(12, 89, 207));
        login_Button.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        login_Button.setForeground(new java.awt.Color(255, 255, 255));
        login_Button.setText("Log In");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_detailsPanelLayout = new javax.swing.GroupLayout(login_detailsPanel);
        login_detailsPanel.setLayout(login_detailsPanelLayout);
        login_detailsPanelLayout.setHorizontalGroup(
            login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_Password)
                    .addComponent(login_detailsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_Username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_detailsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(login_RememberDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        login_detailsPanelLayout.setVerticalGroup(
            login_detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_detailsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(login_detailsHeader)
                .addGap(18, 18, 18)
                .addComponent(login_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(login_RememberDetails)
                .addGap(27, 27, 27)
                .addComponent(login_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        screen_Login.add(login_detailsPanel);
        login_detailsPanel.setBounds(26, 155, 313, 310);

        login_ExtraPanel.setBackground(new java.awt.Color(255, 255, 255));

        login_ForgottenLink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        login_ForgottenLink.setForeground(new java.awt.Color(20, 100, 246));
        login_ForgottenLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_ForgottenLink.setText("Forgotten username or Password");

        login_CookiesLink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        login_CookiesLink.setForeground(new java.awt.Color(20, 100, 246));
        login_CookiesLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_CookiesLink.setText("Cookies must be enabled in your browser");

        javax.swing.GroupLayout login_ExtraPanelLayout = new javax.swing.GroupLayout(login_ExtraPanel);
        login_ExtraPanel.setLayout(login_ExtraPanelLayout);
        login_ExtraPanelLayout.setHorizontalGroup(
            login_ExtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_ExtraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_ExtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_ForgottenLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_CookiesLink, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        login_ExtraPanelLayout.setVerticalGroup(
            login_ExtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_ExtraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_ForgottenLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_CookiesLink)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        screen_Login.add(login_ExtraPanel);
        login_ExtraPanel.setBounds(0, 570, 360, 79);

        login_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginBackgroundResized.jpg"))); // NOI18N
        screen_Login.add(login_Background);
        login_Background.setBounds(0, 0, 360, 640);

        parentPanel.add(screen_Login, "card2");

        screen_studentMain.setBackground(new java.awt.Color(255, 255, 255));
        screen_studentMain.setPreferredSize(new java.awt.Dimension(360, 640));

        main_BackButton.setBackground(new java.awt.Color(255, 255, 255));
        main_BackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        main_BackButton.setForeground(new java.awt.Color(0, 0, 0));
        main_BackButton.setText("< Back");
        main_BackButton.setPreferredSize(new java.awt.Dimension(90, 40));
        main_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_BackButtonActionPerformed(evt);
            }
        });

        main_WelcomeBackMessage.setBackground(new java.awt.Color(0, 0, 0));
        main_WelcomeBackMessage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_WelcomeBackMessage.setForeground(new java.awt.Color(0, 0, 0));
        main_WelcomeBackMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_WelcomeBackMessage.setText("Welcome Back USER_NAME USER_SURNAME");
        main_WelcomeBackMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        main_NextClassLabel.setBackground(new java.awt.Color(2, 31, 84));
        main_NextClassLabel.setLayout(null);

        main_NextClassHeader.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_NextClassHeader.setForeground(new java.awt.Color(255, 255, 255));
        main_NextClassHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_NextClassHeader.setText("Your next class:");
        main_NextClassLabel.add(main_NextClassHeader);
        main_NextClassHeader.setBounds(6, 6, 340, 19);

        main_NextClassNameCode.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        main_NextClassNameCode.setForeground(new java.awt.Color(255, 255, 255));
        main_NextClassNameCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_NextClassNameCode.setText("CLASS_NAME — CLASS_CODE");
        main_NextClassLabel.add(main_NextClassNameCode);
        main_NextClassNameCode.setBounds(10, 40, 320, 19);

        main_nextClassDuration.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        main_nextClassDuration.setForeground(new java.awt.Color(255, 255, 255));
        main_nextClassDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main_nextClassDuration.setText("Duration : START_TIME — END_TIME");
        main_NextClassLabel.add(main_nextClassDuration);
        main_nextClassDuration.setBounds(10, 70, 320, 19);

        main_NextClassesButton.setBackground(new java.awt.Color(2, 31, 84));
        main_NextClassesButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_NextClassesButton.setForeground(new java.awt.Color(255, 255, 255));
        main_NextClassesButton.setText(">");
        main_NextClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_NextClassesButtonActionPerformed(evt);
            }
        });
        main_NextClassLabel.add(main_NextClassesButton);
        main_NextClassesButton.setBounds(300, 0, 38, 32);

        main_NavToClassButton.setBackground(new java.awt.Color(2, 31, 84));
        main_NavToClassButton.setForeground(new java.awt.Color(255, 255, 255));
        main_NavToClassButton.setText("Navigate to Class");

        main_NavigateButton.setBackground(new java.awt.Color(2, 31, 84));
        main_NavigateButton.setForeground(new java.awt.Color(255, 255, 255));
        main_NavigateButton.setText("Find a Specific venue");

        main_ChatButton.setBackground(new java.awt.Color(2, 31, 84));
        main_ChatButton.setForeground(new java.awt.Color(255, 255, 255));
        main_ChatButton.setText("Chat with an SRC member or Lecturer");

        main_CalendarEvents.setBackground(new java.awt.Color(2, 31, 84));
        main_CalendarEvents.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        main_CalendarEvents.setForeground(new java.awt.Color(255, 255, 255));
        main_CalendarEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"19 Feb: Career Expo in Cafeteria"},
                {"20 Feb: ITMP221 CAS Presentation"},
                {"23 Feb: ITSP200: Feedback Session"},
                {"3 Mar: ITDA211 Take Home Test 2"},
                {"x Month: ?????????????????????????????????????????????"}
            },
            new String [] {
                "Upcomming Events"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        main_CalendarEvents.setFocusable(false);
        main_CalendarEvents.setGridColor(new java.awt.Color(255, 255, 255));
        main_CalendarEvents.setRowHeight(50);
        main_CalendarEvents.setRowSelectionAllowed(false);
        main_CalendarEvents.getTableHeader().setResizingAllowed(false);
        main_CalendarEvents.getTableHeader().setReorderingAllowed(false);
        main_CalendarScrollPane.setViewportView(main_CalendarEvents);

        main_CalendarButton.setBackground(new java.awt.Color(2, 31, 84));
        main_CalendarButton.setForeground(new java.awt.Color(255, 255, 255));
        main_CalendarButton.setText("Open Calendar View");

        javax.swing.GroupLayout screen_studentMainLayout = new javax.swing.GroupLayout(screen_studentMain);
        screen_studentMain.setLayout(screen_studentMainLayout);
        screen_studentMainLayout.setHorizontalGroup(
            screen_studentMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen_studentMainLayout.createSequentialGroup()
                .addGroup(screen_studentMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen_studentMainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(screen_studentMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(main_NavigateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(main_ChatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(screen_studentMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(screen_studentMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(main_CalendarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(main_NextClassLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(main_CalendarScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screen_studentMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(main_WelcomeBackMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(screen_studentMainLayout.createSequentialGroup()
                                .addComponent(main_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(screen_studentMainLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(main_NavToClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen_studentMainLayout.setVerticalGroup(
            screen_studentMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen_studentMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_WelcomeBackMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_NextClassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(main_NavToClassButton)
                .addGap(18, 18, 18)
                .addComponent(main_CalendarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_CalendarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(main_NavigateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(main_ChatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(main_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        parentPanel.add(screen_studentMain, "card3");

        screen_studentSchedule.setBackground(new java.awt.Color(255, 255, 255));
        screen_studentSchedule.setMaximumSize(new java.awt.Dimension(360, 640));

        sSchedule_Banner.setBackground(new java.awt.Color(2, 31, 84));

        sSchedule_BannerText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sSchedule_BannerText.setForeground(new java.awt.Color(255, 255, 255));
        sSchedule_BannerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sSchedule_BannerText.setText("Your Schedule for the day");

        javax.swing.GroupLayout sSchedule_BannerLayout = new javax.swing.GroupLayout(sSchedule_Banner);
        sSchedule_Banner.setLayout(sSchedule_BannerLayout);
        sSchedule_BannerLayout.setHorizontalGroup(
            sSchedule_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sSchedule_BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sSchedule_BannerText, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        sSchedule_BannerLayout.setVerticalGroup(
            sSchedule_BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sSchedule_BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sSchedule_BannerText, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        sSchedule_BackButton.setBackground(new java.awt.Color(255, 255, 255));
        sSchedule_BackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sSchedule_BackButton.setForeground(new java.awt.Color(0, 0, 0));
        sSchedule_BackButton.setText("< Back");
        sSchedule_BackButton.setPreferredSize(new java.awt.Dimension(90, 40));
        sSchedule_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSchedule_BackButtonActionPerformed(evt);
            }
        });

        sSchedule_scheduleTable.setBackground(new java.awt.Color(2, 31, 84));
        sSchedule_scheduleTable.setForeground(new java.awt.Color(255, 255, 255));
        sSchedule_scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        sSchedule_scheduleTable.setRowSelectionAllowed(false);
        sSchedule_scheduleTable.setTableHeader(null);
        jScrollPane1.setViewportView(sSchedule_scheduleTable);

        javax.swing.GroupLayout screen_studentScheduleLayout = new javax.swing.GroupLayout(screen_studentSchedule);
        screen_studentSchedule.setLayout(screen_studentScheduleLayout);
        screen_studentScheduleLayout.setHorizontalGroup(
            screen_studentScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sSchedule_Banner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(screen_studentScheduleLayout.createSequentialGroup()
                .addComponent(sSchedule_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        screen_studentScheduleLayout.setVerticalGroup(
            screen_studentScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen_studentScheduleLayout.createSequentialGroup()
                .addComponent(sSchedule_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sSchedule_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        parentPanel.add(screen_studentSchedule, "card4");

        screen_StudentCalendar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout screen_StudentCalendarLayout = new javax.swing.GroupLayout(screen_StudentCalendar);
        screen_StudentCalendar.setLayout(screen_StudentCalendarLayout);
        screen_StudentCalendarLayout.setHorizontalGroup(
            screen_StudentCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        screen_StudentCalendarLayout.setVerticalGroup(
            screen_StudentCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        parentPanel.add(screen_StudentCalendar, "card9");

        screen_ChatMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout screen_ChatMenuLayout = new javax.swing.GroupLayout(screen_ChatMenu);
        screen_ChatMenu.setLayout(screen_ChatMenuLayout);
        screen_ChatMenuLayout.setHorizontalGroup(
            screen_ChatMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        screen_ChatMenuLayout.setVerticalGroup(
            screen_ChatMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        parentPanel.add(screen_ChatMenu, "card5");

        screen_ChatRoom.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout screen_ChatRoomLayout = new javax.swing.GroupLayout(screen_ChatRoom);
        screen_ChatRoom.setLayout(screen_ChatRoomLayout);
        screen_ChatRoomLayout.setHorizontalGroup(
            screen_ChatRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        screen_ChatRoomLayout.setVerticalGroup(
            screen_ChatRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        parentPanel.add(screen_ChatRoom, "card6");

        screen_NavMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout screen_NavMenuLayout = new javax.swing.GroupLayout(screen_NavMenu);
        screen_NavMenu.setLayout(screen_NavMenuLayout);
        screen_NavMenuLayout.setHorizontalGroup(
            screen_NavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        screen_NavMenuLayout.setVerticalGroup(
            screen_NavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        parentPanel.add(screen_NavMenu, "card7");

        screen_NavDirections.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout screen_NavDirectionsLayout = new javax.swing.GroupLayout(screen_NavDirections);
        screen_NavDirections.setLayout(screen_NavDirectionsLayout);
        screen_NavDirectionsLayout.setHorizontalGroup(
            screen_NavDirectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        screen_NavDirectionsLayout.setVerticalGroup(
            screen_NavDirectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        parentPanel.add(screen_NavDirections, "card8");

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    
//////////      LOGIN SCREEN        //////////
    private void login_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_UsernameFocusGained
        if (login_Username.getText().equals("Student ID / Pearson Email")) {        //code for showing text hints the login screentextboxes
            login_Username.setText("");
            login_Username.setForeground(Color.black);
        } 
    }//GEN-LAST:event_login_UsernameFocusGained

    private void login_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_UsernameFocusLost
        if (login_Username.getText().equals("")) {
            login_Username.setText("Student ID / Pearson Email");
            login_Username.setForeground(new Color(153,153,153));
        }    
    }//GEN-LAST:event_login_UsernameFocusLost

    private void login_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_PasswordFocusGained
        if (login_Password.getText().equals("Password")) {
            login_Password.setText("");
            login_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_login_PasswordFocusGained

    private void login_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_PasswordFocusLost
        if (login_Password.getText().equals("")) {
            login_Password.setText("Password");
            login_Password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_login_PasswordFocusLost

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
        User user = new User();
        if (user.userLoginTest(login_Username.getText(), login_Password.getText())) {//test login button, will work with database
            parentPanel.removeAll();
            parentPanel.add(screen_studentMain);
            parentPanel.repaint();
            parentPanel.revalidate();
            if (!login_RememberDetails.isSelected()) {
                login_Password.setText("Password");
                login_Password.setForeground(new Color(153,153,153));
                login_Username.setText("Student ID / Pearson Email");
                login_Username.setForeground(new Color(153,153,153));
            }
        } else {
            login_Password.setText("Password");
            login_Password.setForeground(new Color(153,153,153));
            login_Username.setText("Student ID / Pearson Email");
            login_Username.setForeground(new Color(153,153,153));
            JOptionPane.showMessageDialog(parentPanel,"Incorrect Username or Password", "", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_login_ButtonActionPerformed

    

//////////          MAIN SCREEN         //////////
private void main_NextClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_NextClassesButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(screen_studentSchedule);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_main_NextClassesButtonActionPerformed
	
    private void main_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_BackButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(screen_Login);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_main_BackButtonActionPerformed

    private void sSchedule_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSchedule_BackButtonActionPerformed
        parentPanel.removeAll();
        parentPanel.add(screen_studentMain);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_sSchedule_BackButtonActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTimeMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTimeMinus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel login_AppName;
    private javax.swing.JLabel login_Background;
    private javax.swing.JButton login_Button;
    private javax.swing.JLabel login_CookiesLink;
    private javax.swing.JPanel login_ExtraPanel;
    private javax.swing.JLabel login_ForgottenLink;
    private javax.swing.JLabel login_Logo;
    private javax.swing.JTextField login_Password;
    private javax.swing.JCheckBox login_RememberDetails;
    private javax.swing.JTextField login_Username;
    private javax.swing.JLabel login_detailsHeader;
    private javax.swing.JPanel login_detailsPanel;
    private javax.swing.JButton main_BackButton;
    private javax.swing.JButton main_CalendarButton;
    private javax.swing.JTable main_CalendarEvents;
    private javax.swing.JScrollPane main_CalendarScrollPane;
    private javax.swing.JButton main_ChatButton;
    private javax.swing.JButton main_NavToClassButton;
    private javax.swing.JButton main_NavigateButton;
    private javax.swing.JLabel main_NextClassHeader;
    private javax.swing.JPanel main_NextClassLabel;
    private javax.swing.JLabel main_NextClassNameCode;
    private javax.swing.JButton main_NextClassesButton;
    private javax.swing.JLabel main_WelcomeBackMessage;
    private javax.swing.JLabel main_nextClassDuration;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton sSchedule_BackButton;
    private javax.swing.JPanel sSchedule_Banner;
    private javax.swing.JLabel sSchedule_BannerText;
    private javax.swing.JTable sSchedule_scheduleTable;
    private javax.swing.JPanel screen_ChatMenu;
    private javax.swing.JPanel screen_ChatRoom;
    private javax.swing.JPanel screen_Login;
    private javax.swing.JPanel screen_NavDirections;
    private javax.swing.JPanel screen_NavMenu;
    private javax.swing.JPanel screen_StudentCalendar;
    private javax.swing.JPanel screen_studentMain;
    private javax.swing.JPanel screen_studentSchedule;
    // End of variables declaration//GEN-END:variables
}
