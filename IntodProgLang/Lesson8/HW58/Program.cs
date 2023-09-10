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

int[,] MultiplyArrays(int[,] firstArray, int[,] secondArray){
    if (firstArray.GetLength(1) != secondArray.GetLength(0)){
        Console.WriteLine("Невозможно перемножить матрицы таких размерностей.");
        int[,] res = new int[1,1];
        return res;
    }
    else{
        int[,] result = new int[firstArray.GetLength(0), secondArray.GetLength(1)];
        for (int i = 0; i < result.GetLength(0); i++){
            for (int j = 0; j < result.GetLength(1); j++){
                result[i, j] = 0;
                for (int k = 0; k < firstArray.GetLength(1); k++){
                    result[i, j] += firstArray[i, k] * secondArray[k, j];
                }
            }
        }
        return result;
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

Console.WriteLine("Собираем информацию о первой матрице...");
int[,] firstArray = FillArray(CreateArraySize());
Console.WriteLine("Собираем информацию о второй матрице...");
int[,] secondArray = FillArray(CreateArraySize());
PrintArray(firstArray);
Console.WriteLine();
PrintArray(secondArray);
Console.WriteLine();
PrintArray(MultiplyArrays(firstArray, secondArray));