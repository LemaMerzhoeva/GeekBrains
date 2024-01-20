
//пространоство имен
//область видимости, где виден наш класс
namespace Lesson1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            if (args.Length == 3) {
                int res;
                if (int.TryParse(args[0], out var value1) && int.TryParse(args[2], out var value2)) {
                    switch (args[1]) {
                        case "+":
                            res = value1 + value2;
                            break;
                        case "-":
                            res = value1 - value2;
                            break;
                        case "*":
                            res = value1 * value2;
                            break;
                        case "/":
                            if (value2 != 0)
                                res = value1 / value2;
                            else
                            {
                                Console.WriteLine("Некорректный ввод данных");
                                return;
                            }
                            break;
                        default:
                            Console.WriteLine("Некорректный ввод данных");
                            return;
                    }
                    Console.WriteLine("Результат выполнения действия: {0}", res);
                    return;
                }
            }
            Console.WriteLine("Некорректный ввод данных");
        }
    }
}