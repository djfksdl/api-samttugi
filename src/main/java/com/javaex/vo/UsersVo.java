package com.javaex.vo;

public class UsersVo {
   
   //필드
   private int userNo;
   private String id;
   private String userName;
   private String password;
   private String hp;
   private String email;
   private String gender;
   private String birth;
   private String address;
   
   //생성자
   public UsersVo() {
      
   }
   
   
   public UsersVo(String userName, String hp, String email, String address) {
	super();
	this.userName = userName;
	this.hp = hp;
	this.email = email;
	this.address = address;
}


public UsersVo(int userNo, String id, String userName, String password, String hp, String email, String gender,
         String birth, String address) {
      
      this.userNo = userNo;
      this.id = id;
      this.userName = userName;
      this.password = password;
      this.hp = hp;
      this.email = email;
      this.gender = gender;
      this.birth = birth;
      this.address = address;
   }
   
   // g/s
   public int getUserNo() {
      return userNo;
   }
   public void setUserNo(int userNo) {
      this.userNo = userNo;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getHp() {
      return hp;
   }
   public void setHp(String hp) {
      this.hp = hp;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getBirth() {
      return birth;
   }
   public void setBirth(String birth) {
      this.birth = birth;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   
   //toString
   @Override
   public String toString() {
      return "UsersVo [userNo=" + userNo + ", id=" + id + ", userName=" + userName + ", password=" + password
            + ", hp=" + hp + ", email=" + email + ", gender=" + gender + ", birth=" + birth + ", address=" + address
            + "]";
   }
   
   

}