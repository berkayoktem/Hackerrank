using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    static string timeConversion(string s) {
        DateTime time = DateTime.Parse(s);
        string dateString = time.ToString("HH:mm:ss");
        return dateString;
    }

    static void Main(string[] args) {
        TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        string result = timeConversion(s);

        tw.WriteLine(result);

        tw.Flush();
        tw.Close();
    }
}
