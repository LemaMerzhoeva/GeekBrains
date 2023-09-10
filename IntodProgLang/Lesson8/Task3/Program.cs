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

int[] SortRow(int[] row){
    int temp;
    for (int i = 0; i < row.Length; i++){
        for (int j = i + 1; j < row.Length; j++){
            if (row[j] > row[i]){
                temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
    }
    return row;
}

int[,] SortRowsArray(int[,] array){
    int[,] result = new int[array.GetLength(0), array.GetLength(1)];
    int[] row = new int[array.GetLength(1)];
    for (int i = 0; i < result.GetLength(0); i++){
        for (int j = 0; j < result.GetLength(1); j++){
            row[j] = array[i, j];
        }
        row = SortRow(row);
        for (int j = 0; j < row.Length; j++){
            result[i, j] = row[j];
        }
    }
    return result;
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
PrintArray(SortRowsArray(array));