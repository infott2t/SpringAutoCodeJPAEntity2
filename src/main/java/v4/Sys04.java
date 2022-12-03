package v4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sys04 extends JFrame{

    private JPanel jp;
    private JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,
    jl10,jl11,jl12,jl13,jl14;
    private JTextField jtf, jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
    private JTextArea jta,jta2,jta3,jta4;
    private JScrollPane jsp,jsp2,jsp3,jsp4;
    private JButton btn;

    static UtilStrConvV4 usc;


    String columnStrings;
    String columnLongs;
    String columnDates;
    String tableName;

    String[] colStrs;
    String[] colLongs;
    String[] colDates;


    Sys04(){
        jp= new JPanel();
        jl = new JLabel("Database, Extract variable.");
        jl2 = new JLabel("Table name: ");
        jtf = new JTextField(20);
        jl3 = new JLabel("Extract variable. csv. Column Name, Column Name, ...");
        jta = new JTextArea(5,20);
        jsp = new JScrollPane(jta);
        jsp.setPreferredSize(new Dimension(300,200));
        jtf2 = new JTextField(33);



        btn = new JButton("Extract Letter change...");

        jp.add(jl);
        jp.add(jl2);
        jp.add(jtf);
        jp.add(jl3);
        jp.add(jsp);


        jp.add(btn);
        jp.add(jtf2);
        setVisible(true);
        setResizable(true);
        add(jp);
        setBounds(300,300,390,700);
        setTitle("v4 Table Letter Change, Upper or Camel.");
        jtf2.setText("만든 곳, https://github.com/infott2t/SpringAutoCodeJPAEntity2");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jta.getText();
                String valBefore[] = str.split(",");



                tableName = jtf.getText();
                columnStrings = jta.getText();
                columnLongs  = jta.getText();
                columnDates = jta.getText();

                 usc = new UtilStrConvV4(tableName,valBefore, "sqlUpper");
                 new UpperCaseSQLResultScreen(usc);
                 //usc = new UtilStrConvV4(tableName,valBefore, "Camel");
                //new ExtractVResultScreen(usc);

            }
        });
    }


    public static void main(String[] args){

        new Sys04();
    }
}
