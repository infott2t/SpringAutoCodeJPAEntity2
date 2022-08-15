package v2;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RepositoryResultScreen extends JFrame{

    private JPanel jp;
    private JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9;
    private JTextField jtf, jtf2,jtf3,jtf4,jtf5;
    private JTextArea jta,jta2,jta3,jta4;
    private JScrollPane jsp,jsp2,jsp3,jsp4;
    private JButton btn;

    public String className; //Alliance

    RepositoryResultScreen(UtilStrConv usc){
        className = usc.getClassNameTables();
        jp= new JPanel();
        jl = new JLabel("@Repository QueryDSL일때: " + className+"Repository.java");
        jta = new JTextArea(5,50);
        jsp = new JScrollPane(jta);
        //btn = new JButton("");
        jp.add(jl);
        jp.add(jsp);
       // jp.add(btn);
        add(jp);
        setVisible(true);
        setResizable(true);
        setTitle("Repository: " + className+"Repository.java");
        setBounds(300,300,650,500);

        jta.setText("" +
                "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                "import org.springframework.data.querydsl.QuerydslPredicateExecutor;\n" +
                "import org.springframework.stereotype.Repository;\n" +
                "\n" +
                "@Repository\n" +
                "public interface "+className+"Repository extends JpaRepository<"+className+", Long>,\n" +
                "        QuerydslPredicateExecutor<"+className+">, "+className+"RepositoryCustom {\n" +
                "\n" +
                "\n" +
                "}");

        String code = jta.getText();

        try {
            File file = new File("C:\\category\\" + className + "Repository.java");
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

        jl3 = new JLabel("@Repository QueryDSL일때: " + className+"RepositoryCustom.java ");
        jta3 = new JTextArea(5,50);
        jsp3 = new JScrollPane(jta3);

        jp.add(jl3);
        jp.add(jsp3);

        jta3.setText("" +
                "import org.springframework.data.domain.Page;\n" +
                "import org.springframework.data.domain.Pageable;\n" +
                "\n" +
                "public interface "+className+"RepositoryCustom {\n" +
                "\n" +
                "    Page<"+className+"> searchAllV2("+className+"Condition condition, Pageable pageable);\n" +
                "\n" +
                "\n" +
                "}");

        String code3 = jta3.getText();

        try {
            File file = new File("C:\\category\\" + className + "RepositoryCustom.java");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(code3);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        jl2 = new JLabel("@Repository: " + className+"Repository.java 일반 Repository.");
        jta2 = new JTextArea(5,50);
        jsp2 = new JScrollPane(jta2);

        jp.add(jl2);
        jp.add(jsp2);

        jta2.setText("" +
                "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                "import org.springframework.data.jpa.repository.Query;\n" +
                "import org.springframework.stereotype.Repository\n" +
                "\n" +
                "import java.util.List;\n" +
                "\n" +
                "@Repository\n" +
                "public interface "+className+"Repository extends JpaRepository<"+className+", Long> {\n" +
                "    @Query(\"SELECT p FROM "+className+" p ORDER BY p.id DESC\")\n" +
                "    List<"+className+"> findAllDesc();\n" +
                "  //Page<"+className+"> findAllDesc();\n"+
                "}");

        String code2 = jta2.getText();

        try {
            File file = new File("C:\\category\\" + className + "Repository2.java");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(code2);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
