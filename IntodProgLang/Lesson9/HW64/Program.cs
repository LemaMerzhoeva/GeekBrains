void PrintSection(int N){
    if (N > 1){
        Console.Write(N + ", ");
        PrintSection(--N);
    }
    else{
        Console.Write(N);
        return;
    }
}

Console.Write("Введите натуральное число: ");
int N = Convert.ToInt32(Console.ReadLine());
PrintSection(N);