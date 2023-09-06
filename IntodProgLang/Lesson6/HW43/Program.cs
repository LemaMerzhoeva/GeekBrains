// Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, 
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

double[] ParseStringToInt(string str){
    string[] arr_str = str.Split(",");
    double[] arr_int = new double[2];
    for (int i = 0; i < 2; i++){
        arr_int[i] = Convert.ToDouble(arr_str[i]);
    }
    return arr_int;
}


double[] FillCoefficientsFromConsole(){
    double[] coefficients = new double[4];
    Console.Write("Введите коэффициенты k, b для первой прямой через запятую: ");
    double[] arr_str = ParseStringToInt(Console.ReadLine());
    coefficients[0] = arr_str[0];
    coefficients[1] = arr_str[1];
    Console.Write("Введите коэффициенты k, b для второй прямой через запятую: ");
    arr_str = ParseStringToInt(Console.ReadLine());
    coefficients[2] = arr_str[0];
    coefficients[3] = arr_str[1];
    return coefficients;
}

double[] FillCoefficients(){
    Random rnd = new Random();
    double[] coefficients = new double[4];
    for (int i = 0; i < 4; i++){
        coefficients[i] = Math.Round(rnd.Next(-10,11) + rnd.NextDouble(),2);;
    }
    return coefficients;
}


void FindCrossPoint(double[] coefficients){
    Console.WriteLine($"Прямые со следующими коэффициентами:\n k1 = {coefficients[0]}, b1 = {coefficients[1]}\n k2 = {coefficients[2]}, b2 = {coefficients[3]}");
    if (coefficients[0] == coefficients[2]){
        if (coefficients[1] == coefficients[3]) Console.WriteLine("Параллельны");
        else Console.WriteLine("Совпадают");
    }
    else {
        double x = (coefficients[3] - coefficients[1])/(coefficients[0] - coefficients[2]);
        double y = coefficients[0] * x + coefficients[1];
        Console.WriteLine($"Пересекаются в точке ({x}, {y})");
    }
}

FindCrossPoint(FillCoefficients());