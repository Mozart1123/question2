package test;
import movie.movie;
import movie.MovieItem;
public class movieTest {
    public static void main(String[]args){
        movie myMovie = new movie();
        MovieItem item1 = new MovieItem(" NO TIME TO DIE","DANIEL  ");
        MovieItem item2 = new MovieItem("MISSION IMPOSSIBLE","TOM CRUISE");
        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);
        myMovie.printmovieDetails();
    }

}
