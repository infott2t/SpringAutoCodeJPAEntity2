package v2;

import java.util.ArrayList;
import java.util.Locale;


public class   UtilStrConv {

    public static String tableName;
    public static String columnStrings;
    public static String columnLongs;
    public static String columnDates;
    public static String savePath; //파일저장위치.

    public static String tableNameDB; //엔티티에 적는 @Table(name="") 테이블 이름.
    public static String manyToOneJoinColumn;
    public static String manyToOneTableName;
    public static String oneToManyMappedTable;
    public static String oneToManyListing;

    //코드에 반환할 값.
    public static String tnSmall; //전부 소문자. 테이블 이름.
    public static String[] colStrs; //테이블 칼럼명. 배열. String타입.
    public static String[] colLongs; //테이블 칼럼명. 배열, Long타입. 1번째는 Primary Key.

    private static String[] colDates;  //테이블 칼럼명. 배열, LocalDateTime형.

    public static String classNameTables; //테이블 명으로 클래스가 되는 경우.  //getter, setter.


    public UtilStrConv(String tableName, String columnStrings, String columnLongs, String columnDates, String tableNameDBString, String manyToOneTableName,
                       String manyToOneJoinColumn, String oneToManyMappedTable, String oneToManyListing) {
        this.tableNameDB = tableNameDBString;
        this.tableName = tableName;
        this.columnStrings = columnStrings;
        this.columnLongs = columnLongs;
        this.columnDates = columnDates;
        this.tnSmall = tableName.toLowerCase(Locale.ROOT);
        this.colStrs = columnStrings.split(",");
        this.colLongs = columnLongs.split(",");
        this.colDates = columnDates.split(",");
        this.classNameTables = tableName;
        this.manyToOneTableName = manyToOneTableName; //Member member
        this.manyToOneJoinColumn = manyToOneJoinColumn; //member_id
        this.oneToManyMappedTable = oneToManyMappedTable; //member
        this.oneToManyListing = oneToManyListing; //BoardComment, boardcomment
    }

  //  setTitle(form.getTitle());\n"
  //  setContent(form.getContent());\n"
   // setMember(member);\n */"



    public static String getToOneTableNameClass(){
        return manyToOneTableName;
    } //Member

    public static String getManyToOneJoinColumn(){
        return manyToOneJoinColumn;
    } //member_id
    public static String getToOneTableNameMethod(){
        return manyToOneTableName.toLowerCase();
    } //member
    public static String getOneToManyMappedTable(){
        return oneToManyMappedTable;
    } //member
    public static String getOneToManyListing(){
        return tableName+"Comment";
    } // BoardComment

    public static String getTableName() {
        return tableName;
    }

    public static void setTableName(String tableName) {
        tableName = tableName;
    }

    public static String getColumnStrings() {
        return columnStrings;
    }

    public static void setColumnStrings(String columnStrings) {
         columnStrings = columnStrings;
    }

    public static String getColumnLongs() {
        return columnLongs;
    }

    public static void setColumnLongs(String columnLongs) {
        columnLongs = columnLongs;
    }

    public static String getTnSmall() {
        return tnSmall;
    }

    public static void setTnSmall(String tnSmall) {
        tnSmall = tnSmall;
    }

    public static String[] getColStrs() {
        return colStrs;
    }

    public static void setColStrs(String[] colStrs) {
        colStrs = colStrs;
    }

    public static String[] getColLongs() {
        return colLongs;
    }

    public static void setColLongs(String[] colLongs) {
        colLongs = colLongs;
    }

    public static String getClassNameTables() {
        return classNameTables;
    }

    public static void setClassNameTables(String classNameTables) {
        classNameTables = classNameTables;
    }

    public static String getSavePath() {
        return savePath;
    }

    public static void setSavePath(String savePath) {
        savePath = savePath;
    }

    public static String getTableNameDB() {
        return tableNameDB;
    }

    public static void setTableNameDB(String tableNameDB) {
        tableNameDB = tableNameDB;
    }

    public static String[] getColDates() {
        return colDates;
    }

    public static String getCreateTable(String[] colStr, String[] colLong, String[] colDate, String tablename) {

        /**
         * setTitle(
         * 첫글자 대문자로 바꾸기, firstUpperCase(str)
         * set + firstUpperCase(str) + (

        colStr = firstUpperCase(colStr);
        colLong = firstUpperCase(colLong);
        colDate = firstUpperCase(colDate);

        String setStrStringFront []= new String[colStr.length];
        for(int i=0; i< colStr.length; i++){
            setStrStringFront[i] = "set"+colStr[i]+"(";
            System.out.println( setStrStringFront[i]);
        }

        String setLongStringFront [] =new String[colLong.length];
        for(int i=1; i< colLong.length; i++){
            setLongStringFront[i] = "set"+colLong[i]+"(";
            System.out.println(setLongStringFront[i]);
        }
         */

        /**
         * setTitle(
         * 첫글자 대문자로 바꾸기, firstUpperCase(str)
         * board.set + firstUpperCase(str) + (form.get + firstUpperCase(str) + ());
         */
         colStr = firstUpperCase(colStr);
         colLong = firstUpperCase(colLong);
         colDate = firstUpperCase(colDate);

         String setStrString []= new String[colStr.length];
         String setStrPrint = "";
         for(int i=0; i< colStr.length; i++){
         setStrString[i] = "        "+tablename+".set"+colStr[i]+"(form.get"+colStr[i]+"());\n";
         setStrPrint = setStrString[i]+setStrPrint;
         System.out.println( setStrString[i]);
         }

         String setLongString [] =new String[colLong.length];
         String setLongPrint = "";
         for(int i=1; i< colLong.length; i++){
         setLongString[i] = "       "+tablename+".set"+colLong[i]+"(form.get"+colLong[i]+"());\n";
         setLongPrint = setLongString[i] + setLongPrint;
         System.out.println(setLongString[i]);
         }

        String setDateString [] =new String[colDate.length];
         String setDatePrint = "";
        for(int i=0; i< colDate.length; i++){
            setDateString[i] = "        "+tablename+".set"+colDate[i]+"(form.get"+colDate[i]+"());\n";
            setDatePrint = setDateString[i] + setDatePrint;
            System.out.println(setDateString[i]);

        }

        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(setStrString);
        arr.add(setLongString);
        arr.add(setDateString);

        return setStrPrint + "\n" + setLongPrint + "\n" + setDatePrint;
    }

    //앞글자 대문자로 바꾸기. getCreateTable(), getTitle... 사용.
    public static String[] firstUpperCase(String[] str){
        for(int i=0; i< str.length; i++) {
            str[i]=str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
        }
        return str;
    }

    //앞글자 소문자로 바꾸기. getCreateTable(), getTitle... 사용.
    public static String[] firstLowerCase(String[] str){
        for(int i=0; i< str.length; i++) {
            str[i]=str[i].substring(0, 1).toLowerCase() + str[i].substring(1);
        }
        return str;
    }


    public static String getVariablesPrint(String[] colStr, String[] colLong, String[] colDate){
        String stringPrint = "";

        colStr = firstLowerCase(colStr);
        colLong = firstLowerCase(colLong);
        colDate = firstLowerCase(colDate);

        String colLongs = "";
        for(int i =0; i< colLong.length; i++){
            colLongs = colLongs +"    private Long "+colLong[i]+";\n" ;
        }
        colLongs = colLongs + "\n";

        String colStrs = "";
        for(int i =0; i< colStr.length; i++){
            colStrs = colStrs + "    private String "+colStr[i]+";\n";
        }
        colStrs = colStrs + "\n";

        String colDates = "";
        for(int i =0; i< colDate.length; i++){
            colDates = colDates +"    private LocalDateTime "+colDate[i]+";\n";
        }
        colDates = colDates + "\n";
        colDates = colDates.substring(0,colDates.length()-1);
        return colLongs + colStrs + colDates;
    }

    public static String getConstPrint(String[] colStr, String[] colLong, String[] colDate){
        String stringPrint = "";

        colStr = firstLowerCase(colStr);
        colLong = firstLowerCase(colLong);
        colDate = firstLowerCase(colDate);

        String colLongs = "";
        for(int i =0; i< colLong.length; i++){
            colLongs = colLongs +", Long "+colLong[i];
        }
        colLongs = colLongs + "\n";
        colLongs = colLongs.substring(1);

        String colStrs = "";
        for(int i =0; i< colStr.length; i++){
            colStrs = colStrs +", String "+colStr[i];
        }
        colStrs = colStrs + "\n";

        String colDates = "";
        for(int i =0; i< colDate.length; i++){
            colDates = colDates +", LocalDateTime "+colDate[i];
        }
        colDates = colDates + "\n";



        return colLongs + colStrs + colDates;


    }

    public static String getConstInPrint(String[] colStr, String[] colLong, String[] colDate) {

        colStr = firstLowerCase(colStr);
        colLong = firstLowerCase(colLong);
        colDate = firstLowerCase(colDate);

        String colLongs = "";
        for(int i =0; i< colLong.length; i++){
            colLongs = colLongs + "     this."+colLong[i]+" = "+colLong[i]+";\n";
        }
        colLongs = colLongs + "\n";

        String colStrs = "";
        for(int i =0; i< colStr.length; i++){
            colStrs = colStrs + "     this."+colStr[i]+" = "+colStr[i]+";\n";
        }
        colStrs = colStrs + "\n";

        String colDates = "";
        for(int i =0; i< colDate.length; i++){
            colDates = colDates + "     this."+colDate[i]+" = "+colDate[i]+";\n";
        }
        colDates = colDates + "\n";

        return colLongs + colStrs + colDates;
    }

    public String getNewsqlPrint(String[] colLong, String[] colStr, String[] colDate, String className, String classNameSm) {

        colStr = firstLowerCase(colStr);
        colLong = firstLowerCase(colLong);
        colDate = firstLowerCase(colDate);

        String esm = classNameSm;

        String colLongs ="";
        for(int i=0; i<colLong.length; i++){
            colLongs = colLongs +"                      "+esm+"."+colLong[i]+",\n";
        }

        String colStrs="";
        for(int i=0; i<colStr.length; i++){
            colStrs = colStrs +"                      "+esm+"."+colStr[i]+",\n";
        }

        String colDates="";
        for(int i=0; i<colDate.length; i++){
            colDates = colDates +"                      "+esm+"."+colDate[i]+",\n";
        }

        return colLongs + colStrs + colDates;
    }
}
