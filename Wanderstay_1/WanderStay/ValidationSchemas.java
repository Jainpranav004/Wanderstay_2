import javax.validation.constraints.*;

public class ValidationSchemas {

    // Listing Schema
    public static class ListingSchema {

        @NotNull(message = "Title is required")
        private String title;

        @NotNull(message = "Description is required")
        private String description;

        @NotNull(message = "Location is required")
        private String location;

        @NotNull(message = "Country is required")
        private String country;

        @NotNull(message = "Price is required")
        @Min(value = 0, message = "Price must be greater than or equal to 0")
        private Double price;

        private String image;

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    // Review Schema
    public static class ReviewSchema {

        public static class Review {

            @NotNull(message = "Rating is required")
            @Min(value = 1, message = "Rating must be at least 1")
            @Max(value = 5, message = "Rating must be at most 5")
            private Integer rating;

            @NotNull(message = "Comment is required")
            private String comment;

            // Getters and Setters
            public Integer getRating() {
                return rating;
            }

            public void setRating(Integer rating) {
                this.rating = rating;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }
        }

        @NotNull(message = "Review object is required")
        private Review review;

        // Getters and Setters
        public Review getReview() {
            return review;
        }

        public void setReview(Review review) {
            this.review = review;
        }
    }
}
