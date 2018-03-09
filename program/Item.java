/**
 * FILENAME: Item.java
 * DESCRIPTION: Representation of an item someone could lend someone else.
 * @author Angelina Li
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Item {

    private static String dateFormat = "yyyy-MM-dd HH:mm:ss";

    private String name, pic, startDT, endDT; // start and end date time
    private boolean overdue;

    public Item(String name, String pic, String startDT, String endDT) {
        this.name = name;
        this.pic = pic;
        this.startDT = startDT;
        this.endDT = endDT;
        this.overdue = false;
    }

    public Item(String name, String pic, String endDT) {
        this(name, pic, getTodayDT(), endDT);
    }

    public Item(String name, String pic, String startDT, double lendDuration) {

    }

    public static String getTodayDT() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(dateFormat);
        Date now = new Date();
        return sdfDate.format(now);
    }

    public static String getEndDT(String startDT, double lendDuration) {
        // finish this for use in constructor
        return "";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + name + "\n");
        sb.append("pic: " + pic +  "\n");
        sb.append("startDateTime: " + startDT + "\n");
        sb.append("endDateTime: " + endDT + "\n");
        sb.append("overdue: " + overdue);
        return sb.toString();
    }

    public static void main(String[] args) {
        Item testItem = new Item("Angelina", "picPath.png", getTodayDT());

        System.out.println("");
        System.out.println("Testing constructor: \n" + testItem + "\n");
        System.out.println("Testing getTodayDT(): " + getTodayDT());
        System.out.println("");
    }
}
