import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariScreen extends JFrame {

    String tableName;
    String resultValueStringAndLong1;
    String resultValueStringAndLong2;
    String resultValueStringAndLong3;
    String resultValueStringAndLong4;
    String resultValueStringAndLong5;
    String resultValueStringAndLong6;
    String resultValueStringAndLong7;
    String resultValueStringAndLong8;
    String resultValueStringAndLong9;
    String resultValueStringAndLong10;
    String resultValueStringAndLong11;
    String resultValueStringAndLong12;
    String resultValueStringAndLong13;
    String resultValueStringAndLong14;
    String resultValueStringAndLong15;
    String resultValueStringAndLong16;
    String resultValueStringAndLong17;
    String resultValueStringAndLong18;
    String resultValueStringAndLong19;
    String resultValueStringAndLong20;
    String resultValueStringAndLong21;
    String resultValueStringAndLong22;
    String resultValueStringAndLong23;
    String resultValueStringAndLong24;
    String resultValueStringAndLong25;
    String resultValueStringAndLong26;
    String resultValueStringAndLong27;
    String resultValueStringAndLong28;
    String resultValueStringAndLong29;
    String resultValueStringAndLong30;

    JPanel jp;

    JTextField jtfEnterKey;

    JTextArea jta;
    JButton btn;


    JLabel aA1jl;
    JLabel aA2jl;
    JLabel aA3jl;
    JLabel aA4jl;
    JLabel aA5jl;
    JLabel aA6jl;
    JLabel aA7jl;
    JLabel aA8jl;
    JLabel aA9jl;
    JLabel aA10jl;
    JLabel aA11jl;
    JLabel aA12jl;
    JLabel aA13jl;
    JLabel aA14jl;
    JLabel aA15jl;
    JLabel aA16jl;
    JLabel aA17jl;
    JLabel aA18jl;
    JLabel aA19jl;
    JLabel aA20jl;
    JLabel aA21jl;
    JLabel aA22jl;
    JLabel aA23jl;
    JLabel aA24jl;
    JLabel aA25jl;
    JLabel aA26jl;
    JLabel aA27jl;
    JLabel aA28jl;
    JLabel aA29jl;
    JLabel aA30jl;

    JTextField aA1jtf;
    JTextField aA2jtf;
    JTextField aA3jtf;
    JTextField aA4jtf;
    JTextField aA5jtf;
    JTextField aA6jtf;
    JTextField aA7jtf;
    JTextField aA8jtf;
    JTextField aA9jtf;
    JTextField aA10jtf;
    JTextField aA11jtf;
    JTextField aA12jtf;
    JTextField aA13jtf;
    JTextField aA14jtf;
    JTextField aA15jtf;
    JTextField aA16jtf;
    JTextField aA17jtf;
    JTextField aA18jtf;
    JTextField aA19jtf;
    JTextField aA20jtf;
    JTextField aA21jtf;
    JTextField aA22jtf;
    JTextField aA23jtf;
    JTextField aA24jtf;
    JTextField aA25jtf;
    JTextField aA26jtf;
    JTextField aA27jtf;
    JTextField aA28jtf;
    JTextField aA29jtf;
    JTextField aA30jtf;


    JRadioButton aA1jrb, aA1jrb2;
    JRadioButton aA2jrb, aA2jrb2;
    JRadioButton aA3jrb, aA3jrb2;
    JRadioButton aA4jrb, aA4jrb2;
    JRadioButton aA5jrb, aA5jrb2;
    JRadioButton aA6jrb, aA6jrb2;
    JRadioButton aA7jrb, aA7jrb2;
    JRadioButton aA8jrb, aA8jrb2;
    JRadioButton aA9jrb, aA9jrb2;
    JRadioButton aA10jrb, aA10jrb2;
    JRadioButton aA11jrb, aA11jrb2;
    JRadioButton aA12jrb, aA12jrb2;
    JRadioButton aA13jrb, aA13jrb2;
    JRadioButton aA14jrb, aA14jrb2;
    JRadioButton aA15jrb, aA15jrb2;
    JRadioButton aA16jrb, aA16jrb2;
    JRadioButton aA17jrb, aA17jrb2;
    JRadioButton aA18jrb, aA18jrb2;
    JRadioButton aA19jrb, aA19jrb2;
    JRadioButton aA20jrb, aA20jrb2;
    JRadioButton aA21jrb, aA21jrb2;
    JRadioButton aA22jrb, aA22jrb2;
    JRadioButton aA23jrb, aA23jrb2;
    JRadioButton aA24jrb, aA24jrb2;
    JRadioButton aA25jrb, aA25jrb2;
    JRadioButton aA26jrb, aA26jrb2;
    JRadioButton aA27jrb, aA27jrb2;
    JRadioButton aA28jrb, aA28jrb2;
    JRadioButton aA29jrb, aA29jrb2;
    JRadioButton aA30jrb, aA30jrb2;





    VariScreen(){}


    VariScreen(String jt2){
        tableName = jt2;
        jp = new JPanel();
        aA1jl = new JLabel("vari1: ");
        aA2jl = new JLabel("vari2: ");
        aA3jl = new JLabel("vari3: ");
        aA4jl = new JLabel("vari4: ");
        aA5jl = new JLabel("vari5: ");
        aA6jl = new JLabel("vari6: ");
        aA7jl = new JLabel("vari7: ");
        aA8jl = new JLabel("vari8: ");
        aA9jl = new JLabel("vari9: ");
        aA10jl = new JLabel("vari10: ");
        aA11jl = new JLabel("vari11: ");
        aA12jl = new JLabel("vari12: ");
        aA13jl = new JLabel("vari13: ");
        aA14jl = new JLabel("vari14: ");
        aA15jl = new JLabel("vari15: ");
        aA16jl = new JLabel("vari16: ");
        aA17jl = new JLabel("vari17: ");
        aA18jl = new JLabel("vari18: ");
        aA19jl = new JLabel("vari19: ");
        aA20jl = new JLabel("vari20: ");
        aA21jl = new JLabel("vari21: ");
        aA22jl = new JLabel("vari22: ");
        aA23jl = new JLabel("vari23: ");
        aA24jl = new JLabel("vari24: ");
        aA25jl = new JLabel("vari25: ");
        aA26jl = new JLabel("vari26: ");
        aA27jl = new JLabel("vari27: ");
        aA28jl = new JLabel("vari28: ");
        aA29jl = new JLabel("vari29: ");
        aA30jl = new JLabel("vari30: ");

        aA1jl.setFont(new Font("", Font.PLAIN,15));
        aA2jl.setFont(new Font("", Font.PLAIN,15));
        aA3jl.setFont(new Font("", Font.PLAIN,15));
        aA4jl.setFont(new Font("", Font.PLAIN,15));
        aA5jl.setFont(new Font("", Font.PLAIN,15));
        aA6jl.setFont(new Font("", Font.PLAIN,15));
        aA7jl.setFont(new Font("", Font.PLAIN,15));
        aA8jl.setFont(new Font("", Font.PLAIN,15));
        aA9jl.setFont(new Font("", Font.PLAIN,15));
        aA10jl.setFont(new Font("", Font.PLAIN,15));
        aA11jl.setFont(new Font("", Font.PLAIN,15));
        aA12jl.setFont(new Font("", Font.PLAIN,15));
        aA13jl.setFont(new Font("", Font.PLAIN,15));
        aA14jl.setFont(new Font("", Font.PLAIN,15));
        aA15jl.setFont(new Font("", Font.PLAIN,15));
        aA16jl.setFont(new Font("", Font.PLAIN,15));
        aA17jl.setFont(new Font("", Font.PLAIN,15));
        aA18jl.setFont(new Font("", Font.PLAIN,15));
        aA19jl.setFont(new Font("", Font.PLAIN,15));
        aA20jl.setFont(new Font("", Font.PLAIN,15));
        aA21jl.setFont(new Font("", Font.PLAIN,15));
        aA22jl.setFont(new Font("", Font.PLAIN,15));
        aA23jl.setFont(new Font("", Font.PLAIN,15));
        aA24jl.setFont(new Font("", Font.PLAIN,15));
        aA25jl.setFont(new Font("", Font.PLAIN,15));
        aA26jl.setFont(new Font("", Font.PLAIN,15));
        aA27jl.setFont(new Font("", Font.PLAIN,15));
        aA28jl.setFont(new Font("", Font.PLAIN,15));
        aA29jl.setFont(new Font("", Font.PLAIN,15));
        aA30jl.setFont(new Font("", Font.PLAIN,15));

        aA1jrb = new JRadioButton("string");
        aA2jrb = new JRadioButton("string");
        aA3jrb = new JRadioButton("string");
        aA4jrb = new JRadioButton("string");
        aA5jrb = new JRadioButton("string");
        aA6jrb = new JRadioButton("string");
        aA7jrb = new JRadioButton("string");
        aA8jrb = new JRadioButton("string");
        aA9jrb = new JRadioButton("string");
        aA10jrb = new JRadioButton("string");
        aA11jrb = new JRadioButton("string");
        aA12jrb = new JRadioButton("string");
        aA13jrb = new JRadioButton("string");
        aA14jrb = new JRadioButton("string");
        aA15jrb = new JRadioButton("string");
        aA16jrb = new JRadioButton("string");
        aA17jrb = new JRadioButton("string");
        aA18jrb = new JRadioButton("string");
        aA19jrb = new JRadioButton("string");
        aA20jrb = new JRadioButton("string");
        aA21jrb = new JRadioButton("string");
        aA22jrb = new JRadioButton("string");
        aA23jrb = new JRadioButton("string");
        aA24jrb = new JRadioButton("string");
        aA25jrb = new JRadioButton("string");
        aA26jrb = new JRadioButton("string");
        aA27jrb = new JRadioButton("string");
        aA28jrb = new JRadioButton("string");
        aA29jrb = new JRadioButton("string");
        aA30jrb = new JRadioButton("string");

        aA1jrb.setFont(new Font("", Font.PLAIN,15));
        aA2jrb.setFont(new Font("", Font.PLAIN,15));
        aA3jrb.setFont(new Font("", Font.PLAIN,15));
        aA4jrb.setFont(new Font("", Font.PLAIN,15));
        aA5jrb.setFont(new Font("", Font.PLAIN,15));
        aA6jrb.setFont(new Font("", Font.PLAIN,15));
        aA7jrb.setFont(new Font("", Font.PLAIN,15));
        aA8jrb.setFont(new Font("", Font.PLAIN,15));
        aA9jrb.setFont(new Font("", Font.PLAIN,15));
        aA10jrb.setFont(new Font("", Font.PLAIN,15));
        aA11jrb.setFont(new Font("", Font.PLAIN,15));
        aA12jrb.setFont(new Font("", Font.PLAIN,15));
        aA13jrb.setFont(new Font("", Font.PLAIN,15));
        aA14jrb.setFont(new Font("", Font.PLAIN,15));
        aA15jrb.setFont(new Font("", Font.PLAIN,15));
        aA16jrb.setFont(new Font("", Font.PLAIN,15));
        aA17jrb.setFont(new Font("", Font.PLAIN,15));
        aA18jrb.setFont(new Font("", Font.PLAIN,15));
        aA19jrb.setFont(new Font("", Font.PLAIN,15));
        aA20jrb.setFont(new Font("", Font.PLAIN,15));
        aA21jrb.setFont(new Font("", Font.PLAIN,15));
        aA22jrb.setFont(new Font("", Font.PLAIN,15));
        aA23jrb.setFont(new Font("", Font.PLAIN,15));
        aA24jrb.setFont(new Font("", Font.PLAIN,15));
        aA25jrb.setFont(new Font("", Font.PLAIN,15));
        aA26jrb.setFont(new Font("", Font.PLAIN,15));
        aA27jrb.setFont(new Font("", Font.PLAIN,15));
        aA28jrb.setFont(new Font("", Font.PLAIN,15));
        aA29jrb.setFont(new Font("", Font.PLAIN,15));
        aA30jrb.setFont(new Font("", Font.PLAIN,15));



        aA1jrb2 = new JRadioButton("long");
        aA2jrb2 = new JRadioButton("long");
        aA3jrb2 = new JRadioButton("long");
        aA4jrb2 = new JRadioButton("long");
        aA5jrb2 = new JRadioButton("long");
        aA6jrb2 = new JRadioButton("long");
        aA7jrb2 = new JRadioButton("long");
        aA8jrb2 = new JRadioButton("long");
        aA9jrb2 = new JRadioButton("long");
        aA10jrb2 = new JRadioButton("long");
        aA11jrb2 = new JRadioButton("long");
        aA12jrb2 = new JRadioButton("long");
        aA13jrb2 = new JRadioButton("long");
        aA14jrb2 = new JRadioButton("long");
        aA15jrb2 = new JRadioButton("long");
        aA16jrb2 = new JRadioButton("long");
        aA17jrb2 = new JRadioButton("long");
        aA18jrb2 = new JRadioButton("long");
        aA19jrb2 = new JRadioButton("long");
        aA20jrb2 = new JRadioButton("long");
        aA21jrb2 = new JRadioButton("long");
        aA22jrb2 = new JRadioButton("long");
        aA23jrb2 = new JRadioButton("long");
        aA24jrb2 = new JRadioButton("long");
        aA25jrb2 = new JRadioButton("long");
        aA26jrb2 = new JRadioButton("long");
        aA27jrb2 = new JRadioButton("long");
        aA28jrb2 = new JRadioButton("long");
        aA29jrb2 = new JRadioButton("long");
        aA30jrb2 = new JRadioButton("long");

        aA1jrb2.setFont(new Font("",Font.PLAIN,15));
        aA2jrb2.setFont(new Font("",Font.PLAIN,15));
        aA3jrb2.setFont(new Font("",Font.PLAIN,15));
        aA4jrb2.setFont(new Font("",Font.PLAIN,15));
        aA5jrb2.setFont(new Font("",Font.PLAIN,15));
        aA6jrb2.setFont(new Font("",Font.PLAIN,15));
        aA7jrb2.setFont(new Font("",Font.PLAIN,15));
        aA8jrb2.setFont(new Font("",Font.PLAIN,15));
        aA9jrb2.setFont(new Font("",Font.PLAIN,15));
        aA10jrb2.setFont(new Font("",Font.PLAIN,15));
        aA11jrb2.setFont(new Font("",Font.PLAIN,15));
        aA12jrb2.setFont(new Font("",Font.PLAIN,15));
        aA13jrb2.setFont(new Font("",Font.PLAIN,15));
        aA14jrb2.setFont(new Font("",Font.PLAIN,15));
        aA15jrb2.setFont(new Font("",Font.PLAIN,15));
        aA16jrb2.setFont(new Font("",Font.PLAIN,15));
        aA17jrb2.setFont(new Font("",Font.PLAIN,15));
        aA18jrb2.setFont(new Font("",Font.PLAIN,15));
        aA19jrb2.setFont(new Font("",Font.PLAIN,15));
        aA20jrb2.setFont(new Font("",Font.PLAIN,15));
        aA21jrb2.setFont(new Font("",Font.PLAIN,15));
        aA22jrb2.setFont(new Font("",Font.PLAIN,15));
        aA23jrb2.setFont(new Font("",Font.PLAIN,15));
        aA24jrb2.setFont(new Font("",Font.PLAIN,15));
        aA25jrb2.setFont(new Font("",Font.PLAIN,15));
        aA26jrb2.setFont(new Font("",Font.PLAIN,15));
        aA27jrb2.setFont(new Font("",Font.PLAIN,15));
        aA28jrb2.setFont(new Font("",Font.PLAIN,15));
        aA29jrb2.setFont(new Font("",Font.PLAIN,15));
        aA30jrb2.setFont(new Font("",Font.PLAIN,15));



        aA1jtf = new JTextField(10);    //aA1jtf.setText();
        aA2jtf = new JTextField(10);
        aA3jtf = new JTextField(10);
        aA4jtf = new JTextField(10);
        aA5jtf = new JTextField(10);
        aA6jtf = new JTextField(10);
        aA7jtf = new JTextField(10);
        aA8jtf = new JTextField(10);
        aA9jtf = new JTextField(10);
        aA10jtf = new JTextField(10);
        aA11jtf = new JTextField(10);
        aA12jtf = new JTextField(10);
        aA13jtf = new JTextField(10);
        aA14jtf = new JTextField(10);
        aA15jtf = new JTextField(10);
        aA16jtf = new JTextField(10);
        aA17jtf = new JTextField(10);
        aA18jtf = new JTextField(10);
        aA19jtf = new JTextField(10);
        aA20jtf = new JTextField(10);
        aA21jtf = new JTextField(10);
        aA22jtf = new JTextField(10);
        aA23jtf = new JTextField(10);
        aA24jtf = new JTextField(10);
        aA25jtf = new JTextField(10);
        aA26jtf = new JTextField(10);
        aA27jtf = new JTextField(10);
        aA28jtf = new JTextField(10);
        aA29jtf = new JTextField(10);
        aA30jtf = new JTextField(10);

        aA1jtf.setFont(new Font("",Font.PLAIN,15));    //aA1jtf.setText();
        aA2jtf.setFont(new Font("",Font.PLAIN,15));
        aA3jtf.setFont(new Font("",Font.PLAIN,15));
        aA4jtf.setFont(new Font("",Font.PLAIN,15));
        aA5jtf.setFont(new Font("",Font.PLAIN,15));
        aA6jtf.setFont(new Font("",Font.PLAIN,15));
        aA7jtf.setFont(new Font("",Font.PLAIN,15));
        aA8jtf.setFont(new Font("",Font.PLAIN,15));
        aA9jtf.setFont(new Font("",Font.PLAIN,15));
        aA10jtf.setFont(new Font("",Font.PLAIN,15));
        aA11jtf.setFont(new Font("",Font.PLAIN,15));
        aA12jtf.setFont(new Font("",Font.PLAIN,15));
        aA13jtf.setFont(new Font("",Font.PLAIN,15));
        aA14jtf.setFont(new Font("",Font.PLAIN,15));
        aA15jtf.setFont(new Font("",Font.PLAIN,15));
        aA16jtf.setFont(new Font("",Font.PLAIN,15));
        aA17jtf.setFont(new Font("",Font.PLAIN,15));
        aA18jtf.setFont(new Font("",Font.PLAIN,15));
        aA19jtf.setFont(new Font("",Font.PLAIN,15));
        aA20jtf.setFont(new Font("",Font.PLAIN,15));
        aA21jtf.setFont(new Font("",Font.PLAIN,15));
        aA22jtf.setFont(new Font("",Font.PLAIN,15));
        aA23jtf.setFont(new Font("",Font.PLAIN,15));
        aA24jtf.setFont(new Font("",Font.PLAIN,15));
        aA25jtf.setFont(new Font("",Font.PLAIN,15));
        aA26jtf.setFont(new Font("",Font.PLAIN,15));
        aA27jtf.setFont(new Font("",Font.PLAIN,15));
        aA28jtf.setFont(new Font("",Font.PLAIN,15));
        aA29jtf.setFont(new Font("",Font.PLAIN,15));
        aA30jtf.setFont(new Font("",Font.PLAIN,15));




        //jtfEnterKey = new JTextField(10);




        btn = new JButton("Generate");
        btn.setFont(new Font("",Font.PLAIN,15));
        jta = new JTextArea(15,30);
        jta.setFont(new Font("",Font.PLAIN,15));
        //jtfEnterKey.setText("");


        jp.add(aA1jl);
        jp.add(aA1jrb);
        jp.add(aA1jrb2);
        jp.add(aA1jtf);

        jp.add(aA2jl);
        jp.add(aA2jrb);
        jp.add(aA2jrb2);
        jp.add(aA2jtf);


        jp.add(aA3jl);
        jp.add(aA3jrb);
        jp.add(aA3jrb2);
        jp.add(aA3jtf);

        jp.add(aA4jl);
        jp.add(aA4jrb);
        jp.add(aA4jrb2);
        jp.add(aA4jtf);

        jp.add(aA5jl);
        jp.add(aA5jrb);
        jp.add(aA5jrb2);
        jp.add(aA5jtf);

        jp.add(aA6jl);
        jp.add(aA6jrb);
        jp.add(aA6jrb2);
        jp.add(aA6jtf);

        jp.add(aA7jl);
        jp.add(aA7jrb);
        jp.add(aA7jrb2);
        jp.add(aA7jtf);

        jp.add(aA8jl);
        jp.add(aA8jrb);
        jp.add(aA8jrb2);
        jp.add(aA8jtf);

        jp.add(aA9jl);
        jp.add(aA9jrb);
        jp.add(aA9jrb2);
        jp.add(aA9jtf);

        jp.add(aA10jl);
        jp.add(aA10jrb);
        jp.add(aA10jrb2);
        jp.add(aA10jtf);

        jp.add(aA11jl);
        jp.add(aA11jrb);
        jp.add(aA11jrb2);
        jp.add(aA11jtf);

        jp.add(aA12jl);
        jp.add(aA12jrb);
        jp.add(aA12jrb2);
        jp.add(aA12jtf);

        jp.add(aA13jl);
        jp.add(aA13jrb);
        jp.add(aA13jrb2);
        jp.add(aA13jtf);

        jp.add(aA14jl);
        jp.add(aA14jrb);
        jp.add(aA14jrb2);
        jp.add(aA14jtf);

        jp.add(aA15jl);
        jp.add(aA15jrb);
        jp.add(aA15jrb2);
        jp.add(aA15jtf);

        jp.add(aA16jl);
        jp.add(aA16jrb);
        jp.add(aA16jrb2);
        jp.add(aA16jtf);

        jp.add(aA17jl);
        jp.add(aA17jrb);
        jp.add(aA17jrb2);
        jp.add(aA17jtf);

        jp.add(aA18jl);
        jp.add(aA18jrb);
        jp.add(aA18jrb2);
        jp.add(aA18jtf);

        jp.add(aA19jl);
        jp.add(aA19jrb);
        jp.add(aA19jrb2);
        jp.add(aA19jtf);

        jp.add(aA20jl);
        jp.add(aA20jrb);
        jp.add(aA20jrb2);
        jp.add(aA20jtf);

        jp.add(aA21jl);
        jp.add(aA21jrb);
        jp.add(aA21jrb2);
        jp.add(aA21jtf);

        jp.add(aA22jl);
        jp.add(aA22jrb);
        jp.add(aA22jrb2);
        jp.add(aA22jtf);

        jp.add(aA23jl);
        jp.add(aA23jrb);
        jp.add(aA23jrb2);
        jp.add(aA23jtf);

        jp.add(aA24jl);
        jp.add(aA24jrb);
        jp.add(aA24jrb2);
        jp.add(aA24jtf);

        jp.add(aA25jl);
        jp.add(aA25jrb);
        jp.add(aA25jrb2);
        jp.add(aA25jtf);

        jp.add(aA26jl);
        jp.add(aA26jrb);
        jp.add(aA26jrb2);
        jp.add(aA26jtf);

        jp.add(aA27jl);
        jp.add(aA27jrb);
        jp.add(aA27jrb2);
        jp.add(aA27jtf);

        jp.add(aA28jl);
        jp.add(aA28jrb);
        jp.add(aA28jrb2);
        jp.add(aA28jtf);

        jp.add(aA29jl);
        jp.add(aA29jrb);
        jp.add(aA29jrb2);
        jp.add(aA29jtf);

        jp.add(aA30jl);
        jp.add(aA30jrb);
        jp.add(aA30jrb2);
        jp.add(aA30jtf);

        //jp.add(jtfEnterKey);
        jp.add(btn);
        jp.add(jta);
        setBounds(100,100,650,925);
        setTitle("Control drive01"+" Table name, "+tableName);
        setFont(new Font("",Font.PLAIN,20));
        setVisible(true);
        setResizable(true);
        add(jp);

        jta.setText("Input variable. Fisrt, vari1. must Long. and have primary key.\n * Rule, first column, have Id, end position. Column1 name, maked that --> vari1+Id. \n And If blink, have null value so, need erase that code. Thank you. and 1~30. Strait input need. And, Generate. Button click~. \n\n *Using programming, Spring boot(https://spring.io). Automation coding. \n2021-08-01. Writter, Hyeonil Choi.\n\n  Thank you.\n And How about this. Church. Jesus Christ. \nLet's go there. Thank you, using on. ");
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

                String v1 = aA1jtf.getText();
                String v2 = aA2jtf.getText();
                String v3 = aA3jtf.getText();
                String v4 = aA4jtf.getText();
                String v5 = aA5jtf.getText();
                String v6 = aA6jtf.getText();
                String v7 = aA7jtf.getText();
                String v8 = aA8jtf.getText();
                String v9 = aA9jtf.getText();
                String v10 = aA10jtf.getText();
                String v11 = aA11jtf.getText();
                String v12 = aA12jtf.getText();
                String v13 = aA13jtf.getText();
                String v14 = aA14jtf.getText();
                String v15 = aA15jtf.getText();
                String v16 = aA16jtf.getText();
                String v17 = aA17jtf.getText();
                String v18 = aA18jtf.getText();
                String v19 = aA19jtf.getText();
                String v20 = aA20jtf.getText();
                String v21 = aA21jtf.getText();
                String v22 = aA22jtf.getText();
                String v23 = aA23jtf.getText();
                String v24 = aA24jtf.getText();
                String v25 = aA25jtf.getText();
                String v26 = aA26jtf.getText();
                String v27 = aA27jtf.getText();
                String v28 = aA28jtf.getText();
                String v29 = aA29jtf.getText();
                String v30 = aA30jtf.getText();
                //jta.setText("v, " + v);
                Boolean radioSt1 = aA1jrb.isSelected();
                Boolean radioSt2 = aA2jrb.isSelected();
                Boolean radioSt3 = aA3jrb.isSelected();
                Boolean radioSt4 = aA4jrb.isSelected();
                Boolean radioSt5 = aA5jrb.isSelected();
                Boolean radioSt6 = aA6jrb.isSelected();
                Boolean radioSt7 = aA7jrb.isSelected();
                Boolean radioSt8 = aA8jrb.isSelected();
                Boolean radioSt9 = aA9jrb.isSelected();
                Boolean radioSt10 = aA10jrb.isSelected();
                Boolean radioSt11 = aA11jrb.isSelected();
                Boolean radioSt12 = aA12jrb.isSelected();
                Boolean radioSt13 = aA13jrb.isSelected();
                Boolean radioSt14 = aA14jrb.isSelected();
                Boolean radioSt15 = aA15jrb.isSelected();
                Boolean radioSt16 = aA16jrb.isSelected();
                Boolean radioSt17 = aA17jrb.isSelected();
                Boolean radioSt18 = aA18jrb.isSelected();
                Boolean radioSt19 = aA19jrb.isSelected();
                Boolean radioSt20 = aA20jrb.isSelected();
                Boolean radioSt21 = aA21jrb.isSelected();
                Boolean radioSt22 = aA22jrb.isSelected();
                Boolean radioSt23 = aA23jrb.isSelected();
                Boolean radioSt24 = aA24jrb.isSelected();
                Boolean radioSt25 = aA25jrb.isSelected();
                Boolean radioSt26 = aA26jrb.isSelected();
                Boolean radioSt27 = aA27jrb.isSelected();
                Boolean radioSt28 = aA28jrb.isSelected();
                Boolean radioSt29 = aA29jrb.isSelected();
                Boolean radioSt30 = aA30jrb.isSelected();


                Boolean radioLo1 = aA1jrb2.isSelected();
                Boolean radioLo2 = aA2jrb2.isSelected();
                Boolean radioLo3 = aA3jrb2.isSelected();
                Boolean radioLo4 = aA4jrb2.isSelected();
                Boolean radioLo5 = aA5jrb2.isSelected();
                Boolean radioLo6 = aA6jrb2.isSelected();
                Boolean radioLo7 = aA7jrb2.isSelected();
                Boolean radioLo8 = aA8jrb2.isSelected();
                Boolean radioLo9 = aA9jrb2.isSelected();
                Boolean radioLo10 = aA10jrb2.isSelected();
                Boolean radioLo11 = aA11jrb2.isSelected();
                Boolean radioLo12 = aA12jrb2.isSelected();
                Boolean radioLo13 = aA13jrb2.isSelected();
                Boolean radioLo14 = aA14jrb2.isSelected();
                Boolean radioLo15 = aA15jrb2.isSelected();
                Boolean radioLo16 = aA16jrb2.isSelected();
                Boolean radioLo17 = aA17jrb2.isSelected();
                Boolean radioLo18 = aA18jrb2.isSelected();
                Boolean radioLo19 = aA19jrb2.isSelected();
                Boolean radioLo20 = aA20jrb2.isSelected();
                Boolean radioLo21 = aA21jrb2.isSelected();
                Boolean radioLo22 = aA22jrb2.isSelected();
                Boolean radioLo23 = aA23jrb2.isSelected();
                Boolean radioLo24 = aA24jrb2.isSelected();
                Boolean radioLo25 = aA25jrb2.isSelected();
                Boolean radioLo26 = aA26jrb2.isSelected();
                Boolean radioLo27 = aA27jrb2.isSelected();
                Boolean radioLo28 = aA28jrb2.isSelected();
                Boolean radioLo29 = aA29jrb2.isSelected();
                Boolean radioLo30 = aA30jrb2.isSelected();

                if(radioSt1){resultValueStringAndLong1="String";}
                if(radioSt2){resultValueStringAndLong2="String";}
                if(radioSt3){resultValueStringAndLong3="String";}
                if(radioSt4){resultValueStringAndLong4="String";}
                if(radioSt5){resultValueStringAndLong5="String";}
                if(radioSt6){resultValueStringAndLong6="String";}
                if(radioSt7){resultValueStringAndLong7="String";}
                if(radioSt8){resultValueStringAndLong8="String";}
                if(radioSt9){resultValueStringAndLong9="String";}
                if(radioSt10){resultValueStringAndLong10="String";}
                if(radioSt11){resultValueStringAndLong11="String";}
                if(radioSt12){resultValueStringAndLong12="String";}
                if(radioSt13){resultValueStringAndLong13="String";}
                if(radioSt14){resultValueStringAndLong14="String";}
                if(radioSt15){resultValueStringAndLong15="String";}
                if(radioSt16){resultValueStringAndLong16="String";}
                if(radioSt17){resultValueStringAndLong17="String";}
                if(radioSt18){resultValueStringAndLong18="String";}
                if(radioSt19){resultValueStringAndLong19="String";}
                if(radioSt20){resultValueStringAndLong20="String";}
                if(radioSt21){resultValueStringAndLong21="String";}
                if(radioSt22){resultValueStringAndLong22="String";}
                if(radioSt23){resultValueStringAndLong23="String";}
                if(radioSt24){resultValueStringAndLong24="String";}
                if(radioSt25){resultValueStringAndLong25="String";}
                if(radioSt26){resultValueStringAndLong26="String";}
                if(radioSt27){resultValueStringAndLong27="String";}
                if(radioSt28){resultValueStringAndLong28="String";}
                if(radioSt29){resultValueStringAndLong29="String";}
                if(radioSt30){resultValueStringAndLong30="String";}
                if(radioLo1){resultValueStringAndLong1="Long";}
                if(radioLo2){resultValueStringAndLong2="Long";}
                if(radioLo3){resultValueStringAndLong3="Long";}
                if(radioLo4){resultValueStringAndLong4="Long";}
                if(radioLo5){resultValueStringAndLong5="Long";}
                if(radioLo6){resultValueStringAndLong6="Long";}
                if(radioLo7){resultValueStringAndLong7="Long";}
                if(radioLo8){resultValueStringAndLong8="Long";}
                if(radioLo9){resultValueStringAndLong9="Long";}
                if(radioLo10){resultValueStringAndLong10="Long";}
                if(radioLo11){resultValueStringAndLong11="Long";}
                if(radioLo12){resultValueStringAndLong12="Long";}
                if(radioLo13){resultValueStringAndLong13="Long";}
                if(radioLo14){resultValueStringAndLong14="Long";}
                if(radioLo15){resultValueStringAndLong15="Long";}
                if(radioLo16){resultValueStringAndLong16="Long";}
                if(radioLo17){resultValueStringAndLong17="Long";}
                if(radioLo18){resultValueStringAndLong18="Long";}
                if(radioLo19){resultValueStringAndLong19="Long";}
                if(radioLo20){resultValueStringAndLong20="Long";}
                if(radioLo21){resultValueStringAndLong21="Long";}
                if(radioLo22){resultValueStringAndLong22="Long";}
                if(radioLo23){resultValueStringAndLong23="Long";}
                if(radioLo24){resultValueStringAndLong24="Long";}
                if(radioLo25){resultValueStringAndLong25="Long";}
                if(radioLo26){resultValueStringAndLong26="Long";}
                if(radioLo27){resultValueStringAndLong27="Long";}
                if(radioLo28){resultValueStringAndLong28="Long";}
                if(radioLo29){resultValueStringAndLong29="Long";}
                if(radioLo30){resultValueStringAndLong30="Long";}

                  new Make_domain_table_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_domain_table_Repository_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_service_domain_TableService_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_cont_domain_TableApiController_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_cont_domain_TableController_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_dto_domain_ListResponseDto_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_dto_domain_ResponseDto_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                 );
                new Make_web_dto_domain_SaveRequestDto_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_dto_domain_UpdateRequestDto_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
                new Make_web_cont_AdminController_ResultScreen(
                        tableName,
                        v1,
                        v2,
                        v3,
                        v4,
                        v5,
                        v6,
                        v7,
                        v8,
                        v9,
                        v10,
                        v11,
                        v12,
                        v13,
                        v14,
                        v15,
                        v16,
                        v17,
                        v18,
                        v19,
                        v20,
                        v21,
                        v22,
                        v23,
                        v24,
                        v25,
                        v26,
                        v27,
                        v28,
                        v29,
                        v30,
                        resultValueStringAndLong1,
                        resultValueStringAndLong2,
                        resultValueStringAndLong3,
                        resultValueStringAndLong4,
                        resultValueStringAndLong5,
                        resultValueStringAndLong6,
                        resultValueStringAndLong7,
                        resultValueStringAndLong8,
                        resultValueStringAndLong9,
                        resultValueStringAndLong10,
                        resultValueStringAndLong11,
                        resultValueStringAndLong12,
                        resultValueStringAndLong13,
                        resultValueStringAndLong14,
                        resultValueStringAndLong15,
                        resultValueStringAndLong16,
                        resultValueStringAndLong17,
                        resultValueStringAndLong18,
                        resultValueStringAndLong19,
                        resultValueStringAndLong20,
                        resultValueStringAndLong21,
                        resultValueStringAndLong22,
                        resultValueStringAndLong23,
                        resultValueStringAndLong24,
                        resultValueStringAndLong25,
                        resultValueStringAndLong26,
                        resultValueStringAndLong27,
                        resultValueStringAndLong28,
                        resultValueStringAndLong29,
                        resultValueStringAndLong30
                );
            }
        });

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                jta.setText("Table, name : " + tableName+"\n Complete.");

            }
        });


    }


}
