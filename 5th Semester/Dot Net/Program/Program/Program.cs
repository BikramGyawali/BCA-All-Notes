//namespace Program
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            Console.WriteLine("Hello, World!");
//        }
//    }
//}
//using System;

//namespace Program
//{
//    class program1
//    {
//        public static void Main(String[] args)
//        {
//            int cp, sp, p, l;
//            Console.WriteLine("Enter Cost Price");
//            cp = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter  Selling Price");
//            sp = Convert.ToInt32(Console.ReadLine());

//            if (sp > cp)
//            {
//                p = sp - cp;
//                Console.WriteLine("Gain amount " + p);
//            }
//            else
//            {
//                l = cp - sp;
//                Console.WriteLine("Loss amount " + l);
//            }
//            Console.ReadKey();
//        }
//    }
//}


//WAP for finding greatest numhber among 4 numbers

//using System;
//namespace Program
//{
//    class biggest
//    {
//        public static void Main(string[] args)
//        {
//            int a, b, c, d, temp;
//            Console.WriteLine("Enter the first Number");
//            a = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the second Number");
//            b = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the third Number");
//            c = Convert.ToInt32(Console.ReadLine());

//            Console.WriteLine("Enter the fourth Number");
//            d = Convert.ToInt32(Console.ReadLine());

//            if (a > b && a > c && a > d)
//            {
//                Console.WriteLine(a + " is greatest Number");
//            }
//            else if (b > a && b > c && b > d)
//            {
//                Console.WriteLine(b + " is greatest Number");
//            }
//            else if (c > a && c > b && c > d)
//            {
//                Console.WriteLine(c + " is greatest Number");
//            }
//            else
//            {
//                Console.WriteLine(d + " is greatest Number");
//            }
//        }
//    }
//}



//WAP for finding the sum of array

//using System;
//namespace program
//{
//    class sumOfArray
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, sum1 = 0, sum2 = 0;
//            int[] number = new int[100];
//            Console.WriteLine("Enter the size of the array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the value of " + (i + 1) +" element");
//                number[i] = Convert.ToInt32(Console.ReadLine());

//            }

//            //for sum long method 
//            for (i = 0; i < n; i++)
//                 sum1 += number[i];
//            Console.WriteLine("The sum of the array is " + sum1);

//            // short and inbulid method

//            sum2 = number.Sum();
//            Console.WriteLine("The sum of the arrray is " + sum2);
//        }
//    }
//}


//WAP to find the largest,smallest and the average of the array

//using System;
//namespace program
//{
//    class findAll
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, average, smallest, biggest, sum = 0;
//            int[] number = new int[100];
//            Console.WriteLine("Enter the size of the array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the " + (i + 1) + " element");
//                    number[i] = Convert.ToInt32(Console.ReadLine());
//            }
//            biggest = number[0]; smallest = number[0];

//            for (i = 0; i < n; i++)
//            {
//                if (number[i] > biggest)
//                    biggest = number[i];
//                if (number[i] < smallest)
//                    smallest = number[i];
//                sum += number[i];
//            }
//            average = sum / n;

//            //print 
//            Console.WriteLine("The biggest number of the array is " + biggest);
//            Console.WriteLine("The smalllest number of the array is " + smallest);
//            Console.WriteLine("The sum number of the array is " + sum);
//            Console.WriteLine("The average number of the array is " + average);

//            // print the bigesst,smallest,sum using the inbulit method
//            Console.WriteLine("The biggest number of the array is " + (number.Max()));
//            Console.WriteLine("The smallest number of the array is " + (number.Min()));
//            Console.WriteLine("The sum number of the array is " + (number.Sum()));
//        }
//    }
//}


//WAP to sort an array using both inbuilt method and  logic method

//using System;
//namespace program
//{
//    class sortArrray
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, j, temp;
//            int[] numbers = new int[100];
//            Console.WriteLine("Enter the size of array");
//            n = Convert.ToInt32(Console.ReadLine());

//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine("Enter the " + (i + 1) + "th element");
//                numbers[i] = Convert.ToInt32(Console.ReadLine());

//            }

//            for (i = 0; i < n; i++)
//            {
//                for (j = i+1; j < n; j++)
//                {
//                    if (numbers[j] < numbers[i])
//                    {
//                        temp = numbers[i];
//                        numbers[i] = numbers[j];
//                        numbers[j] = temp;
//                    }
//                }
//            }

//            //for print
//            Console.WriteLine("Array after sorting");
//            for (i = 0; i < n; i++)
//            {
//                Console.WriteLine(numbers[i]);
//            }

//            // using bulit in with foreach the builtin method is only used when the array is already give not a user input array
//            //Array.Sort(numbers);
//            //foreach(int a in numbers){
//            //    Console.WriteLine(a);
//            //}
//        }
//    }
//}


// program for item search in an array
//using System;
//namespace program
//{
//    class itemSearch
//    {
//        public static void Main(String[] args)
//        {
//            int i, n, item;
//            bool flag=false;
//            int[] numbers = { 1, 2, 3, 4, 5 };
//            n = numbers.Length;
//            Console.WriteLine("Enter the search element");
//            item = Convert.ToInt32(Console.ReadLine());
//            for (i = 0; i < n; i++)
//            {
//                if (item == numbers[i])
//                {
//                    Console.WriteLine("Elements found in " + i + "th index");
//                    flag = true;
//                    return;
//                }
//  }
//            if (!flag)
//            {
//                Console.WriteLine("No element found in the array");
//            }
//}
//}
//}


//2d array rectangle  
/*
using System;

namespace Program
{
    class _2darray
    {
        public static void Main(String[] args)
        {
            int i, j;
            int[,] numbers = new int[2, 2];
            Console.WriteLine("Enter the elements in 2 d array ");
            for (i = 0; i < numbers.GetLength(0); i++)
            {
                for (j = 0; j < numbers.GetLength(1); j++)
                {
                    numbers[i, j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            //for read 
            Console.WriteLine("The elements of the array");
            foreach(int a in numbers)
            {
                Console.WriteLine(a);
            }
        Console.ReadKey();
        }
    }

}

*/





// class and object

//using System;

//namespace personalDetails
//{
//    class program
//    {
//        public static void Main(String[] args)
//        {
//            person p = new person();
//            p.id = 0001;
//                p.name="Birkam Gyawali";
//            p.age = 19;
//            p.address = "Kathmandu";
//                p.displayData();
//        }
//    }


//// create a class for the person

//    class person
//    {
//      public  int id, age;
//        public string name, address;

//          public  void displayData()
//        {
//            Console.WriteLine("Hello " + name + " Your id is " + id + " and you are " + age + " year old. " + " You are from  " + address);
//        }
//    }

//}


// class and object for the area ,volume and parameter of rectangle with multiple class 
// now rewrite with single class 


/* using System;
namespace AVPofRectangle
{
    class program
    {
        public static void Main(String[] args)
        {
            int l, b, h;
            Console.WriteLine("Enter the length of the rectangle");
            l = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the breadth of the rectangle");
            b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the height of the rectangle");
            h = Convert.ToInt32(Console.ReadLine());

            area A = new area();
            A.Calculate(l, b);

            volume v = new volume();
            v.CaulculateVolume(l, b, h);
            Console.ReadKey();
        }
    }

    // class for area 
    class area
    {

        public void Calculate(int l, int b)
        {
            int area = l * b;
            Console.WriteLine("The area of the rectangle is " + area);
        }

    }


    class volume
    {

        public void CaulculateVolume(int l, int b, int h)
        {
            int volume = l * b * h;
            Console.WriteLine("The volume of rectangle is " + volume);
        }
    }
}
*/

//using single class 

/*using System;
namespace AVPSingleClass
{

    class program
    {
        public static void Main(String[] args)
        {
            Caculation c = new Caculation();
            Console.WriteLine("Enter the length of the rectangle");
            double l = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter the breadth of the rectangle");
            double b = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter the height of the rectangle");
            double h = Convert.ToDouble(Console.ReadLine());
            c.setData(l, b, h);
            Console.WriteLine("The area of the rectangle is " + c.area());
            Console.WriteLine("The volume of the rectangle is " + c.volume());

            Console.ReadKey();
        }
    }

    class Caculation
    {
        double l, b, h;
        public void setData(double l, double b, double h)
        {
            this.l = l;
            this.b = b;
            this.h = h;
        }

        public double area()
        {
            return l * b;
        }

        public double volume()
        {
            return l * b * h;
        }
    }

}
*/

/*ACCESS MODIFIER
Note : 
    1. class is by default internal and never by private
    2. members inside class is by default private 
    3. method is also by default private 
*/

/*

// claculation of simple interes 

using System;
namespace SimpleInterest
{
    class Calculatin
    {
        public double SICalculation(double p, double t, double r)
        {
            return (p * t * r) / 100;

        }
    }
    class program
    {
        public static void Main(string[] args)
        {
            Calculatin c = new Calculatin();
            Console.WriteLine("The simple interest is " + c.SICalculation(20000, 3, 4));
        Console.ReadKey();
        }
    }
}
*/

/*
example of call by vlaue : this is the default way of call method 
definition : When you pass a variable to a method,
C# makes a copy of that value. The method works on the copy. The original variable is completely safe and never touched.

using System;
class program
{
    static void Show(int x)
    {
        x = x + 10;
        Console.WriteLine("Inside the value " + x);
    }
    public static void Main(String[] args)
    {
        int a = 20;
        Show(a);
        Console.WriteLine("Outside method value" + a);
    }
}

Call by reference : Instead of sending a copy, you send the actual memory address of the variable. Whatever the method does to it directly changes your
original variable.
*/
using System;


/*simple inheritance

using System;
using System.Xml.Serialization;
namespace simpleInheritance
{
   internal class program
    {
        class A
        {
            public void display()
            {
                Console.WriteLine("hello user");
            }
        }

        class B : A
        {
            public void test()
            {
                Console.WriteLine("this is test");
            }
        }

       class Inheritance
        {
            public static void Main(String[] args)
            {
                B b = new  B();
                b.display();
                b.test();
                Console.ReadKey();
            }
        }

    }
}

*/


/* write a program to base class name employe has salary 35000 and who is manager get bonus 20000 per month. uisng inheritance

using System;
namespace example
{
    internal class program
    {
        class employer
        {
         public  int salary = 30000;
            public void Salary()
            {
                Console.WriteLine("Salay is  {0}", salary);
            }
        }
        class manager : employer
        {
           public int bonous = 20000;
           public int total ;

            public manager()
            {
                total = salary + bonous;
            }
            public void managerSalary()
            {
                Console.WriteLine("Manager salary is {0}",total);
            }

        }

        class calulation
        {
            public static void Main(String[] args)
            {
                manager m = new manager();
                m.Salary();
                m.managerSalary();
                Console.ReadKey();
            }
        }
      
    }
}
*/