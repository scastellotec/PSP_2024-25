package example1;

public class StarswithConditionIMPL implements InterfaceCondition{

    @Override
    public boolean evaluate(Object o, String letra) {
        String name = o.toString();
        if(name.startsWith(letra))
            return true;
        return false;
    }
}
