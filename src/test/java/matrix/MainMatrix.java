package matrix;


import exception.ExceptionMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MainMatrix {


    @Test
    public void getTestMatrix() throws Exception{
       Matrix m = new Matrix(3,3);
       m.setValue(3,2,5);
       //assertEquals(matrix,matrix);
    }
}
