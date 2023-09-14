void printSection (int start, int end){
    if (start < end){
        Console.Write(start + ", ");
        printSection(++start, end);
    }
    else if (start == end){
        Console.Write(start);
        return;
    }
}

Console.Write("Введите начало отрезка: ");
int start = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите конец отрезка: ");
int end = Convert.ToInt32(Console.ReadLine());
printSection(start, end);