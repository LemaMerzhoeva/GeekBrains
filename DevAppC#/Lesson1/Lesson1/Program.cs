// Спроектируйте программу для построения генеалогического дерева.
// Учтите что у нас есть члены семьи у кого нет детей(дет).
// Есть члены семьи у кого дети есть (взрослые). Есть мужчины и женщины.

namespace Lesson1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Person uncle = new Person()
            {
                BirthDay = new DateTime(1976, 04, 3),
                Name = "Дулат",
                Gender = GenderType.male
            };

            Person aunt = new Person()
            {
                BirthDay = new DateTime(1972, 05, 28),
                Name = "Айнаш",
                Gender = GenderType.female
            };

            Person mom = new Person()
            {
                BirthDay = new DateTime(1980, 01, 30),
                Name = "Назира",
                Gender = GenderType.female
            };

            Person dad = new Person()
            {
                BirthDay = new DateTime(1950, 06, 27),
                Name = "Руслан",
                Gender = GenderType.male
            };

            Person grandma = new Person()
            {
                BirthDay = new DateTime(1950, 07, 08),
                Name = "Рауза",
                Gender = GenderType.female,
                Children = new Person[] { aunt, mom, uncle }
            };

            Person grandpa = new Person()
            {
                BirthDay = new DateTime(1945, 12, 09),
                Name = "Борис",
                Gender = GenderType.male,
                Children = new Person[] { aunt, mom, uncle }
            };


            /*Person grandma2 = new Person()
            {
                BirthDay = new DateTime(1930, 07, 08),
                Name = "понятия не имею",
                Gender = GenderType.female,
                Children = new Person[] { dad }
            };

            Person grandpa2 = new Person()
            {
                BirthDay = new DateTime(1925, 12, 09),
                Name = "не знаю",
                Gender = GenderType.male,
                Children = new Person[] { dad }
            };*/


            mom.Mother = grandma;
            mom.Father = grandpa;
            aunt.Mother = grandma;
            aunt.Father = grandpa;
            uncle.Mother = grandma;
            uncle.Father = grandpa;
            /*dad.Mother = grandma2;
            dad.Father = grandpa2;*/

            Person me = new Person()
            {
                BirthDay = new DateTime(2001, 10, 09),
                Name = "Лема",
                Gender = GenderType.female,
                Mother = mom,
                Father = dad
            };

            Person sister = new Person()
            {
                BirthDay = new DateTime(2007, 05, 12),
                Name = "Мадина",
                Gender = GenderType.female,
                Mother = mom,
                Father = dad
            };

            mom.Children = new Person[] { me, sister };
            dad.Children = new Person[] { me, sister };

            me.GetGrandmothers();
            me.GetGrandfathers();

            FamilyTree familyTree = new FamilyTree() { FamilyPersons = new Person[] { me, sister, mom, dad, grandma, grandpa, uncle, aunt} };
            familyTree.PrintFamilyPersons();
            familyTree.PrintClosePersons();

        }
    }
}