package inheritance;

import java.util.LinkedList;
import java.util.List;


public class Theater {
    List<Review> reviews;
    String name;
    double rating;
    String priceCategory;

    public Theater(String name, String priceCategory){
        reviews = new LinkedList<>();
        this.name = name;
        this.rating = 0.0;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return "Theatre name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCategory;
    }

    public void addReview(Review r){
        this.reviews.add(r);
        this.rating += (r.reviewRating);
        this.rating = rating / reviews.size();
    }
}

//copy and pasted from Restaurant;
