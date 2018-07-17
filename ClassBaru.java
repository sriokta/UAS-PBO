package polymorphims;

public enum ClassBaru {
    Sriokta("Tidur","20"),
    Shinta("Internetan","21"),
    Dinar("Makan","25"),
    Adel("Chatting","17"),
    Shanti("Main","10");
    
    public final String hoby;
    public final String umur;
    
    ClassBaru (String _hoby, String _umur) {
        hoby = _hoby;
        umur = _umur; 
    }
    public String getHoby(){
        return hoby;
    }
    public String getUmur(){
        return umur;
    }
}
