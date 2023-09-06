// Задача 46: Задайте двумерный массив размером m×n, 
// заполненный случайными целыми числами.
// m = 3, n = 4.
// 1 4 8 19
// 5 -2 33 -2
// 77 3 8 1

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

PrintArray(FillArray(ConstructArray()));
