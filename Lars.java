/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: Lars.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/15 at 11:38 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

/**
 * ITs LArS!!!! :) <script></script>
 */
public class Lars {
    private boolean hasBrain;
    private String label;
    public int id;
    public String doing;

    public Lars() {
        doing = "good";
        hasBrain = false;
        label = "";
        id = 0;
    }

    /**
     * Create a lars with set parameters
     * @param hasBrain - Does hi have brain
     * @param label - its the label <code>label</code>
     * @param id - uuid for the id
     */
    public Lars(boolean hasBrain, String label, int id) {
//        System.out.println("is null "+(this.id == null));
        this.hasBrain = hasBrain;
        this.label = label;
        this.id = id;
    }

    public String getLabel() {return label;}

    public int getId() {
        return id;
    }

    public String getDoing() {
        return doing;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    public void setHasBrain(boolean hasBrain) {
        this.hasBrain = hasBrain;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Lars{" +
                "hasBrain=" + hasBrain +
                ", label='" + label + '\'' +
                ", id=" + id +
                ", doing='" + doing + '\'' +
                '}';
    }

    /**
     * A way to test some Lars
     * @param args useless stuff from the console args
     */
    public static void main(String[] args) {
        Lars l1 = new Lars();
        Lars l2 = new Lars(true, "lars", 1);
        System.out.println(l1);
        System.out.println(l2);
    }
}
