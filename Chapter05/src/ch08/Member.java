package ch08;

public class Member {
	private int mId;
	private String mName;
	
	public Member(int mId, String mName) {
		this.mId = mId;
		this.mName = mName;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}
	
	@Override
	public String toString() {
		return mName +  " 회원님의 아이디는 "  + mId + "입니다.";
	}
}
