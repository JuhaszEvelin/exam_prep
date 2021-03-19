package io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DaVinciCodeTest {

    DaVinciCode dvc = new DaVinciCode();

    @Test
    void testDecode_file1(){
        String path = "src/main/resources/io.txt";
        char find = 'x';
        assertEquals(0, dvc.decode(path, find));
    }

    @Test
    void testDecode_file2(){
        String path = "src/main/resources/io2.txt";
        char find = '1';
        assertEquals(1, dvc.decode(path, find));
    }

    @Test
    void testDecode_file3(){
        String path = "src/main/resources/io3.txt";
        char find = '0';
        assertEquals(5, dvc.decode(path, find));
    }

    @Test
    void testDecode_file4(){
        String path = "src/main/resources/io4.txt";
        char find = 'x';
        assertEquals(5, dvc.decode(path, find));
    }

}
