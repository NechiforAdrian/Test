package itschool1;

public class LivingRoom {
    private String colour;
    //private double width = 3.4; we can do that or...
    private double widthRoom;
    //private double length = 2.7; we can do that or...
    private double lengthRoom;
    private boolean tv;
    private boolean wifi;
    //private Multimedia multimedia;
    private boolean ac;
    private boolean coach;
    private boolean windows;
    private String windowsPosition;
    //private String windowsSize = "width = 434. height =342"; we can do that or...
    private double windowsWidth;
    private double windowsLength;

    //public - access modifier
    //void - return type, doesn't return anything
    //setColour - method name
    //(String colour) - method parameter of type String, and name colour
    //this.colour - colour variables declare above, at line 5

   public String getColour(){
        return colour;
   }
    public void setColour(String colour){
        this.colour = colour;
    }
    public double getWidthRoom(){
        return widthRoom;
    }
    public void setWidthRoom(double widthRoom){
        this.widthRoom = widthRoom;
    }
    public double getLengthRoom(){
        return lengthRoom;
    }
    public void setLengthRoom(double lengthRoom){
        this.lengthRoom = lengthRoom;
    }
    public boolean isTv(){
       return tv;
    }
    public void setTv(boolean tv){
       this.tv = tv;
    }
    public boolean isWifi(){
        return wifi;
    }
    public void setWifi(boolean wifi){
        this.wifi = wifi;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isCoach() {
        return coach;
    }

    public void setCoach(boolean coach) {
        this.coach = coach;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public String getWindowsPosition() {
        return windowsPosition;
    }

    public void setWindowsPosition(String windowsPosition) {
        this.windowsPosition = windowsPosition;
    }

    public double getWindowsWidth() {
        return windowsWidth;
    }

    public void setWindowsWidth(double windowsWidth) {
        this.windowsWidth = windowsWidth;
    }

    public double getWindowsLength() {
        return windowsLength;
    }

    public void setWindowsLength(double windowsLength) {
        this.windowsLength = windowsLength;
    }
}
      ////class Multimedia{
      //private boolean tv;
        //private String tvBrand;
     //}
