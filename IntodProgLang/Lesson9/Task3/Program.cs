int Pow(int basis, int degree, int res = 1){
    if (degree > 0){
        res *= basis;
        return Pow(basis, --degree, res);
    }
    else{
        return res;
    }
}

Console.Write("Введите основание степени: ");
int basis = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите степень: ");
int degree = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"{basis} в {degree} степени: {Pow(basis, degree)}");