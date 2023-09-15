
/**
 * GenreFilter can be used to extract movies in specified genre in the method parameter.
 * 
 * @ Snehil S P 
 * @ Version: 1.0 (08 September 2023)
 */

public class GenreFilter implements Filter {
    private String myGenre;
    
    public GenreFilter (String genre) {
        myGenre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getGenres(id).contains(myGenre);
    }
}
