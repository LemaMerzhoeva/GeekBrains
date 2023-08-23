Console.Write("Введите числа для сравнения: ");
int[] input = Console.ReadLine().Split(' ').Select(item => Int32.Parse(item)).ToArray();
int max = input[0];
foreach(int item in input){
    if (item > max){
        max = item;
    }
}
Console.WriteLine("max = " + max);

