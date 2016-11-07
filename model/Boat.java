package model;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.io.Serializable;
import view.StartApp;

public class Boat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long size;
    private Type type;
    private byte[] imaage;
    private Member member;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * for saving in file we use in this format for showing we should convert in
     * to image
     */
    public byte[] getImaage() {
        return imaage;
    }

    public void setImaage(byte[] imaage) {
        this.imaage = imaage;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public static enum Type implements Serializable {

        Sailboat, Motorsailer, kayak_Canoe, Other;

        public Type getType(String typeStr) {
            for (Type type : Type.values()) {
                if (type.toString().equals(typeStr)) {
                    return type;
                }
            }
            return Type.Other;
        }
    }



    @Override
    public boolean equals(Object other) {
        Boat otherBoat = (Boat) other;
        if (otherBoat.getId().equals(this.getId())) {
            return true;
        }
        return false;
    }

}
