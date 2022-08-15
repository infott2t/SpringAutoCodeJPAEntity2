package v2;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ResultEntityScreen extends JFrame{

    private JPanel jp;
    private JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9
            ,jl10;

    private JTextField jtf, jtf2,jtf3,jtf4,jtf5;
    private JTextArea jta,jta2,jta3,jta4;
    private JScrollPane jsp,jsp2,jsp3,jsp4;
    private JButton btn;

    ResultEntityScreen(UtilStrConv usc){
        String className = usc.getClassNameTables();
        jp= new JPanel();
        jl = new JLabel("@Entity class: " + className);
        jta = new JTextArea(20,50);
        jsp = new JScrollPane(jta);
        //btn = new JButton("");
        jp.add(jl);
        jp.add(jsp);
       // jp.add(btn);
        add(jp);
        setVisible(true);
        setResizable(true);
        setTitle("@Entity class: " + className+".java");
        setBounds(300,300,650,500);

        //변수 이름 초기화...
        String [] colLong = usc.getColLongs(); //Long형 칼럼. 0번이 primary key.

        String privateColLongPrint="";  // private Long ...
        String colLongPrintComma=""; // Long var1, Long var2, Long var3, ...의 형태.
        String colLongPrintThis="";    // this.custNo = custNo;
        String colLongPrintCommaUpdate = ""; //primary key인 배열0값을 제외한 Long var2, ...의 형태. 업데이트 메소드에 쓰임.
        for(int i=0; i< colLong.length; i++){

            colLongPrintComma = "Long " + colLong[i] + ", \n" + colLongPrintComma;
            colLongPrintThis = "this."+colLong[i]+" = "+colLong[i]+";\n" + colLongPrintThis;
        }
        String privateColLongPrint0 = "private Long id;\n";
        for(int i=1; i< colLong.length; i++){
            privateColLongPrint = "     private Long "+colLong[i]+";\n" + privateColLongPrint;
        }
        colLongPrintCommaUpdate = colLongPrintComma;
        colLongPrintComma = "Long "+colLong[0] +", "+ colLongPrintComma;
        colLongPrintThis = "this."+colLong[0]+" = "+colLong[0]+";\n" + colLongPrintThis;

        String [] colStr = usc.getColStrs();   // String형 칼럼.
        String privateColStrPrint="";
        String colStringPrintComma=""; // String var1, String var2, String var3, ...의 형태.
        String colStringPrintThis="";
        for(int i=0; i< colStr.length; i++) {
            privateColStrPrint = "      private String "+colStr[i]+";\n" + privateColStrPrint;
            colStringPrintComma = "String " + colStr[i] + ", \n" + colStringPrintComma;
            colStringPrintThis = "this."+colStr[i]+" = "+colStr[i]+";\n" + colStringPrintThis;
        }

        String [] colDate = usc.getColDates(); //Date형 칼럼.
        String privateColDatePrint = "";
        String colDatePrintComma=""; // LocalDateTime var1, LocalDateTime var2, LocalDateTime var3, ...의 형태.
        String colDatePrintThis="";
        for(int i=0; i< colDate.length; i++) {
            privateColDatePrint = "     private LocalDateTime "+colDate[i]+";\n" + privateColDatePrint;
            colDatePrintComma = "LocalDateTime " + colDate[i] + ", \n" + colDatePrintComma;
            colDatePrintThis = "this."+colDate[i]+" = "+colDate[i]+";\n" + colDatePrintThis;
        }

        String colPrintComma =  colLongPrintComma+ colStringPrintComma+ colDatePrintComma;
        String colPirntCommaUpdate = colLongPrintCommaUpdate +colStringPrintComma+colDatePrintComma;
        // 마지막 문자, ',' 콤마 제거.
        colPrintComma = colPrintComma.trim().substring(0,colPrintComma.trim().length()-1);
        colPirntCommaUpdate = colPirntCommaUpdate.trim().substring(0,colPirntCommaUpdate.trim().length()-1);

        String privateColPrint =  privateColLongPrint+"\n"+ privateColStrPrint+"\n"+privateColDatePrint+ "\n";
        System.out.println("String, colPrintComma, ... : "+colPrintComma);
        System.out.println("클래스 이름, ... : "+ usc.getClassNameTables());
        System.out.println("소문자 클래스 이름, 생성자 사용, ...: " +usc.getTnSmall());
        System.out.println("변수 이름, private Long id, ...: " + privateColPrint);

        String createTable = usc.getCreateTable(colStr, colLong, colDate, usc.getTnSmall());

         jta.setText("" +
                "import com.fasterxml.jackson.annotation.JsonIgnore;\n" +
                 "import lombok.Getter;\n" +
                 "import lombok.RequiredArgsConstructor;\n" +
                 "import lombok.Setter;\n" +
                 "\n" +
                 "import javax.persistence.*;\n" +
                 "import java.util.ArrayList;\n" +
                 "import java.util.List;\n" +
                 "\n" +
                 "@Entity\n" +
                 "@Getter\n" +
                 "@Setter\n" +
                 "@RequiredArgsConstructor\n" +
                 "@Table(name =\""+usc.getTableNameDB()+"\")\n" +
                 "public class "+usc.getClassNameTables()+" {\n" +
                 "\n" +
                 "    @Id\n" +
                 "    @GeneratedValue(strategy = GenerationType.IDENTITY)\n" +
                 "    @Column(name = \""+usc.getTnSmall()+"_id\")\n" +
                 "     "+privateColLongPrint0+
                 ""+privateColLongPrint+"\n"+
                 ""+privateColStrPrint +"\n"+
                 ""+privateColDatePrint+"\n" +
                 "    @ManyToOne(fetch = FetchType.LAZY)\n" +
                 "    @JoinColumn(name = \""+usc.getManyToOneJoinColumn() +"\", updatable = false)\n" +
                 "    private "+usc.getToOneTableNameClass()+" "+usc.getToOneTableNameMethod()+";\n" +
                 "\n" +
                 "    @JsonIgnore\n" +
                 "    @OneToMany(mappedBy = \""+usc.getOneToManyMappedTable()+"\")\n" +
                 "    private List<BoardComment> boardComments = new ArrayList<>();\n" +
                 "  \n" +
                 "\n" +
                 "    // 연관 관계 메서드\n" +
                 "    public void set"+usc.getToOneTableNameClass()+"("+usc.getToOneTableNameClass()+" "+usc.getToOneTableNameMethod()+") {\n" +
                 "        this."+usc.getToOneTableNameMethod()+" = "+usc.getToOneTableNameMethod()+";\n" +
                 "        "+usc.getToOneTableNameMethod()+".getBoards().add(this);\n" +
                 "    }\n" +
                 "\n" +
                 "    // 생성 메서드\n" +
                 "    public static "+usc.getClassNameTables()+" create"+usc.getClassNameTables()+"("+usc.getClassNameTables()+" "+usc.getTnSmall()+", "+usc.getClassNameTables()+"SaveForm form) {\n" +
                 "        "+usc.getClassNameTables()+" "+usc.getTnSmall()+" = new "+usc.getClassNameTables()+"();\n" +
                 "        "+createTable +

                 "        "+usc.getTnSmall()+".set"+usc.getToOneTableNameClass()+"("+usc.getToOneTableNameMethod()+");\n " +
                 "        return "+usc.getTnSmall()+";\n" +
                 "    }\n" +
                 "\n" +
                 "}");

        String code = jta.getText();

        try {
            File file = new File("C:\\category\\" + usc.getClassNameTables() + ".java");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(code);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
