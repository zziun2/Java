package ch11;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberKim = new Member(1003, "������");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKang = new Member(1002, "������");
		
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.showAllMember();
	}

}
