/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 * @author Melek Homrani
 */
public class AddTable {
    public static void main(String[] args) {

        int[] array = new int[3];
        for (int i = 0; i < 4; ++i) {
            array[i] = i;
        }
        try {
            System.out.println(Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds exception.");
        }
    }
}


