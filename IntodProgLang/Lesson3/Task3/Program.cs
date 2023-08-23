Console.Write("Введите число N: ");
int N = Convert.ToInt32(Console.ReadLine());
int[] array = new int[N];
for (int i = 1; i <= N; i++){
    array[i - 1] = i * i;
}
Console.WriteLine("Таблица квадратов числе от 1 до {0}: [{1}]", N,  string.Join(", ", array));