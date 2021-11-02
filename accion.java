import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;

public class accion implements Runnable {
    JButton roja;
    JButton amarilla;
    JButton verde;
    JTextField num;
    int conta=0,tmp=0,tmp1=0,tmp2=0;
            
public accion(JButton accion1,JButton accion2,
        JButton accion3,JTextField accion4){
this.roja=accion1;
this.amarilla=accion2;
this.verde=accion3;
this.num=accion4;
}   
    @Override
    public void run(){
    while(true){
    conta++;
    if(conta>=1 && conta<=27){
    tmp++;
    num.setText(""+tmp);
    }
    if(conta==1){
    roja.setBackground(Color.red);
    amarilla.setBackground(Color.gray);
    verde.setBackground(Color.gray);
    }   
      if(conta>=28 && conta<=30){
    tmp1++;
    num.setText(""+tmp1);
    }     
    if(conta==28){
    roja.setBackground(Color.gray);
    amarilla.setBackground(Color.yellow);
    verde.setBackground(Color.gray);
    }   
    if(conta>=31 && conta<=60){
    tmp2++;
    num.setText(""+tmp2);
    }     
    if(conta==31){
    roja.setBackground(Color.gray);
    amarilla.setBackground(Color.gray);
    verde.setBackground(Color.green);
    }   
    if(conta>=60){
    conta=0;
    tmp=0;
    tmp1=0;
    tmp2=0;
    }
    try {      
  sleep(1000);
    }catch(Exception e){
    }
  }
}
 public void start (){
 new Thread(this).start();
 }   
}
