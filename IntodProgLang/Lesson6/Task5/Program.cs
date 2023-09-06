// Задача 45: Напишите программу, которая будет создавать копию 
// заданного массива с помощью поэлементного копирования.

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(1, 10);
    }
    return array;
}

int[] CopyArray (int[] array){
    int[] copy = new int[array.Length];
    for (int i = 0; i < array.Length; i++){
        copy[i] = array[i];
    }
    return copy;
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
int[] copy_array = CopyArray(array);
Console.WriteLine($"Исходный массив: [{string.Join(",", array)}]    Скопированный поэлементно массив: [{string.Join(",", copy_array)}]");
Console.WriteLine("Изменим второй элемент скопированного массива и выведем заново оба массива.");
copy_array[1] = 200;
Console.WriteLine($"Исходный массив: [{string.Join(",", array)}]    Скопированный поэлементно массив: [{string.Join(",", copy_array)}]");