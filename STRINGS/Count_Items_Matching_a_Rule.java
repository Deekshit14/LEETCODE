package STRINGS;
import java.util.ArrayList;
import java.util.List;
public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        // Declare a two-dimensional ArrayList
        ArrayList<List<String>> items = new ArrayList<>();

        // Create and add inner lists
        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));

        System.out.println(countMatches(items, "color", "silver"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        int i=0;
        int j=0;
        if (ruleKey.equals("type"))
            j=0;
        else if (ruleKey.equals("color"))
            j=1;
        else
            j=2;
        
        while (i<items.size())
        {
            if (items.get(i).get(j).equals(ruleValue))
                match++;
            i++;
        }
        return match;
    }
}
