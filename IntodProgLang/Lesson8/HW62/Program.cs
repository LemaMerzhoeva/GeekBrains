int[,] CreateArraySize(){
    Console.Write("Введите количество строк: ");
    int rows = Convert.ToInt32(Console.ReadLine());
    Console.Write("Введите количество столбцов: ");
    int columns = Convert.ToInt32(Console.ReadLine());
    int[,] array = new int[rows, columns];
    return array;
}



int[,] FillSpiralArray(int[,] array){
    int k = 0;
    string vector = "right";
    int i_min = 0;
    int i_max = array.GetLength(0) - 1;
    int j_min = 0;
    int j_max = array.GetLength(1) - 1;
    int i = 0, j = 0;
    while (i_min <= i_max && j_min <= j_max){
        switch (vector){
            case "right":
                j = j_min;
                while (j <= j_max){
                    array[i_min, j] = k++;
                    j++;
                }
                i_min++;
                vector = "down";
                break;
            case "down":
                i = i_min;
                while (i <= i_max){
                    array[i, j_max] = k++;
                    i++;
                }
                j_max--;
                vector = "left";
                break;
            case "left":
                j = j_max;
                while (j >= j_min){
                    array[i_max, j] = k++;
                    j--;
                }
                i_max--;
                vector = "up";
                break;
            case "up":
                i = i_max;
                while (i >= i_min){
                    array[i, j_min] = k++;
                    i--;
                }
                j_min++;
                vector = "right";
                break;
        }
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

int[,] array = FillSpiralArray(CreateArraySize());
PrintArray(array);