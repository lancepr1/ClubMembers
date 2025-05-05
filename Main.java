import java.util.ArrayList;
public class Main
{
    public static void main(String[]args)
    {
        ClubMembers j = new ClubMembers();
        String[] members = {
            "XIA, PEISU",
            "ELLIS, CLARENCE",
            "VON AHN, LUIS"};
        j.addMembers(members, 2025);
        System.out.println(j.getMemberList());
        MemberInfo[] roster = {
            new MemberInfo("Smith, Jane", 2019, false),
            new MemberInfo("Fox, Steve", 2018, true),
            new MemberInfo("Xin, Michael", 2017, false),
            new MemberInfo("Garcia, Maria", 2020, true)
        };
        ArrayList<MemberInfo> memberList = new ArrayList();
        for (MemberInfo m: roster ) memberList.add(m);
        j.setMemberList(memberList);
        System.out.println(j.removeMembers(2018));
        System.out.println(j.getMemberList());
    }
}
