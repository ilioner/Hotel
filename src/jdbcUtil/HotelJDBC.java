package jdbcUtil;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import entity.AdminUser;
import entity.HotelClient;
  
public class HotelJDBC {  
    // ������̬ȫ�ֱ���  
    static Connection conn;  
  
    static Statement st;  
  
//    public static void main(String[] args) {  
//        insert();   //������Ӽ�¼  
//        update();   //���¼�¼����  
//        delete();   //ɾ����¼  
//        query();    //��ѯ��¼����ʾ  
//    }  
      
    /* �������ݼ�¼���������������ݼ�¼��*/  
    public static boolean insertAClient(HotelClient client) {  
          
        conn = getConnection(); // ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
  
        try {  
        	
            String sql = "insert into `Hotel`.`client` ( `minzu`, `yuding`, `clientname`, `age`, `dianhua`, `shenfenzheng`, `sex`)"+
            " values ( ?, ?, ?, ?, ?, ?, ?)";  // �������ݵ�sql���  
            st = (Statement) conn.createStatement();    // ��������ִ�о�̬sql����Statement����  
            PreparedStatement sta = (PreparedStatement) conn.prepareStatement(sql); 
            sta.setString(1,client.minzu);
            sta.setInt(2, 1);
            sta.setString(3, client.cleintname);
            sta.setString(4, client.age);
            sta.setInt(5, client.dianhua);
            sta.setString(6, client.shenfenzheng);
            sta.setString(7, client.sex); 
            int rows = sta.executeUpdate(); 
            if(rows > 0) { 
                  System.out.println("operate successfully!"); 
            } 
            sta.close();
            conn.close();   //�ر����ݿ�����  
            return true;
        } catch (SQLException e) {  
            System.out.println("��������ʧ��" + e.getMessage());  
            return false;
        } 
    }  
      
    /* ���·���Ҫ��ļ�¼�������ظ��µļ�¼��Ŀ*/  
    public static void update() {  
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "update staff set wage='2200' where name = 'lucy'";// �������ݵ�sql���  
              
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            int count = st.executeUpdate(sql);// ִ�и��²�����sql��䣬���ظ������ݵĸ���  
              
            System.out.println("staff���и��� " + count + " ������");      //������²����Ĵ�����  
              
            conn.close();   //�ر����ݿ�����  
              
        } catch (SQLException e) {  
            System.out.println("��������ʧ��");  
        }  
    }  
  
    /* ��ѯ���ݿ⣬�������Ҫ��ļ�¼�����*/  
    public static ArrayList queryLogin() {  
          
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "select * from AdminUser";     // ��ѯ���ݵ�sql���  
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            ResultSet rs = st.executeQuery(sql);    //ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����  
            System.out.println("���Ĳ�ѯ���Ϊ��");  
            ArrayList<AdminUser> list = new ArrayList<AdminUser>();
            while (rs.next()) { // �ж��Ƿ�����һ������  
                AdminUser admin = new AdminUser();
                // �����ֶ�����ȡ��Ӧ��ֵ  
                String name = rs.getString("username");  
                String pwd = rs.getString("password");    
                admin.username = name;
                admin.password = pwd;
                //����鵽�ļ�¼�ĸ����ֶε�ֵ  
                System.out.println(name + " " + pwd );  
                list.add(admin);
            }  
            conn.close();   //�ر����ݿ�����  
//            return true;
            return list;
        } catch (SQLException e) {  
            System.out.println("��ѯ����ʧ��");
            return null;
        }
//		return false;  
    }  
  
    /* ��ѯ���ݿ⣬�������Ҫ��ļ�¼�����*/  
    public static HotelClient getAClient(String idCard) {  
          
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "select * from HotelClient where shenfenzheng = "+idCard+"\"";     // ��ѯ���ݵ�sql���  
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            ResultSet rs = st.executeQuery(sql);    //ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����  
            System.out.println("���Ĳ�ѯ���Ϊ��");  
            HotelClient client = new HotelClient();
            while (rs.next()) { // �ж��Ƿ�����һ������                  
            	// �����ֶ�����ȡ��Ӧ��ֵ  
                client.cleintname = rs.getString("clientname");
                client.sex = rs.getString("sex");
                client.age = rs.getString("age");
                client.shenfenzheng = rs.getString("shenfenzheng");
                client.minzu = rs.getString("shenfenzheng");
                client.dianhua = Integer.parseInt(rs.getString("shenfenzheng"));
            }  
            rs.close();
            conn.close();   //�ر����ݿ�����  
            return client;
        } catch (SQLException e) {  
            System.out.println("��ѯ����ʧ��");
            return null;
        }
//		return false;  
    }
    
    
    /* ɾ������Ҫ��ļ�¼��������*/  
    public static void delete() {  
  
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "delete from staff  where name = 'lili'";// ɾ�����ݵ�sql���  
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            int count = st.executeUpdate(sql);// ִ��sqlɾ����䣬����ɾ�����ݵ�����  
              
            System.out.println("staff����ɾ�� " + count + " ������\n");    //���ɾ�������Ĵ�����  
              
            conn.close();   //�ر����ݿ�����  
              
        } catch (SQLException e) {  
            System.out.println("ɾ������ʧ��");  
        }  
          
    }  
      
    
    /* ɾ������Ҫ��ļ�¼��������*/  
    public static boolean deleteASchedule(String idCard) {  
  
        conn = getConnection(); //ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�  
        try {  
            String sql = "delete from client  where shenfenzheng = '"+ idCard +"'";// ɾ�����ݵ�sql���  
            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����  
              
            int count = st.executeUpdate(sql);// ִ��sqlɾ����䣬����ɾ�����ݵ�����  
              
            System.out.println("staff����ɾ�� " + count + " ������\n");    //���ɾ�������Ĵ�����  
            st.close();  
            conn.close();   //�ر����ݿ�����  
            if (count == 0){
          	  return false;
            }else{
          	  return true;
            }
        } catch (SQLException e) {  
            System.out.println("ɾ������ʧ��");  
            return false;
        }  
          
    }
    
    /* ��ȡ���ݿ����ӵĺ���*/  
    public static Connection getConnection() {  
        Connection con = null;  //���������������ݿ��Connection����  
        try {  
            Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������  
              
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Hotel", "root", "root");// ������������  
            System.out.println("���ݿ�����"); 
        } catch (Exception e) {  
            System.out.println("���ݿ�����ʧ��" + e);  
        }  
        return con; //���������������ݿ�����  
    }  
}