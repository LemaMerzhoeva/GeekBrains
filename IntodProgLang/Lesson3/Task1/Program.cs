Console.WriteLine("Введите координаты точки через пробел (X Y): ");
string[] input = Console.ReadLine().Split(" ");
int x = Convert.ToInt32(input[0]);
int y = Convert.ToInt32(input[1]);
if (x > 0 && y > 0) {
    Console.WriteLine("Точка лежит в первой четверти");
}
else if (x > 0 && y < 0) {
    Console.WriteLine("Точка лежит в четвертой четверти");
}
else if (x < 0 && y < 0) {
    Console.WriteLine("Точка лежит в третьей четверти");
}
else if (x < 0 && y > 0) {
    Console.WriteLine("Точка лежит в четвертой четверти");
}
else {
    Console.WriteLine("Некорректное условие: начало координат или граница четвертей");
}
