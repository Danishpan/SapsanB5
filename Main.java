package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // int number;
    //
    // boolean isPositive;
    //
    //
    // number = 50;
    //
    //
    // if (number > 0) {
    //
    //   System.out.println("Number is positive!");
    //   isPositive = true;
    //
    // } else if (number < 0) {
    //
    //   System.out.println("Number is negative!");
    //   isPositive = false;
    //
    // } else {
    //
    //   isPositive = false;
    //
    // }
    //
    // System.out.println("Number is positive - " + isPositive);


    // Снизу переменная для хранения пола

    // char letter;
    //
    // letter = 'f';
    //
    // if (letter != 'f')  {
    //   System.out.println("You are female!");
    // } else if (letter == 'm') {
    //   System.out.println("You are male!");
    // }
    //
    //
    // int x, y, z;
    //
    // x = 5;
    // y = -5;
    // z = 10;
    //
    // System.out.println(x*x + y - z/2);


    // int number = 7;
    //
    // if ((number%2 == 0) || (number > 10)) {
    //   System.out.println("true!");
    // } else {
    //   System.out.println("false!");
    // }
    //
    // int number1, number2;
    //
    // number1 = 14;
    // number2 = 60;
    //
    // if (number1 > number2) {
    //   if (number1%number2 == 0) {
    //     System.out.println("yes");
    //   } else {
    //     System.out.println("no");
    //   }
    // }

    // double a = 1.0;
    // double b = 5.0;
    // double c = 1.0;
    //
    // double d = b*b - 4 * a * c;
    //
    // double x1 = (-b + Math.sqrt(d)) / (2*a);
    // double x2 = (-b - Math.sqrt(d)) / (2*a);
    //
    // System.out.println("The roots are " + x1 + " and " + x2);

    // int number1 = 25;
    // int number2 = 78;
    // int number3 = 87;
    //
    // if ((number1 > number2) && (number1 > number3)) {
    //   System.out.println("The greatest: " + number1);
    // } else if ((number2 > number1) && (number2 > number3)) {
    //   System.out.println("The greatest: " + number2);
    // } else if ((number3 > number2) && (number3 > number1)) {
    //   System.out.println("The greatest: " + number3);
    // }

    // int dayNumber = 7;
    //
    // if (dayNumber == 1) {
    //   System.out.println("Monday!");
    // } else if (dayNumber == 2) {
    //   System.out.println("Tuesday!");
    // } else if (dayNumber == 3) {
    //   System.out.println("Wednesday!");
    // } else if (dayNumber == 4) {
    //   System.out.println("Thursday!");
    // } else if (dayNumber == 5) {
    //   System.out.println("Friday!");
    // } else if ((dayNumber == 6) || (dayNumber == 7)) {
    //   System.out.println("Yay! Its weekend!!!");
    // }

    // int monthNumber = 11;
    //
    // int year = 2017;
    //
    // if ((monthNumber == 1) || (monthNumber == 3) || (monthNumber == 5) || (monthNumber == 7) || (monthNumber == 8) || (monthNumber == 10) || (monthNumber == 12)) {
    //   System.out.println("This month has 31 days!");
    // } else if (monthNumber == 2) {
    //   if ((year % 4 == 0) && (year % 100 != 0)) {
    //     System.out.println("This month has 29 days!");
    //   } else {
    //     System.out.println("This month has 28 days!");
    //   }
    // } else if ((monthNumber == 4) || (monthNumber == 6) || (monthNumber == 9) || (monthNumber == 11)) {
    //   System.out.println("This month has 30 days!");
    // }

    // int number1 = 12;
    // int number2 = -4;
    //
    // if (number1 < number2) {
    //   System.out.println("<");
    // } else if (number1 > number2) {
    //   System.out.println(">");
    // } else {
    //   System.out.println("=");
    // }
    //
    // Scanner in = new Scanner(System.in);

    // System.out.print("Введите ваш возраст - ");
    //
    // int age = in.nextInt();
    //
    // if (age > 18) {
    //   System.out.println("Вы взрослый!");
    // } else {
    //   System.out.println("Вы пока что ребенок!");
    // }

    // System.out.println(" - Как вас зовут?");
    //
    // String name = in.nextLine();
    //
    // System.out.println("Рада знакомству, " + name + "!");

    // System.out.println("Введите ваш пол. 'f' - женщина, 'm' - мужчина");
    // char gender = in.next().toLowerCase().charAt(0);
    //
    // if (gender == 'f') {
    //   System.out.println("Вам повезло! Вы женщина");
    // } else if (gender == 'm') {
    //   System.out.println("Вам тоже повезло! Вы мужчина!");
    // }


    // Scanner sc = new Scanner(System.in);
    //
    // System.out.print("Введите ваш возраст - ");
    //
    // int age = sc.nextInt();
    //
    // System.out.println("Ваш возраст - " + age);

      //
      // int number = 10;
      //
      // while(number == 10) {
      //   System.out.println("Все чики пуки!");
      // }

    // int number = 5;
    //
    // while(number <= 10) {
    //   System.out.println(number);
    //   number++;
    // }

    // Scanner scanner = new Scanner(System.in);
    // int number = 0;
    //
    // while(number < 10) {
    //   System.out.println("Zhumys Isteimiz!");
    //   number += scanner.nextInt(); // number = number + scanner.nextInt();
    // }


    // for (int i = 2; i <= 100; i+=2) {
    //   System.out.println(i);
    // }

    // int number = 0;
    // for (int i = 0; i < 10; i++) {
    //   number += i;
    //   System.out.println("Sum = " + number + ", i = " + i);
    // }
    // System.out.println(number);

    // Scanner sc = new Scanner(System.in);
    //
    // for (int i = sc.nextInt(); i > 0; i--) { // i--; i -= 1; i = i - 1;
    //   System.out.println(i);
    // }

    // Scanner scanner = new Scanner(System.in);
    // int number = scanner.nextInt();
    //
    // for (int i = 0; i < number; i++) {
    //   System.out.println(i);
    // }
    //
    // Scanner sc = new Scanner(System.in);
    //
    // int number = sc.nextInt();
    // // int i = 1;
    // // int sum = 0;
    // //
    // // while(i <= number) {
    // //   sum = sum + i;
    // //   //System.out.println(i + " " + sum);
    // //   i++;
    // // }
    //
    // for(int )
    //
    // System.out.println(sum);








    // int[] sapsanNumbers = new int[25];
    // System.out.println("Размер нашего массива - " + sapsanNumbers.length);

    // int[] sapsanNumbers = {1,2,3,4};
    // System.out.println("Размер нашего массива - " + sapsanNumbers.length);

    // String[] cities = {"Paris", "Almaty", "Amsterdam"};
    //
    // String[] countries = new String[3];
    // countries[0] = "Kazakhstan";
    // countries[1] = "France";
    // countries[1] = "Italy";
    // countries[1] = "United " + "States " + "of " + "America";
    // countries[2] = "Spain";
    //
    // System.out.println(countries[1]);

    // int[] sapsanNumbers = new int[25];
    // int number = 2;
    //
    // for (int i = 0; i<sapsanNumbers.length; i++) {
    //   sapsanNumbers[i] = number;
    //   number*=2;
    //   System.out.println("В элемент под индексом " + i + " добавлено значение " + sapsanNumbers[i]);
    // }


    // int[] sapsanNumbers = new int[25];
    //
    // for (int i = 0; i < sapsanNumbers.length; i++) {
    //   sapsanNumbers[i] = i;
    // }
    //
    // for (int i = 0; i < sapsanNumbers.length; i++) {
    //   System.out.println("Element with index: " + i + " is " + sapsanNumbers[i]);
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // int sum = 0;
    //
    // for (int i = 0; i < size; i++) {
    //   sum += numbers[i];
    // }
    //
    // System.out.println("Сумма всех значений массива - " + sum);


    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }

    // double sum = 0.0;
    //
    // for (int i = 0; i < size; i++) {
    //   sum += numbers[i];
    // }
    //
    // double avg = sum / size;
    //
    // System.out.println("Среднее арифметическое значение всех элементов массива - " + avg);

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // System.out.println("Введите значение наличие которого хотите проверить в массиве - ");
    // int specificNumber = sc.nextInt();
    //
    // boolean isElementFound = false;
    //
    // for (int i = 0; i < size; i++) {
    //   if (numbers[i] == specificNumber) {
    //     isElementFound = true;
    //     break;
    //   }
    // }
    //
    // if (isElementFound) { 
    //   System.out.println("Ваш элемент найден в массиве!");
    // } else {
    //   System.out.println("Ваш элемент не найден!");
    // }

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // System.out.println("Введите значение наличие которого хотите проверить в массиве - ");
    // int specificNumber = sc.nextInt();
    //
    // boolean isElementFound = false;
    // int indexOfFoundElement = 0;
    //
    // for (int i = 0; i < size; i++) {
    //   if (numbers[i] == specificNumber) {
    //     isElementFound = true;
    //     indexOfFoundElement = i;
    //     break;
    //   }
    // }
    //
    // if (isElementFound) {
    //   System.out.println("Ваш элемент найден в массиве! Его индекс - " + indexOfFoundElement);
    // } else {
    //   System.out.println("Ваш элемент не найден!");
    // }


// // Write a Java program to remove a specific element from an array.
//
//     Scanner sc = new Scanner(System.in);
//
//     System.out.println("Введите размер вашего массива данных - ");
//     int size = sc.nextInt();
//
//     int[] numbers = new int[size];
//
//     for (int i = 0; i < size; i++) {
//       System.out.println("Введите значение для элемента под индексом " + i + " - ");
//       numbers[i] = sc.nextInt();
//     }
//
//     System.out.println("Введите элемент, который хотите удалить из массива - ");
//     int numberToDelete = sc.nextInt();
//
//     int[] newArray = new int[size - 1];
//
//     int j = 0;
//
//     for (int i = 0; i < newArray.length; i++) {
//       if (numbers[i] != numberToDelete) {
//         newArray[i] = numbers[j];
//         j++;
//       } else {
//         newArray[i] = numbers[j+1];
//         j+=2;
//       }
//     }
//
//     for (int i = 0; i < newArray.length; i++) {
//       System.out.println("Элемент нового массива под индексом " + i + " - " + newArray[i]);
//     }


// 8. Write a Java program to copy an array by iterating the array.


    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // int[] numbersCopy = numbers;
    //
    // // for (int i = 0; i < size; i++) {
    // //   numbersCopy[i] = numbers[i];
    // // }
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Элемент нового массива под индексом " + i + " - " + numbersCopy[i]);
    // }

    // 10. Write a Java program to find the maximum and minimum value of an array.

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // int max = numbers[0];
    // int min = numbers[0];
    //
    // for (int i = 0; i < size; i++) {
    //   if (numbers[i] > max) {
    //     max = numbers[i];
    //   } else if (numbers[i] < min) {
    //     min = numbers[i];
    //   }
    // }
    //
    // System.out.println("Наибольшее значение в массиве - " + max + ", наименьшее - " + min);

// 11. Write a Java program to reverse an array of integer values.

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // for (int i = size - 1; i >= 0; i--) {
    //   System.out.println("Элемент массива под индексом " + i + " - " + numbers[i]);
    // }

    // Write a Java program to find the number of even and odd integers in a given array of integers.

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите размер вашего массива данных - ");
    // int size = sc.nextInt();
    //
    // int[] numbers = new int[size];
    //
    // for (int i = 0; i < size; i++) {
    //   System.out.println("Введите значение для элемента под индексом " + i + " - ");
    //   numbers[i] = sc.nextInt();
    // }
    //
    // int evenCounter = 0;
    // int oddCounter = 0;
    // int zeroCounter = 0;
    //
    // for (int i = 0; i < size; i++) {
    //   if ((numbers[i] % 2 == 0) && (numbers[i] != 0)) {
    //     evenCounter++;
    //   } else if (numbers[i] % 2 == 1) {
    //     oddCounter++;
    //   } else if (numbers[i] == 0) {
    //     zeroCounter++;
    //   }
    // }
    //
    // System.out.println("Количество четных чисел - " + evenCounter + ", нечетных - " + oddCounter + ", нулей - " + zeroCounter);
    //


    // Minimum in the table

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество строк - ");
    // int rows = sc.nextInt();
    // System.out.println("Введите количество столбцов - ");
    // int columns = sc.nextInt();
    //
    // int[][] numbers = new int[rows][columns];
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     System.out.println("Введите значение для элемента под индексами " + i + " и " + j + " - ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    //
    // int min = numbers[0][0];
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     if (numbers[i][j] < min) {
    //       min = numbers[i][j];
    //     }
    //   }
    // }
    //
    // System.out.println("Наименьшее значение в двумерном массиве - " + min);

    // Calculate the total sum of numbers that are located on diagonals in a given square table NxN.
    //
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество строк и столбцов - ");
    // int numOfElements = sc.nextInt();
    //
    //
    // int[][] numbers = new int[numOfElements][numOfElements];
    //
    // for (int i = 0; i < numOfElements; i++) {
    //   for (int j = 0; j < numOfElements; j++) {
    //     System.out.println("Введите значение для элемента под индексами " + i + " и " + j + " - ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < numOfElements; i++) {
    //   for (int j = 0; j < numOfElements; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    //
    // int mainSum = 0;
    // int secondarySum = 0;
    //
    // for (int i = 0; i < numOfElements; i++) {
    //   for (int j = 0; j < numOfElements; j++) {
    //     if (i == j) {
    //       mainSum += numbers[i][j];
    //     }
    //     if ((i + j) == numOfElements - 1) {
    //       secondarySum += numbers[i][j];
    //     }
    //   }
    // }
    //
    // System.out.println("Сумма элементов на главной диагонали - " + mainSum + ", а сумма элементов второстепенной диагонали - " + secondarySum);
    //

    // In the given matrix find the position of the zero.

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество строк - ");
    // int rows = sc.nextInt();
    // System.out.println("Введите количество столбцов - ");
    // int columns = sc.nextInt();
    //
    // int[][] numbers = new int[rows][columns];
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     System.out.println("Введите значение для элемента под индексами " + i + " и " + j + " - ");
    //     numbers[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    //
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     if (numbers[i][j] == 0) {
    //       System.out.println("Ноль находится в элементе с индексами [" + i + "][" + j + "]");
    //     }
    //   }
    // }

// Position of "-1".
//
//     Scanner sc = new Scanner(System.in);
//
//     System.out.println("Введите количество строк - ");
//     int rows = sc.nextInt();
//     System.out.println("Введите количество столбцов - ");
//     int columns = sc.nextInt();
//
//     int[][] numbers = new int[rows][columns];
//
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < columns; j++) {
//         System.out.println("Введите значение для элемента под индексами " + i + " и " + j + " - ");
//         numbers[i][j] = sc.nextInt();
//       }
//     }
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < columns; j++) {
//         System.out.print("[" + i + "][" + j + "] - " + numbers[i][j] + " ");
//       }
//       System.out.println();
//     }
//
//     int row = -1;
//     int column = -1;
//
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < columns; j++) {
//         if (numbers[i][j] == -1) {
//           row = i;
//           column = j;
//         }
//       }
//     }
//     System.out.println("Индексы элемента со значением '-1' - [" + row + "][" + column + "]");


// Homework 5

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("Введите количество строк и столбцов - ");
    // int numberOfElements = sc.nextInt();
    //
    //
    // int[][] firstArray = new int[numberOfElements][numberOfElements];
    // int[][] secondArray = new int[numberOfElements][numberOfElements];
    //
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     System.out.println("Введите значение для элемента первого массива под индексами " + i + " и " + j + " - ");
    //     firstArray[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     System.out.println("Введите значение для элемента второго массива под индексами " + i + " и " + j + " - ");
    //     secondArray[i][j] = sc.nextInt();
    //   }
    // }
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + firstArray[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + secondArray[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    //
    // int[][] thirdArray = new int[numberOfElements][numberOfElements];
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     thirdArray[i][j] = firstArray[i][j] + secondArray[i][j];
    //   }
    // }
    //
    // for (int i = 0; i < numberOfElements; i++) {
    //   for (int j = 0; j < numberOfElements; j++) {
    //     System.out.print("[" + i + "][" + j + "] - " + thirdArray[i][j] + " ");
    //   }
    //   System.out.println();
    // }


    // int row = -1;
    // int column = -1;
    //
    // for (int i = 0; i < rows; i++) {
    //   for (int j = 0; j < columns; j++) {
    //     if (numbers[i][j] == -1) {
    //       row = i;
    //       column = j;
    //     }
    //   }
    // }
    // System.out.println("Индексы элемента со значением '-1' - [" + row + "][" + column + "]");







    // 2.12.2022 Functions

    // int firstNumber = 5;
    // int secondNumber = 2;
    //
    // int result = sumOfTwoNumbers(firstNumber, secondNumber);
    //
    //
    // System.out.println("Сумма чисел 5 и 2 = " + result);

    // String firstName = "Боб";
    // String secondName = "Болат";
    //
    // greetUser(firstName);
    //
    // System.out.println();
    //
    // greetUser(secondName);

    // int[] numbers = {12, 3, 41, 123, 123, 1223, 4, 1, 1};
    //
    // System.out.println("Сумма всех элементов массива - " + sumOfArrayElements(numbers));

    //
    // int[] numbers = {12, 3, 41, 123, 123, 1223, 4, 1, 1};
    //
    // System.out.println("Сумма всех удвоенных элементов массива - " + sumOfDoubledArrayElements(numbers));


    // 1. Write a Java method to find the smallest number among three numbers.

    // System.out.println("Наименьшее число среди 2, 2 и 3 - " + findSmallestNumberAmongThree(2, 2, 3));


    //

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Please enter number of tasks you want to add: ");
//     int numberOfTasks = sc.nextInt();

//     String[] tasks = fillTasksArray(numberOfTasks);

//     boolean isRunnable = true;

//     while(isRunnable) {
//       System.out.println("Here is your task list: ");

//       printTaskList(tasks);

//       System.out.println("Choose the index of task you want to mark as (completed)/(not completed) or enter '999' to end the program: ");
//       int index = sc.nextInt() - 1;

//       if (index == 998) {
//         System.out.println("Thanks for being with us! Bye-bye!");
//         isRunnable = false;
//       } else {
//         changeTaskList(index, tasks);
//       }

//       isRunnable = !checkIfAllTasksAreCompleted(tasks);
//     }
    
    
    System.out.println("Hello from GitHub!");
    

  }

//   private static boolean checkIfAllTasksAreCompleted(String[] tasks) {
//     for (int i = 0; i < tasks.length; i++) {
//       if (!tasks[i].contains("Done")) {
//         return false;
//       }
//     }

//     printTaskList(tasks);
//     System.out.println("You are excellent! You completed all your tasks! Bye-Bye!");
//     return true;
//   }

//   private static void changeTaskList(int index, String[] tasks) {
//     if (tasks[index] == null) {
//       System.out.println("Sorry, there is no task with such index!");
//     } else {
//       if (tasks[index].contains("Done")) {
//         tasks[index] = tasks[index].substring(10);
//       } else {
//         tasks[index] = "(Done!) | " + tasks[index];
//       }
//     }
//   }

//   private static void printTaskList(String[] tasks) {
//     for (int i = 0; i < tasks.length; i++) {
//       System.out.println((i + 1) + ". " + tasks[i]);
//     }
//   }

//   private static String[] fillTasksArray(int numberOfTasks) {
//     String[] tasksList = new String[numberOfTasks];

//     Scanner sc = new Scanner(System.in);

//     for (int i = 0; i < numberOfTasks; i++) {
//       System.out.println("You still have " + (numberOfTasks - i) + " tasks to add!");
//       System.out.println("Please enter the task you want to complete: ");
//       tasksList[i] = sc.nextLine();
//     }

//     return tasksList;
//   }

  // static int sumOfDoubledArrayElements(int[] numbers) {
  //   int sum = 0;
  //   for (int i = 0; i < numbers.length; i++) {
  //     sum += doubleNumber(numbers[i]);
  //   }
  //   return sum;
  // }
  //
  // static int doubleNumber(int number) {
  //   return number * 2;
  // }

  // Upper case - ADSHASFGKNA

  // Lower case - hfgsldjflsdfj

  // Camel case - sumOfDoubleArrayElements

  // static int sumOfArrayElements(int[] numbers) {
  //   int sum = 0;
  //   for (int i = 0; i < numbers.length; i++) {
  //     sum += numbers[i];
  //   }
  //   return sum;
  // }


  // static int sumOfTwoNumbers(int number1, int number2) {
  //   int sum = 0;
  //   sum = number1 + number2;
  //
  //   return sum;
  // }


  //
  // static void greetUser(String name) {
  //   System.out.println("Привет, " + name);
  //   System.out.println("Как Ваши дела, " + name + "?");
  //   System.out.println("Погодка сегодня отличная!");
  // }
  //
  // static int findSmallestNumberAmongThree(int firstNumber, int secondNumber, int thirdNumber) {
  //
  //   if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
  //     return firstNumber;
  //   }
  //
  //   if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
  //     return secondNumber;
  //   }
  //
  //   if ((thirdNumber < secondNumber) && (thirdNumber < firstNumber)) {
  //     return thirdNumber;
  //   }
  //
  //   return 0;
  // }


}
