int Akkerman(int m, int n){
    if (m == 0){
        return n + 1;
    }
    else if (m > 0 && n == 0){
        return Akkerman(m - 1, 1);
    }
    else{
        return Akkerman(m - 1, Akkerman(m, n - 1));
    }
}

Console.WriteLine("Введите первое неотрицательное число m: ");
int m = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите второе неотрицательное число n: ");
int n = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Результат вычисления функции Аккермана A({m}, {n}): {Akkerman(m, n)}");