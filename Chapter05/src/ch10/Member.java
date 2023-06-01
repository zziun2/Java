package ch10;

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
	
	
	//아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의 equals()와 hashCode()메서드를 재정의함
	@Override
	public int hashCode() {
		return mId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
				Member member = (Member)obj;
				if(this.mId == member.mId)
					return true;
				else
					return false;
		}
		return false;
	}
}
