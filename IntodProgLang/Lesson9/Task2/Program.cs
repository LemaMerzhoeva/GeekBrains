void PrintSumDigit(int number, int res = 0){
    if (number > 9){
        res += number % 10;
        PrintSumDigit(number/10, res);
    }
    else{
        res += number;
        Console.WriteLine("Сумма цифр в числе: " + res);
    }
}

Console.Write("Введите число: ");
PrintSumDigit(Convert.ToInt32(Console.ReadLine()));