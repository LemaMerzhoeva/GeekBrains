using System;
using System.Collections;

Console.Write("Введите число: ");
int input = Convert.ToInt32(Console.ReadLine());
ArrayList output = new ArrayList();
for (int i = (-1) * input; i <= input; i++){
    output.Add(i);
}
foreach (int item in output){
    Console.Write($"{item} ");
}