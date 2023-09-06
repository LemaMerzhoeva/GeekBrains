// Задача 39: Напишите программу, которая перевернёт одномерный 
// массив (последний элемент будет на первом месте, а первый - на 
// последнем и т.д.)
// [1 2 3 4 5] -> [5 4 3 2 1]
// [6 7 3 6] -> [6 3 7 6]

int[] FillArray (int[] array){
    for (int i = 0; i < array.Length; i++){
        array[i] = new Random().Next(1, 10);
    }
    return array;
}

// Массив - ссылочный тип данных, поэтому при передаче в функцию массива в кчаестве аргумента
// изменения происходят в исходном массиве.


// не изменяет исходный массив
int[] Reverse (int[] array){
    int array_length = array.Length;
    int[] res = new int[array_length];
    for (int i = 0; i < array_length; i++){
        res[array_length - 1 - i] = array[i];
    }
    return res;
}

//изменяет исходный массив
// int[] Reverse (int[] array){
//     int buf, array_length = array.Length;
//     for (int i = 0; i < array_length / 2; i++){
//         buf = array[i];
//         array[i] = array[array_length - 1 - i];
//         array[array_length - 1 - i] = buf;
//     }
//     return array;
// }

int array_length = new Random().Next(3, 11);
int[] array = FillArray(new int[array_length]);
Console.WriteLine($"Исходный массив: [{string.Join(",", array)}]\nПеревернутый массив: [{string.Join(",", Reverse(array))}]");