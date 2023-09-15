
/**
 * MinutesFilter can be used to extract movies with length in between minimum and maximum
 * specified minutes specified in the method parameter.
 * 
 * @ Snehil S P
 * @ Version: 1.0 (09 August 2023)
 */

public class MinutesFilter implements Filter {
    private int minMin;
    private int maxMin;
    
    public MinutesFilter (int min, int max) {
        minMin = min;
        maxMin = max;
    }
    
    @Override
    public boolean satisfies(String id) {
        return MovieDatabase.getMinutes(id) >= minMin && MovieDatabase.getMinutes(id) <= maxMin;
    }
}
