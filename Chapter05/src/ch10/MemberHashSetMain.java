package ch10;


public class MemberHashSetMain {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member mLee = new Member(1001, "�̼���");
		Member mKim = new Member(1002, "������");
		Member mKang = new Member(1003, "������");
		
		memberHashSet.addMember(mLee);
		memberHashSet.addMember(mKim);
		memberHashSet.addMember(mKang);
		memberHashSet.showAllMember();
		
		Member mHong = new Member(1003, "ȫ�浿");  //1003 ���̵� �ߺ� 
		memberHashSet.addMember(mHong);
		memberHashSet.showAllMember();

	}

}
