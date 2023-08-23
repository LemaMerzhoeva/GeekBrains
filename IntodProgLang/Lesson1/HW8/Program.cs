Console.Write("Введите число: ");
int input = Convert.ToInt32(Console.ReadLine());
for (int i = 2; i <= input; i += 2){
    Console.Write($"{i} ");
}
