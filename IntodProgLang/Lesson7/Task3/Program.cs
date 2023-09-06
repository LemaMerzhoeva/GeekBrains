// Задача 49: Задайте двумерный массив. Найдите элементы, у 
// которых оба индекса чётные, и замените эти элементы на их 
// квадраты.

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

int[,] ChangeEvenPos (int[,] array){
    for (int i = 1; i < array.GetLength(0); i += 2){
        for (int j = 1; j < array.GetLength(1); j += 2){
            array[i, j] *= array[i, j];
        }
    }
    return array;
}

int[,] array = FillArray(ConstructArray());
PrintArray(array);
Console.WriteLine();
PrintArray(ChangeEvenPos(array));
