package api.http;

public class Title {
    public String title;
    public int year;

    public Title(OMDbTitle omdbTitle) {
        this.title = omdbTitle.title();

        String yearString = omdbTitle.year();
        yearString = yearString.replace("–", ""); // Reemplaza el guion largo con el normal

        try {
            // Ex: "20192021"
            if (yearString.length() > 4) {
                yearString = yearString.substring(0, 4); // Take the first year ("2019")
            }

            this.year = Integer.parseInt(yearString);
        } catch (NumberFormatException e) {
            this.year = 0; // Default value
        }
    }
}
