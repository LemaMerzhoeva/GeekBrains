int rand = new Random().Next(100,998);
int res = rand/100*10+rand%10;
Console.WriteLine("Исходное число: {0}      Число с удаленным вторым символом: {1}", rand, res);

