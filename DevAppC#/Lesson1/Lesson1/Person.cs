using System;
using System.Collections.Generic;
using System.Diagnostics.Metrics;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Lesson1
{
    public class Person
    {
        public DateTime BirthDay { get; init; }
        public string Name { get; init; }
        public GenderType Gender { get; init; }
        public Person Mother { get; set; } = null;
        public Person Father { get; set; } = null;
        public Person[] Children { get; set; }

        public Person[] GetGrandmothers()
        {
            string[] grandmothers = new string[] { Mother?.Mother?.Name, Father?.Mother?.Name };
            Console.WriteLine(string.Join(" ", grandmothers));
            return new Person[] { Mother?.Mother, Father?.Mother };
        }

        public Person[] GetGrandfathers()
        {
            string[] grandfathers = new string[] { Mother?.Father?.Name, Father?.Father?.Name };
            Console.WriteLine(string.Join(" ", grandfathers));
            return new Person[] { Mother?.Father, Father?.Father };
        }

        public void Print()
        {
            Console.WriteLine($"Имя: {Name}\tПол: {Gender}\tДата рождения: {BirthDay}");
        }
    }

    public enum GenderType { male, female };
}
