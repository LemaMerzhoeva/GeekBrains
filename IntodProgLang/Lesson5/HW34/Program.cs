// Задача 34: Задайте массив заполненный случайными положительными 
// трёхзначными числами. Напишите программу, 
// которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(100, 1000);
    }
    return array;
}

int EvenCount (int[] array){
    int res = 0;
    for (int i = 0; i < array.Length; i++){
        if (array[i] % 2 == 0){
            res++;
        }
    }
    return res;
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
Console.WriteLine($"Количество четных чисел в массиве [{string.Join(",", array)}]: {EvenCount(array)}");