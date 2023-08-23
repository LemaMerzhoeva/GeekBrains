int rand = new Random().Next(10,100);
int first = rand / 10;
int second = rand % 10;
int max;
if (first > second) max = first;
else max = second;
Console.WriteLine("Исходное число: {0}      Максимальная цифра: {1}", rand, max);
