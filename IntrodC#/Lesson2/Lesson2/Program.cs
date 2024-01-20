

using System;
using System.Text;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace Lesson2
{
    internal class Program
    {
        class MyArrayInt
        {
            static Random random = new Random();
            public static int[] CreateArray(int length)
            {
                int[] array = new int[length];
                for (int i = 0; i < array.Length; i++)
                {
                    array[i] = random.Next(-10, 10);
                }
                return array;
            }

            public static int[] ConcatArrays(int[] array1, int[] array2)
            {
                int[] array3 = new int[array1.Length + array2.Length];
                for (int i = 0; i < array3.Length; i++)
                {
                    if (i < array1.Length)
                    {
                        array3[i] = array1[i];
                    }
                    else
                    {
                        array3[i] = array2[i - array1.Length];
                    }
                }
                return array3;
            }

            public static int[] SortArrayIncr(int[] array)
            {
                for (int i = 0; i < array.Length; i++)
                {
                    for (int j = 0; j < array.Length - 1 - i; j++)
                    {
                        if (array[j] > array[j + 1])
                        {
                            int cur = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = cur;
                        }
                    }
                    Console.WriteLine(string.Join(" ", array));
                }
                return array;
            }

        }

        class BinaryNumb
        {
            public static StringBuilder DecimalToBinary(int initialNumb)
            {
                StringBuilder sb = new StringBuilder();
                int res = initialNumb;
                while (res > 1)
                {
                    sb.Append(res % 2);
                    res = res / 2;
                }
                sb.Append(res);
                for (int i = 0; i < sb.Length / 2; i++)
                {
                    char cur = sb[i];
                    sb[i] = sb[sb.Length - 1 - i];
                    sb[sb.Length - 1 - i] = cur;
                }
                return sb;
            }

            public static int CountOne(StringBuilder sb)
            {
                int count = 0;
                for (int i = 0; i < sb.Length; i++)
                {
                    if (sb[i] == '1') count++;
                }
                return count;
            }
        }
   
        class MyMultidimArrayInt
        {
            public static int[,] SortArrayIncr(int[,] array)
            {
                for (int k = 0; k < array.GetLength(0); k++)
                {
                    for (int i = 0; i < array.GetLength(0) - k; i++)
                    {
                        for (int m = 0; m < array.GetLength(1); m++)
                        {
                            for (int j = 0; j < array.GetLength(1) - m; j++)
                            {
                                if (j != array.GetLength(1) - 1)
                                {
                                    if (array[i, j] > array[i, j + 1])
                                    {
                                        int cur = array[i, j];
                                        array[i, j] = array[i, j + 1];
                                        array[i, j + 1] = cur;
                                    }
                                }
                                else if (i != array.GetLength(0) - 1)
                                {
                                    if (array[i, j] > array[i + 1, 0])
                                    {
                                        int cur = array[i, j];
                                        array[i, j] = array[i + 1, 0];
                                        array[i + 1, 0] = cur;
                                    }
                                }
                            }
                        }
                    }
                }
                return array;
            }

            public static void Print(int[,] array)
            {
                for (int i = 0; i < array.GetLength(0); i++)
                {
                    for (int j = 0; j < array.GetLength(1); j++)
                    {
                        Console.Write(array[i, j] + " ");
                    }
                    Console.WriteLine();
                }
            }
        }


        static void Main(string[] args)
        {
            Random random = new Random();

            //Task 1

            /*int[] array1 = MyArrayInt.CreateArray(3);
            int[] array2 = MyArrayInt.CreateArray(5);
            Console.WriteLine(string.Join(" ", array1));
            Console.WriteLine(string.Join(" ", array2));

            int[] array3 = MyArrayInt.ConcatArrays(array1, array2);
            Console.WriteLine(string.Join(" ", array3));

            array3 = MyArrayInt.SortArrayIncr(array3);
            Console.WriteLine(string.Join(" ", array3));*/



            //Task2

            /*int numb = random.Next(0, 100);
            Console.WriteLine(numb);
            StringBuilder numbSb = BinaryNumb.DecimalToBinary(numb);
            Console.WriteLine(numbSb);
            Console.WriteLine(BinaryNumb.CountOne(numbSb));*/


            //Task3

            /*string s = "Эта строка содержит числа 12345 в своей середине";
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.Length; i++)
            {
                if (Char.IsDigit(s[i]))
                {
                    res.Append(s[i]);
                }
                else if (res.Length != 0) 
                { 
                    Console.WriteLine(res);
                    return;
                }
            }*/

            //Homework

            int[,] array = { {7, 3, 2, 10}, {4, 9, 6, 25}, {1, 8, 5, -4} };
            MyMultidimArrayInt.Print(array);
            Console.WriteLine();
            array = MyMultidimArrayInt.SortArrayIncr(array);
            MyMultidimArrayInt.Print(array);
            
            
        }
    }
}