import java.util.ArrayList;

public class ArrayListExercise {

    public static void main(String[] args) {
            //  Creating and Initializing an ArrayList
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");
            colors.add("Yellow");
            colors.add("Orange");

            // iterating Over the arraylist
            System.out.println("Colors:");
            for(String color : colors){
                System.out.println(color);
            }
            
            // adding and removing elements
            colors.add(2,"Purple");
            colors.remove(1);


            // print the updated ArrayList
            System.out.println("\nUpdated Colors:");
            for (String color : colors){
                System.out.println(color);
            }

            // searching for an element
            String searchTerm = "Yellow";
            System.out.println("\nSearching for color:" + searchTerm);
            System.out.println(searchColor(colors, searchTerm));

            // duplicate removal
            ArrayList<String> uniqueColors = removeDuplicates(colors);
            System.out.println("\nUnique Colors:");
            for (String color : uniqueColors){
                System.out.println(color);
            }

        }

        //Method to search for a color in the ArrayList 
        public static String searchColor(ArrayList<String> colors, String searchTerm){
            int index = colors.indexOf(searchTerm);
            if (index != -1){
                return "Color'" + searchTerm + "' Found at position" + (index + 1);
            } else {
                return "Color'" + searchTerm + "' not found in the list";
            }
        }

        // Method to remove duplicate values from the ArrayList
        public static ArrayList<String> removeDuplicates (ArrayList<String> list){
            ArrayList<String> uniqueList = new ArrayList<>();
            for (String item : list){
                if (!uniqueList.contains(item)){
                    uniqueList.add(item);

                }
            }
            return uniqueList;
        }
}