//Проверяет кратность числам 7 и 23 одновременно
Console.Write("Введите число:");
int a = Convert.ToInt32(Console.ReadLine());
if (a % 7 == 0 && a % 23 == 0){
    Console.WriteLine("Да");
}
else Console.WriteLine("Нет");