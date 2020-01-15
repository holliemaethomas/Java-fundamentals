package inheritance;

public class Review {
    Restaurant restaurant;
    double reviewRating;
    String body;
    String author;

    public Review(double reviewRating, String body, String author) {
        this.reviewRating = reviewRating;
        this.body = body;
        this.author = author;
    }

    public String toString() {
        return "received "+ this.reviewRating +" stars"+"| text: "+ this.body +"| author: "+this.author+"";
    }
}
