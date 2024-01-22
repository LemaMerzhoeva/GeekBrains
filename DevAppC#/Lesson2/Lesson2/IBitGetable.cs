using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2
{

    //Спроектируйте интерфейс для класса
    //способного устанавливать и получать
    //значения отдельных бит в заданном числе.
    internal interface IBitGetable
    {
        bool GetBitByIndex(int index);
        void SetBitByIndex(int index, bool value);
    }
}
