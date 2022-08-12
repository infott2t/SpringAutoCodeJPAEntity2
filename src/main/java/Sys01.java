import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sys01 extends JFrame {

    JPanel jp;
    JLabel jl,jl2;
    JTextField jtf,jtf2;
    JTextArea jta, jta2;
    JButton btn;



    Sys01(){
        jp = new JPanel();
        jl = new JLabel("Rally: ");
        jl2 = new JLabel("table name: ");
        jtf = new JTextField(30);
        jtf2 = new JTextField(10);



        btn = new JButton("enter");
        jta = new JTextArea(15,30);
        jta2 = new JTextArea(15,30);

        jtf.setText("");
        jp.add(jl);
        jp.add(jtf);
        jp.add(jl2);
        jp.add(jtf2);
        //jp.add(btn);
        jp.add(jta);
        jp.add(jta2);
        setBounds(300,300,863,567);
        setTitle("Control drive01");
        setVisible(true);
        setResizable(true);
        jl.setFont(new Font("", Font.PLAIN,15));
        jtf.setFont(new Font("", Font.PLAIN,15));
        jl2.setFont(new Font("", Font.PLAIN,15));
        jtf2.setFont(new Font("", Font.PLAIN,15));
        jta.setFont(new Font("", Font.PLAIN,15));
        jta2.setFont(new Font("", Font.PLAIN,15));
        add(jp);

        jta.setText(" Let's safely using smartphones, etc.\n\n1. input\n\nNumber and possible, enter key.\n\n *Using programming, Spring boot(https://spring.io). Automation coding. \n2021-08-01. Writter, Hyeonil Choi.\n\nhttps://github.com/infott2t/Auto_writting_JavaCode_makeSwing,\n MIT License.\nThank you.\n \n How about this. Church. Jesus Christ. \nLet's go there. \nThank you, using on. ");

        jtf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {



                String jt = jtf.getText();
                if(jt.equals("1")) {
                    jta.setText("Table name. Writting, 'table'.\n Then press enter key.\n Before writting table name.");
                }
                else if(jt.equals("3")) {
                    jta.setText("");
                }
                else if(jt.equals("table")){
                    String jt2 = jtf2.getText();
                    if(jt2 !=null){
                        jta.setText("Table name, " + jt2+ "\n Make code...");
                        new VariScreen(jt2);
                    }
                }
            }
        });


    }


    public static void main(String[] args) {

        new Sys01();
    }
}
