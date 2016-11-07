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
    public List<String> getMembersCompactList(List<Member> members) throws WorkShopException { 
        List<String> compactList = new ArrayList<String>();
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
    public List<String> getMembersVerboseList(List<Member> members) throws WorkShopException {
        List<String> verboseList = new ArrayList<String>();
        try {
            for (Member member : members) {
                String verboseInfo = "member name : " + member.getName() + ", personal number: " + member.getPersonalNumber() + ", member id: " + member.getMemberId() + ", boats info: \n";
                Iterator<Boat> boatIterator = member.getBoats();
                while ( boatIterator.hasNext()) {
                    Boat boat = boatIterator.next();
                    verboseInfo += "boat id: " + boat.getId() + ", boat size: " + boat.getSize() + ", boat type: " + boat.getType() + "\n";
                }
                verboseList.add(verboseInfo);
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return verboseList;
    }

    /**
     * remove a member from list by its memberId and save changes in both file
     * and memory
     *
     * @param member
     */
        public void deleteMember(List<Member> members,Member member,List<Boat> boats) throws WorkShopException {
        try {
            members.remove(member);
            Iterator<Boat> boatIterator = member.getBoats();
            while ( boatIterator.hasNext()) {
                Boat boat = boatIterator.next();
                boats.remove(boat);
            }
            fileService.writeBoats(boats);
            fileService.writeMembers(members);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * return a member with input memerId
     *
     * @param memberId
     * @return
     */
    public Member searchMemberByMemberId(List<Member> members,Long memberId) throws WorkShopException {
        try {
            for (Member member : members) {
                if (member.getMemberId().equals(memberId)) {
                    return member;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * return a boat with input id
     *
     * @param id
     * @return
     */
    public Boat searchBoatById(List<Boat> boats,Long id) throws WorkShopException {
        try {
            for (Boat boat : boats) {
                if (boat.getId().equals(id)) {
                    return boat;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * return a member with input personalNumber
     *
     * @param personalNumber
     * @return
     */
    public Member searchMemberByPersonalNumber(List<Member> members,String personalNumber) throws WorkShopException {
        try {
            for (Member member : members) {
                if (member.getPersonalNumber().equals(personalNumber)) {
                    return member;
                }
            }
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
        return null;
    }

    /**
     * update a member info
     *
     * @param member
     */
        public void updateMember(List<Member> members,Member member,List<Boat> boats) throws WorkShopException {
        try {
            Member beforeChange = searchMemberByMemberId(members,member.getMemberId());
            deleteMember(members,beforeChange,boats);
            addMember(members,member);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * add a boat info file and update in memory
     *
     * @param member
     * @param boat
     */
        public void addBoat(List<Member> members,Member member, Boat boat,List<Boat> boats) throws WorkShopException {
        try {
            Member findMember = searchMemberByMemberId(members,member.getMemberId());
            deleteMember(members,findMember,boats);
            member.addBoat(boat);
            addMember(members,member);

            boat.setMember(member);
            Iterator<Boat> boatIterator = member.getBoats();
            while ( boatIterator.hasNext()) {
                Boat b = boatIterator.next();
                boats.add(b);
            }
            fileService.writeBoats(boats);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }
    /**
     * remove a boat from list by its id and save changes in both file and
     * memory
     *
     * @param boat
     */
     public void deleteBoat(List<Member> members,List<Boat> boats,Boat boat) throws WorkShopException {
        try {
            boats.remove(boat);
            fileService.writeBoats(boats);

            Member findMember = searchMemberByMemberId(members,boat.getMember().getMemberId());
            deleteMember(members,findMember,boats);
            findMember.removeBoat(boat);
            addMember(members,findMember);
        } catch (WorkShopException e) {
            throw e;
        } catch (Exception e) {
            throw new WorkShopException(e);
        }

    }
    /**
     * update a boat info
     *
     * @param boat
     */
    public void updateBoat(List<Member> members,List<Boat> boats,Boat boat,Member member) throws WorkShopException {}

}
