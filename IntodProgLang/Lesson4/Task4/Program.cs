int[] RandArray(int length){
    int[] randArray = new int[length];
    for (int i = 0; i < length; i++){
        Random rand = new Random();
        randArray[i] = rand.Next(0, 2);
    }
    Console.WriteLine($"[{String.Join(",", randArray)}]");
    return randArray;
}

int Input(){
    Console.Write("Введите длину массива: ");
    return Convert.ToInt32(Console.ReadLine());
}
RandArray(Input());