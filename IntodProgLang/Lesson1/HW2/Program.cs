Console.Write("Введите два числа: ");
string[] input = Console.ReadLine().Split(' ');
int number1 = Convert.ToInt32(input[0]);
int number2 = Convert.ToInt32(input[1]);
if (number1 > number2){
    Console.WriteLine("max = " + number1);
}
else if (number2 > number1){
    Console.WriteLine("max = " + number2);
}
else {
    Console.WriteLine("Числа равны.");
}