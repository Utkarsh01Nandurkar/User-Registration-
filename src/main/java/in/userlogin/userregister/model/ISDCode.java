package in.userlogin.userregister.model;

public enum ISDCode {
	US("+1"),
    ZA("+27"),
    FR("+33"),
    UK("+44"),
    DE("+49"),
    BR("+55"),
    AU("+61"),
    ID("+62"),
    PH("+63"),
    JP("+81"),
    KR("+82"),
    CN("+86"),
    IN("+91"),
    PK("+92"),
    BD("+880"),
    AE("+971"),
    SA("+966"),
    NG("+234"),
    RU("+7");

    private final String code;

    ISDCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
