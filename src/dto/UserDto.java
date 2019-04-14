package dto;

public class UserDto {
	private String name;
	private String blood;
	private String sex;
	private int heigth;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setSexint(int sexint) {
		String sexStr = "";
		// 0が男だとするとif
		if(sexint == 0) {
			sexStr = "男";

		} else {
			sexStr = "女";
		}
		this.sex =sexStr;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
