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

    public FrameActionListener(MainForm mainForm) {}

    public  List<Member> getMembers() {}

    public  void setMembers(List<Member> members) {}

    public  List<Boat> getBoats() {}

    public  void setBoats(List<Boat> boats) {}

    private  boolean isNumeric(String str)
    {}
    @Override
    public void actionPerformed(ActionEvent e) {}

}
