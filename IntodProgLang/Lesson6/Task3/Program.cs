// Задача 42: Напишите программу, которая будет преобразовывать 
// десятичное число в двоичное.
// 45 -> 101101
// 3 -> 11
// 2 -> 10

int ReadNumber(){
    Console.Write("Введите число: ");
    return Convert.ToInt32(Console.ReadLine());
}

string Reverse(string s )
{
    char[] charArray = s.ToCharArray();
    Array.Reverse(charArray);
    return new string(charArray);
}

int BinaryNumber(int number){
    string buf = "";
    int res = number;
    while (res != 0){
        buf += res % 2;
        res /= 2;
    }
    return int.Parse(Reverse(buf));
}

int x = ReadNumber();
Console.WriteLine($"Десятичное число: {x}. Двоичное число: {BinaryNumber(x)}");


//Test();

void Test(){
    int k = 0;
    int x;
    Random rnd = new Random();
    while (k < 10){
        x = rnd.Next(1,1001);
        Console.WriteLine($"Десятичное число: {x}. Двоичное число из функции: {BinaryNumber(x)}. Двоичное число встроенное: {Convert.ToString(x, 2)}. ");
        k++;
    }
}
