// Задача 40: Напишите программу, которая принимает на вход три числа и 
// проверяет, может ли существовать треугольник с сторонами такой длины.
// Теорема о неравенстве треугольника: каждая сторона треугольника 
// меньше суммы двух других сторон.

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(1, 10);
    }
    return array;
}

bool TriangleExist(int[] array){
    if (array[0] + array[1] > array[2] && 
    array[1] + array[2] > array[0] && 
    array[2] + array[0] > array[1]) return true;
    else return false;
}

int[] array = FillArray(new int[3]);
Console.Write($"Треугольник со следующими сторонами {string.Join(",", array)} ");
if (TriangleExist(array)) Console.WriteLine("существует.");
else Console.WriteLine("не существует.");
