// Задача 33: Задайте массив. Напишите программу, которая 
// определяет, присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, 3] -> нет
// -3; массив [6, 7, 19, 345, 3] -> да

Random rnd = new Random();

int[] FillArray (int[] array, Random rnd){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(-20, 20);
    }
    return array;
}

bool FindElem (int[] array, int number){
    foreach (int element in array){
        if (element == number) return true;
    }
    return false;
}

int array_length = rnd.Next(3, 11);
int[] array = FillArray(new int[array_length], rnd);
int numb = rnd.Next(-20, 20);
Console.Write($"Заданный массив: [{string.Join(",", array)}]\nЧисло {numb} в массиве ");
if (FindElem(array, numb)) Console.WriteLine("обнаружено");
else Console.WriteLine("не обнаружено");