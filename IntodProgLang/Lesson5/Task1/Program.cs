// Задача 31: Задайте массив из 12 элементов, заполненный 
// случайными числами из промежутка [-9, 9]. Найдите сумму 
// отрицательных и положительных элементов массива.

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-9, 10);
    }
    return array;
}

void SumMinusPlus (int[] array, ref int sum_minus, ref int sum_plus){
    foreach (int element in array){
        if (element < 0) sum_minus += element;
        else sum_plus += element;
    }
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
int sum_plus = 0, sum_minus = 0;
SumMinusPlus(array, ref sum_minus, ref sum_plus);
Console.WriteLine($"Сумма положительных элементов массива [{string.Join(",", array)}]: {sum_plus}");
Console.WriteLine($"Сумма отрицательных элементов массива [{string.Join(",", array)}]: {sum_minus}");