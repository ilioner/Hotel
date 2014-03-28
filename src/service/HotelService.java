package service;
import java.util.ArrayList;

import entity.AdminUser;
import entity.HotelClient;
import jdbcUtil.HotelJDBC;
public class HotelService {

	public static int adminLoginConfrim(AdminUser adminUser)
	{
		ArrayList<AdminUser> adminList = (ArrayList<AdminUser>)HotelJDBC.queryLogin();
		for(AdminUser user:adminList)
		{
			if( user.username.equals(adminUser.username) && user.password.equals(adminUser.password)) 
			{
				return 0;
			}else if( !user.username.equals(adminUser.username))
			{
				return 1;
			}else if( !user.password.equals(adminUser.password))
			{
				return 2;
			}
		}
		return 3;
	}
	public static int clientYuding(HotelClient client)
	{
		if( HotelJDBC.insertAClient(client) )
		{
			return 0;
		}else{
			return 1;
		}
	}
	
	public static boolean deleteThisSchedule(String idCard){
		HotelJDBC.deleteASchedule(idCard);
		return false;
	}
	
	public static HotelClient getClientSchedule(String idCard){
		System.out.println("geta------------------------- "+idCard);
		return HotelJDBC.getAClient(idCard);
	}
}
