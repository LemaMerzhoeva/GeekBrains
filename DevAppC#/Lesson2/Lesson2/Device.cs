using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2
{
    internal class Device : IControllable
    {
        public Device() { }
        public bool IsOn { get; set; } = false;

        public void Off()
        {
            IsOn = false;
            Console.WriteLine("Устройство выключено");
        }

        public void On()
        {
            IsOn = true;
            Console.WriteLine("Устройство включено");
        }
    }

    internal class Devices
    {
        public List<IControllable> DevicesList { get; init; } = new List<IControllable>();
        public Devices()
        {
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
            DevicesList.Add(new Device());
        }
        

        public void TurnOnOff(Bits bits)
        {
            for (int i = 0; i < 8; i++) 
            { 
                if (DevicesList[i].IsOn && !bits[i])
                {
                    DevicesList[i].Off();
                }
                else if (!DevicesList[i].IsOn && bits[i])
                {
                    DevicesList[i].On();
                }
            }
        }

        public override string ToString()
        {
            return string.Join("", DevicesList.Select(d => d.IsOn ? "1" : "0"));
        }
    }
}
