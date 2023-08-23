Console.Write("Введите трехзначное число: ");
string input = Console.ReadLine();
if (input.Length == 3){
    int a = Convert.ToInt32(input);
    Console.WriteLine("Вторая цифра в числе {0}: {1}", a, a / 10 % 10);
}
else
    Console.WriteLine("Число не трехзначное.");