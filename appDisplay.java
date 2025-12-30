import java.util.ArrayList;

public class appDisplay {

    public appDisplay() {

        public void searchBar() {
            String search = readLine("Enter disease(s) or medications: ");
            ArrayList<String> results = displayResults(search);
            ArrayList<String> interactions = new ArrayList<String>();
            if (results.get(0) == null) {
                System.out.println("No results found.");
            } else {
                for (int i = 0; i < disease.size(); i++) {
                    if (results.contains(disease.get(i))) {
                        System.out.println("Medications available:");
                        for (int j = 0; j < disease.get(i).size(); j++) {
                            System.out.println(disease.get(i).get(j));
                        }
                    }
                }
                for (int i = 0; i < medications.size(); i++) {
                    if (results.contains(medications.get(i).name)) {
                        for (int j = 0; j < medications.get(i).size(); j++) {
                            interactions.add(medications.get(i).get(j) + " interacts with " + medications.get(i));
                        }
                    }
                }
            }
        }

        public ArrayList<String> displayResults(String search) {
            String input = search;
            ArrayList<String> results = new ArrayList<String>();
            for (int i = input.length() - 1; i >= 0; i--) {
                int count = input.length();
                if (input.charAt(i) == ' ') {
                    results.add(input.substring(i, count));
                    count = i;
                } else if (i == 0) {
                    results.add(input.substring(i, count));
                }
            }
            return results;
        }

    }

}