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

    // Complete the staircase function below.
    static void staircase(int n) {
        /*for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                Console.Write(" ");
            }
            for(int k=1; k<=i; k++){
                Console.Write("#");
            }
            Console.WriteLine();
        }*/
        for(int i=1; i<=n; i++){
            StringBuilder str = new StringBuilder(String.Empty);
            str.Append(' ', n-i);
            str.Append('#', i);
            Console.WriteLine(str);
        }
    }

    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());

        staircase(n);
    }
}
