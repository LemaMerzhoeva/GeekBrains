int[,] CreateArraySize(){
    Console.Write("Введите количество строк: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Введите количество столбцов: ");
    int columns = Convert.ToInt32(Console.ReadLine());
    int[,] array = new int[rows, columns];
    return array;
}

int[,] FillArray(int[,] array){
    Random rnd = new Random();
    for (int i = 0; i < array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            array[i, j] = rnd.Next(-10, 10);
        }
    }
    return array;
}

int[,] TransposeArray(int[,] array){
    int[,] result = new int[array.GetLength(0), array.GetLength(1)];
    if (array.GetLength(0) == array.GetLength(1)){    
        for (int i = 0; i < result.GetLength(0); i++){
            for (int j = 0; j < result.GetLength(1); j++){
                result[i, j] = array[j, i];
            }
        }
        return result;
    }
    else {
        Console.WriteLine("Матрица не является квадратной.");
        return array;
    }
}

void PrintArray(int[,] array){
    for (int i = 0; i < array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            Console.Write(array[i, j] + "\t");
        }
        Console.WriteLine();
    }
}

int[,] array = FillArray(CreateArraySize());
PrintArray(array);
Console.WriteLine();
PrintArray(TransposeArray(array));