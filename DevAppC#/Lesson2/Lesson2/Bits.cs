using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2
{
    internal class Bits : IBitGetable
    {
        public byte Value {  get; private set; }
        public Bits(byte value)
        {
            Value = value;
        }


        public Bits(long value)
        {
            Value = (Bits)value;
        }

        public bool GetBitByIndex(int index)
        {
            if (index > 7 || index < 0)
                return false;
            return ((Value >> index) & 1) == 1;
        }

        public void SetBitByIndex(int index, bool value)
        {
            if (value)
            {
                Value |= (byte)(1 << index);
            }
            else
            {
                Value &= (byte)~(1 << index);
            }
        }

        public bool this[int index]
        {
            get => GetBitByIndex(index);
            set => SetBitByIndex(index, value);
        }

        // явное преобразование из byte в Bits
        public static implicit operator byte(Bits bits) => bits.Value;
        public static implicit operator int(Bits bits) => bits.Value;
        public static implicit operator long(Bits bits) => bits.Value;

        // неявное преобразование из Bits в byte
        public static explicit operator Bits(byte bits) => new Bits(bits);
        public static explicit operator Bits(long bits) => new Bits((byte)bits);
        public static explicit operator Bits(int bits) => new Bits((byte)bits);

    }
}
