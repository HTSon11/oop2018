package week3;


import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {
    

    
    @Test
    public void testmax(){
        assertEquals(34,Week3.max(34,4));
        assertEquals(4,Week3.max(4,3));
        assertEquals(67,Week3.max(67,23));
        assertEquals(0,Week3.max(0,-2));
        assertEquals(88,Week3.max(88,88));
    }

    
    public void testminOfArray(){
        int[] array1={2,6,9,1,9,4,0,34,123};
        assertEquals(0,Week3.minOfArray(array1));
        int[] array2={9,8,7,6,5,4,3,2,1,0};
        assertEquals(0,Week3.minOfArray(array2));
        int[] array3={324,4,77,-88,5,4,1};
        assertEquals(-88,Week3.minOfArray(array3));
        int[] array4={80,68,85,90,-9,1123};
        assertEquals(-9,Week3.minOfArray(array4));
        int[] array5={8,3,8,24,76,44,17,77,28,8};
        assertEquals(3,Week3.minOfArray(array5));
    }

    
    public void testcalculateBMI(){
        assertEquals("thiếu cân", Week3.calculateBMI(49, 1.64));
        assertEquals("bình thường", Week3.calculateBMI(77, 1.85));
        assertEquals("Thieu can", Week3.calculateBMI(59, 1.90));
        assertEquals("Beo phi", Week3.calculateBMI(88, 1.60));
        assertEquals("Thua can", Week3.calculateBMI(60, 1.60));
    }
}
