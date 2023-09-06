// Задача 35: Задайте одномерный массив из 123 случайных чисел. 
// Найдите количество элементов массива, значения которых лежат в 
// отрезке [10,99]. 
// Пример для массива из 5, а не 123 элементов. В своём решении сделайте для 123
// [5, 18, 123, 6, 2] -> 1
// [1, 2, 3, 6, 2] -> 0
// [10, 11, 12, 13, 14] -> 5

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-100,101);
    }
    return array;
}

int ElemCondition (int[] array){
    int count = 0;
    foreach (int element in array){
        if (element > 9 && element < 100) count++;
    }
    return count;
}

int[] array = FillArray(new int[123]);
Console.WriteLine($"Количество элементов массива [{string.Join(",", array)}]\nнаходящихся на отрезке [10,99]: {ElemCondition(array)}");