﻿/*
 * Created by SharpDevelop.
 * User: redfox
 * Date: 9/13/2022
 * Time: 8:37 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace asd
{
	class Program
	{
		 static void Main(string[] args)
		{
		 	string[] Email  = {"reg.realeza@gmail.com"};
			string[] Username  = {"rreginarose"};
			string[] Password  = {"Yeyel"};
			 
			Console.WriteLine("Index : ");
			int index = Convert.ToInt32(Console.ReadLine());
			
			Console.WriteLine("Email    : " + Email[index]);
			Console.WriteLine("Username : " + Username[index]);
			Console.WriteLine("Password : " + Password[index]);
			Console.ReadKey();
		}
	}
}