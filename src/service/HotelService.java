package service;
import java.util.ArrayList;

import entity.AdminUser;
import jdbcUtil.HotelJDBC;
public class HotelService {

	public static int adminLoginConfrim(AdminUser adminUser)
	{
		ArrayList<AdminUser> adminList = HotelJDBC.queryLogin();
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
}
