package com.callor.score.model;

/*
 * 성적처리를 위한 기본 데이터를 저장할
 * Value Object 클래스
 * 		DTO(Data Transfer Object), 
 * 		DD(Data Define)
 * 
 * 학생의 정보 : 학번, 학생이름
 * 5과목의 점수 : 국어, 영어, 수학, 음악, 역사
 * 연산결과 : 총점, 평균, 석차
 * 
 */
public class ScoreVO {

	/*
	 * 1. 변수 이름 작명
	 * 2. 변수 타입 결정
	 * 3. 정보 은닉 설정(private)
	 */
	private String stNum;
	private String stName;
	
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int history;
	
	private int total;
	private float avg;
	private int rank;
	
	/*
	 * 기본생성자 정의
	 * ScoreVO score = new Score() 명령문에서 호출되는
	 * 생성자 메서드
	 */
	public ScoreVO() {
	}
	
	/*
	 * 필드생성자 정의
	 * 객체를 생성할때 변수값을 지정하면서 만들때
	 * ScoreVO scoreVO 
	 * 		= new ScoreVO(학번,
	 * 				국어점수,
	 * 				영어점수,
	 * 				수학점수,
	 * 				음악점수,
	 * 				역사점수)
	 * 
	 * 이때 호출되는 method
	 */
	public ScoreVO(String stNum, int kor, int eng, int math, int music, int history) {
		super();
		this.stNum = stNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.history = history;
	}
	
	
	
	
	/*
	 * private으로 선언된 인스턴스변수에 접근할
	 * getter, setter method 생성
	 */
	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	/*
	 * Object 클래스로 부터 상속받은 
	 * 		toString() method 재정의
	 * 
	 * VO 객체에 데이터를 저장한 후
	 * 잘 저장되었는지 확인하기 위한 Debuging 용
	 * method 재 정의
	 * 
	 */
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", stName=" + stName + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", music=" + music + ", history=" + history + ", total=" + total + ", avg=" + avg + ", rank=" + rank
				+ "]";
	}
	
	
	
	
	
	
	
}
