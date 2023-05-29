/** 
     * @author Samantha Bhor 
     * // arreglo programa inicial 
     */


import java.util.HashMap;
import java.util.Map;

public class SupportFunctions {
    
    /** 
     * @param kValue
     * @param value
     * @return String
     */
    public static String getKeyfromValue(HashMap<String,Integer> kValue, Integer value){
        for (Map.Entry<String, Integer> entry : kValue.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
