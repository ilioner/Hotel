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
    // 创建静态全局变量  
    static Connection conn;  
  
    static Statement st;  
  
//    public static void main(String[] args) {  
//        insert();   //插入添加记录  
//        update();   //更新记录数据  
//        delete();   //删除记录  
//        query();    //查询记录并显示  
//    }  
      
    /* 插入数据记录，并输出插入的数据记录数*/  
    public static boolean insertAClient(HotelClient client) {  
          
        conn = getConnection(); // 首先要获取连接，即连接到数据库  
  
        try {  
        	
            String sql = "insert into `Hotel`.`client` ( `minzu`, `yuding`, `clientname`, `age`, `dianhua`, `shenfenzheng`, `sex`)"+
            " values ( ?, ?, ?, ?, ?, ?, ?)";  // 插入数据的sql语句  
            st = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象  
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
            conn.close();   //关闭数据库连接  
            return true;
        } catch (SQLException e) {  
            System.out.println("插入数据失败" + e.getMessage());  
            return false;
        } 
    }  
      
    /* 更新符合要求的记录，并返回更新的记录数目*/  
    public static void update() {  
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "update staff set wage='2200' where name = 'lucy'";// 更新数据的sql语句  
              
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            int count = st.executeUpdate(sql);// 执行更新操作的sql语句，返回更新数据的个数  
              
            System.out.println("staff表中更新 " + count + " 条数据");      //输出更新操作的处理结果  
              
            conn.close();   //关闭数据库连接  
              
        } catch (SQLException e) {  
            System.out.println("更新数据失败");  
        }  
    }  
  
    /* 查询数据库，输出符合要求的记录的情况*/  
    public static ArrayList queryLogin() {  
          
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "select * from AdminUser";     // 查询数据的sql语句  
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
            System.out.println("最后的查询结果为：");  
            ArrayList<AdminUser> list = new ArrayList<AdminUser>();
            while (rs.next()) { // 判断是否还有下一个数据  
                AdminUser admin = new AdminUser();
                // 根据字段名获取相应的值  
                String name = rs.getString("username");  
                String pwd = rs.getString("password");    
                admin.username = name;
                admin.password = pwd;
                //输出查到的记录的各个字段的值  
                System.out.println(name + " " + pwd );  
                list.add(admin);
            }  
            conn.close();   //关闭数据库连接  
//            return true;
            return list;
        } catch (SQLException e) {  
            System.out.println("查询数据失败");
            return null;
        }
//		return false;  
    }  
  
    /* 查询数据库，输出符合要求的记录的情况*/  
    public static HotelClient getAClient(String idCard) {  
          
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "select * from HotelClient where shenfenzheng = "+idCard+"\"";     // 查询数据的sql语句  
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
            System.out.println("最后的查询结果为：");  
            HotelClient client = new HotelClient();
            while (rs.next()) { // 判断是否还有下一个数据                  
            	// 根据字段名获取相应的值  
                client.cleintname = rs.getString("clientname");
                client.sex = rs.getString("sex");
                client.age = rs.getString("age");
                client.shenfenzheng = rs.getString("shenfenzheng");
                client.minzu = rs.getString("shenfenzheng");
                client.dianhua = Integer.parseInt(rs.getString("shenfenzheng"));
            }  
            rs.close();
            conn.close();   //关闭数据库连接  
            return client;
        } catch (SQLException e) {  
            System.out.println("查询数据失败");
            return null;
        }
//		return false;  
    }
    
    
    /* 删除符合要求的记录，输出情况*/  
    public static void delete() {  
  
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "delete from staff  where name = 'lili'";// 删除数据的sql语句  
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            int count = st.executeUpdate(sql);// 执行sql删除语句，返回删除数据的数量  
              
            System.out.println("staff表中删除 " + count + " 条数据\n");    //输出删除操作的处理结果  
              
            conn.close();   //关闭数据库连接  
              
        } catch (SQLException e) {  
            System.out.println("删除数据失败");  
        }  
          
    }  
      
    
    /* 删除符合要求的记录，输出情况*/  
    public static boolean deleteASchedule(String idCard) {  
  
        conn = getConnection(); //同样先要获取连接，即连接到数据库  
        try {  
            String sql = "delete from client  where shenfenzheng = '"+ idCard +"'";// 删除数据的sql语句  
            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量  
              
            int count = st.executeUpdate(sql);// 执行sql删除语句，返回删除数据的数量  
              
            System.out.println("staff表中删除 " + count + " 条数据\n");    //输出删除操作的处理结果  
            st.close();  
            conn.close();   //关闭数据库连接  
            if (count == 0){
          	  return false;
            }else{
          	  return true;
            }
        } catch (SQLException e) {  
            System.out.println("删除数据失败");  
            return false;
        }  
          
    }
    
    /* 获取数据库连接的函数*/  
    public static Connection getConnection() {  
        Connection con = null;  //创建用于连接数据库的Connection对象  
        try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动  
              
            con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/Hotel", "root", "root");// 创建数据连接  
            System.out.println("数据库连接"); 
        } catch (Exception e) {  
            System.out.println("数据库连接失败" + e);  
        }  
        return con; //返回所建立的数据库连接  
    }  
}