
package HotelManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Booking extends javax.swing.JFrame {
    private static String Gmail;
    private static String Name;
    public Booking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Twin Room", "Triple Room", "Quad Room", "Queen Room", "King Room", "Studio Room", "Suite", "Executive Room", "Presidential Suite", "Accessible Room" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Welcome to the Upadhayay Luxury Suites");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Room Type:");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Twin Room", "Triple Room", "Quad Room", "Queen Room", "King Room", "Studio Room", "Suite", "Executive Room", "Presidential Suite", "Accessible Room" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number of Rooms:");

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Number of Days:");

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Other Services: ");

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personalized Services", "Wellness Programs", "Cultural Experiences", "Adventure Activities", "Eco-Friendly Initiatives", "Luxury Transportation", "Thematic Suites", "Technology Enhancements", "Exclusive Club Access", "Private Dining", "Art and Design", "Personal Fitness Trainers", "Special Events", "Pet Services", "Gardens and Outdoor Spaces", "Specialized Health Services", "Educational Programs", "Customizable Stay Packages", "Entertainment and Games", "Unique Spa Treatments" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void setGmail(String gmail)
    {
        Booking.Gmail = gmail;
    }
    public static void setname(String name)
    {
        Booking.Name = name;
    }
    private static int getMaxPersons(String roomType) {
    switch (roomType) {
        case "Single Room":
            return 1;
        case "Double Room":
            return 2;
        case "Twin Room":
            return 2;
        case "Triple Room":
            return 3;
        case "Quad Room":
            return 4;
        case "King Room":
            return 2; 
        case "Queen Room":
            return 2; 
        case "Studio Room":
            return 2; 
        case "Suite":
            return 4; 
        case "Executive Room":
            return 2; 
        case "Presidential Room":
            return 6; 
        case "Accessible Room":
            return 2; 
        default:
            throw new IllegalArgumentException("Unknown room type: " + roomType);
    }
}
    private static double getRoomPrice(String roomType) {
        switch (roomType) {
            case "Single Room":
              return 100.0;
            case "Double Room":
              return 150.0;
            case "Twin Room":
              return 150.0;
            case "Triple Room":
              return 200.0;
            case "Quad Room":
              return 250.0;
            case "King Room":
               return 200.0;
            case "Queen Room":
              return 180.0;
            case "Studio Room":
              return 180.0;
            case "Suite":
              return 300.0;
            case "Executive Room":
              return 350.0;
            case "Presidential Room":
              return 500.0;
            case "Accessible Room":
              return 150.0;
            default:
              throw new IllegalArgumentException("Unknown room type: " + roomType);
    }
}

    private static double getExtraFacilityPrice(String facility) {
        switch (facility) {
            case "Personalized Services":
                return 50.0;
            case "Wellness Programs":
                return 30.0;
            case "Cultural Experiences":
                return 20.0;
            case "Adventure Activities":
                return 40.0;
            case "Eco-Friendly Initiatives":
                return 10.0;
            case "Luxury Transportation":
                return 80.0;
            case "Thematic Suites":
                return 100.0;
            case "Technology Enhancements":
                return 60.0;
            case "Exclusive Club Access":
                return 70.0;
            case "Private Dining":
                return 90.0;
            case "Art and Design":
                return 50.0;
            case "Personal Fitness Trainers":
                return 60.0;
            case "Special Events":
                return 100.0;
            case "Pet Services":
                return 20.0;
            case "Gardens and Outdoor Spaces":
                return 30.0;
            case "Specialized Health Services":
                return 40.0;
            case "Educational Programs":
                return 20.0;
            case "Customizable Stay Packages":
                return 50.0;
            case "Entertainment and Games":
                return 30.0;
            case "Unique Spa Treatments":
                return 70.0;
            default:
                throw new IllegalArgumentException("Unknown facility type: " + facility);
        }
    }

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // view Section
        String Name = Booking.Name;
        String Gmail = Booking.Gmail;
        String Room_type = (String)jComboBox2.getSelectedItem();
        int No_of_rooms = (int) jSpinner1.getValue();
        int No_of_days = (int) jSpinner2.getValue();
        String Other_services = (String)jComboBox3.getSelectedItem();
        int Max_persons = Booking.getMaxPersons(Room_type);
        Double Room_price = Booking.getRoomPrice(Room_type);
        Double Facility_price = Booking.getExtraFacilityPrice(Other_services);
        Double Total = (Room_price + Facility_price)* No_of_rooms * No_of_days;
        String message = "Booking Details\n" + String.format(
        "Name: %s\nGmail: %s\nRoom Type: %s\nNumber of Rooms: %d\nNumber of Days: %d\nOther Services: %s\nMaximum Number of persons accomodated in a Room: %d\nRoom Price: %.2f\nFacility Price: %.2f\nTotal: %.2f",
        Name, Gmail, Room_type, No_of_rooms, No_of_days, Other_services, Max_persons, Room_price, Facility_price, Total) + "\nTo know about Allocated Room Numbers Please Contact Our Customer Care Section.\n" + "For this please click on Help Button";
        JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // help section
        JOptionPane.showMessageDialog(this, "Customer care: 9847966171\n" +
                                        "Toll-Free Number: 025741587\n" +
                                        "Online Help: www.UpadhayayLuxurySuites.com");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Booking section
        String Name = Booking.Name;
        String Gmail = Booking.Gmail;
        String Room_type = (String)jComboBox2.getSelectedItem();
        int No_of_rooms = (int) jSpinner1.getValue();
        int Max_persons = Booking.getMaxPersons(Room_type);
        int No_of_days = (int) jSpinner2.getValue();
        String Other_services = (String)jComboBox3.getSelectedItem();
        Double Room_price = Booking.getRoomPrice(Room_type);
        Double Facility_price = Booking.getExtraFacilityPrice(Other_services);
        Double Total = (Room_price + Facility_price)* No_of_rooms * No_of_days;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydb", "root", "5130");
            Statement st = (Statement) con.createStatement();
            String sql1 = "SELECT * FROM Booking WHERE Gmail = '"+Gmail+"'";
            ResultSet rs = st.executeQuery(sql1);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this, "Each booking must have a separate email until checkout.");    
            }
            else
            {
            String sql = "INSERT INTO Booking(Name, Gmail, RoomType, NoOfRooms, NoOfPersons, NoOfDays, Totalprice, OtherServices) VALUES ("
            + "'" + Name + "', "
            + "'" + Gmail + "', "
            + "'" + Room_type + "', "
            + No_of_rooms + ", "
            + Max_persons + ", "
            + No_of_days + ", "
            + Total + ", "
            + "'" + Other_services + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Your booking is sucesfully registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }    
    }//GEN-LAST:event_jButton3ActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
