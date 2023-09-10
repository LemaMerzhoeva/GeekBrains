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

int[] FindMinPosArray(int[,] array){
    int min = array[0, 0];
    int[] pos = new int[2];
    for(int i = 0; i < array.GetLength(0); i++){
        for (int j = 0; j < array.GetLength(1); j++){
            if (array[i, j] < min){
                min = array[i, j];
                pos[0] = i;
                pos[1] = j;
            }
        }
    }
    return pos;
}

int[,] DeleteRowColArray(int[,] array){
    int[] position = FindMinPosArray(array);
    int[,] result = new int[array.GetLength(0) - 1, array.GetLength(1) - 1];
    bool row = true, col = true;
    for (int i = 0; i < result.GetLength(0); i++){
        if (i == position[0]) row = false;
        if (row){
            for (int j = 0; j < result.GetLength(1); j++){
                if (j == position[1]) col = false;
                if (col) result[i, j] = array[i, j];
                else result[i, j] = array[i, j + 1];
            }
        }
        else {
            for (int j = 0; j < result.GetLength(1); j++){
                if (j == position[1]) col = false;
                if (col) result[i, j] = array[i + 1, j];
                else result[i, j] = array[i + 1, j + 1];
            }
        }
        col = true;
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
PrintArray(DeleteRowColArray(array));