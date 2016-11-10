
package view;
import controller.FrameActionListener;

public class MainForm extends javax.swing.JFrame {
    FrameActionListener frameActionListener = null;

    public MainForm() {
        frameActionListener = new FrameActionListener(this);
        initComponents();

    }


    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        memberNameLabel = new javax.swing.JLabel();
        memberPersonalNumberLabel = new javax.swing.JLabel();
        memberNameTextField = new javax.swing.JTextField();
        memberPersonalNumberTextField = new javax.swing.JTextField();
        addMemberButton = new javax.swing.JButton();
        delimeterLabel1 = new java.awt.Label();
        showMembersLabel = new java.awt.Label();
        compactShowLastMembersButton = new javax.swing.JButton();
        verboseShowLastMembersButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        delimeterLabel2 = new java.awt.Label();
        memberPersonalNumberDeleteTextField = new javax.swing.JTextField();
        memberPersonalNumberDeleteLabel = new javax.swing.JLabel();
        deleteMemberByPeronalNumberButton = new javax.swing.JButton();
        memberIdDeleteLabel = new javax.swing.JLabel();
        memberIdDeleteTextField = new javax.swing.JTextField();
        deleteMemberByMemberIdButton = new javax.swing.JButton();
        showMembersLabel1 = new java.awt.Label();
        memberPersonalNumberShowTextField = new javax.swing.JTextField();
        showMemberByPeronalNumberButton = new javax.swing.JButton();
        delimeterLabel5 = new java.awt.Label();
        memberPersonalNumberUpdateTextField = new javax.swing.JTextField();
        memberPersonalNumberUpdateLabel = new javax.swing.JLabel();
        updateMemberByPeronalNumberShowButton = new javax.swing.JButton();
        memberNameUpdateLabel = new javax.swing.JLabel();
        memberNameUpdateTextField = new javax.swing.JTextField();
        memberPersonalNumberUpdateNewLabel = new javax.swing.JLabel();
        memberPersonalNumberUpdateNewTextField = new javax.swing.JTextField();
        updateMemberButton = new javax.swing.JButton();
        cancelUpdateMemberButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        boatSizeTextField = new javax.swing.JTextField();
        boatSizeLabel = new javax.swing.JLabel();
        boatTypeLabel = new javax.swing.JLabel();
        boatTypeComboBox = new javax.swing.JComboBox();
        boatMemberPersonalNumberTextField = new javax.swing.JTextField();
        boatMemberPersonalNumberLabel = new javax.swing.JLabel();
        addBoatButton = new javax.swing.JButton();
        delimeterLabel3 = new java.awt.Label();
        boatIdDeleteLabel = new javax.swing.JLabel();
        boatIdDeleteTextField = new javax.swing.JTextField();
        deleteBoatByIdButton = new javax.swing.JButton();
        delimeterLabel4 = new java.awt.Label();
        boatIdUpdateLabel = new javax.swing.JLabel();
        updateBoatShowButton = new javax.swing.JButton();
        boatSizeUpdateLabel = new javax.swing.JLabel();
        boatSizeUpdateTextField = new javax.swing.JTextField();
        boatTypeUpdateLabel = new javax.swing.JLabel();
        boatTypeUpdateComboBox = new javax.swing.JComboBox();
        boatMemberPersonalNumberUpdateLabel = new javax.swing.JLabel();
        updateBoatButton = new javax.swing.JButton();
        boatMemberPersonalNumberUpdateTextField = new javax.swing.JTextField();
        cancelUpdateBoatButton = new javax.swing.JButton();
        boatIdUpdateTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        memberNameLabel.setText("Name: ");

        memberPersonalNumberLabel.setText("Personal Number: ");

        addMemberButton.setText("ADD MEMBER");

        delimeterLabel1.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        showMembersLabel.setText("show specific Member's info(by personal number)");

        compactShowLastMembersButton.setText("SHOW COMPACT");

        verboseShowLastMembersButton.setText("SHOW VERBOSE");

        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        jScrollPane1.setViewportView(infoTextArea);

        delimeterLabel2.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        memberPersonalNumberDeleteLabel.setText("Personal Number: ");

        deleteMemberByPeronalNumberButton.setText("DELETE");
        deleteMemberByPeronalNumberButton.setActionCommand("DELETE PERSONAL");

        memberIdDeleteLabel.setText("member Id:");

        deleteMemberByMemberIdButton.setText("DELETE");
        deleteMemberByMemberIdButton.setActionCommand("DELETE ID");

        showMembersLabel1.setText("show last updated Members");

        showMemberByPeronalNumberButton.setText("SHOW MEMBER");

        delimeterLabel5.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        memberPersonalNumberUpdateLabel.setText("Personal Number: ");

        updateMemberByPeronalNumberShowButton.setText("SHOW");
        updateMemberByPeronalNumberShowButton.setActionCommand("SHOW UPDATE MEMBER");

        memberNameUpdateLabel.setText("Name: ");

        memberPersonalNumberUpdateNewLabel.setText("New Personal Number: ");

        updateMemberButton.setText("UPDATE");
        updateMemberButton.setActionCommand("UPDATE MEMBER");

        cancelUpdateMemberButton.setText("CANCEL");
        cancelUpdateMemberButton.setActionCommand("CANCEL UPDATE MEMBER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup();
        jPanel1Layout.setVerticalGroup();

        addMemberButton.addActionListener(frameActionListener);
        showMembersLabel.getAccessibleContext().setAccessibleName("");
        compactShowLastMembersButton.addActionListener(frameActionListener);
        verboseShowLastMembersButton.addActionListener(frameActionListener);
        deleteMemberByPeronalNumberButton.addActionListener(frameActionListener);
        deleteMemberByMemberIdButton.addActionListener(frameActionListener);
        showMemberByPeronalNumberButton.addActionListener(frameActionListener);
        updateMemberByPeronalNumberShowButton.addActionListener(frameActionListener);
        updateMemberButton.addActionListener(frameActionListener);
        cancelUpdateMemberButton.addActionListener(frameActionListener);

        jTabbedPane1.addTab("Members", jPanel1);

        boatSizeLabel.setText("length: ");

        boatTypeLabel.setText("type: ");

        boatTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sailboat", "Motorsailer", "kayak_Canoe", "Other" }));

        boatMemberPersonalNumberLabel.setText("member Personal Number: ");

        addBoatButton.setText("ADD BOAT");

        delimeterLabel3.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        boatIdDeleteLabel.setText("boat id: ");

        deleteBoatByIdButton.setText("DELETE");
        deleteBoatByIdButton.setActionCommand("DELETE BOAT");

        delimeterLabel4.setText("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        boatIdUpdateLabel.setText("boat id: ");

        updateBoatShowButton.setText("SHOW");
        updateBoatShowButton.setActionCommand("SHOW UPDATE BOAT");

        boatSizeUpdateLabel.setText("length: ");

        boatTypeUpdateLabel.setText("type: ");

        boatTypeUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sailboat", "Motorsailer", "kayak_Canoe", "Other" }));

        boatMemberPersonalNumberUpdateLabel.setText("member Personal Number: ");

        updateBoatButton.setText("UPDATE");
        updateBoatButton.setActionCommand("UPDATE BOAT");

        cancelUpdateBoatButton.setText("CANCEL");
        cancelUpdateBoatButton.setActionCommand("CANCEL UPDATE BOAT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup();
        jPanel2Layout.setVerticalGroup();

        addBoatButton.addActionListener(frameActionListener);
        deleteBoatByIdButton.addActionListener(frameActionListener);
        updateBoatShowButton.addActionListener(frameActionListener);
        updateBoatButton.addActionListener(frameActionListener);
        cancelUpdateBoatButton.addActionListener(frameActionListener);

        jTabbedPane1.addTab("Boats", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }

    


    private javax.swing.JButton addBoatButton;
    private javax.swing.JButton addMemberButton;
    private javax.swing.JLabel boatIdDeleteLabel;
    private javax.swing.JTextField boatIdDeleteTextField;
    private javax.swing.JLabel boatIdUpdateLabel;
    private javax.swing.JTextField boatIdUpdateTextField;
    private javax.swing.JLabel boatMemberPersonalNumberLabel;
    private javax.swing.JTextField boatMemberPersonalNumberTextField;
    private javax.swing.JLabel boatMemberPersonalNumberUpdateLabel;
    private javax.swing.JTextField boatMemberPersonalNumberUpdateTextField;
    private javax.swing.JLabel boatSizeLabel;
    private javax.swing.JTextField boatSizeTextField;
    private javax.swing.JLabel boatSizeUpdateLabel;
    private javax.swing.JTextField boatSizeUpdateTextField;
    private javax.swing.JComboBox boatTypeComboBox;
    private javax.swing.JLabel boatTypeLabel;
    private javax.swing.JComboBox boatTypeUpdateComboBox;
    private javax.swing.JLabel boatTypeUpdateLabel;
    private javax.swing.JButton cancelUpdateBoatButton;
    private javax.swing.JButton cancelUpdateMemberButton;
    private javax.swing.JButton compactShowLastMembersButton;
    private javax.swing.JButton deleteBoatByIdButton;
    private javax.swing.JButton deleteMemberByMemberIdButton;
    private javax.swing.JButton deleteMemberByPeronalNumberButton;
    private java.awt.Label delimeterLabel1;
    private java.awt.Label delimeterLabel2;
    private java.awt.Label delimeterLabel3;
    private java.awt.Label delimeterLabel4;
    private java.awt.Label delimeterLabel5;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel memberIdDeleteLabel;
    private javax.swing.JTextField memberIdDeleteTextField;
    private javax.swing.JLabel memberNameLabel;
    private javax.swing.JTextField memberNameTextField;
    private javax.swing.JLabel memberNameUpdateLabel;
    private javax.swing.JTextField memberNameUpdateTextField;
    private javax.swing.JLabel memberPersonalNumberDeleteLabel;
    private javax.swing.JTextField memberPersonalNumberDeleteTextField;
    private javax.swing.JLabel memberPersonalNumberLabel;
    public javax.swing.JTextField memberPersonalNumberShowTextField;
    private javax.swing.JTextField memberPersonalNumberTextField;
    private javax.swing.JLabel memberPersonalNumberUpdateLabel;
    private javax.swing.JLabel memberPersonalNumberUpdateNewLabel;
    private javax.swing.JTextField memberPersonalNumberUpdateNewTextField;
    private javax.swing.JTextField memberPersonalNumberUpdateTextField;
    private javax.swing.JButton showMemberByPeronalNumberButton;
    private java.awt.Label showMembersLabel;
    private java.awt.Label showMembersLabel1;
    private javax.swing.JButton updateBoatButton;
    private javax.swing.JButton updateBoatShowButton;
    private javax.swing.JButton updateMemberButton;
    private javax.swing.JButton updateMemberByPeronalNumberShowButton;
    private javax.swing.JButton verboseShowLastMembersButton;

    public javax.swing.JButton getAddBoatButton() {
        return addBoatButton;
    }


    public void setAddBoatButton(javax.swing.JButton addBoatButton) {
        this.addBoatButton = addBoatButton;
    }


    public javax.swing.JButton getAddMemberButton() {
        return addMemberButton;
    }


    public void setAddMemberButton(javax.swing.JButton addMemberButton) {
        this.addMemberButton = addMemberButton;
    }


    public javax.swing.JLabel getBoatIdDeleteLabel() {
        return boatIdDeleteLabel;
    }


    public void setBoatIdDeleteLabel(javax.swing.JLabel boatIdDeleteLabel) {
        this.boatIdDeleteLabel = boatIdDeleteLabel;
    }


    public javax.swing.JTextField getBoatIdDeleteTextField() {
        return boatIdDeleteTextField;
    }


    public void setBoatIdDeleteTextField(javax.swing.JTextField boatIdDeleteTextField) {
        this.boatIdDeleteTextField = boatIdDeleteTextField;
    }


    public javax.swing.JTextField getBoatIdDeleteTextField1() {
        return getBoatIdUpdateTextField();
    }


    public void setBoatIdDeleteTextField1(javax.swing.JTextField boatIdDeleteTextField1) {
        this.setBoatIdUpdateTextField(boatIdDeleteTextField1);
    }


    public javax.swing.JLabel getBoatIdUpdateLabel() {
        return boatIdUpdateLabel;
    }


    public void setBoatIdUpdateLabel(javax.swing.JLabel boatIdUpdateLabel) {
        this.boatIdUpdateLabel = boatIdUpdateLabel;
    }


    public javax.swing.JLabel getBoatMemberPersonalNumberLabel() {
        return boatMemberPersonalNumberLabel;
    }


    public void setBoatMemberPersonalNumberLabel(javax.swing.JLabel boatMemberPersonalNumberLabel) {
        this.boatMemberPersonalNumberLabel = boatMemberPersonalNumberLabel;
    }


    public javax.swing.JTextField getBoatMemberPersonalNumberTextField() {
        return boatMemberPersonalNumberTextField;
    }


    public void setBoatMemberPersonalNumberTextField(javax.swing.JTextField boatMemberPersonalNumberTextField) {
        this.boatMemberPersonalNumberTextField = boatMemberPersonalNumberTextField;
    }


    public javax.swing.JLabel getBoatMemberPersonalNumberUpdateLabel() {
        return boatMemberPersonalNumberUpdateLabel;
    }


    public void setBoatMemberPersonalNumberUpdateLabel(javax.swing.JLabel boatMemberPersonalNumberUpdateLabel) {
        this.boatMemberPersonalNumberUpdateLabel = boatMemberPersonalNumberUpdateLabel;
    }


    public javax.swing.JTextField getBoatMemberPersonalNumberUpdateTextField() {
        return boatMemberPersonalNumberUpdateTextField;
    }


    public void setBoatMemberPersonalNumberUpdateTextField(javax.swing.JTextField boatMemberPersonalNumberUpdateTextField) {
        this.boatMemberPersonalNumberUpdateTextField = boatMemberPersonalNumberUpdateTextField;
    }


    public javax.swing.JLabel getBoatSizeLabel() {
        return boatSizeLabel;
    }


    public void setBoatSizeLabel(javax.swing.JLabel boatSizeLabel) {
        this.boatSizeLabel = boatSizeLabel;
    }


    public javax.swing.JTextField getBoatSizeTextField() {
        return boatSizeTextField;
    }


    public void setBoatSizeTextField(javax.swing.JTextField boatSizeTextField) {
        this.boatSizeTextField = boatSizeTextField;
    }


    public javax.swing.JLabel getBoatSizeUpdateLabel() {
        return boatSizeUpdateLabel;
    }


    public void setBoatSizeUpdateLabel(javax.swing.JLabel boatSizeUpdateLabel) {
        this.boatSizeUpdateLabel = boatSizeUpdateLabel;
    }


    public javax.swing.JTextField getBoatSizeUpdateTextField() {
        return boatSizeUpdateTextField;
    }


    public void setBoatSizeUpdateTextField(javax.swing.JTextField boatSizeUpdateTextField) {
        this.boatSizeUpdateTextField = boatSizeUpdateTextField;
    }


    public javax.swing.JComboBox getBoatTypeComboBox() {
        return boatTypeComboBox;
    }


    public void setBoatTypeComboBox(javax.swing.JComboBox boatTypeComboBox) {
        this.boatTypeComboBox = boatTypeComboBox;
    }


    public javax.swing.JLabel getBoatTypeLabel() {
        return boatTypeLabel;
    }


    public void setBoatTypeLabel(javax.swing.JLabel boatTypeLabel) {
        this.boatTypeLabel = boatTypeLabel;
    }


    public javax.swing.JComboBox getBoatTypeUpdateComboBox() {
        return boatTypeUpdateComboBox;
    }


    public void setBoatTypeUpdateComboBox(javax.swing.JComboBox boatTypeUpdateComboBox) {
        this.boatTypeUpdateComboBox = boatTypeUpdateComboBox;
    }


    public javax.swing.JLabel getBoatTypeUpdateLabel() {
        return boatTypeUpdateLabel;
    }


    public void setBoatTypeUpdateLabel(javax.swing.JLabel boatTypeUpdateLabel) {
        this.boatTypeUpdateLabel = boatTypeUpdateLabel;
    }


    public javax.swing.JButton getCompactShowLastMembersButton() {
        return compactShowLastMembersButton;
    }


    public void setCompactShowLastMembersButton(javax.swing.JButton compactShowLastMembersButton) {
        this.compactShowLastMembersButton = compactShowLastMembersButton;
    }


    public javax.swing.JButton getDeleteBoatByIdButton() {
        return deleteBoatByIdButton;
    }


    public void setDeleteBoatByIdButton(javax.swing.JButton deleteBoatByIdButton) {
        this.deleteBoatByIdButton = deleteBoatByIdButton;
    }


    public javax.swing.JButton getDeleteMemberByMemberIdButton() {
        return deleteMemberByMemberIdButton;
    }


    public void setDeleteMemberByMemberIdButton(javax.swing.JButton deleteMemberByMemberIdButton) {
        this.deleteMemberByMemberIdButton = deleteMemberByMemberIdButton;
    }


    public javax.swing.JButton getDeleteMemberByPeronalNumberButton() {
        return deleteMemberByPeronalNumberButton;
    }


    public void setDeleteMemberByPeronalNumberButton(javax.swing.JButton deleteMemberByPeronalNumberButton) {
        this.deleteMemberByPeronalNumberButton = deleteMemberByPeronalNumberButton;
    }


    public java.awt.Label getDelimeterLabel1() {
        return delimeterLabel1;
    }


    public void setDelimeterLabel1(java.awt.Label delimeterLabel1) {
        this.delimeterLabel1 = delimeterLabel1;
    }


    public java.awt.Label getDelimeterLabel2() {
        return delimeterLabel2;
    }


    public void setDelimeterLabel2(java.awt.Label delimeterLabel2) {
        this.delimeterLabel2 = delimeterLabel2;
    }


    public java.awt.Label getDelimeterLabel3() {
        return delimeterLabel3;
    }


    public void setDelimeterLabel3(java.awt.Label delimeterLabel3) {
        this.delimeterLabel3 = delimeterLabel3;
    }


    public java.awt.Label getDelimeterLabel4() {
        return delimeterLabel4;
    }


    public void setDelimeterLabel4(java.awt.Label delimeterLabel4) {
        this.delimeterLabel4 = delimeterLabel4;
    }


    public java.awt.Label getDelimeterLabel5() {
        return delimeterLabel5;
    }


    public void setDelimeterLabel5(java.awt.Label delimeterLabel5) {
        this.delimeterLabel5 = delimeterLabel5;
    }


    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }


    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }


    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }


    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }


    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }


    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }


    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }


    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }


    public javax.swing.JTextArea getjTextArea1() {
        return getInfoTextArea();
    }


    public void setjTextArea1(javax.swing.JTextArea jTextArea1) {
        this.setInfoTextArea(jTextArea1);
    }


    public javax.swing.JLabel getMemberIdDeleteLabel() {
        return memberIdDeleteLabel;
    }


    public void setMemberIdDeleteLabel(javax.swing.JLabel memberIdDeleteLabel) {
        this.memberIdDeleteLabel = memberIdDeleteLabel;
    }


    public javax.swing.JTextField getMemberIdDeleteTextField() {
        return memberIdDeleteTextField;
    }


    public void setMemberIdDeleteTextField(javax.swing.JTextField memberIdDeleteTextField) {
        this.memberIdDeleteTextField = memberIdDeleteTextField;
    }


    public javax.swing.JLabel getMemberNameLabel() {
        return memberNameLabel;
    }


    public void setMemberNameLabel(javax.swing.JLabel memberNameLabel) {
        this.memberNameLabel = memberNameLabel;
    }


    public javax.swing.JTextField getMemberNameTextField() {
        return memberNameTextField;
    }


    public void setMemberNameTextField(javax.swing.JTextField memberNameTextField) {
        this.memberNameTextField = memberNameTextField;
    }


    public javax.swing.JLabel getMemberNameUpdateLabel() {
        return memberNameUpdateLabel;
    }


    public void setMemberNameUpdateLabel(javax.swing.JLabel memberNameUpdateLabel) {
        this.memberNameUpdateLabel = memberNameUpdateLabel;
    }


    public javax.swing.JTextField getMemberNameUpdateTextField() {
        return memberNameUpdateTextField;
    }


    public void setMemberNameUpdateTextField(javax.swing.JTextField memberNameUpdateTextField) {
        this.memberNameUpdateTextField = memberNameUpdateTextField;
    }


    public javax.swing.JLabel getMemberPersonalNumberDeleteLabel() {
        return memberPersonalNumberDeleteLabel;
    }


    public void setMemberPersonalNumberDeleteLabel(javax.swing.JLabel memberPersonalNumberDeleteLabel) {
        this.memberPersonalNumberDeleteLabel = memberPersonalNumberDeleteLabel;
    }


    public javax.swing.JTextField getMemberPersonalNumberDeleteTextField() {
        return memberPersonalNumberDeleteTextField;
    }


    public void setMemberPersonalNumberDeleteTextField(javax.swing.JTextField memberPersonalNumberDeleteTextField) {
        this.memberPersonalNumberDeleteTextField = memberPersonalNumberDeleteTextField;
    }


    public javax.swing.JLabel getMemberPersonalNumberLabel() {
        return memberPersonalNumberLabel;
    }


    public void setMemberPersonalNumberLabel(javax.swing.JLabel memberPersonalNumberLabel) {
        this.memberPersonalNumberLabel = memberPersonalNumberLabel;
    }


    public javax.swing.JTextField getMemberPersonalNumberShowTextField() {
        return memberPersonalNumberShowTextField;
    }


    public void setMemberPersonalNumberShowTextField(javax.swing.JTextField memberPersonalNumberShowTextField) {
        this.memberPersonalNumberShowTextField = memberPersonalNumberShowTextField;
    }


    public javax.swing.JTextField getMemberPersonalNumberTextField() {
        return memberPersonalNumberTextField;
    }


    public void setMemberPersonalNumberTextField(javax.swing.JTextField memberPersonalNumberTextField) {
        this.memberPersonalNumberTextField = memberPersonalNumberTextField;
    }


    public javax.swing.JLabel getMemberPersonalNumberUpdateLabel() {
        return memberPersonalNumberUpdateLabel;
    }


    public void setMemberPersonalNumberUpdateLabel(javax.swing.JLabel memberPersonalNumberUpdateLabel) {
        this.memberPersonalNumberUpdateLabel = memberPersonalNumberUpdateLabel;
    }


    public javax.swing.JLabel getMemberPersonalNumberUpdateNewLabel() {
        return memberPersonalNumberUpdateNewLabel;
    }


    public void setMemberPersonalNumberUpdateNewLabel(javax.swing.JLabel memberPersonalNumberUpdateNewLabel) {
        this.memberPersonalNumberUpdateNewLabel = memberPersonalNumberUpdateNewLabel;
    }


    public javax.swing.JTextField getMemberPersonalNumberUpdateNewTextField() {
        return memberPersonalNumberUpdateNewTextField;
    }


    public void setMemberPersonalNumberUpdateNewTextField(javax.swing.JTextField memberPersonalNumberUpdateNewTextField) {
        this.memberPersonalNumberUpdateNewTextField = memberPersonalNumberUpdateNewTextField;
    }


    public javax.swing.JTextField getMemberPersonalNumberUpdateTextField() {
        return memberPersonalNumberUpdateTextField;
    }


    public void setMemberPersonalNumberUpdateTextField(javax.swing.JTextField memberPersonalNumberUpdateTextField) {
        this.memberPersonalNumberUpdateTextField = memberPersonalNumberUpdateTextField;
    }


    public javax.swing.JButton getShowMemberByPeronalNumberButton() {
        return showMemberByPeronalNumberButton;
    }


    public void setShowMemberByPeronalNumberButton(javax.swing.JButton showMemberByPeronalNumberButton) {
        this.showMemberByPeronalNumberButton = showMemberByPeronalNumberButton;
    }


    public java.awt.Label getShowMembersLabel() {
        return showMembersLabel;
    }


    public void setShowMembersLabel(java.awt.Label showMembersLabel) {
        this.showMembersLabel = showMembersLabel;
    }


    public java.awt.Label getShowMembersLabel1() {
        return showMembersLabel1;
    }


    public void setShowMembersLabel1(java.awt.Label showMembersLabel1) {
        this.showMembersLabel1 = showMembersLabel1;
    }


    public javax.swing.JButton getUpdateBoatButton() {
        return updateBoatButton;
    }


    public void setUpdateBoatButton(javax.swing.JButton updateBoatButton) {
        this.updateBoatButton = updateBoatButton;
    }


    public javax.swing.JButton getUpdateBoatShowButton() {
        return updateBoatShowButton;
    }


    public void setUpdateBoatShowButton(javax.swing.JButton updateBoatShowButton) {
        this.updateBoatShowButton = updateBoatShowButton;
    }


    public javax.swing.JButton getUpdateMemberButton() {
        return updateMemberButton;
    }


    public void setUpdateMemberButton(javax.swing.JButton updateMemberButton) {
        this.updateMemberButton = updateMemberButton;
    }


    public javax.swing.JButton getUpdateMemberByPeronalNumberShowButton() {
        return updateMemberByPeronalNumberShowButton;
    }

    /**
     * @param updateMemberByPeronalNumberShowButton the updateMemberByPeronalNumberShowButton to set
     */
    public void setUpdateMemberByPeronalNumberShowButton(javax.swing.JButton updateMemberByPeronalNumberShowButton) {
        this.updateMemberByPeronalNumberShowButton = updateMemberByPeronalNumberShowButton;
    }


    public javax.swing.JButton getVerboseShowLastMembersButton() {
        return verboseShowLastMembersButton;
    }


    public void setVerboseShowLastMembersButton(javax.swing.JButton verboseShowLastMembersButton) {
        this.verboseShowLastMembersButton = verboseShowLastMembersButton;
    }


    public javax.swing.JTextArea getInfoTextArea() {
        return infoTextArea;
    }


    public void setInfoTextArea(javax.swing.JTextArea infoTextArea) {
        this.infoTextArea = infoTextArea;
    }


    public javax.swing.JTextField getBoatIdUpdateTextField() {
        return boatIdUpdateTextField;
    }


    public void setBoatIdUpdateTextField(javax.swing.JTextField boatIdUpdateTextField) {
        this.boatIdUpdateTextField = boatIdUpdateTextField;
    }
}
