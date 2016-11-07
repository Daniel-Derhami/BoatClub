package service;

import model.Boat;
import model.Member;
import model.WorkShopException;
import view.StartApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * this class prepare data for saving in file , use FileService class for doing
 * this
 */
 
 public class CRUDService {

    FileService fileService = new FileService();
    public CRUDService(){

    }

    /**
     * add a member info file and update in memory
     *
     * @param member
     */
    public void addMember(List<Member> members ,  Member member) throws WorkShopException {
        try {
            members.add(member);
            fileService.writeMembers(members);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * get Compact List that contains name, member id and number of boats
     *
     * @return
     */
    public List<String> getMembersCompactList(List<Member> members) throws WorkShopException { List<String> compactList = new ArrayList<String>();
        try {
            for (Member member : members) {
                String compactInfo = "member name : " + member.getName() + ", member id: " + member.getMemberId() + ", number of boats: " + member.getBoatsSize();
                compactList.add(compactInfo);
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return compactList;
        
    }

    /**
     * get Verbose List that contains name, personal number, member id and boats
     * with boat information
     *
     * @return
     */
     public List<String> getMembersCompactList(List<Member> members) throws WorkShopException {
       
    }

    /**
     * remove a member from list by its memberId and save changes in both file
     * and memory
     *
     * @param member
     */
    public void deleteMember(List<Member> members,Member member,List<Boat> boats) throws WorkShopException {}

    /**
     * return a member with input memerId
     *
     * @param memberId
     * @return
     */
    public Member searchMemberByMemberId(List<Member> members,Long memberId) throws WorkShopException {}

    /**
     * return a boat with input id
     *
     * @param id
     * @return
     */
    public Boat searchBoatById(List<Boat> boats,Long id) throws WorkShopException {}

    /**
     * return a member with input personalNumber
     *
     * @param personalNumber
     * @return
     */
    public Member searchMemberByPersonalNumber(List<Member> members,String personalNumber) throws WorkShopException {}

    /**
     * update a member info
     *
     * @param member
     */
    public void updateMember(List<Member> members,Member member,List<Boat> boats) throws WorkShopException {}

    /**
     * add a boat info file and update in memory
     *
     * @param member
     * @param boat
     */
    public void addBoat(List<Member> members,Member member, Boat boat,List<Boat> boats) throws WorkShopException {}

    /**
     * remove a boat from list by its id and save changes in both file and
     * memory
     *
     * @param boat
     */
    public void deleteBoat(List<Member> members,List<Boat> boats,Boat boat) throws WorkShopException {}

    /**
     * update a boat info
     *
     * @param boat
     */
    public void updateBoat(List<Member> members,List<Boat> boats,Boat boat,Member member) throws WorkShopException {}

}
