Console.Write("Введите два числа через пробел: ");
string[] input = Console.ReadLine().Split(' ');
int number1 = Convert.ToInt32(input[0]);
int number2 = Convert.ToInt32(input[1]);
if (number1 == Math.Pow(number2,2)){
    Console.WriteLine("Первое число является квадратом второго.");
}
else {
    Console.WriteLine("Первое число не является квадратом второго.");
}