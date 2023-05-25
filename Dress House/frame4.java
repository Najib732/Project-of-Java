
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class frame4 extends JFrame  {

    JPanel p1,p2;
    JButton b1,b2,b3,b4,b5,b9,b10,b11; 
    ImageIcon im1,im2,im3;

    frame4(){

      this.setTitle("BOY CHOICE");
      this.setSize(700,380);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);

      p1=new JPanel();
      p1.setBounds(0,0,700,50);
      p1.setBackground(Color.white);
      p1.setLayout(null);
      this.add(p1);
   
      im3=new ImageIcon(getClass().getResource("Image/banner/n.png"));
      b11=new JButton(im3);  
      b11.setBounds(05,10,40,30);
      b11.setBorder(null);   
      b11.setBackground(Color.white);
      p1.add(b11);
   
      b1=new JButton("MEN");
      b1.setBounds(62,10,40,30);
      b1.setBorder(null);
      b1.setBackground(Color.white);
      b1.setFont(new Font("Aharoni",Font.PLAIN,15));
      p1.add(b1);
   
      b2=new JButton("Women");

      b2.setBounds(125,10,55,30);
      b2.setBorder(null);
      b2.setBackground(Color.white); 
      b2.setFont(new Font("Aharoni",Font.PLAIN,15));
      p1.add(b2);
   
      b3=new JButton("Children");
      b3.setBounds(200,10,60,30);
      b3.setFont(new Font("Aharoni",Font.PLAIN,15));
      b3.setBorder(null);
      b3.setBackground(Color.white);
      p1.add(b3);


      p2=new JPanel();
      p2.setBounds(0,0,700,380);
      p2.setLayout(null);
      p2.setBackground(new Color(230,230,250));
      this.add(p2);

      im1=new ImageIcon("Image/boy/summer/summer.gif");
      b4=new JButton(im1);
      b4.setBounds(100,95,255,155);
      b4.setBorder(null);
      p2.add(b4);

      im2=new ImageIcon(getClass().getResource("Image/boy/winter/winter.gif"));
      b5=new JButton(im2);
      b5.setBounds(360,95,255,155);
      b5.setBorder(null);
      p2.add(b5);

      b9=new JButton("back");
      b9.setBounds(30,310,80,20);
      b9.setBorder(null);
      b9.setBackground(Color.black);
      b9.setForeground(Color.white);
      p2.add(b9);
     
      b1.addMouseListener(new MouseAdapter(){
   
        public void mouseEntered(MouseEvent evt){
         
        b1.setBackground(Color.decode("#87CEEB"));  
           
      }	
     
      public void mouseExited(MouseEvent evt){
         
        b1.setBackground(Color.white);  
         
     }	
     });

     b2.addMouseListener(new MouseAdapter(){
   
      public void mouseEntered(MouseEvent evt){
       
        b2.setBackground(Color.decode("#87CEEB"));
         
    }	
   
    public void mouseExited(MouseEvent evt){
       
      b2.setBackground(Color.white);  
       
   }
   });
   
   b3.addMouseListener(new MouseAdapter(){
      
      public void mouseEntered(MouseEvent evt){
       
        b3.setBackground(Color.decode("#87CEEB"));
    }	
   
    public void mouseExited(MouseEvent evt){
       
      b3.setBackground(Color.white);  
       
   }   
   });

   b4.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b4.setBackground(Color.decode("#87CEEB"));
  }	
 
  public void mouseExited(MouseEvent evt){
     
    b4.setBackground(Color.white);  
     
 }   
 });




 
 b5.addMouseListener(new MouseAdapter(){
      
  public void mouseEntered(MouseEvent evt){
    
    b5.setBackground(Color.decode("#87CEEB"));
}	

public void mouseClicked(MouseEvent evt){

  

}

public void mouseExited(MouseEvent evt){
   
  b5.setBackground(Color.white);  
   
}   
});


b9.addMouseListener(new MouseAdapter(){
      
  public void mouseEntered(MouseEvent evt){
   
    b9.setBackground(Color.decode("#87CEEB"));
}	

public void mouseExited(MouseEvent evt){
   
  b9.setBackground(Color.black);  
   
}   
});


b11.addMouseListener(new MouseAdapter(){
      
  public void mouseEntered(MouseEvent evt){
   
    b11.setBackground(Color.decode("#87CEEB"));
}	

public void mouseExited(MouseEvent evt){
   
  b11.setBackground(Color.white);  
   
}   
});


    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
     
            setVisible(false);
            frame4 frame = new  frame4();
            frame.setVisible(true);
        }
     
        
     });
     
     b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
     
            setVisible(false);
            frame9 frame = new  frame9();
            frame.setVisible(true);
        }
     
        
     });

     b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
     
            setVisible(false);
            frame14 frame = new  frame14();
            frame.setVisible(true);
        }
     
        
     });


        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
         
                setVisible(false);
                frame5 frame = new  frame5();
                frame.setVisible(true);
            }
         });


         
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              
                setVisible(false);
                frame7 frame = new  frame7();
                frame.setVisible(true);
            
          
          }


              
               
         });
        
        
         b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
         
                setVisible(false);
                frame3  frame = new  frame3 ();
                frame.setVisible(true);
            }
         });//back


         b11.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
       
              setVisible(false);
              frame3  frame = new  frame3 ();
              frame.setVisible(true);
          }
       });
    
    
        
        }}

