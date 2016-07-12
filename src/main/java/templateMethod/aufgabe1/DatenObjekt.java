package templateMethod.aufgabe1;

/**
 * Created by edutilos on 12.07.2016.
 */
public class DatenObjekt {
    private String name;
    private int maxWert;
    private int minWert;
    private int eroeffnungsWert;
    private  int schlusswert;

    public DatenObjekt(String name, int maxWert, int minWert, int eroeffnungsWert, int schlusswert) {
        this.name = name;
        this.maxWert = maxWert;
        this.minWert = minWert;
        this.eroeffnungsWert = eroeffnungsWert;
        this.schlusswert = schlusswert;
    }

    public String getName() {
        return name;
    }

    public int getMaxWert() {
        return maxWert;
    }

    public int getMinWert() {
        return minWert;
    }

    public int getEroeffnungsWert() {
        return eroeffnungsWert;
    }

    public int getSchlusswert() {
        return schlusswert;
    }

    @Override
    public String toString() {
        return "DatenObjekt{" +
                "name='" + name + '\'' +
                ", maxWert=" + maxWert +
                ", minWert=" + minWert +
                ", eroeffnungsWert=" + eroeffnungsWert +
                ", schlusswert=" + schlusswert +
                '}';
    }
}
