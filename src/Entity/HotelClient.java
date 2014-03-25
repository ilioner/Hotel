package Entity;

public class HotelClient {
	Integer id;
	String cleintname;
	String sex;
	String age;
	String shenfenzheng;
	String minzu;
	Integer dianhua;
	Integer roomno;
	Integer yuding;
	public HotelClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCleintname() {
		return cleintname;
	}
	public void setCleintname(String cleintname) {
		this.cleintname = cleintname;
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
	public void setDianhua(Integer dianhua) {
		this.dianhua = dianhua;
	}
	public Integer getRoomno() {
		return roomno;
	}
	public void setRoomno(Integer roomno) {
		this.roomno = roomno;
	}
	public Integer getYuding() {
		return yuding;
	}
	public void setYuding(Integer yuding) {
		this.yuding = yuding;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((cleintname == null) ? 0 : cleintname.hashCode());
		result = prime * result + ((dianhua == null) ? 0 : dianhua.hashCode());
		result = prime * result + ((minzu == null) ? 0 : minzu.hashCode());
		result = prime * result + ((roomno == null) ? 0 : roomno.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((shenfenzheng == null) ? 0 : shenfenzheng.hashCode());
		result = prime * result + ((yuding == null) ? 0 : yuding.hashCode());
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
		if (cleintname == null) {
			if (other.cleintname != null)
				return false;
		} else if (!cleintname.equals(other.cleintname))
			return false;
		if (dianhua == null) {
			if (other.dianhua != null)
				return false;
		} else if (!dianhua.equals(other.dianhua))
			return false;
		if (minzu == null) {
			if (other.minzu != null)
				return false;
		} else if (!minzu.equals(other.minzu))
			return false;
		if (roomno == null) {
			if (other.roomno != null)
				return false;
		} else if (!roomno.equals(other.roomno))
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
		if (yuding == null) {
			if (other.yuding != null)
				return false;
		} else if (!yuding.equals(other.yuding))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HotelClient [id=" + id + ", cleintname=" + cleintname
				+ ", sex=" + sex + ", age=" + age + ", shenfenzheng="
				+ shenfenzheng + ", minzu=" + minzu + ", dianhua=" + dianhua
				+ ", roomno=" + roomno + ", yuding=" + yuding + "]";
	}
	
}
