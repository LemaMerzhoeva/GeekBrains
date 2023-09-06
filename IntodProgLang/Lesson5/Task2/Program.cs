// Задача 32: Напишите программу замена элементов 
// массива: положительные элементы замените на 
// соответствующие отрицательные, и наоборот.
// [-4, -8, 8, 2] -> [4, 8, -8, -2] 

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-9, 10);
    }
    return array;
}

int[] ChangeSign (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] *= -1;
    }
    return array;
}

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
Console.WriteLine($"Исходный массив: [{string.Join(",", array)}]\nМассив с элементами противоположных знаков: [{string.Join(",", ChangeSign(array))}]");