using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson1
{
    internal class FamilyTree
    {
        public Person[] FamilyPersons { get; set; }
        

        public void PrintFamilyPersons()
        {
            Console.WriteLine("____________FamilyPersons____________");
            foreach (Person person in FamilyPersons)
            {
                person.Print();
            }
            Console.WriteLine("____________________________________");
        }

        public void PrintClosePersons()
        {
            Console.WriteLine("____________ClosePersons____________");
            HashSet<Person> currentFamily = new HashSet<Person>();
            foreach (Person person1 in FamilyPersons)
            {
                if (!currentFamily.Contains(person1))
                {
                    foreach (Person person2 in FamilyPersons)
                    {
                        if (!currentFamily.Contains(person2))
                        {
                            if (!currentFamily.Contains(person2) && !person1.Equals(person2))
                            {
                                bool flag = false;
                                if (person1?.Children?.Length == person2?.Children?.Length && person1?.Children?.Length != null)
                                {
                                    flag = true;
                                    foreach (Person child in person1.Children)
                                    {
                                        if (!person2.Children.Contains(child))
                                        {
                                            flag = false;
                                            break;
                                        }
                                    }
                                }

                                if (flag)
                                {
                                    Console.WriteLine($"{person1.Name} и {person2.Name} являются мужем и женой.");
                                    currentFamily.Add(person1);
                                    currentFamily.Add(person2);
                                }
                            }
                        }
                    }
                }
            }
            Console.WriteLine("____________________________________");
        }
    }
}
