// Задача 48: Задайте двумерный массив размера m на n, 
// каждый элемент в массиве находится по формуле: Aₘₙ = m+n. 
// Выведите полученный массив на экран.
// m = 3, n = 4.
// 0 1 2 3
// 1 2 3 4
// 2 3 4 5


int[,] ConstructArray(){
    Console.Write("Введите размерность массива через запятую: ");
    string[] array_size_str = Console.ReadLine().Split(",");
    int[,] array = new int[Convert.ToInt32(array_size_str[0]), Convert.ToInt32(array_size_str[1])];
    return array;
}

int[,] FillArray(int[,] array){
    for (int i = 0; i< array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            array[i, j] = i + j;
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
