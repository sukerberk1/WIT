﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;
using System.Drawing.Imaging;

namespace Mandelbroat
{
    partial class MandelbroatForm
    {
        public static uint MandelbrotCalc(double Pi, double Pr)
        {
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
