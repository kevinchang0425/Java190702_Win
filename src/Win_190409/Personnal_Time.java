/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Win_190409;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinchang
 */
public class Personnal_Time {
    public static void main(String[] args) {
        
        String P1_name = "kc";
        String P1_code = "1234";
        
        String name = JOptionPane.showInputDialog("請輸入姓名：");
        //String name = "kc";
        
        String code = JOptionPane.showInputDialog("請輸入密碼：");

        if (name.equals(P1_name) && code.equals(P1_code)) {
                SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                Date date = new Date();
                String strDate = sdFormat.format(date);

                System.out.println(name + " 您好，您的上班時間為：" + strDate);
                return;     
        } else {
            System.out.println("您不是公司員工或密碼錯誤，請確認！");

        }
        
              
    }
    
}
