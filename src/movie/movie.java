package movie;
import java.util.ArrayList;
import java.util.List;
public class movie {
    private List<MovieItem> movieItems;
    public movie(){
        movieItems=new ArrayList<>();
    }
    public <movieItems extends MovieItem> void addmovieItem(movieItems item){
        movieItems.add(item);
    }
    public void printmovieDetails(){
        movieItems.forEach(item -> item.printDetails());
    }
}