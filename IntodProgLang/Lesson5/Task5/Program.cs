// Задача 37: Найдите произведение пар чисел в одномерном массиве. 
// Парой считаем первый и последний элемент, второй и предпоследний 
// и т.д. Результат запишите в новом массиве.
// [1 2 3 4 5] -> 5 8 3
// [6 7 3 6] -> 12 10

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-9, 10);
    }
    return array;
}

int[] MultFirstLastArray (int[] array){
    int array_length = array.Length;
    int res_length;
    int[] res;
    if (array_length % 2 == 1) {
        res_length = array_length / 2 + 1;
        res = new int[res_length];
        for (int i = 0; i < res_length - 1; i++){
            res[i] = array[i] * array[array_length - 1 - i];
        }
        res[res_length - 1] = array[res_length - 1];
    }
    else {
        res_length = array_length / 2;
        res = new int[res_length];
        for (int i = 0; i < res_length; i++){
            res[i] = array[i] * array[array_length - 1 - i];
        }
    }
    return res;
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
Console.WriteLine($"Исходный массив: [{string.Join(",", array)}]\nМассив с перменоженными прами элементов: [{string.Join(",", MultFirstLastArray(array))}]");