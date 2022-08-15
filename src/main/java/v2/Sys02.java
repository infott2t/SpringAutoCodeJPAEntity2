package v2;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sys02 extends JFrame{

    private JPanel jp;
    private JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,
    jl10,jl11,jl12,jl13,jl14;
    private JTextField jtf, jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9;
    private JTextArea jta,jta2,jta3,jta4;
    private JScrollPane jsp,jsp2,jsp3,jsp4;
    private JButton btn;

    static UtilStrConv usc;

    Sys02(){
        jp= new JPanel();
        jl = new JLabel("테이블 칼럼 명 입력하기. 테이블 클래스 이름, 칼럼명을 적어주세요.");
        jl2 = new JLabel("테이블 명(첫글자 대문자): ");
        jtf = new JTextField(20);
        jl3 = new JLabel("칼럼명: String인 경우. ,로 구분");
        jta = new JTextArea(5,20);
        jsp = new JScrollPane(jta);
        jl4 = new JLabel("칼럼명: Long인 경우. , 로 구분. 첫값은 id(Primary key). id, ...으로 적어주세요.");
        jtf2 = new JTextField(20);
        jl5 = new JLabel("칼럼명: LocalDateTime인 경우. , 로 구분");
        jtf3 = new JTextField(20);
        jl6 = new JLabel("@Table(name=). ex 실제 데이터 베이스 테이블 이름");
        jtf4 = new JTextField(20);
        jl7 = new JLabel("ManyToOne 연관관계 테이블 Member,");
        jtf5 = new JTextField(20);
        jl8 = new JLabel ("ManyToOne, 연관관계 테이블에서 조인컬럼명. 예, member_id");
        jtf6 = new JTextField(20);
        jl9 = new JLabel("OneToMany, mappedBy 테이블.");
        jtf7 = new JTextField(20);
        jl10 = new JLabel("OneToMany, 연관관계 List이름. 엔티티로 생성됨.");
        jtf8 = new JTextField(20);



        btn = new JButton("엔티티 코드 생성하기");

        jp.add(jl);
        jp.add(jl2);
        jp.add(jtf);
        jp.add(jl3);
        jp.add(jsp);
        jp.add(jl4);
        jp.add(jtf2);
        jp.add(jl5);
        jp.add(jtf3);
        jp.add(jl6);
        jp.add(jtf4);
        jp.add(jl7);
        jp.add(jtf5);
        jp.add(jl8);
        jp.add(jtf6);
        jp.add(jl9);
        jp.add(jtf7);
        jp.add(jl10);
        jp.add(jtf8);
        jp.add(btn);

        setVisible(true);
        setResizable(true);
        add(jp);
        setBounds(300,300,380,700);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tableName = jtf.getText();
                String columnStrings = jta.getText();
                String columnLongs = jtf2.getText();
                String columnDates = jtf3.getText();
                String tableNameDB = jtf4.getText();
                String manyToOneTableName = jtf5.getText();
                String manyToOneJoinColumn = jtf6.getText();
                String oneToManyMappedTable = jtf7.getText();
                String oneToManyListing = jtf8.getText();

                 usc = new UtilStrConv(tableName,columnStrings, columnLongs, columnDates, tableNameDB,
                        manyToOneTableName, manyToOneJoinColumn, oneToManyMappedTable, oneToManyListing);

                 new ResultEntityScreen(usc);
                new ResultSaveFormScreen(usc);
               // new ResultFormScreen(usc);
                new ResultUpdateFormScreen(usc);
                new RepositoryResultScreen(usc);

            }
        });
    }


    public static void main(String[] args){

        new Sys02();
    }
}
