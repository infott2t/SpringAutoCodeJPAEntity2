import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Make_web_dto_domain_SaveRequestDto_ResultScreen extends JFrame {

    JPanel jp;
    JLabel jl;
    JTextField jtf;
    JTextArea jta;
    JButton btn;
    JScrollPane scrolljta;

    String reCodeTN_LFUC; // Recode. table name, letter first upper case (LFUC) ex)abc -> Abc.

    String reCodeV1_LFUC; // Recode. Variable. Column name, letter first upper caseLFUC. ex) abc -> Abc.
    String reCodeV2_LFUC;
    String reCodeV3_LFUC;
    String reCodeV4_LFUC;
    String reCodeV5_LFUC;
    String reCodeV6_LFUC;
    String reCodeV7_LFUC;
    String reCodeV8_LFUC;
    String reCodeV9_LFUC;
    String reCodeV10_LFUC;
    String reCodeV11_LFUC;
    String reCodeV12_LFUC;
    String reCodeV13_LFUC;
    String reCodeV14_LFUC;
    String reCodeV15_LFUC;
    String reCodeV16_LFUC;
    String reCodeV17_LFUC;
    String reCodeV18_LFUC;
    String reCodeV19_LFUC;
    String reCodeV20_LFUC;
    String reCodeV21_LFUC;
    String reCodeV22_LFUC;
    String reCodeV23_LFUC;
    String reCodeV24_LFUC;
    String reCodeV25_LFUC;
    String reCodeV26_LFUC;
    String reCodeV27_LFUC;
    String reCodeV28_LFUC;
    String reCodeV29_LFUC;
    String reCodeV30_LFUC;



    public Make_web_dto_domain_SaveRequestDto_ResultScreen(String tableName, String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9, String v10, String v11, String v12, String v13, String v14, String v15, String v16, String v17, String v18, String v19, String v20, String v21, String v22, String v23, String v24, String v25, String v26, String v27, String v28, String v29, String v30, String resultValueStringAndLong1, String resultValueStringAndLong2, String resultValueStringAndLong3, String resultValueStringAndLong4, String resultValueStringAndLong5, String resultValueStringAndLong6, String resultValueStringAndLong7, String resultValueStringAndLong8, String resultValueStringAndLong9, String resultValueStringAndLong10, String resultValueStringAndLong11, String resultValueStringAndLong12, String resultValueStringAndLong13, String resultValueStringAndLong14, String resultValueStringAndLong15, String resultValueStringAndLong16, String resultValueStringAndLong17, String resultValueStringAndLong18, String resultValueStringAndLong19, String resultValueStringAndLong20, String resultValueStringAndLong21, String resultValueStringAndLong22, String resultValueStringAndLong23, String resultValueStringAndLong24, String resultValueStringAndLong25, String resultValueStringAndLong26, String resultValueStringAndLong27, String resultValueStringAndLong28, String resultValueStringAndLong29, String resultValueStringAndLong30) {
        jp = new JPanel();
        jl = new JLabel("Rally: Table Name, "+ tableName );
        jl.setFont(new Font("", Font.PLAIN, 15));
        jtf = new JTextField(30);
        jtf.setFont(new Font("", Font.PLAIN,15));
        btn = new JButton("enter");
        btn.setFont(new Font("", Font.PLAIN,15));
        jta = new JTextArea(20,50);
        jta.setFont(new Font("", Font.PLAIN,15));
        scrolljta = new JScrollPane(jta);

        jp.add(jl);
        jp.add(jtf);
        jp.add(btn);
        jp.add(scrolljta);
        setBounds(300,300,863,567);

        setVisible(true);
        setResizable(true);
        add(jp);

        //jta.setText("1. input\n2. View Status\n3.Turn");
        jtf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String jt = jtf.getText();
                if(jt.equals("1")) {
                    jta.setText("1. new instance \n2. move instance");
                }
                else if(jt.equals("3")) {
                    jta.setText("");
                }
            }
        });

        //v1, 대소문자 앞글자를 소문자로 바꾸기. 변수명.
        //v1.
        Util util = new Util();
        reCodeTN_LFUC = util.frontChangeCase(tableName);
        setTitle("web.dto."+tableName+"."+reCodeTN_LFUC+"SaveRequestDto.java File.");

        if(v1.equals("")){}else{reCodeV1_LFUC = util.frontChangeCase(v1);}
        if(v2.equals("")){}else{reCodeV2_LFUC = util.frontChangeCase(v2);}
        if(v3.equals("")){}else{reCodeV3_LFUC = util.frontChangeCase(v3);}
        if(v4.equals("")){}else{reCodeV4_LFUC = util.frontChangeCase(v4);}
        if(v5.equals("")){}else{reCodeV5_LFUC = util.frontChangeCase(v5);}
        if(v6.equals("")){}else{reCodeV6_LFUC = util.frontChangeCase(v6);}
        if(v7.equals("")){}else{reCodeV7_LFUC = util.frontChangeCase(v7);}
        if(v8.equals("")){}else{reCodeV8_LFUC = util.frontChangeCase(v8);}
        if(v9.equals("")){}else{reCodeV9_LFUC = util.frontChangeCase(v9);}
        if(v10.equals("")){}else{reCodeV10_LFUC = util.frontChangeCase(v10);}
        if(v11.equals("")){}else{reCodeV11_LFUC = util.frontChangeCase(v11);}
        if(v12.equals("")){}else{reCodeV12_LFUC = util.frontChangeCase(v12);}
        if(v13.equals("")){}else{reCodeV13_LFUC = util.frontChangeCase(v13);}
        if(v14.equals("")){}else{reCodeV14_LFUC = util.frontChangeCase(v14);}
        if(v15.equals("")){}else{reCodeV15_LFUC = util.frontChangeCase(v15);}
        if(v16.equals("")){}else{reCodeV16_LFUC = util.frontChangeCase(v16);}
        if(v17.equals("")){}else{reCodeV17_LFUC = util.frontChangeCase(v17);}
        if(v18.equals("")){}else{reCodeV18_LFUC = util.frontChangeCase(v18);}
        if(v19.equals("")){}else{reCodeV19_LFUC = util.frontChangeCase(v19);}
        if(v20.equals("")){}else{reCodeV20_LFUC = util.frontChangeCase(v20);}
        if(v21.equals("")){}else{reCodeV21_LFUC = util.frontChangeCase(v21);}
        if(v22.equals("")){}else{reCodeV22_LFUC = util.frontChangeCase(v22);}
        if(v23.equals("")){}else{reCodeV23_LFUC = util.frontChangeCase(v23);}
        if(v24.equals("")){}else{reCodeV24_LFUC = util.frontChangeCase(v24);}
        if(v25.equals("")){}else{reCodeV25_LFUC = util.frontChangeCase(v25);}
        if(v26.equals("")){}else{reCodeV26_LFUC = util.frontChangeCase(v26);}
        if(v27.equals("")){}else{reCodeV27_LFUC = util.frontChangeCase(v27);}
        if(v28.equals("")){}else{reCodeV28_LFUC = util.frontChangeCase(v28);}
        if(v29.equals("")){}else{reCodeV29_LFUC = util.frontChangeCase(v29);}
        if(v30.equals("")){}else{reCodeV30_LFUC = util.frontChangeCase(v30);}

        //reCodeV1_LFUC = v1;
        //reCodeV2_LFUC = v2;
        //reCodeV3_LFUC = v3;
        //reCodeV4_LFUC = v4;
        //System.out.println("v4 값: " + v4);
        //reCodeV5_LFUC = v5;
        //reCodeV6_LFUC = v6;
        //reCodeV7_LFUC = v7;
        //reCodeV8_LFUC = v8;
        //reCodeV9_LFUC = v9;
        //reCodeV10_LFUC = v10;
        //reCodeV11_LFUC = v11;
        //reCodeV12_LFUC = v12;
        //reCodeV13_LFUC = v13;
        //reCodeV14_LFUC = v14;
        //reCodeV15_LFUC = v15;
        //reCodeV16_LFUC = v16;
        //reCodeV17_LFUC = v17;
        //reCodeV18_LFUC = v18;
        //reCodeV19_LFUC = v19;
        //reCodeV20_LFUC = v20;
        //reCodeV21_LFUC = v21;
        //reCodeV22_LFUC = v22;
        //reCodeV23_LFUC = v23;
        //reCodeV24_LFUC = v24;
        //reCodeV25_LFUC = v25;
        //reCodeV26_LFUC = v26;
        //reCodeV27_LFUC = v27;
        //reCodeV28_LFUC = v28;
        //reCodeV29_LFU= v30;
        //
        ////ex, PostsService
        jta.setText("// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible. \n"+
                "//  " + reCodeTN_LFUC +"SaveRequestDto.java       File. Textting. \n"+
                "// \n"+
                "\n"+
                "@Getter\n"+
                "@NoArgsConstructor\n"+
                "public class "+reCodeTN_LFUC+"SaveRequestDto {\n"+

                "   private "+resultValueStringAndLong2 +" "+v2+";\n"+
                "   private "+resultValueStringAndLong3 +" "+v3+";\n"+
                "   private "+resultValueStringAndLong4 +" "+v4+";\n"+
                "   private "+resultValueStringAndLong5 +" "+v5+";\n"+
                "   private "+resultValueStringAndLong6 +" "+v6+";\n"+
                "   private "+resultValueStringAndLong7 +" "+v7+";\n"+
                "   private "+resultValueStringAndLong8 +" "+v8+";\n"+
                "   private "+resultValueStringAndLong9 +" "+v9+";\n"+
                "   private "+resultValueStringAndLong10 +" "+v10+";\n"+
                "   private "+resultValueStringAndLong11 +" "+v11+";\n"+
                "   private "+resultValueStringAndLong12 +" "+v12+";\n"+
                "   private "+resultValueStringAndLong13 +" "+v13+";\n"+
                "   private "+resultValueStringAndLong14 +" "+v14+";\n"+
                "   private "+resultValueStringAndLong15 +" "+v15+";\n"+
                "   private "+resultValueStringAndLong16 +" "+v16+";\n"+
                "   private "+resultValueStringAndLong17 +" "+v17+";\n"+
                "   private "+resultValueStringAndLong18 +" "+v18+";\n"+
                "   private "+resultValueStringAndLong19 +" "+v19+";\n"+
                "   private "+resultValueStringAndLong20 +" "+v20+";\n"+
                "   private "+resultValueStringAndLong21 +" "+v21+";\n"+
                "   private "+resultValueStringAndLong22 +" "+v22+";\n"+
                "   private "+resultValueStringAndLong23 +" "+v23+";\n"+
                "   private "+resultValueStringAndLong24 +" "+v24+";\n"+
                "   private "+resultValueStringAndLong25 +" "+v25+";\n"+
                "   private "+resultValueStringAndLong26 +" "+v26+";\n"+
                "   private "+resultValueStringAndLong27 +" "+v27+";\n"+
                "   private "+resultValueStringAndLong28 +" "+v28+";\n"+
                "   private "+resultValueStringAndLong29 +" "+v29+";\n"+
                "   private "+resultValueStringAndLong30 +" "+v30+";\n"+

                "\n"+
                "   @Builder\n"+
                "   public "+reCodeTN_LFUC+"SaveRequestDto("+
                                                    resultValueStringAndLong2+" "+v2+",\n"+
                                                    resultValueStringAndLong3+" "+v3+",\n"+
                                                    resultValueStringAndLong4+" "+v4+",\n"+
                                                    resultValueStringAndLong5+" "+v5+",\n"+
                                                    resultValueStringAndLong6+" "+v6+",\n"+
                                                    resultValueStringAndLong7+" "+v7+",\n"+
                                                    resultValueStringAndLong8+" "+v8+",\n"+
                                                    resultValueStringAndLong9+" "+v9+",\n"+
                                                    resultValueStringAndLong10+" "+v10+",\n"+
                                                    resultValueStringAndLong11+" "+v11+",\n"+
                                                    resultValueStringAndLong12+" "+v12+",\n"+
                                                    resultValueStringAndLong13+" "+v13+",\n"+
                                                    resultValueStringAndLong14+" "+v14+",\n"+
                                                    resultValueStringAndLong15+" "+v15+",\n"+
                                                    resultValueStringAndLong16+" "+v16+",\n"+
                                                    resultValueStringAndLong17+" "+v17+",\n"+
                                                    resultValueStringAndLong18+" "+v18+",\n"+
                                                    resultValueStringAndLong19+" "+v19+",\n"+
                                                    resultValueStringAndLong20+" "+v20+",\n"+
                                                    resultValueStringAndLong21+" "+v21+",\n"+
                                                    resultValueStringAndLong22+" "+v22+",\n"+
                                                    resultValueStringAndLong23+" "+v23+",\n"+
                                                    resultValueStringAndLong24+" "+v24+",\n"+
                                                    resultValueStringAndLong25+" "+v25+",\n"+
                                                    resultValueStringAndLong26+" "+v26+",\n"+
                                                    resultValueStringAndLong27+" "+v27+",\n"+
                                                    resultValueStringAndLong28+" "+v28+",\n"+
                                                    resultValueStringAndLong29+" "+v29+",\n"+
                                                    resultValueStringAndLong30+" "+v30+"\n"+
                "                  ){\n"+

                "       this."+v2+" = "+v2+";\n"+
                "       this."+v3+" = "+v3+";\n"+
                "       this."+v4+" = "+v4+";\n"+
                "       this."+v5+" = "+v5+";\n"+
                "       this."+v6+" = "+v6+";\n"+
                "       this."+v7+" = "+v7+";\n"+
                "       this."+v8+" = "+v8+";\n"+
                "       this."+v9+" = "+v9+";\n"+
                "       this."+v10+" = "+v10+";\n"+
                "       this."+v11+" = "+v11+";\n"+
                "       this."+v12+" = "+v12+";\n"+
                "       this."+v13+" = "+v13+";\n"+
                "       this."+v14+" = "+v14+";\n"+
                "       this."+v15+" = "+v15+";\n"+
                "       this."+v16+" = "+v16+";\n"+
                "       this."+v17+" = "+v17+";\n"+
                "       this."+v18+" = "+v18+";\n"+
                "       this."+v19+" = "+v19+";\n"+
                "       this."+v20+" = "+v20+";\n"+
                "       this."+v21+" = "+v21+";\n"+
                "       this."+v22+" = "+v22+";\n"+
                "       this."+v23+" = "+v23+";\n"+
                "       this."+v24+" = "+v24+";\n"+
                "       this."+v25+" = "+v25+";\n"+
                "       this."+v26+" = "+v26+";\n"+
                "       this."+v27+" = "+v27+";\n"+
                "       this."+v28+" = "+v28+";\n"+
                "       this."+v29+" = "+v29+";\n"+
                "       this."+v30+" = "+v30+";\n"+
                "   }\n"+
                "\n"+
                "   public "+reCodeTN_LFUC+" toEntity() {\n"+
                "\n"+
                "       return "+reCodeTN_LFUC+".builder()\n"+
                "                 ."+v2+"("+v2+")\n"+
                "                 ."+v3+"("+v3+")\n"+
                "                 ."+v4+"("+v4+")\n"+
                "                 ."+v5+"("+v5+")\n"+
                "                 ."+v6+"("+v6+")\n"+
                "                 ."+v7+"("+v7+")\n"+
                "                 ."+v8+"("+v8+")\n"+
                "                 ."+v9+"("+v9+")\n"+
                "                 ."+v10+"("+v10+")\n"+
                "                 ."+v11+"("+v11+")\n"+
                "                 ."+v12+"("+v12+")\n"+
                "                 ."+v13+"("+v13+")\n"+
                "                 ."+v14+"("+v14+")\n"+
                "                 ."+v15+"("+v15+")\n"+
                "                 ."+v16+"("+v16+")\n"+
                "                 ."+v17+"("+v17+")\n"+
                "                 ."+v18+"("+v18+")\n"+
                "                 ."+v19+"("+v19+")\n"+
                "                 ."+v20+"("+v20+")\n"+
                "                 ."+v21+"("+v21+")\n"+
                "                 ."+v22+"("+v22+")\n"+
                "                 ."+v23+"("+v23+")\n"+
                "                 ."+v24+"("+v24+")\n"+
                "                 ."+v25+"("+v25+")\n"+
                "                 ."+v26+"("+v26+")\n"+
                "                 ."+v27+"("+v27+")\n"+
                "                 ."+v28+"("+v28+")\n"+
                "                 ."+v29+"("+v29+")\n"+
                "                 ."+v30+"("+v30+")\n"+
                "                 .build();\n"+

                "      }\n"+
                "}\n"




        );

        // 1. 파일 객체 생성
        try {
            File file = new File("C:\\category\\" +reCodeTN_LFUC +"SaveRequestDto.java");
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
            //3. Buffer를 사용해서 File에 write할 수 있는 BufferedWriter 생성
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            // 4. 파일에 쓰기
            writer.write("// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible. \n"+
                    "//  " + reCodeTN_LFUC +"SaveRequestDto.java       File. Textting. \n"+
                    "// \n"+
                    "\n"+
                    "@Getter\n"+
                    "@NoArgsConstructor\n"+
                    "public class "+reCodeTN_LFUC+"SaveRequestDto {\n"+

                    "   private "+resultValueStringAndLong2 +" "+v2+";\n"+
                    "   private "+resultValueStringAndLong3 +" "+v3+";\n"+
                    "   private "+resultValueStringAndLong4 +" "+v4+";\n"+
                    "   private "+resultValueStringAndLong5 +" "+v5+";\n"+
                    "   private "+resultValueStringAndLong6 +" "+v6+";\n"+
                    "   private "+resultValueStringAndLong7 +" "+v7+";\n"+
                    "   private "+resultValueStringAndLong8 +" "+v8+";\n"+
                    "   private "+resultValueStringAndLong9 +" "+v9+";\n"+
                    "   private "+resultValueStringAndLong10 +" "+v10+";\n"+
                    "   private "+resultValueStringAndLong11 +" "+v11+";\n"+
                    "   private "+resultValueStringAndLong12 +" "+v12+";\n"+
                    "   private "+resultValueStringAndLong13 +" "+v13+";\n"+
                    "   private "+resultValueStringAndLong14 +" "+v14+";\n"+
                    "   private "+resultValueStringAndLong15 +" "+v15+";\n"+
                    "   private "+resultValueStringAndLong16 +" "+v16+";\n"+
                    "   private "+resultValueStringAndLong17 +" "+v17+";\n"+
                    "   private "+resultValueStringAndLong18 +" "+v18+";\n"+
                    "   private "+resultValueStringAndLong19 +" "+v19+";\n"+
                    "   private "+resultValueStringAndLong20 +" "+v20+";\n"+
                    "   private "+resultValueStringAndLong21 +" "+v21+";\n"+
                    "   private "+resultValueStringAndLong22 +" "+v22+";\n"+
                    "   private "+resultValueStringAndLong23 +" "+v23+";\n"+
                    "   private "+resultValueStringAndLong24 +" "+v24+";\n"+
                    "   private "+resultValueStringAndLong25 +" "+v25+";\n"+
                    "   private "+resultValueStringAndLong26 +" "+v26+";\n"+
                    "   private "+resultValueStringAndLong27 +" "+v27+";\n"+
                    "   private "+resultValueStringAndLong28 +" "+v28+";\n"+
                    "   private "+resultValueStringAndLong29 +" "+v29+";\n"+
                    "   private "+resultValueStringAndLong30 +" "+v30+";\n"+

                    "\n"+
                    "   @Builder\n"+
                    "   public "+reCodeTN_LFUC+"SaveRequestDto("+
                    resultValueStringAndLong2+" "+v2+",\n"+
                    resultValueStringAndLong3+" "+v3+",\n"+
                    resultValueStringAndLong4+" "+v4+",\n"+
                    resultValueStringAndLong5+" "+v5+",\n"+
                    resultValueStringAndLong6+" "+v6+",\n"+
                    resultValueStringAndLong7+" "+v7+",\n"+
                    resultValueStringAndLong8+" "+v8+",\n"+
                    resultValueStringAndLong9+" "+v9+",\n"+
                    resultValueStringAndLong10+" "+v10+",\n"+
                    resultValueStringAndLong11+" "+v11+",\n"+
                    resultValueStringAndLong12+" "+v12+",\n"+
                    resultValueStringAndLong13+" "+v13+",\n"+
                    resultValueStringAndLong14+" "+v14+",\n"+
                    resultValueStringAndLong15+" "+v15+",\n"+
                    resultValueStringAndLong16+" "+v16+",\n"+
                    resultValueStringAndLong17+" "+v17+",\n"+
                    resultValueStringAndLong18+" "+v18+",\n"+
                    resultValueStringAndLong19+" "+v19+",\n"+
                    resultValueStringAndLong20+" "+v20+",\n"+
                    resultValueStringAndLong21+" "+v21+",\n"+
                    resultValueStringAndLong22+" "+v22+",\n"+
                    resultValueStringAndLong23+" "+v23+",\n"+
                    resultValueStringAndLong24+" "+v24+",\n"+
                    resultValueStringAndLong25+" "+v25+",\n"+
                    resultValueStringAndLong26+" "+v26+",\n"+
                    resultValueStringAndLong27+" "+v27+",\n"+
                    resultValueStringAndLong28+" "+v28+",\n"+
                    resultValueStringAndLong29+" "+v29+",\n"+
                    resultValueStringAndLong30+" "+v30+"\n"+
                    "                  ){\n"+

                    "       this."+v2+" = "+v2+";\n"+
                    "       this."+v3+" = "+v3+";\n"+
                    "       this."+v4+" = "+v4+";\n"+
                    "       this."+v5+" = "+v5+";\n"+
                    "       this."+v6+" = "+v6+";\n"+
                    "       this."+v7+" = "+v7+";\n"+
                    "       this."+v8+" = "+v8+";\n"+
                    "       this."+v9+" = "+v9+";\n"+
                    "       this."+v10+" = "+v10+";\n"+
                    "       this."+v11+" = "+v11+";\n"+
                    "       this."+v12+" = "+v12+";\n"+
                    "       this."+v13+" = "+v13+";\n"+
                    "       this."+v14+" = "+v14+";\n"+
                    "       this."+v15+" = "+v15+";\n"+
                    "       this."+v16+" = "+v16+";\n"+
                    "       this."+v17+" = "+v17+";\n"+
                    "       this."+v18+" = "+v18+";\n"+
                    "       this."+v19+" = "+v19+";\n"+
                    "       this."+v20+" = "+v20+";\n"+
                    "       this."+v21+" = "+v21+";\n"+
                    "       this."+v22+" = "+v22+";\n"+
                    "       this."+v23+" = "+v23+";\n"+
                    "       this."+v24+" = "+v24+";\n"+
                    "       this."+v25+" = "+v25+";\n"+
                    "       this."+v26+" = "+v26+";\n"+
                    "       this."+v27+" = "+v27+";\n"+
                    "       this."+v28+" = "+v28+";\n"+
                    "       this."+v29+" = "+v29+";\n"+
                    "       this."+v30+" = "+v30+";\n"+
                    "   }\n"+
                    "\n"+
                    "   public "+reCodeTN_LFUC+" toEntity() {\n"+
                    "\n"+
                    "       return "+reCodeTN_LFUC+".builder()\n"+
                    "                 ."+v2+"("+v2+")\n"+
                    "                 ."+v3+"("+v3+")\n"+
                    "                 ."+v4+"("+v4+")\n"+
                    "                 ."+v5+"("+v5+")\n"+
                    "                 ."+v6+"("+v6+")\n"+
                    "                 ."+v7+"("+v7+")\n"+
                    "                 ."+v8+"("+v8+")\n"+
                    "                 ."+v9+"("+v9+")\n"+
                    "                 ."+v10+"("+v10+")\n"+
                    "                 ."+v11+"("+v11+")\n"+
                    "                 ."+v12+"("+v12+")\n"+
                    "                 ."+v13+"("+v13+")\n"+
                    "                 ."+v14+"("+v14+")\n"+
                    "                 ."+v15+"("+v15+")\n"+
                    "                 ."+v16+"("+v16+")\n"+
                    "                 ."+v17+"("+v17+")\n"+
                    "                 ."+v18+"("+v18+")\n"+
                    "                 ."+v19+"("+v19+")\n"+
                    "                 ."+v20+"("+v20+")\n"+
                    "                 ."+v21+"("+v21+")\n"+
                    "                 ."+v22+"("+v22+")\n"+
                    "                 ."+v23+"("+v23+")\n"+
                    "                 ."+v24+"("+v24+")\n"+
                    "                 ."+v25+"("+v25+")\n"+
                    "                 ."+v26+"("+v26+")\n"+
                    "                 ."+v27+"("+v27+")\n"+
                    "                 ."+v28+"("+v28+")\n"+
                    "                 ."+v29+"("+v29+")\n"+
                    "                 ."+v30+"("+v30+")\n"+
                    "                 .build();\n"+

                    "      }\n"+
                    "}\n");
            // 5. BufferedWriter close
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}





