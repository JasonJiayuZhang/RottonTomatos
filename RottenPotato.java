public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static int movieAvgRating(int[][] ratings, int movie) {
        double average = 0;
        for (int i = 0; i < ratings.length; i++){
            average += ratings[i][movie];
    }
            return (int)(average/ratings.length);
}

    //Question 2
    public static int reviewerAvgRating(int[][] ratings,int reviewer) {
        double average = 0;
        for (int i = 0; i < ratings[0].length; i++){
            average += ratings[reviewer][i];
    }
            return (int)(average/ratings[0].length);        
}

    //Question 3
    public static int avgRating2018(int[][] ratings) {
        double average = 0;
        double rating = ratings.length * ratings[0].length;
        for (int r = 0; r < ratings.length; r++) {
            for (int c = 0; c < ratings[0].length; c++) {
                average += ratings[r][c];
            }
        }

        return (int)(average/rating);
    }


    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        int hardestA = reviewerAvgRating(ratings, 0);
        int hardestnum = 0;
        for (int i = 1; i < ratings.length; i++) {
            int newAvg =  reviewerAvgRating(ratings, i);
            if (newAvg < hardestA) {
                hardestnum = i;
                hardestA = newAvg;
            }
        }
        return hardestnum;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        int worstscore   = movieAvgRating(ratings, 0);
        int worstnum = 0;
        for (int c = 1; c < ratings[0].length; c++) {
            int newAvg = movieAvgRating(ratings, c);
            if (newAvg < worstscore) {
                worstscore = newAvg;
                worstnum = c;
            }
        }

        return worstnum;
    }
    }   
