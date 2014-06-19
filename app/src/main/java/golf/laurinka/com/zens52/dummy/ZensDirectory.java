package golf.laurinka.com.zens52.dummy;

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
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Meditate"));
        addItem(new DummyItem("2", "Unprocrastinate"));
        addItem(new DummyItem("3", "Walking"));
        addItem(new DummyItem("4", "Flexible Mind"));
        addItem(new DummyItem("5", "Identify Your Essentials"));
        addItem(new DummyItem("6", "Mindful Eating"));
        addItem(new DummyItem("7", "Most Important !ings (MITs)"));
        addItem(new DummyItem("8", "Clear a Shelf"));
        addItem(new DummyItem("9", "Start Saving"));
        addItem(new DummyItem("10", "Yoga or strength training"));
        addItem(new DummyItem("11", "Floss"));
        addItem(new DummyItem("12", "Pay a small debt"));
        addItem(new DummyItem("13", "Mindful Exercise"));
        addItem(new DummyItem("14", "Budget Simply"));
        addItem(new DummyItem("15", "Create a support crew"));
        addItem(new DummyItem("16", "Eat some veggies"));
        addItem(new DummyItem("17", "Gratitude"));
        addItem(new DummyItem("18", "Clear counters"));
        addItem(new DummyItem("19", "Slow down"));
        addItem(new DummyItem("20", "Play"));
        addItem(new DummyItem("21", "Flow"));
        addItem(new DummyItem("22", "Let go of a voice"));
        addItem(new DummyItem("23", "Don’t wish things were different"));
        addItem(new DummyItem("24", "Clear a closet"));
        addItem(new DummyItem("25", "Let go of TV"));
        addItem(new DummyItem("26", "Get more sleep"));
        addItem(new DummyItem("27", "Value time over money"));
        addItem(new DummyItem("28", "Replace opinions with curiosity"));
        addItem(new DummyItem("29", "Read"));
        addItem(new DummyItem("30", "Cut out shopping"));
        addItem(new DummyItem("31", "Learn that you’re good enough"));
        addItem(new DummyItem("32", "Create"));
        addItem(new DummyItem("33", "Eat real food"));
        addItem(new DummyItem("34", "Explore work you love"));
        addItem(new DummyItem("35", "Help others"));
        addItem(new DummyItem("36", "Breathe"));
        addItem(new DummyItem("37", "Enjoy the habit"));
        addItem(new DummyItem("38", "Solitude"));
        addItem(new DummyItem("39", "Unclutter a room"));
        addItem(new DummyItem("40", "Iterate the habit"));
        addItem(new DummyItem("41", "Less busywork, more impact"));
        addItem(new DummyItem("42", "Disconnect"));
        addItem(new DummyItem("43", "Let go of a goal"));
        addItem(new DummyItem("44", "Treat failure as a learning opportunity"));
        addItem(new DummyItem("45", "Reduce commitments"));
        addItem(new DummyItem("46", "Turn problems into opportunities"));
        addItem(new DummyItem("47", "Savor"));
        addItem(new DummyItem("48", "Clear your inbox"));
        addItem(new DummyItem("49", "Teach"));
        addItem(new DummyItem("50", "Compassion"));
        addItem(new DummyItem("51", "Reflect"));
        addItem(new DummyItem("52", "Realize you’re not missing out"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
