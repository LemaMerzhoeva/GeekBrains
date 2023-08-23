Console.Write("Введите два числа через пробел: ");
string[] input = Console.ReadLine().Split(' ');
int number1 = Convert.ToInt32(input[0]);
int number2 = Convert.ToInt32(input[1]);
int res = number1 % number2;
if (res == 0) Console.WriteLine("Число {0} кратно числу {1}", number1, number2);
else Console.WriteLine("Число {0} не кратно числу {1}. Остаток от деления: {2}", number1, number2, res);