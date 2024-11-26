package example1;

import java.util.function.Predicate;

public class PredicatImpl implements Predicate {
    @Override
    public boolean test(Object o) {
        String name = o.toString();
        if(name.startsWith("J"))
            return true;
        return false;
    }
}
