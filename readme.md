# Project Documentation

Author: Matthew Festa


# Problem-Solving Lifecycle:

# 1. Describe the problem:

This program t will take the user input of numeric date and numeric
month and output the correct zodiac sign for that specific date and month. Both of these
numbers have to be integers. The program can only allow valid date / month combinations
so an error message should be returned if the day / month combination is invalid.
In addition, to check for correct user input, a debug flag will be used that when it is
set to true and the program is compiled, the program will print out the month and the day
of the month that the user entered before trying to validate or calculate the Zodiac sign.
If the program is compiled with the debug flag set to false, the program should NOT print out
the month and day of the month that the user entered.

The program output should look like this:

Example 1 – Normal Calculation with debug flag false

Zodiac Sign Calculator
Enter the month (1-12):
1
Enter the day of the month (1-31):
24
The Zodiac Sign is: Aquarius

Example 2 – Normal Calculation with debug flag true

Zodiac Sign Calculator
Enter the month (1-12):
1
Enter the day of the month (1-31):
24
The user entered '1' as the month
The user entered '24' as the day of the month
The Zodiac Sign is: Aquarius

Example 3 – Incorrect Month with debug flag true

Zodiac Sign Calculator
Enter the month (1-12):
15
Enter the day of the month (1-31):
24
The user entered '15' as the month
The user entered '24' as the day of the month
Invalid month

Example 4 – Incorrect Day of Month with debug flag false

Zodiac Sign Calculator
Enter the month (1-12):
1
Enter the day of the month (1-31):
9876
Invalid day of the month

Example 5 – Incorrect Calendar Date with debug flag true

Zodiac Sign Calculator
Enter the month (1-12):
6
Enter the day of the month (1-31):
31
The user entered '6' as the month
The user entered '31' as the day of the month
Invalid calendar date


# 2. Analyze the problem:

a. What are the inputs?
i. The day of the month as an integer.
ii. The month of the year as an integer.

b. What are the outputs that should made by the solution to the problem?
i. If the debug flag is set to true, the output will confirm the date and month
chosen by the user by stating "The user entered ... as the month" or "The user entered ...
as the day of the month".
ii. After the debug flag outputs the result OR if the debug flag is set to false,
the output will read "The Zodiac Sign is: .... "
iii. If the input is an invalid date / month combination, the output will read:
"Invalid month" or "Invalid day of the month".

c. How are the inputs and outputs related?
i. There are 12 zodiac signs and 12 months of the year.    
ii. Approximately half the days in a month belong to the preceding zodiac sign,
and the days of the second half of the month belong to the next zodiac sign.
iii. So using the inputs of the day and month will result in the correct zodiac sign
being outputted.

d. Are there any constraints on the input?
i. Day of the month must be a non-negative integer that ranges from 1-29, 1-30, or 1-31
depending on the month of the year. Only those numbers will be valid.
ii. Month of the year must be a non-negative integer that ranges from 1-12. Only
those numbers will be considered valid.

# 3. Design the algorithm to solve the problem
      a. Prompt user for the month of the year. 
      b. Prompt user for the date of the month. 
      c. If debugFlag == true, output the useer's selection. 
      d. If debugFlag == false OR after debugFlag outputs, compute if 
      selection was valid.
      e. If selection is valid, display correct zodiac sign under
      the following conditions: 
         1. If (month == 3 AND Day == 21-31) OR (month == 4 AND day == 1-19) 
         display "Aries". 
         2. If (month == 4 AND Day == 20-30) OR (month == 5 AND day == 1-20) 
         display "Taurus".
         3. If (month == 5 AND Day == 21-31) OR (month == 6 AND day == 1-20) 
         display "Gemini".
         4. If (month == 6 AND Day == 21-30) OR (month == 7 AND day == 1-22) 
         display "Cancer".
         5. If (month == 7 AND Day == 23-31) OR (month == 8 AND day == 1-22) 
         display "Leo".
         6. If (month == 8 AND Day == 23-31) OR (month == 9 AND day == 1-22) 
         display "Virgo".
         7. If (month == 9 AND Day == 23-30) OR (month == 10 AND day == 1-22) 
         display "Libra".
         8. If (month == 10 AND Day == 23-31) OR (month == 11 AND day == 1-21) 
         display "Scorpio".
         9. If (month == 11 AND Day == 22-30) OR (month == 12 AND day == 1-21) 
         display "Sagittarius".
         10. If (month == 12 AND Day == 22-31) OR (month == 1 AND day == 1-19) 
         display "Capricorn".
         11. If (month == 1 AND Day == 20-31) OR (month == 2 AND day == 1-18) 
         display "Aquarius".
         12. If (month == 2 AND Day == 19-29) OR (month == 3 AND day == 1-20) 
         display "Aries".
      f. If selection is invalid, display error message. 

(Flowchart is in a separate document)

# 4. Test the correctness of algorithm using a trace:

| Input 1    | Input 2    | debugFlag | Expected Output                            | Implementation Result                      |
|------------|------------|-----------|--------------------------------------------|--------------------------------------------|
| Month: 1   | Day: 20    | true      | """1"" ""20"" ""Aquarius""               " | """1"" ""20"" ""Aquarius""               " |
| Month: 2   | Day: 27    | false     | " ""Pisces""                "              | " ""Pisces""                "              |
| Month: 3   | Day: 16    | true      | """3"" ""16"" ""Pisces"""                  | """3"" ""16"" ""Pisces"""                  |
| Month: 5   | Day: 5     | false     | """Taurus"""                               | Taurus                                     |
| Month: 8   | Day: 14    | true      | """8"" ""14"" ""Leo"""                     | """8"" ""14"" ""Leo"""                     |
| Month: -2  | Day: 4     | false     | Invalid Month                              | Invalid Month                              |
| Month: 5th | Day: Fifth | true      | java.util.InputMismatchException           | java.util.InputMismatchException           |
| Month: Aug | Day: 16    | false     | java.util.InputMismatchException           | java.util.InputMismatchException           |
| Month: 1   | Day: 7     | true      | """1"" ""7"" ""Capricorn"""                | """1"" ""7"" ""Capricorn"""                |
| Month: 10  | Day: 24    | false     | """Scorpio"""                              | """Scorpio"""                              |


