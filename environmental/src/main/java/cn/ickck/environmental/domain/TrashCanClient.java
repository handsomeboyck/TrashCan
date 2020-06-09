package cn.ickck.environmental.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

/**
 * @Author: ck
 * @Description:
 * @Date: Create in 11:59 2020/4/9
 */
public class TrashCanClient {
/*
 硬件服务器连接
 */

    public static void main(String[] args)
    {
        try {
            Socket socket = new Socket("122.51.253.165", 9806);
            //开启一个线程接收信息，并解析
            ClientThread thread=new ClientThread(socket);
            thread.setName("Client1");
            thread.start();
            //主线程用来发送信息
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(socket.getOutputStream());
            System.out.println("连接成功");
            while(true)
            {
                String s=br.readLine();
                out.println(s);
                //out.write(s+"\n");
                out.flush();
            }
        }catch(Exception e){
            System.out.println("服务器异常");
        }
    }
    }





