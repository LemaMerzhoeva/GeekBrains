using System;
using System.Collections;

Console.Write("Введите трехзначное число: ");
string input = Console.ReadLine();
int n;
if (input.Length == 3 && int.TryParse(input, out n)){
    Console.WriteLine("Последняя цифра в числе: " + input[2]);
}
else
{
    Console.WriteLine("Число не трехзначное или введено не число.");
}