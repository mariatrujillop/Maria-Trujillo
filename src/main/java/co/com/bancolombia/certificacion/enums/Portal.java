package co.com.bancolombia.certificacion.enums;

public enum Portal {

    DEMO_QA("https://www.grupobancolombia.com/personas");
    String portal;
    private Portal(String msj){this.portal =msj; }
    public String getUrl(){return portal;}



}
