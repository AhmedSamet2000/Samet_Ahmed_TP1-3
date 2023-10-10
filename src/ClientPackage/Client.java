package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void  main(String[] args) {
            try{




            InetAddress serverAddress = InetAddress.getByName("123.123.123.123");
            InetSocketAddress  isa=new InetSocketAddress(serverAddress, 1234);

            Socket s = new Socket();
            s.connect(isa);


            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            System.out.print("entrez les donnees:");

            Scanner scanner=new Scanner(System.in);

            int nb= scanner.nextInt();
            os.write(nb);
            int res=is.read();
            System.out.println("le resultat est "+res);
            s.close();

            }catch (Exception e){
                    e.printStackTrace();
            }
        }
    }
