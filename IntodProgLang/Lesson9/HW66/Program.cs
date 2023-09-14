int SumSectionNM(int N, int M, int res = 0){
    if (N < M){
        res += N + SumSectionNM(++N, M, res);
    }
    else{
        res += N;
    }
    return res;
}

Console.Write("Введите начало промежутка: ");
int start = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите конец промежутка: ");
int end = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Сумма чисел в промежутке от {start} до {end}: {SumSectionNM(start, end)}");