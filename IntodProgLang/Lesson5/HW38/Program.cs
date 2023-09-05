// Задача 38: Задайте массив вещественных чисел. 
// Найдите разницу между максимальным и минимальным элементов 
// массива.
// [3.22, 4.2, 1.15, 77.15, 65.2] => 77.15 - 1.15 = 76

double[] FillArray (double[] array){
    Random rnd = new Random();
    for (int i = 0; i < array.Length; i++){
        array[i] = Math.Round(rnd.Next(-100,101) + rnd.NextDouble(),2);

    }
    return array;
}

double DiffMaxMin (double[] array){
    double max = array[0];
    double min = array[0];
    for (int i = 1; i < array.Length; i++){
        if (array[i] > max) max = array[i];
        else if (array[i] < min) min = array[i];
    }
    return max - min;
}

int array_length = new Random().Next(3, 11);
double[] array = FillArray(new double[array_length]);
Console.WriteLine($"Разница между максимальным и минимальными элементами \nв массиве [{string.Join(" ", array).Replace(",",".").Replace(" ", ",")}]: {DiffMaxMin(array)}");
