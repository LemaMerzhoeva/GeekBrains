int Sum(int input){
    int res = (1 + input)*input/2;
    Console.WriteLine($"Сумма всех чисел от 1 до {input}: {res}");
    return res;
}

int Input(){
    Console.Write("Введите число: ");
    return Convert.ToInt32(Console.ReadLine());
}

Sum(Input());

// int input = 1;
// while (input > 0){
//     Console.Write("Введите число: ");
//     input = Convert.ToInt32(Console.ReadLine());
//     Console.WriteLine($"Сумма всех чисел от 1 до {input}: {sum(input)}");
// }
