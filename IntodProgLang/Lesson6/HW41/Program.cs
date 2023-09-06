// Задача 41: Пользователь вводит с клавиатуры M чисел. 
// Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// -1, -7, 567, 89, 223-> 3

string ReadNumbers(){
    Console.Write("Введите числа запятую: ");
    return Console.ReadLine();
}

int CountNumbers(string str){
    if (str != ""){
        int count = 0;
        string[] numbers_array_str = str.Split(",");
        for (int i = 0; i < numbers_array_str.Length; i++){
            if (Convert.ToInt32(numbers_array_str[i]) > 0) count++;
        }
        return count;
    }
    else return 0;
}

string str_numbers = ReadNumbers();
Console.WriteLine($"Количество чисел в введенной строке: {CountNumbers(str_numbers)}");