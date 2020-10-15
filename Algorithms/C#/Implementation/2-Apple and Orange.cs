using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int homeS, int homeF, int appTree, int orTree, int[] apples, int[] oranges) {
        int resultApp=0;
        int resultOr=0;
        foreach(int apple in apples){
            if(appTree+apple>=homeS && appTree+apple<=homeF)
                resultApp++;
        }
        foreach(int orange in oranges){
            if(orTree+orange>=homeS && orTree+orange<=homeF)
                resultOr++;
        }
        Console.WriteLine(resultApp);
        Console.WriteLine(resultOr);
    }

    static void Main(string[] args) {
        string[] st = Console.ReadLine().Split(' ');
        int s = Convert.ToInt32(st[0]);
        int t = Convert.ToInt32(st[1]);
        string[] ab = Console.ReadLine().Split(' ');
        int a = Convert.ToInt32(ab[0]);
        int b = Convert.ToInt32(ab[1]);
        string[] mn = Console.ReadLine().Split(' ');
        int m = Convert.ToInt32(mn[0]);
        int n = Convert.ToInt32(mn[1]);

        int[] apples = Array.ConvertAll(Console.ReadLine().Split(' '), applesTemp => Convert.ToInt32(applesTemp))
        ;

        int[] oranges = Array.ConvertAll(Console.ReadLine().Split(' '), orangesTemp => Convert.ToInt32(orangesTemp))
        ;
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
