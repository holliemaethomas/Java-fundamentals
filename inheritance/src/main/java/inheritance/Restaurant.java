package inheritance;
import java.util.List;
import java.util.LinkedList;

    public class Restaurant {
        List<Review> reviews;
        String name;
        double rating;
        String priceCategory;

        public Restaurant(String name, String priceCategory){
            reviews = new LinkedList<>();
            this.name = name;
            this.rating = 0.0;
            this.priceCategory = priceCategory;
        }

        public String toString() {
            return "Restaurant name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCategory;
        }

        public void addReview(Review r){
            this.reviews.add(r);
            this.rating += (r.reviewRating);
            this.rating = rating / reviews.size();
        }
    }

