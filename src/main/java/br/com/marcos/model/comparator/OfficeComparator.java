package br.com.marcos.model.comparator;

import br.com.marcos.model.Office;

import java.util.Comparator;

/**
 * Created by marcos on 05/11/16.
 */
public class OfficeComparator implements Comparator<Office> {
    @Override
    public int compare(Office o1, Office o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
