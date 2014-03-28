package entity;

public class HotelClient {
	public int id;
	public String clientname;
	public String sex;
	public String age;
	public String shenfenzheng;
	public String minzu;
	public int dianhua;
	public int roomno;
	public int yuding;
	public HotelClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	public String getMinzu() {
		return minzu;
	}
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	public Integer getDianhua() {
		return dianhua;
	}
	public void setDianhua(int dianhua) {
		this.dianhua = dianhua;
	}
	public Integer getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public Integer getYuding() {
		return yuding;
	}
	public void setYuding(int yuding) {
		this.yuding = yuding;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((clientname == null) ? 0 : clientname.hashCode());
		result = prime * result + dianhua;
		result = prime * result + ((minzu == null) ? 0 : minzu.hashCode());
		result = prime * result + roomno;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((shenfenzheng == null) ? 0 : shenfenzheng.hashCode());
		result = prime * result + yuding;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelClient other = (HotelClient) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (clientname == null) {
			if (other.clientname != null)
				return false;
		} else if (!clientname.equals(other.clientname))
			return false;
		if (dianhua != other.dianhua)
			return false;
		if (minzu == null) {
			if (other.minzu != null)
				return false;
		} else if (!minzu.equals(other.minzu))
			return false;
		if (roomno != other.roomno)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (shenfenzheng == null) {
			if (other.shenfenzheng != null)
				return false;
		} else if (!shenfenzheng.equals(other.shenfenzheng))
			return false;
		if (yuding != other.yuding)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HotelClient [id=" + id + ", cleintname=" + clientname
				+ ", sex=" + sex + ", age=" + age + ", shenfenzheng="
				+ shenfenzheng + ", minzu=" + minzu + ", dianhua=" + dianhua
				+ ", roomno=" + roomno + ", yuding=" + yuding + "]";
	}
	
}
