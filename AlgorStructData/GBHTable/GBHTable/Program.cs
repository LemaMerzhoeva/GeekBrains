using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace GBHTable
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            do
            {
                //ArrayList arrayList = new ArrayList();
                //Dictionary<string, string> hashMap = new Dictionary<string, string>();
                //hashMap.Add("+79001113344", "���������");
                //hashMap.Add("+79001113343", "������");

                //Person person = new Person();
                //person.name = "AAAA";
                //person.phone = "+79001113344";
                //Console.WriteLine(person.GetHashCode());

                //Person person2 = new Person();
                //person2.name = "BBBB";
                //person2.phone = "+79001113344";
                //Console.WriteLine(person2.GetHashCode());
                Console.WriteLine("aaa");
                HashMap<string, string> hashMap = new HashMap<string, string>(4);
                hashMap.put("+79005554433", "������");
                hashMap.put("+79005554432", "�������");
                hashMap.put("+79005554432", "�����1");
                hashMap.put("+79005554433", "�����2");
                hashMap.put("+79005554434", "�����3");
                hashMap.put("+79005554435", "�����4");
                hashMap.put("+79005554436", "�����5");
                hashMap.put("+79005554437", "�����6");
                hashMap.put("+79005554438", "�����7");
                hashMap.put("+79005554439", "�����8");

                var res = hashMap.get("+79005554435");
                hashMap.remove("+79005554439");

                foreach(HashMap<string,string>.Entity<String,String> element in hashMap){
                    Console.WriteLine(element.key + " - " + element.value);
                }


            }
            while (Console.ReadKey().Key != ConsoleKey.Escape);

        }
    }
}

class Person
{
    public String name;
    public String phone;
}