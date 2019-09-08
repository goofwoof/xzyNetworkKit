package com.xzy.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpRequest {
	//private static final String host = "http://localhost/xiangziyouWeb/";//这个是我自己本地测试的地址
    private static final String host = "http://heli.nat123.cc:29235/xiangziyouWeb/";
	
	public static String sendPost(String mapping, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(host+mapping);
            URLConnection conn = realUrl.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream(),"UTF-8");
            outputStreamWriter.write(param);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("出现异常！"+e);
            e.printStackTrace();
        }
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;

    }    
 public static String sendGet(String mapping) {
	 //PrintWriter out = null;
     BufferedReader in = null;
     String result = "";
     try {
         URL realUrl = new URL(host+mapping);
         URLConnection conn = realUrl.openConnection();
         conn.setDoOutput(true);
         conn.setRequestProperty("accept", "*/*");
         conn.setRequestProperty("connection", "Keep-Alive");
         conn.setRequestProperty("user-agent",
                 "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
         //conn.setDoOutput(true);
         conn.setDoInput(true);
         //OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream(),"UTF-8");
         //outputStreamWriter.flush();
         //outputStreamWriter.close();
         in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String line;
         while ((line = in.readLine()) != null) {
             result += line;
         }
     } catch (Exception e) {
         System.out.println("出现异常！"+e);
         e.printStackTrace();
     }
     finally{
         try{
        	 /*if(out!=null){
                 out.close();
             }*/
             if(in!=null){
                 in.close();
             }
         }
         catch(IOException ex){
             ex.printStackTrace();
         }
     }
     return result;
 }    
}