/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Serializacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("serial.txt"));

            MClase ej = new MClase("ola", -7, 2.7E10);
            os.writeObject(ej);
            os.close();

            MClase ej2 = (MClase) is.readObject();
            System.out.println(ej2.toString());
            is.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serializacion1.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
