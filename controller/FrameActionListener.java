/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Boat;
import model.Member;
import model.WorkShopException;
import service.CRUDService;
import service.FileService;
import view.MainForm;
import view.StartApp;
import javax.swing.*;

public class FrameActionListener implements ActionListener {

    private  List<Member> members = new ArrayList<Member>();
    private  List<Boat> boats = new ArrayList<Boat>();
    
    MainForm mainForm;
    CRUDService cruds = new CRUDService();

    public FrameActionListener(MainForm mainForm) {
        this.mainForm = mainForm;
        FileService fileService = new FileService();
        try {
            setMembers(fileService.readMembers());
            setBoats(fileService.readBoats());
        } catch (WorkShopException e) {
            e.printStackTrace();
        }

    }

    public  List<Member> getMembers() {
        return members;
    }

    public  void setMembers(List<Member> members) {
        this.members = members;
    }

    public  List<Boat> getBoats() {
        return boats;
    }

    public  void setBoats(List<Boat> boats) {
        this.boats = boats;
    }

    private  boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ADD MEMBER")) {
            try {
                boolean existPersonalNumber = false;
                for (Member member : getMembers()){
                    if(member.getPersonalNumber().equals(mainForm.getMemberPersonalNumberTextField().getText().trim())){
                        existPersonalNumber = true;
                    }
                }
                if(existPersonalNumber){
                    JOptionPane.showMessageDialog(mainForm,
                            "personal number has been exit before.");
                }else {

                    String prsnc = mainForm.getMemberPersonalNumberTextField().getText().trim();
                    String[] s =prsnc.split("-");
                    boolean hasCorrectFormat = true;
                    if(s.length != 2 || s[0].length() != 6 || s[1].length() != 4 || !isNumeric(s[0]) || !isNumeric(s[1]) ){
                        hasCorrectFormat = false;
                    }
                    if (!hasCorrectFormat){
                        JOptionPane.showMessageDialog(mainForm,
                                "personal number should be in YYMMDD-ABCD format (both part should be numeric).");
                    }else {

                        Member member = new Member();
                        member.setMemberId((long) getMembers().size()+1);
                        member.setName(mainForm.getMemberNameTextField().getText());
                        mainForm.getMemberNameTextField().setText("");
                        member.setPersonalNumber(mainForm.getMemberPersonalNumberTextField().getText());
                        mainForm.getMemberPersonalNumberTextField().setText("");
                        cruds.addMember(getMembers(),member);
                    }
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW MEMBER")) {
            try {
                mainForm.getInfoTextArea().setText("");
                Member member = cruds.searchMemberByPersonalNumber(getMembers(),mainForm.getMemberPersonalNumberShowTextField().getText());
                if (member != null) {
                    String verboseInfo = "name : " + member.getName() + " personal number: " + member.getPersonalNumber() + " member id: " + member.getMemberId() + " boats info: \n";
                    Iterator<Boat> boatIterator = member.getBoats();
                    while ( boatIterator.hasNext()) {
                        Boat boat = boatIterator.next();
                        verboseInfo += "boat name: " + boat.getId() + " boat size: " + boat.getSize() + " boat type: " + boat.getType() + "\n";
                    }
                    mainForm.getInfoTextArea().setText(verboseInfo);
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (e.getActionCommand().equals("SHOW COMPACT")) {
            try {
                mainForm.getInfoTextArea().setText("");
                List<String> infos = cruds.getMembersCompactList(getMembers());
                String infoStr = "";
                for (String str : infos) {
                    infoStr += str + "\n";
                }
                mainForm.getInfoTextArea().setText(infoStr);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW VERBOSE")) {
            try {
                mainForm.getInfoTextArea().setText("");
                List<String> infos = cruds.getMembersVerboseList(getMembers());
                String infoStr = "";
                for (String str : infos) {
                    infoStr += str + "\n";
                }
                mainForm.getInfoTextArea().setText(infoStr);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE PERSONAL")) {
            try {
                Member member = cruds.searchMemberByPersonalNumber(getMembers(),mainForm.getMemberPersonalNumberDeleteTextField().getText());
                if (member != null) {
                    cruds.deleteMember(getMembers(),member,getBoats());
                    mainForm.getMemberPersonalNumberDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE ID")) {
            try {
                Member member = cruds.searchMemberByMemberId(getMembers(),Long.valueOf(mainForm.getMemberIdDeleteTextField().getText()));
                if (member != null) {
                    cruds.deleteMember(getMembers(),member,getBoats());
                    mainForm.getMemberIdDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW UPDATE MEMBER")) {
            try {
                mainForm.getMemberNameUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                Member member = cruds.searchMemberByPersonalNumber(getMembers(),mainForm.getMemberPersonalNumberUpdateTextField().getText());
                mainForm.getMemberNameUpdateTextField().setText(member.getName());
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText(member.getPersonalNumber().toString());
                mainForm.getMemberPersonalNumberUpdateTextField().setEditable(false);
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CANCEL UPDATE MEMBER")) {
            try {
                mainForm.getMemberNameUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setText("");
                mainForm.getMemberPersonalNumberUpdateTextField().setEditable(true);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("UPDATE MEMBER")) {
            try {

                boolean existPersonalNumber = false;
                for (Member member : getMembers()){
                    if(member.getPersonalNumber().equals(mainForm.getMemberPersonalNumberUpdateNewTextField().getText().trim())){
                        existPersonalNumber = true;
                    }
                }
                if(mainForm.getMemberPersonalNumberUpdateTextField().getText().trim().equals(mainForm.getMemberPersonalNumberUpdateNewTextField().getText().trim())){
                    existPersonalNumber = false;
                }
                if(existPersonalNumber){
                    JOptionPane.showMessageDialog(mainForm,
                            "personal number has been exit before.");
                }else {

                    String prsnc = mainForm.getMemberPersonalNumberUpdateNewTextField().getText().trim();
                    String[] s =prsnc.split("-");
                    boolean hasCorrectFormat = true;
                    if(s.length != 2 || s[0].length() != 6 || s[1].length() != 4 || !isNumeric(s[0]) || !isNumeric(s[1]) ){
                        hasCorrectFormat = false;
                    }
                    if (!hasCorrectFormat){
                        JOptionPane.showMessageDialog(mainForm,
                                "personal number should be in YYMMDD-ABCD format (both part should be numeric).");
                    }else {

                        Member member = cruds.searchMemberByPersonalNumber(getMembers(),mainForm.getMemberPersonalNumberUpdateTextField().getText());
                        member.setName(mainForm.getMemberNameUpdateTextField().getText());
                        member.setPersonalNumber(mainForm.getMemberPersonalNumberUpdateNewTextField().getText());
                        cruds.updateMember(getMembers(),member,getBoats());
                        mainForm.getMemberNameUpdateTextField().setText("");
                        mainForm.getMemberPersonalNumberUpdateNewTextField().setText("");
                        mainForm.getMemberPersonalNumberUpdateTextField().setText("");
                        mainForm.getMemberPersonalNumberUpdateTextField().setEditable(true);
                    }
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("ADD BOAT")) {
            try {
                Member member = cruds.searchMemberByPersonalNumber(getMembers(),mainForm.getBoatMemberPersonalNumberTextField().getText());
                Boat boat = new Boat();
                boat.setId((long)getBoats().size()+1);
                boat.setSize(Long.valueOf(mainForm.getBoatSizeTextField().getText()));
                boat.setType(Boat.Type.valueOf(mainForm.getBoatTypeComboBox().getSelectedItem().toString()));
                cruds.addBoat(getMembers(),member, boat,getBoats());
                mainForm.getBoatMemberPersonalNumberTextField().setText("");
                mainForm.getBoatSizeTextField().setText("");

            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("DELETE BOAT")) {
            try {
                Boat boat = cruds.searchBoatById(getBoats(),Long.valueOf(mainForm.getBoatIdDeleteTextField().getText()));
                if (boat != null) {
                    cruds.deleteBoat(getMembers(),getBoats(),boat);
                    mainForm.getBoatIdDeleteTextField().setText("");
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("SHOW UPDATE BOAT")) {
            try {
                mainForm.getBoatSizeUpdateTextField().setText("");
                mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                Boat boat = cruds.searchBoatById(getBoats() ,Long.valueOf(mainForm.getBoatIdUpdateTextField().getText()));
                if (boat != null) {
                    mainForm.getBoatSizeUpdateTextField().setText(boat.getSize().toString());
                    mainForm.getBoatMemberPersonalNumberUpdateTextField().setText(boat.getMember().getPersonalNumber());
                    mainForm.getBoatTypeUpdateComboBox().setSelectedItem(boat.getType().toString());
                    mainForm.getBoatIdUpdateTextField().setEditable(false);
                }
            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CANCEL UPDATE BOAT")) {
            try {
                mainForm.getBoatSizeUpdateTextField().setText("");
                mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                mainForm.getBoatIdUpdateTextField().setEditable(true);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("UPDATE BOAT")) {
            try {
                Boat boat = cruds.searchBoatById(getBoats(),Long.valueOf(mainForm.getBoatIdUpdateTextField().getText()));
                Member member = cruds.searchMemberByPersonalNumber(getMembers(), mainForm.getBoatMemberPersonalNumberUpdateTextField().getText());
                if (member != null && boat != null) {
                    boat.setSize(Long.valueOf(mainForm.getBoatSizeUpdateTextField().getText()));
                    boat.setType(Boat.Type.valueOf(mainForm.getBoatTypeUpdateComboBox().getSelectedItem().toString()));
                    cruds.updateBoat(getMembers(),getBoats(),boat,member);
                    mainForm.getBoatSizeUpdateTextField().setText("");
                    mainForm.getBoatMemberPersonalNumberUpdateTextField().setText("");
                    mainForm.getBoatIdUpdateTextField().setText("");
                    mainForm.getBoatIdUpdateTextField().setEditable(true);
                }

            } catch (WorkShopException ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrameActionListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
