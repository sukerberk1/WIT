﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MandelbrotTest
{
    public partial class MandelbrotHelper
    {
        public static uint Calc(double Pi, double Pr)
        {
            //       Zr     Zi
            //  Zr   Zr*Zr  Zr*Zi
            //  Zi   Zi*Zr  Zi*Zi
            uint max = (uint)Theme.Length - 1, i = 0;
            for (double Zr = 0, Zi = 0; i < max; ++i)
            {
                double Tmp = Zr * Zr - Zi * Zi + Pr;
                Zi = 2 * Zr * Zi + Pi;
                Zr = Tmp;
                if (Zr * Zr + Zi * Zi >= 4) return i;
            }
            return max;
        }
    }
}
