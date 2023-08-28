int Input(string text){
    Console.Write(text);
    return Convert.ToInt32(Console.ReadLine());
}

int Pow(int a, int b){
    int res = 1;
    for (int i = 1; i <= b; i++){
        res *= a;
    }
    Console.WriteLine($"Результат возведения числа {a} в степень {b}: {res}");
    return res;
}

Pow(Input("Введите основание числа: "), Input("Введите степень числа: "));