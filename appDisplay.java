import java.util.ArrayList;

public class appDisplay {

    public appDisplay() {

        public void searchBar() {
            String search = readLine("Enter disease(s) or medications: ");
            ArrayList<String> results = displayResults(search);
        }

        public ArrayList<String> displayResults(String search) {
            String input = search;
            ArrayList<String> results = new ArrayList<String>();
            for (int i = input.length - 1; i >= 0; i--) {
                int count = input.length;
                if (input.charAt(i) == " ") {
                    results.add(input(i, count));
                    count = i;
                } else if (i == 0) {
                    results.add(input(i, count));
                }
            }
            return results;
        }

    }

}