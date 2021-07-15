import java.util.Objects;

public class Cylinder {

    private double h;
    private double r;

    public Cylinder() {
    }

    public Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // I have been created one more method.

    public double getDiameterOfBase () {
        return this.r * 2;
    }

    public double getLengthOfBase () {
        return 2 * Math.PI * this.r;
    }

    public double getSideSurfaceArea () {
        return 2 * Math.PI * this.h * this.r;
    }

    public double getAreaOfBase () {
        return Math.PI * this.r * this.r;
    }

    public double getTotalArea () {
        return 2 * Math.PI * r * (this.h + this.r);
    }

    public double getVolume () {
        return Math.PI * this.r * this.r * this.h;
    }

    @Override
    public String toString() {
        return "Parameters of the Cylinder: " + "\n" +
                "1. Height is " + h + " sm;" + "\n" +
                "2. Radius is " + r + " sm;" + "\n" +
                "3. The diameter of base is " +
                this.getDiameterOfBase() + " sm;" +
                "4. Length of base  is " + this.getLengthOfBase() + " sm;" +
                "\n" +"5. The side surface area is " +
                this.getSideSurfaceArea() + " sm;" + "\n" +
                "6. The area of base is " + this.getAreaOfBase() + " sm;" +
                "7. The total area is " + this.getTotalArea() + " sm;" +
                "8. The volume is " + this.getVolume() + " sm.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.h, h) == 0 &&
                Double.compare(cylinder.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, r);
    }

    //@Override
    public String toJSON() { // I know that this block of code isn't nice, but
        // I have limit for 80 symbols in line
        String json = "Cylinder" + "{" + "\"" + "diameter of base" + "\"" +
                ": " + this.getDiameterOfBase() + "," + "\"" +
                "length of base" + "\"" + ": " + this.getLengthOfBase() + "," +
                "\"" + "side surface area" + "\"" + ":" +
                this.getSideSurfaceArea() + "," + "\"" + "area of base" +
                "\"" + ": " + this.getAreaOfBase() + "," + "\"" +
                "total area" + "\"" + ": " + this.getTotalArea() + "," +
                "\"" + "volume" + "\"" + ":" + this.getVolume() + "}";
        return json;
    }

    //@Override
    public String toXML() {
        String xml = "<Cylinder>" +
                " + <diameter of base> " + this.getDiameterOfBase() +
                "</diameter of base>" +
                " + <length of base> " + this.getLengthOfBase() +
                "</length of base>" +
                " + <side surface area> " + this.getSideSurfaceArea() +
                "</side surface area>" +
                " + <area of base> " + this.getAreaOfBase() +
                "</area of base>" +
                " + <total area> " + this.getTotalArea() + "</total area>" +
                " + <volume> " + this.getVolume() + "</volume>" +
                "</Rectangle>";
        return xml;
    }

}
