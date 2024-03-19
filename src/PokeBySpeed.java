/* Class: PokeBySpeed
 * Author: Samuel Cho
 * Description: Class for Pokemon dataset that implements a Comparator interface to compare
 * two Pokemon objects for sorting by speed, breaking ties by total base stat.
 */

import java.util.Comparator;

public class PokeBySpeed implements Comparator<Pokemon> {
    public int compare(Pokemon a, Pokemon b) {
        if (a.getSpeed() != b.getSpeed())
            return a.getSpeed() - b.getSpeed(); // sort by speed
        else
            return a.getTotal() - b.getTotal(); // tie breaker total base stat
    }
}
