Console.Write("Введите два числа через пробел: ");
string[] input = Console.ReadLine().Split(' ');
int number1 = Convert.ToInt32(input[0]);
int number2 = Convert.ToInt32(input[1]);
if (number1 == Math.Pow(number2,2) || number2 == Math.Pow(number1,2)){
    Console.WriteLine("Одно из чисел является квадратом другого числа.");
}
else {
    Console.WriteLine("Ни одно из чисел не является квадратом другого числа.");
}