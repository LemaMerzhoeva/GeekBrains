Console.Write("Введите номер дня недели: ");
int input = Convert.ToInt32(Console.ReadLine());
if (input < 8 && input > 0){
    if (input == 6 || input == 7) Console.WriteLine("Выходной день");
    else Console.WriteLine("Будний день");
}
else Console.WriteLine("Введено некорректное число");
