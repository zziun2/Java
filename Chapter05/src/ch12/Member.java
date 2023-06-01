package ch12;

// MemberŬ������ ���̵� ������������ ���ĵǰ� �ϱ� ���� Comparable �������̽��� ����
public class Member implements Comparable<Member>{
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
		return mName +  " ȸ������ ���̵�� "  + mId + "�Դϴ�.";
	}
	
	
	//���̵� ������ ��� ���� ����̹Ƿ� �ߺ����� �ʵ��� Member Ŭ������ equals()�� hashCode()�޼��带 ��������
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

	@Override
	public int compareTo(Member member) {
		//return (this.mId - member.mId); // ��������
		return (this.mId - member.mId) * (-1); // ��������
	}
}
