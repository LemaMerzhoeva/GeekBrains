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

int[,] ChangeFirstLastRows(int[,] array){
    int temp;
    for (int j = 0; j < array.GetLength(1); j++){
        temp = array[0, j];
        array[0, j] = array[array.GetLength(0) - 1, j];
        array[array.GetLength(0) - 1, j] = temp;
    }
    return array;
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
PrintArray(ChangeFirstLastRows(array));