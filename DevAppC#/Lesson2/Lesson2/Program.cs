namespace Lesson2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Bits bits = new Bits(4);
            Console.WriteLine(bits.Value);
            bits.SetBitByIndex(1, true);

            Console.WriteLine(bits.Value);
            Console.WriteLine(bits.GetBitByIndex(0));

            Console.WriteLine(bits[0]);
            bits[0] = true;
            Console.WriteLine(bits[0]);

            Console.WriteLine(bits.Value);*/

            /*00
            01
            10
            11
            001*/



            /*var bits1 = new Bits(20);
            byte b1 = bits1;
            Console.WriteLine(b1);

            b1 = 22;
            Bits bits2 = (Bits)b1;
            Console.WriteLine(bits2);*/


            // Предположим, у вас есть некоторый набор устройств,
            // каждое из которых может быть включено или выключено,
            // и вы хотите иметь возможность выполнять операции
            // над этими устройствами через битовые операторы.


            /*Devices devices = new Devices();
            Bits bits = new Bits(63);
            Console.WriteLine(devices);
            devices.TurnOnOff(bits);
            Console.WriteLine(devices);
            bits = (Bits)20;
            devices.TurnOnOff(bits);
            Console.WriteLine(devices);
            bits = (Bits)129;
            devices.TurnOnOff(bits);
            Console.WriteLine(devices);*/

            Bits bits = new Bits((byte)14);
            Console.WriteLine(bits);
            bits = new Bits((long)14);
            Console.WriteLine(bits);
            bits = new Bits((int)14);
            Console.WriteLine(bits);


            //Homework
            long exampleLong = 23;
            Bits bitsLong = (Bits)exampleLong;
            Console.WriteLine(bitsLong);

            int exampleInt = 25;
            Bits bitsInt = (Bits)exampleInt;
            Console.WriteLine(bitsInt);

            byte exampleByte = 28;
            Bits bitsByte = (Bits)exampleByte;
            Console.WriteLine(bitsByte);

            Console.WriteLine(exampleLong.GetType().Name + " " + exampleInt.GetType().Name + " " + exampleByte.GetType().Name);
        }
    }
}