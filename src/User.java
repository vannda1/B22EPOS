import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    public static void setUserToTable(JTable tbl,String sql){
        ResultSet rs=getUser(sql);
        ResultSet rs1=getUser(sql);
        int rowCount=0;
        while (true){
            try {
                if (!rs1.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            rowCount++;
        }
        String colName[]={"user ID","user name","sex","email"};
        String data[][]= new String[rowCount][colName.length];
        int idx=0;
        while (true){
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                data[idx][0]=rs.getInt("userID")+"";
                data[idx][1]=rs.getString("userName");
                data[idx][2]=rs.getString("userSex");
                data[idx][3]=rs.getString("userEmail");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        DefaultTableModel model= new DefaultTableModel(data,colName);
        tbl.setModel(model);
    }




    public static ResultSet getUser(String sql){
        ResultSet rs;
        try {
            Statement st=MyConnection.connection().createStatement();
            rs=st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
