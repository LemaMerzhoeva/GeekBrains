// Задача 36: Задайте одномерный массив, 
// заполненный случайными числами. 
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-10, 10);
    }
    return array;
}

int SumOdd (int[] array){
    int res = 0;
    for (int i = 1; i < array.Length; i += 2){
        res += array[i];
        Console.WriteLine(i + " " + array[i]);
    }
    return res;
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
Console.WriteLine($"Сумма элементов, стоящих на нечетных позициях в массиве [{string.Join(",", array)}]: {SumOdd(array)}");