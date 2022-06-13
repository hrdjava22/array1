package org.java.classEx2;

// 사용자 저으이 타입
public class ClassBasic {
	//필드(속성)
	public String userId;//인스턴스맴버
	public String userPw;//인스턴스맴버
	public int userAge;//인스턴스맴버
	// 캡슐화
	private String projectName;//인스턴스맴버, 
    // 클래스맴버(static)
	public static int projectYear;
	
	//객체 생성시 필요한 특수한 매서드
	public ClassBasic(){
		System.out.println("생성자(construct)");
	}
	//매서드
	//인스턴스매서드
	public void instanceMehto() {
		System.out.println("인스턴스매서드");
	}	
	//클래스매서드,클래스맴버(static)
	public static void classMathod() {
		System.out.println("클래스 매서드");
	}	
	// getters, setters
	//private 맴버(필드)를 초기화 set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private 맴버(필드)를 get
	public String getProjectName() {
		return this.projectName;// 호출함 그 곳에 반환한다.
	}
	
	
	
	
	
	
	
}
