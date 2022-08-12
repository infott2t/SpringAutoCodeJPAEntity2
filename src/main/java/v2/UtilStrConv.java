package v2;

import java.util.Locale;


public class UtilStrConv {

    public String tableName;
    public String columnStrings;
    public String columnLongs;
    public String columnDates;
    public String savePath; //파일저장위치.

    public String tableNameDB; //엔티티에 적는 @Table(name="") 테이블 이름.

    //코드에 반환할 값.
    public String tnSmall; //전부 소문자. 테이블 이름.
    public String[] colStrs; //테이블 칼럼명. 배열. String타입.
    public String[] colLongs; //테이블 칼럼명. 배열, Long타입. 1번째는 Primary Key.

    private String[] colDates;  //테이블 칼럼명. 배열, LocalDateTime형.

    public String classNameTables; //테이블 명으로 클래스가 되는 경우.  //getter, setter.


    public UtilStrConv(String savePath, String tableName, String columnStrings, String columnLongs, String columnDates, String tableNameDB) {
        this.savePath = savePath;
        this.tableNameDB = tableNameDB;
        this.tableName = tableName;
        this.columnStrings = columnStrings;
        this.columnLongs = columnLongs;
        this.columnDates = columnDates;
        this.tnSmall = tableName.toLowerCase(Locale.ROOT);
        this.colStrs = columnStrings.split(",");
        this.colLongs = columnLongs.split(",");
        this.colDates = columnDates.split(",");
        this.classNameTables = tableName;


    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnStrings() {
        return columnStrings;
    }

    public void setColumnStrings(String columnStrings) {
        this.columnStrings = columnStrings;
    }

    public String getColumnLongs() {
        return columnLongs;
    }

    public void setColumnLongs(String columnLongs) {
        this.columnLongs = columnLongs;
    }

    public String getTnSmall() {
        return tnSmall;
    }

    public void setTnSmall(String tnSmall) {
        this.tnSmall = tnSmall;
    }

    public String[] getColStrs() {
        return colStrs;
    }

    public void setColStrs(String[] colStrs) {
        this.colStrs = colStrs;
    }

    public String[] getColLongs() {
        return colLongs;
    }

    public void setColLongs(String[] colLongs) {
        this.colLongs = colLongs;
    }

    public String getClassNameTables() {
        return classNameTables;
    }

    public void setClassNameTables(String classNameTables) {
        this.classNameTables = classNameTables;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getTableNameDB() {
        return tableNameDB;
    }

    public void setTableNameDB(String tableNameDB) {
        this.tableNameDB = tableNameDB;
    }

    public String[] getColDates() {
        return colDates;
    }
}
