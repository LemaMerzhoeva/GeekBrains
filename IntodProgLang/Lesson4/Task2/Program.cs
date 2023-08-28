int Input(){
    Console.Write("Введите число: ");
    return Convert.ToInt32(Console.ReadLine());
}

int LengthNumber(int number){
    if (number < 0) number *= -1;
    string num = number.ToString();
    int len = num.Length;
    Console.WriteLine($"Количество цифр в числе: {len}");
    return len;
}

LengthNumber(Input());