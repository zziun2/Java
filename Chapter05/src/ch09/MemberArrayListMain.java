package ch09;

public class MemberArrayListMain {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member mLee = new Member(1001, "�̼���");
		Member mKim = new Member(1002, "������");
		Member mKang = new Member(1003, "������");
		Member mHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(mLee);
		memberArrayList.addMember(mKim);
		memberArrayList.addMember(mKang);
		memberArrayList.addMember(mHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(mHong.getmId());
		memberArrayList.showAllMember();
	}

}
