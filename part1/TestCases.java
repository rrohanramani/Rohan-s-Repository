import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestCases
{
   private static final double DELTA = 0.00001;


   public void testSimpleIf1()
   {
      assertEquals(1.7, SimpleIf.max(1.2, 1.7), DELTA);
   }

   
   public void testSimpleIf2()
   {
      assertEquals(9.0, SimpleIf.max(9.0, 3.2), DELTA);
   }

   
   public void testSimpleIf3()
   {
	   assertEquals(12.0, SimpleIf.max(12.0, 6.5), DELTA);
   }

   
   public void testSimpleLoop1()
   {
      assertEquals(7, SimpleLoop.sum(3, 4));
   }

   
   public void testSimpleLoop2()
   {
      assertEquals(7, SimpleLoop.sum(-2, 4));
   }

   
   public void testSimpleLoop3()
   {
      assertEquals(0, SimpleLoop.sum(-3, 3)); 
   }

   
   public void testSimpleArray1()
   {
      assertArrayEquals(
         new int[] {1, 4, 9},
         SimpleArray.squareAll(new int[] {1, 2, 3}));
   }

   
   public void testSimpleArray2()
   {
      assertArrayEquals(
         new int[] {49, 25},
         SimpleArray.squareAll(new int[] {7, 5}));
   }

   
   public void testSimpleArray3()
   {
      assertArrayEquals(
         new int[] {64, 36},
         SimpleArray.squareAll(new int[] {8, 6}));
   }

   
   public void testSimpleList1()
   {
      List<Integer> input =
         new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 2, 3}));
      List<Integer> expected =
         new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 4, 9}));

      assertEquals(expected, SimpleList.squareAll(input));
   }

   
   public void testSimpleList2()
   {
      List<Integer> input =
         new LinkedList<Integer>(Arrays.asList(new Integer[] {3, 6, 9}));
      List<Integer> expected =
         new ArrayList<Integer>(Arrays.asList(new Integer[] {9, 36, 81}));

      assertEquals(expected, SimpleList.squareAll(input));
   }

   
   public void testBetterLoop1()
   {
      assertTrue(BetterLoop.contains(new int[] {7, 5}, 5));
   }

   
   public void testBetterLoop2()
   {
      assertTrue(BetterLoop.contains(new int[] {7, 5, 2, 4}, 4));
   }

   
   public void testBetterLoop3()
   {
      assertFalse(BetterLoop.contains(new int[] {1,2,3,4,5,6,7}, 9));
   }
   
   public void testExampleMap1()
   {
      List<String> expected = Arrays.asList("Julie", "Zoe");
      Map<String, List<Course>> courseListsByStudent = new HashMap<>();

      courseListsByStudent.put("Julie",
         Arrays.asList(
            new Course("CPE 123", 4),
            new Course("CPE 101", 4),
            new Course("CPE 202", 4),
            new Course("CPE 203", 4),
            new Course("CPE 225", 4)));
      courseListsByStudent.put("Paul",
         Arrays.asList(
            new Course("CPE 101", 4),
            new Course("CPE 202", 4),
            new Course("CPE 203", 4),
            new Course("CPE 225", 4)));
      courseListsByStudent.put("Zoe",
         Arrays.asList(
            new Course("CPE 123", 4),
            new Course("CPE 203", 4),
            new Course("CPE 471", 4),
            new Course("CPE 473", 4),
            new Course("CPE 476", 4),
            new Course("CPE 572", 4)));

      
      assertEquals(new HashSet<>(expected),
         new HashSet<>(ExampleMap.highEnrollmentStudents(
            courseListsByStudent, 16)));
   }

   @Test
   public void testExampleMap2()
   {
      List<String> expected = Arrays.asList("Rohan", "Karina");
      Map<String, List<Course>> courseListsByStudent = new HashMap<>();

      courseListsByStudent.put("Rohan",
         Arrays.asList(
            new Course("CPE 203", 4),
            new Course("CPE 225", 4),
            new Course("Math 241", 4),
            new Course("Phys 141", 4),
            new Course("Tech Writing", 4)));
      courseListsByStudent.put("Ron",
         Arrays.asList(
            new Course("CPE 202", 4),
            new Course("Math III", 4),
            new Course("Orientation", 1),
            new Course("MPE", 4)));
      courseListsByStudent.put("Karina",
         Arrays.asList(
            new Course("CPE 357", 4),
            new Course("CPE 348", 4),
            new Course("Math IV", 4),
            new Course("Gender Studies", 4),
            new Course("AI Class", 4),
            new Course("Game Design", 4)));

      
      assertEquals(new HashSet<>(expected),
         new HashSet<>(ExampleMap.highEnrollmentStudents(
            courseListsByStudent, 16)));
   }
}
