int Input(string text){
    Console.Write(text);
    return Convert.ToInt32(Console.ReadLine());
}

int SumDigit(int number){
    int res = 0;
    string str = Math.Abs(number).ToString();
    for (int i = 0; i < str.Length; i++){
        res += (int)char.GetNumericValue(str[i]);
    }
    Console.WriteLine($"Сумма цифр в числе {number}: {res}");
    return res;
}

SumDigit(Input("Введите число: "));