// Задача 44: Не используя рекурсию, выведите первые N чисел 
// Фибоначчи. Первые два числа Фибоначчи: 0 и 1.
// Если N = 5 -> 0 1 1 2 3
// Если N = 3 -> 0 1 1
// Если N = 7 -> 0 1 1 2 3 5 8

int ReadNumber(){
    Console.Write("Введите число: ");
    return Convert.ToInt32(Console.ReadLine());
}

int[] Fib (int N){
    int[] array = new int[N];
    array[0] = 0;
    array[1] = 1;
    int k = 2;
    while (k < N){
        array[k] = array[k - 1] + array[k - 2];
        k++;
    }
    return array;
}

int N = ReadNumber();
Console.WriteLine($"Первые {N} чисел Фибоначчи: {string.Join(",", Fib(N))}");
