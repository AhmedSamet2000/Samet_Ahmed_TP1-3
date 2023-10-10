package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void  main(String[] args){
        try{

            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();

            System.out.println("in client est connecte");
            InputStream is= s.getInputStream();
            OutputStream os=s.getOutputStream();


            int nb=is.read();


            int rep=nb *5;
            os.write(rep);


            s.close();
            ss.close();
            }catch (Exception e) {
            e.printStackTrace();
        } ;
    }
}