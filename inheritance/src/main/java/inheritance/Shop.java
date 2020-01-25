package inheritance;


import java.util.LinkedList;
import java.util.List;

public class Shop {
    List<Review> reviews;
    String name;
    double rating;
    String priceCategory;


    public Shop(String name, String priceCategory){
        reviews = new LinkedList<>();
        this.name = name;
        this.rating = 0.0;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return "Shop name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCategory;
    }

    public void addReview(Review r){
        this.reviews.add(r);
        this.rating += (r.reviewRating);
        this.rating = rating / reviews.size();
    }
}


//copy and pasted from Restaurant;
