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

void MinSumRowArray(int[,] array){
    int row = 0, max = 0, sum = 0;
    for (int i = 0; i < array.GetLength(0); i++){
        sum = 0;
        for (int j = 0; j < array.GetLength(1); j++){
            sum += array[i, j];
        }
        if (i == 0) max = sum;
        else {
            if (sum < max){
                max = sum;
                row = i;
            }
        }
    }
    Console.WriteLine($"Строка {row + 1} состоит из элементов с наименьшей суммой.");
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
MinSumRowArray(array);