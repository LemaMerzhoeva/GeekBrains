int Input(){
    Console.Write("Введите число: ");
    return Convert.ToInt32(Console.ReadLine());
}

int Multiplication(int number){
    if (number < 1){
        Console.WriteLine("Введите число больше 0");
        return 0;
    }
    int num = 1;
    for (int i = 1; i <= number; i++){
        num *= i;
    }
    Console.WriteLine($"Произведение всех чисел от 1 до {number}: {num}");
    return num;
}

Multiplication(Input());