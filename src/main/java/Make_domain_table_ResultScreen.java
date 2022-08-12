 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.io.BufferedWriter;
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;

 public class
Make_domain_table_ResultScreen extends JFrame {

    JPanel jp;
    JLabel jl;
    JTextField jtf;
    JTextArea jta;
    JButton btn;
    JScrollPane scrolljta;
    String letterTableNameFirstBigClassName;



    public Make_domain_table_ResultScreen(String tableName,
                                          String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9, String v10, String v11, String v12, String v13, String v14, String v15, String v16, String v17, String v18, String v19, String v20, String v21, String v22, String v23, String v24, String v25, String v26, String v27, String v28, String v29, String v30,
                                          String resultValueStringAndLong1, String resultValueStringAndLong2, String resultValueStringAndLong3, String resultValueStringAndLong4, String resultValueStringAndLong5, String resultValueStringAndLong6, String resultValueStringAndLong7, String resultValueStringAndLong8, String resultValueStringAndLong9, String resultValueStringAndLong10, String resultValueStringAndLong11, String resultValueStringAndLong12, String resultValueStringAndLong13, String resultValueStringAndLong14, String resultValueStringAndLong15, String resultValueStringAndLong16, String resultValueStringAndLong17, String resultValueStringAndLong18, String resultValueStringAndLong19, String resultValueStringAndLong20, String resultValueStringAndLong21, String resultValueStringAndLong22, String resultValueStringAndLong23, String resultValueStringAndLong24, String resultValueStringAndLong25, String resultValueStringAndLong26, String resultValueStringAndLong27, String resultValueStringAndLong28, String resultValueStringAndLong29, String resultValueStringAndLong30) {
        jp = new JPanel();
        jl = new JLabel("Rally: Table Name, "+ tableName );
        jl.setFont(new Font("", Font.PLAIN, 15));
        jtf = new JTextField(31);
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

        letterTableNameFirstBigClassName = util.frontChangeCase(tableName);
        setTitle("domain."+tableName+"."+letterTableNameFirstBigClassName+".java");
        //resultValueStringAndLong1
        if(resultValueStringAndLong2==null){System.out.println("long2, null...");}
        jta.setText("// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible. \n"+
                    "//  " +letterTableNameFirstBigClassName+".java       File. Textting. \n"+
                    "// import, javax.persistance.Entity, ...GenerationValue, ...GenerationType, ...Id. \n"+
                    "// \n"+
                    "@Getter\n" +"@NoArgsConstructor\n" + "@Entity\n"+
                    "public class "+letterTableNameFirstBigClassName+" extends BaseTimeEntity {"+
                    "\n @Id //primary key field.\n" +
                    "@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment.\n" +
                    "private Long "+v1+"Id;\n"+
                    "\n"+

                    "private "+ resultValueStringAndLong2 + " "+v2+";\n"+
                    "private "+ resultValueStringAndLong3 + " "+v3+";\n"+
                    "private "+ resultValueStringAndLong4 + " "+v4+";\n"+
                    "private "+ resultValueStringAndLong5 + " "+v5+";\n"+
                    "private "+ resultValueStringAndLong6 + " "+v6+";\n"+
                    "private "+ resultValueStringAndLong7 + " "+v7+";\n"+
                    "private "+ resultValueStringAndLong8 + " "+v8+";\n"+
                    "private "+ resultValueStringAndLong9 + " "+v9+";\n"+
                    "private "+ resultValueStringAndLong10 + " "+v10+";\n"+
                    "private "+ resultValueStringAndLong11 + " "+v11+";\n"+
                    "private "+ resultValueStringAndLong12 + " "+v12+";\n"+
                    "private "+ resultValueStringAndLong13 + " "+v13+";\n"+
                    "private "+ resultValueStringAndLong14 + " "+v14+";\n"+
                    "private "+ resultValueStringAndLong15 + " "+v15+";\n"+
                    "private "+ resultValueStringAndLong16 + " "+v16+";\n"+
                    "private "+ resultValueStringAndLong17 + " "+v17+";\n"+
                    "private "+ resultValueStringAndLong18 + " "+v18+";\n"+
                    "private "+ resultValueStringAndLong19 + " "+v19+";\n"+
                    "private "+ resultValueStringAndLong20 + " "+v20+";\n"+
                    "private "+ resultValueStringAndLong21 + " "+v21+";\n"+
                    "private "+ resultValueStringAndLong22 + " "+v22+";\n"+
                    "private "+ resultValueStringAndLong23 + " "+v23+";\n"+
                    "private "+ resultValueStringAndLong24 + " "+v24+";\n"+
                    "private "+ resultValueStringAndLong25 + " "+v25+";\n"+
                    "private "+ resultValueStringAndLong26 + " "+v26+";\n"+
                    "private "+ resultValueStringAndLong27 + " "+v27+";\n"+
                    "private "+ resultValueStringAndLong28 + " "+v28+";\n"+
                    "private "+ resultValueStringAndLong29 + " "+v29+";\n"+
                    "private "+ resultValueStringAndLong30 + " "+v30+";\n"+
                    "\n"+
                    "@Builder\n"+
                    "public "+letterTableNameFirstBigClassName+"(\n"+
                    "  "+resultValueStringAndLong2+" "+v2+",\n"+
                    "  "+resultValueStringAndLong3+" "+v3+",\n"+
                    "  "+resultValueStringAndLong4+" "+v4+",\n"+
                    "  "+resultValueStringAndLong5+" "+v5+",\n"+
                    "  "+resultValueStringAndLong6+" "+v6+",\n"+
                    "  "+resultValueStringAndLong7+" "+v7+",\n"+
                    "  "+resultValueStringAndLong8+" "+v8+",\n"+
                    "  "+resultValueStringAndLong9+" "+v9+",\n"+
                    "  "+resultValueStringAndLong10+" "+v10+",\n"+
                    "  "+resultValueStringAndLong11+" "+v11+",\n"+
                    "  "+resultValueStringAndLong12+" "+v12+",\n"+
                    "  "+resultValueStringAndLong13+" "+v13+",\n"+
                    "  "+resultValueStringAndLong14+" "+v14+",\n"+
                    "  "+resultValueStringAndLong15+" "+v15+",\n"+
                    "  "+resultValueStringAndLong16+" "+v16+",\n"+
                    "  "+resultValueStringAndLong17+" "+v17+",\n"+
                    "  "+resultValueStringAndLong18+" "+v18+",\n"+
                    "  "+resultValueStringAndLong19+" "+v19+",\n"+
                    "  "+resultValueStringAndLong20+" "+v20+",\n"+
                    "  "+resultValueStringAndLong21+" "+v21+",\n"+
                    "  "+resultValueStringAndLong22+" "+v22+",\n"+
                    "  "+resultValueStringAndLong23+" "+v23+",\n"+
                    "  "+resultValueStringAndLong24+" "+v24+",\n"+
                    "  "+resultValueStringAndLong25+" "+v25+",\n"+
                    "  "+resultValueStringAndLong26+" "+v26+",\n"+
                    "  "+resultValueStringAndLong27+" "+v27+",\n"+
                    "  "+resultValueStringAndLong28+" "+v28+",\n"+
                    "  "+resultValueStringAndLong29+" "+v29+",\n"+
                    "  "+resultValueStringAndLong30+" "+v30+"\n"+
                                                               "){\n"+
                        "this."+v2 +" = "+v2+";\n"+
                        "this."+v3 +" = "+v3+";\n"+
                        "this."+v4 +" = "+v4+";\n"+
                        "this."+v5 +" = "+v5+";\n"+
                        "this."+v6 +" = "+v6+";\n"+
                        "this."+v7 +" = "+v7+";\n"+
                        "this."+v8 +" = "+v8+";\n"+
                        "this."+v9 +" = "+v9+";\n"+
                        "this."+v10 +" = "+v10+";\n"+
                        "this."+v11 +" = "+v11+";\n"+
                        "this."+v12 +" = "+v12+";\n"+
                        "this."+v13 +" = "+v13+";\n"+
                        "this."+v14 +" = "+v14+";\n"+
                        "this."+v15 +" = "+v15+";\n"+
                        "this."+v16 +" = "+v16+";\n"+
                        "this."+v17 +" = "+v17+";\n"+
                        "this."+v18 +" = "+v18+";\n"+
                        "this."+v19 +" = "+v19+";\n"+
                        "this."+v20 +" = "+v20+";\n"+
                        "this."+v21 +" = "+v21+";\n"+
                        "this."+v22 +" = "+v22+";\n"+
                        "this."+v23 +" = "+v23+";\n"+
                        "this."+v24 +" = "+v24+";\n"+
                        "this."+v25 +" = "+v25+";\n"+
                        "this."+v26 +" = "+v26+";\n"+
                        "this."+v27 +" = "+v27+";\n"+
                        "this."+v28 +" = "+v28+";\n"+
                        "this."+v29 +" = "+v29+";\n"+
                        "this."+v30 +" = "+v30+";\n"+

                    "}\n"+
                    "\n"+
                    "public void update("+
                    "  "+resultValueStringAndLong2+" "+v2+",\n"+
                    "  "+resultValueStringAndLong3+" "+v3+",\n"+
                    "  "+resultValueStringAndLong4+" "+v4+",\n"+
                    "  "+resultValueStringAndLong5+" "+v5+",\n"+
                    "  "+resultValueStringAndLong6+" "+v6+",\n"+
                    "  "+resultValueStringAndLong7+" "+v7+",\n"+
                    "  "+resultValueStringAndLong8+" "+v8+",\n"+
                    "  "+resultValueStringAndLong9+" "+v9+",\n"+
                    "  "+resultValueStringAndLong10+" "+v10+",\n"+
                    "  "+resultValueStringAndLong11+" "+v11+",\n"+
                    "  "+resultValueStringAndLong12+" "+v12+",\n"+
                    "  "+resultValueStringAndLong13+" "+v13+",\n"+
                    "  "+resultValueStringAndLong14+" "+v14+",\n"+
                    "  "+resultValueStringAndLong15+" "+v15+",\n"+
                    "  "+resultValueStringAndLong16+" "+v16+",\n"+
                    "  "+resultValueStringAndLong17+" "+v17+",\n"+
                    "  "+resultValueStringAndLong18+" "+v18+",\n"+
                    "  "+resultValueStringAndLong19+" "+v19+",\n"+
                    "  "+resultValueStringAndLong20+" "+v20+",\n"+
                    "  "+resultValueStringAndLong21+" "+v21+",\n"+
                    "  "+resultValueStringAndLong22+" "+v22+",\n"+
                    "  "+resultValueStringAndLong23+" "+v23+",\n"+
                    "  "+resultValueStringAndLong24+" "+v24+",\n"+
                    "  "+resultValueStringAndLong25+" "+v25+",\n"+
                    "  "+resultValueStringAndLong26+" "+v26+",\n"+
                    "  "+resultValueStringAndLong27+" "+v27+",\n"+
                    "  "+resultValueStringAndLong28+" "+v28+",\n"+
                    "  "+resultValueStringAndLong29+" "+v29+",\n"+
                    "  "+resultValueStringAndLong30+" "+v30+"\n"+
                    "){"+
                    "this."+v2+" = "+v2+";\n"+
                    "this."+v3+" = "+v3+";\n"+
                    "this."+v4+" = "+v4+";\n"+
                    "this."+v5+" = "+v5+";\n"+
                    "this."+v6+" = "+v6+";\n"+
                    "this."+v7+" = "+v7+";\n"+
                    "this."+v8+" = "+v8+";\n"+
                    "this."+v9+" = "+v9+";\n"+
                    "this."+v10+" = "+v10+";\n"+
                    "this."+v11+" = "+v11+";\n"+
                    "this."+v12+" = "+v12+";\n"+
                    "this."+v13+" = "+v13+";\n"+
                    "this."+v14+" = "+v14+";\n"+
                    "this."+v15+" = "+v15+";\n"+
                    "this."+v16+" = "+v16+";\n"+
                    "this."+v17+" = "+v17+";\n"+
                    "this."+v18+" = "+v18+";\n"+
                    "this."+v19+" = "+v19+";\n"+
                    "this."+v20+" = "+v20+";\n"+
                    "this."+v21+" = "+v21+";\n"+
                    "this."+v22+" = "+v22+";\n"+
                    "this."+v23+" = "+v23+";\n"+
                    "this."+v24+" = "+v24+";\n"+
                    "this."+v25+" = "+v25+";\n"+
                    "this."+v26+" = "+v26+";\n"+
                    "this."+v27+" = "+v27+";\n"+
                    "this."+v28+" = "+v28+";\n"+
                    "this."+v29+" = "+v29+";\n"+
                    "this."+v30+" = "+v30+";\n"+

                "}\n}"

        );

        // 1. 파일 객체 생성
        try {
            File file = new File("C:\\category\\" + letterTableNameFirstBigClassName+".java");
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
            //3. Buffer를 사용해서 File에 write할 수 있는 BufferedWriter 생성
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            // 4. 파일에 쓰기
            writer.write("// Please, Table name(camelcase and first letter lower case.).. class name. Need first letter, Upper case. Then not bug. Possiible. \n"+
                    "//  " +letterTableNameFirstBigClassName+".java       File. Textting. \n"+
                    "// import, javax.persistance.Entity, ...GenerationValue, ...GenerationType, ...Id. \n"+
                    "// \n"+
                    "@Getter\n" +"@NoArgsConstructor\n" + "@Entity\n"+
                    "public class "+letterTableNameFirstBigClassName+" extends BaseTimeEntity {"+
                    "\n @Id //primary key field.\n" +
                    "@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment.\n" +
                    "private Long "+v1+"Id;\n"+
                    "\n"+

                    "private "+ resultValueStringAndLong2 + " "+v2+";\n"+
                    "private "+ resultValueStringAndLong3 + " "+v3+";\n"+
                    "private "+ resultValueStringAndLong4 + " "+v4+";\n"+
                    "private "+ resultValueStringAndLong5 + " "+v5+";\n"+
                    "private "+ resultValueStringAndLong6 + " "+v6+";\n"+
                    "private "+ resultValueStringAndLong7 + " "+v7+";\n"+
                    "private "+ resultValueStringAndLong8 + " "+v8+";\n"+
                    "private "+ resultValueStringAndLong9 + " "+v9+";\n"+
                    "private "+ resultValueStringAndLong10 + " "+v10+";\n"+
                    "private "+ resultValueStringAndLong11 + " "+v11+";\n"+
                    "private "+ resultValueStringAndLong12 + " "+v12+";\n"+
                    "private "+ resultValueStringAndLong13 + " "+v13+";\n"+
                    "private "+ resultValueStringAndLong14 + " "+v14+";\n"+
                    "private "+ resultValueStringAndLong15 + " "+v15+";\n"+
                    "private "+ resultValueStringAndLong16 + " "+v16+";\n"+
                    "private "+ resultValueStringAndLong17 + " "+v17+";\n"+
                    "private "+ resultValueStringAndLong18 + " "+v18+";\n"+
                    "private "+ resultValueStringAndLong19 + " "+v19+";\n"+
                    "private "+ resultValueStringAndLong20 + " "+v20+";\n"+
                    "private "+ resultValueStringAndLong21 + " "+v21+";\n"+
                    "private "+ resultValueStringAndLong22 + " "+v22+";\n"+
                    "private "+ resultValueStringAndLong23 + " "+v23+";\n"+
                    "private "+ resultValueStringAndLong24 + " "+v24+";\n"+
                    "private "+ resultValueStringAndLong25 + " "+v25+";\n"+
                    "private "+ resultValueStringAndLong26 + " "+v26+";\n"+
                    "private "+ resultValueStringAndLong27 + " "+v27+";\n"+
                    "private "+ resultValueStringAndLong28 + " "+v28+";\n"+
                    "private "+ resultValueStringAndLong29 + " "+v29+";\n"+
                    "private "+ resultValueStringAndLong30 + " "+v30+";\n"+
                    "\n"+
                    "@Builder\n"+
                    "public "+letterTableNameFirstBigClassName+"(\n"+
                    "  "+resultValueStringAndLong2+" "+v2+",\n"+
                    "  "+resultValueStringAndLong3+" "+v3+",\n"+
                    "  "+resultValueStringAndLong4+" "+v4+",\n"+
                    "  "+resultValueStringAndLong5+" "+v5+",\n"+
                    "  "+resultValueStringAndLong6+" "+v6+",\n"+
                    "  "+resultValueStringAndLong7+" "+v7+",\n"+
                    "  "+resultValueStringAndLong8+" "+v8+",\n"+
                    "  "+resultValueStringAndLong9+" "+v9+",\n"+
                    "  "+resultValueStringAndLong10+" "+v10+",\n"+
                    "  "+resultValueStringAndLong11+" "+v11+",\n"+
                    "  "+resultValueStringAndLong12+" "+v12+",\n"+
                    "  "+resultValueStringAndLong13+" "+v13+",\n"+
                    "  "+resultValueStringAndLong14+" "+v14+",\n"+
                    "  "+resultValueStringAndLong15+" "+v15+",\n"+
                    "  "+resultValueStringAndLong16+" "+v16+",\n"+
                    "  "+resultValueStringAndLong17+" "+v17+",\n"+
                    "  "+resultValueStringAndLong18+" "+v18+",\n"+
                    "  "+resultValueStringAndLong19+" "+v19+",\n"+
                    "  "+resultValueStringAndLong20+" "+v20+",\n"+
                    "  "+resultValueStringAndLong21+" "+v21+",\n"+
                    "  "+resultValueStringAndLong22+" "+v22+",\n"+
                    "  "+resultValueStringAndLong23+" "+v23+",\n"+
                    "  "+resultValueStringAndLong24+" "+v24+",\n"+
                    "  "+resultValueStringAndLong25+" "+v25+",\n"+
                    "  "+resultValueStringAndLong26+" "+v26+",\n"+
                    "  "+resultValueStringAndLong27+" "+v27+",\n"+
                    "  "+resultValueStringAndLong28+" "+v28+",\n"+
                    "  "+resultValueStringAndLong29+" "+v29+",\n"+
                    "  "+resultValueStringAndLong30+" "+v30+"\n"+
                    "){\n"+
                    "this."+v2 +" = "+v2+";\n"+
                    "this."+v3 +" = "+v3+";\n"+
                    "this."+v4 +" = "+v4+";\n"+
                    "this."+v5 +" = "+v5+";\n"+
                    "this."+v6 +" = "+v6+";\n"+
                    "this."+v7 +" = "+v7+";\n"+
                    "this."+v8 +" = "+v8+";\n"+
                    "this."+v9 +" = "+v9+";\n"+
                    "this."+v10 +" = "+v10+";\n"+
                    "this."+v11 +" = "+v11+";\n"+
                    "this."+v12 +" = "+v12+";\n"+
                    "this."+v13 +" = "+v13+";\n"+
                    "this."+v14 +" = "+v14+";\n"+
                    "this."+v15 +" = "+v15+";\n"+
                    "this."+v16 +" = "+v16+";\n"+
                    "this."+v17 +" = "+v17+";\n"+
                    "this."+v18 +" = "+v18+";\n"+
                    "this."+v19 +" = "+v19+";\n"+
                    "this."+v20 +" = "+v20+";\n"+
                    "this."+v21 +" = "+v21+";\n"+
                    "this."+v22 +" = "+v22+";\n"+
                    "this."+v23 +" = "+v23+";\n"+
                    "this."+v24 +" = "+v24+";\n"+
                    "this."+v25 +" = "+v25+";\n"+
                    "this."+v26 +" = "+v26+";\n"+
                    "this."+v27 +" = "+v27+";\n"+
                    "this."+v28 +" = "+v28+";\n"+
                    "this."+v29 +" = "+v29+";\n"+
                    "this."+v30 +" = "+v30+";\n"+

                    "}\n"+
                    "\n"+
                    "public void update("+
                    "  "+resultValueStringAndLong2+" "+v2+",\n"+
                    "  "+resultValueStringAndLong3+" "+v3+",\n"+
                    "  "+resultValueStringAndLong4+" "+v4+",\n"+
                    "  "+resultValueStringAndLong5+" "+v5+",\n"+
                    "  "+resultValueStringAndLong6+" "+v6+",\n"+
                    "  "+resultValueStringAndLong7+" "+v7+",\n"+
                    "  "+resultValueStringAndLong8+" "+v8+",\n"+
                    "  "+resultValueStringAndLong9+" "+v9+",\n"+
                    "  "+resultValueStringAndLong10+" "+v10+",\n"+
                    "  "+resultValueStringAndLong11+" "+v11+",\n"+
                    "  "+resultValueStringAndLong12+" "+v12+",\n"+
                    "  "+resultValueStringAndLong13+" "+v13+",\n"+
                    "  "+resultValueStringAndLong14+" "+v14+",\n"+
                    "  "+resultValueStringAndLong15+" "+v15+",\n"+
                    "  "+resultValueStringAndLong16+" "+v16+",\n"+
                    "  "+resultValueStringAndLong17+" "+v17+",\n"+
                    "  "+resultValueStringAndLong18+" "+v18+",\n"+
                    "  "+resultValueStringAndLong19+" "+v19+",\n"+
                    "  "+resultValueStringAndLong20+" "+v20+",\n"+
                    "  "+resultValueStringAndLong21+" "+v21+",\n"+
                    "  "+resultValueStringAndLong22+" "+v22+",\n"+
                    "  "+resultValueStringAndLong23+" "+v23+",\n"+
                    "  "+resultValueStringAndLong24+" "+v24+",\n"+
                    "  "+resultValueStringAndLong25+" "+v25+",\n"+
                    "  "+resultValueStringAndLong26+" "+v26+",\n"+
                    "  "+resultValueStringAndLong27+" "+v27+",\n"+
                    "  "+resultValueStringAndLong28+" "+v28+",\n"+
                    "  "+resultValueStringAndLong29+" "+v29+",\n"+
                    "  "+resultValueStringAndLong30+" "+v30+"\n"+
                    "){"+
                    "this."+v2+" = "+v2+";\n"+
                    "this."+v3+" = "+v3+";\n"+
                    "this."+v4+" = "+v4+";\n"+
                    "this."+v5+" = "+v5+";\n"+
                    "this."+v6+" = "+v6+";\n"+
                    "this."+v7+" = "+v7+";\n"+
                    "this."+v8+" = "+v8+";\n"+
                    "this."+v9+" = "+v9+";\n"+
                    "this."+v10+" = "+v10+";\n"+
                    "this."+v11+" = "+v11+";\n"+
                    "this."+v12+" = "+v12+";\n"+
                    "this."+v13+" = "+v13+";\n"+
                    "this."+v14+" = "+v14+";\n"+
                    "this."+v15+" = "+v15+";\n"+
                    "this."+v16+" = "+v16+";\n"+
                    "this."+v17+" = "+v17+";\n"+
                    "this."+v18+" = "+v18+";\n"+
                    "this."+v19+" = "+v19+";\n"+
                    "this."+v20+" = "+v20+";\n"+
                    "this."+v21+" = "+v21+";\n"+
                    "this."+v22+" = "+v22+";\n"+
                    "this."+v23+" = "+v23+";\n"+
                    "this."+v24+" = "+v24+";\n"+
                    "this."+v25+" = "+v25+";\n"+
                    "this."+v26+" = "+v26+";\n"+
                    "this."+v27+" = "+v27+";\n"+
                    "this."+v28+" = "+v28+";\n"+
                    "this."+v29+" = "+v29+";\n"+
                    "this."+v30+" = "+v30+";\n"+

                    "}\n}");
            // 5. BufferedWriter close
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
