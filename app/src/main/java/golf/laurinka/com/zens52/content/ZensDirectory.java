package golf.laurinka.com.zens52.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class ZensDirectory {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ZenItem> ITEMS = new ArrayList<ZenItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, ZenItem> ITEM_MAP = new HashMap<String, ZenItem>();

    static {
        // Add 3 sample items.
        addItem(new ZenItem("1", "Meditate"));
        addItem(new ZenItem("2", "Unprocrastinate"));
        addItem(new ZenItem("3", "Walking"));
        addItem(new ZenItem("4", "Flexible Mind"));
        addItem(new ZenItem("5", "Identify Your Essentials"));
        addItem(new ZenItem("6", "Mindful Eating"));
        addItem(new ZenItem("7", "Most Important !ings (MITs)"));
        addItem(new ZenItem("8", "Clear a Shelf"));
        addItem(new ZenItem("9", "Start Saving"));
        addItem(new ZenItem("10", "Yoga or strength training"));
        addItem(new ZenItem("11", "Floss"));
        addItem(new ZenItem("12", "Pay a small debt"));
        addItem(new ZenItem("13", "Mindful Exercise"));
        addItem(new ZenItem("14", "Budget Simply"));
        addItem(new ZenItem("15", "Create a support crew"));
        addItem(new ZenItem("16", "Eat some veggies"));
        addItem(new ZenItem("17", "Gratitude"));
        addItem(new ZenItem("18", "Clear counters"));
        addItem(new ZenItem("19", "Slow down"));
        addItem(new ZenItem("20", "Play"));
        addItem(new ZenItem("21", "Flow"));
        addItem(new ZenItem("22", "Let go of a voice"));
        addItem(new ZenItem("23", "Don’t wish things were different"));
        addItem(new ZenItem("24", "Clear a closet"));
        addItem(new ZenItem("25", "Let go of TV"));
        addItem(new ZenItem("26", "Get more sleep"));
        addItem(new ZenItem("27", "Value time over money"));
        addItem(new ZenItem("28", "Replace opinions with curiosity"));
        addItem(new ZenItem("29", "Read"));
        addItem(new ZenItem("30", "Cut out shopping"));
        addItem(new ZenItem("31", "Learn that you’re good enough"));
        addItem(new ZenItem("32", "Create"));
        addItem(new ZenItem("33", "Eat real food"));
        addItem(new ZenItem("34", "Explore work you love"));
        addItem(new ZenItem("35", "Help others"));
        addItem(new ZenItem("36", "Breathe"));
        addItem(new ZenItem("37", "Enjoy the habit"));
        addItem(new ZenItem("38", "Solitude"));
        addItem(new ZenItem("39", "Unclutter a room"));
        addItem(new ZenItem("40", "Iterate the habit"));
        addItem(new ZenItem("41", "Less busywork, more impact"));
        addItem(new ZenItem("42", "Disconnect"));
        addItem(new ZenItem("43", "Let go of a goal"));
        addItem(new ZenItem("44", "Treat failure as a learning opportunity"));
        addItem(new ZenItem("45", "Reduce commitments"));
        addItem(new ZenItem("46", "Turn problems into opportunities"));
        addItem(new ZenItem("47", "Savor"));
        addItem(new ZenItem("48", "Clear your inbox"));
        addItem(new ZenItem("49", "Teach"));
        addItem(new ZenItem("50", "Compassion"));
        addItem(new ZenItem("51", "Reflect"));
        addItem(new ZenItem("52", "Realize you’re not missing out"));
    }

    private static void addItem(ZenItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ZenItem {
        public String id;
        public String content;

        public ZenItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
