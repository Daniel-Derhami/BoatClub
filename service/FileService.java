package service;

import model.Boat;
import model.Member;
import model.WorkShopException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * this class used for save objects in file
 */

public class FileService {

    /**
     * write list of members in file
     *
     * @param members
     * @throws IOException
     */
    public  void writeMembers(List<Member> members) throws WorkShopException {
        try {
            File f = new File("member.obj");
            if (!f.exists()) {
                f.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(members);
            byte b[] = baos.toByteArray();
            raf.seek(0);
            raf.write(b);
            raf.close();
            oos.close();
            baos.close();
        } catch (IOException e) {
            throw new WorkShopException(e);
        } catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * read list of members from file
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public  List<Member> readMembers() throws WorkShopException {
        List<Member> members = new ArrayList<Member>();

        try {
            File f = new File("member.obj");
            if (!f.exists()) {
                return members;
            }
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            raf.seek(0);
            byte b[] = new byte[10000];
            raf.read(b);
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            ObjectInputStream ois = new ObjectInputStream((InputStream) bais);
            members = (List<Member>) ois.readObject();
            ois.close();
            bais.close();
        } catch (ClassNotFoundException e) {
            throw new WorkShopException(e);
        } catch (IOException e) {
            throw new WorkShopException(e);
        } catch (Exception e) {
            throw new WorkShopException(e);
        }

        return members;
    }


    /**
     * write list of boats in file
     *
     * @param boats
     * @throws IOException
     */
    public  void writeBoats(List<Boat> boats) throws WorkShopException {
        try {
            File f = new File("boat.obj");
            if (!f.exists()) {
                f.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(boats);
            byte b[] = baos.toByteArray();
            raf.seek(0);
            raf.write(b);
            raf.close();
            oos.close();
            baos.close();
        } catch (IOException e) {
            throw new WorkShopException(e);
        }catch (Exception e) {
            throw new WorkShopException(e);
        }
    }

    /**
     * read list of boats from file
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public  List<Boat> readBoats()  throws WorkShopException {
        List<Boat> boats = new ArrayList<Boat>();

        try {
            File f = new File("boat.obj");
            if (!f.exists()) {
                return boats;
            }
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            raf.seek(0);
            byte b[] = new byte[10000];
            raf.read(b);
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            ObjectInputStream ois = new ObjectInputStream((InputStream) bais);
            boats = (List<Boat>) ois.readObject();
            ois.close();
            bais.close();
        } catch (ClassNotFoundException e) {
            throw new WorkShopException(e);
        } catch (IOException e) {
            throw new WorkShopException(e);
        } catch (Exception e) {
            throw new WorkShopException(e);
        }

        return boats;
    }


}
