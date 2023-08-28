int[] RandArray(int length, int min, int max){
    int[] randArray = new int[length];
    for (int i = 0; i < length; i++){
        Random rand = new Random();
        randArray[i] = rand.Next(min, max + 1);
    }
    Console.WriteLine($"[{String.Join(",", randArray)}]");
    return randArray;
}

int Input(string text){
    Console.Write(text);
    return Convert.ToInt32(Console.ReadLine());
}

RandArray(Input("Введите длину массива: "), Input("Введите минимальное значение элемента: "), Input("Введите максимальное значение элемента: "));