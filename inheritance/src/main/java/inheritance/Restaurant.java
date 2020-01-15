package inheritance;
import java.util.List;
import java.util.LinkedList;

    public class Restaurants {
        List<Review> reviews;
        String name;
        double rating;
        String priceCategory;
        public Restaurants(String name, double rating, String priceCategory){
            reviews = new LinkedList<>();
            this.name = name;
            this.rating = rating;
            this.priceCategory = priceCategory;
        }
        public String toString() {
            return "Restaurant name: "+ this.name +" | Rating: "+ this.rating + " | Price Category " + this.priceCategory;
        }
        public void addReview(Review r){
            this.reviews.add(r);
            r.Restaurants = this;
        }
    }



//large amount of inserted code is because I had to kill my previous file with fire and paste my code back in :) I did also get some help from Hai