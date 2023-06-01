package ch10;


public class MemberHashSetMain {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member mLee = new Member(1001, "이순신");
		Member mKim = new Member(1002, "김유신");
		Member mKang = new Member(1003, "강감찬");
		
		memberHashSet.addMember(mLee);
		memberHashSet.addMember(mKim);
		memberHashSet.addMember(mKang);
		memberHashSet.showAllMember();
		
		Member mHong = new Member(1003, "홍길동");  //1003 아이디 중복 
		memberHashSet.addMember(mHong);
		memberHashSet.showAllMember();

	}

}
