Console.Write("Введите число: ");
string input = Console.ReadLine();
int n;
if (int.TryParse(input, out n)){
    if (input.Length > 2 ){
        Console.WriteLine("Третья цифра в числе {0}: {1}", input, input[2]);
    }
    else
        Console.WriteLine("В числе меньше трех цифр.");
}
else Console.WriteLine("Введенные данные не являются числом.");
