// Задача 51: Задайте двумерный массив. Найдите сумму 
// элементов, находящихся на главной диагонали (с индексами 
// (0,0); (1;1) и т.д.

int[,] ConstructArray(){
    Console.Write("Введите размерность массива через запятую: ");
    string[] array_size_str = Console.ReadLine().Split(",");
    int[,] array = new int[Convert.ToInt32(array_size_str[0]), Convert.ToInt32(array_size_str[1])];
    return array;
}

int[,] FillArray(int[,] array){
    Random rnd = new Random();
    for (int i = 0; i< array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            array[i, j] = rnd.Next(-10, 10);
        }
    }
    return array;
}

void PrintArray(int[,] array){
    for (int i = 0; i< array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            Console.Write(array[i, j] + "   ");
        }
        Console.WriteLine();
    }
}

int Trace (int[,] array){
    int res = 0;
    for (int i = 0; i < array.GetLength(0) && i < array.GetLength(1); i++){
        res += array[i, i];
    }
    return res;
}

int[,] array = FillArray(ConstructArray());
PrintArray(array);
Console.WriteLine($"След исходной матрицы: {Trace(array)}");