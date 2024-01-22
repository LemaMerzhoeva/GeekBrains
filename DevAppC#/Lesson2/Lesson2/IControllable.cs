using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2
{
    internal interface IControllable
    {
        bool IsOn { get; set; }
        void On();
        void Off();
    }
}
