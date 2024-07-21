public class Show {
    private String movie;
    private String time;
    
    // Constructor
    public Show(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }
    
    // Getters
    public String getMovie() {
        return movie;
    }

    public String getTime() {
        return time;
    }

    // Setters
    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Show [movie=" + movie + ", time=" + time + "]";
    }
}
