Console.Write("Введите номер четверти: ");
switch (Convert.ToInt32(Console.ReadLine())){
    case 1:
        Console.WriteLine("Диапазон по X: (0; +infinity)");
        Console.WriteLine("Диапазон по Y: (0; +infinity)");
        break;
    case 2:
        Console.WriteLine("Диапазон по X: (-infinity; 0)");
        Console.WriteLine("Диапазон по Y: (0; +infinity)");
        break;
    case 3:
        Console.WriteLine("Диапазон по X: (-infinity; 0)");
        Console.WriteLine("Диапазон по Y: (-infinity; 0)");
        break;
    case 4:
        Console.WriteLine("Диапазон по X: (0; +infinity)");
        Console.WriteLine("Диапазон по Y: (-infinity; 0)");
        break;
    default:
        Console.WriteLine("Некорректный номер четверти");
        break;
}