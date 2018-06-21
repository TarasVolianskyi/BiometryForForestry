package com.example.tarasvolianskyi.biometryforforestry.FireBaseAdapter;

public class CellPojo {

    private String userId;
    private String cellType;
    private String cellID;
    private double cellValue;

    public CellPojo() {

    }

    public CellPojo(String userId, String cellType, String cellID, double cellValue) {
        this.userId = userId;
        this.cellType = cellType;
        this.cellID = cellID;
        this.cellValue = cellValue;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    public String getCellID() {
        return cellID;
    }

    public void setCellID(String cellID) {
        this.cellID = cellID;
    }

    public double getCellValue() {
        return cellValue;
    }

    public void setCellValue(double cellValue) {
        this.cellValue = cellValue;
    }
}
