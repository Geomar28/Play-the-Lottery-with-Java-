// @Student Number: 2014222
// @Student Name: GEOMAR RENE MUNOZ QUINTERO
// @Subject: Computer Programming

// Main Assignment

//Module Title: Assignment Type: Project Title:
//Project Date: Assignment Compiler: Weighting:
//Due Date:
//Method of Submission:
//Computer Programming I Individual
//Assignment 1 26/11/2014
//Ricardo Iwashima – ricardo@cct.ie 20 Marks ( out of 100 Marks ) 17/12/2014 – 11:55PM
//Moodle

//IMPORTING THE SCANNER CLASS
import java.util.Scanner;


//This the start of the Main Assignment
class Assignment_1{

 	//This is the start of the Main Method public static void main
 	public static void main (String [] args){

	//I have to create the Scanner for "questions_Part1" and the Char for "USER_questions_Part1"
	Scanner questions_Part1 = new Scanner (System.in);
	char USER_questions_Part1 = ' ';

//QUESTIONS PART 1: QUESTION 1 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//Declaring the variable "int Question_Loop_Part1" for QUESTIONS PART 1: QUESTION 1
	int Question_Loop_Part1;


	//This is the START of the FIRST "For Loop" for the QUESTIONS PART 1: QUESTION 1
	for (Question_Loop_Part1 = 0; Question_Loop_Part1 < 1 ; Question_Loop_Part1++){

		//This is the START of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 1
		try
		{
			//The program have to print to the screen the question "ARE YOU TIRED OF BEING POOR?" and the User have to answer "YES= Y or FOR NO= N"
			System.out.print ("ARE YOU TIRED OF BEING POOR?\n\nFOR YES= Y / FOR NO= N: ");

			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_questions_Part1 = questions_Part1.nextLine().toLowerCase().charAt(0);
					
		}//This is the END of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 1

		
		//This is the START of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 1
		catch (NumberFormatException GeomarError_Letter)
		{
						
		}//This is the END of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 1

			
			//This is the START of FIRST "if Statement", I am using this to check if the User input was different than "YES= Y or FOR NO= N" for the QUESTIONS PART 1: QUESTION 1.
			if (USER_questions_Part1 != 'y' && USER_questions_Part1 != 'n')
			{

				//The program have to print to the screen "WE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?"
				System.out.println("\nWE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This is the END of the FIRST "if statement" for the QUESTIONS PART 1: QUESTION 1
			

			//This is the START of SECOND "if Statement", I am using this to check if the User input was "NO= N" for the QUESTIONS PART 1: QUESTION 1.
			if (USER_questions_Part1 == 'n')
			{
				//The program have to print to the screen "COME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				System.out.println("\nCOME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This is the END of the SECOND "if statement" for the QUESTIONS PART 1: QUESTION 1
				
	}//This is the END of the FIRST "For Loop" for the QUESTIONS PART 1: QUESTION 1

			
//QUESTIONS PART 1: QUESTION 2 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//Declaring the variable "int Question_Loop_Part2" for QUESTIONS PART 1: QUESTION 2
	int Question_Loop_Part2;


	//This is the START of the SECOND "For Loop" for the QUESTIONS PART 1: QUESTION 2
	for (Question_Loop_Part2 = 0; Question_Loop_Part2 < 1 ; Question_Loop_Part2++){

		//This is the START of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 2
		try
		{
			//The program have to print to the screen the question "ARE YOU TIRED OF HAVING HOLIDAYS IN YOUR OWN BACK YARD?" and the User have to answer "YES= Y or FOR NO= N"
			System.out.print("\n\nARE YOU TIRED OF HAVING HOLIDAYS IN YOUR OWN BACK YARD?\n\nFOR YES= Y / FOR NO= N: ");

			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_questions_Part1 = questions_Part1.nextLine().toLowerCase().charAt(0);
					
		}//This is the END of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 2

		
		//This is the START of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 2
		catch (NumberFormatException GeomarError_Letter)
		{
						
		}//This is the END of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 2

			
			//This is the START of FIRST "if Statement", I am using this to check if the User input was different than "YES= Y or FOR NO= N" for the QUESTIONS PART 1: QUESTION 2
			if (USER_questions_Part1 != 'y' && USER_questions_Part1 != 'n')
			{

				//The program have to print to the screen "WE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?"
				System.out.println("\nWE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This is the END of the FIRST "if statement" for the QUESTIONS PART 1: QUESTION 2
			

			//This is the START  of SECOND "if Statement", I am using this to check if the User input was "NO= N" for the QUESTIONS PART 1: QUESTION 2
			if (USER_questions_Part1 == 'n')
			{
				//The program have to print to the screen "COME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				System.out.println("\nCOME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This the End of the SECOND "if statement" for the QUESTIONS PART 1: QUESTION 2
				
	}//This is the END of the FIRST "For Loop" for the QUESTIONS PART 1: QUESTION 2
	


//QUESTIONS PART 1: QUESTION 3 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//This is the START  of the "Do While Loop" for the QUESTIONS PART 1: QUESTION 3
	do{
		
		//This is the START  of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 3			
		try
		{
			//The program have to print to the screen the question "ARE YOU TIRED OF WORKING AS A SLAVE AND WHEN YOU GET PAID ALL THAT MONEY GOES TO YOUR LANDLORD?" and the User have to answer "YES= Y or FOR NO= N"
			System.out.print ("\n\nARE YOU TIRED OF WORKING AS A SLAVE AND WHEN YOU GET PAID ALL THAT MONEY GOES TO YOUR LANDLORD?\n\nFOR YES= Y / FOR NO= N: ");

			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_questions_Part1 = questions_Part1.nextLine().toLowerCase().charAt(0);
					
		}//This the End of the "TRY Declaration" for the QUESTIONS PART 1: QUESTION 3

		//This is the START  of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 3
		catch (NumberFormatException GeomarError_Letter)
		{
		
		}//This is the End of the "CATCH Declaration" for the QUESTIONS PART 1: QUESTION 2

		
			//This is the START of FIRST "if Statement", I am using this to check if the User input was different than "YES= Y or FOR NO= N" for the QUESTIONS PART 1: QUESTION 3
			if (USER_questions_Part1 != 'y' && USER_questions_Part1 != 'n')
			{
				//The program have to print to the screen "WE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?"
				System.out.println("\nWE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This the End of the FIRST "if statement" for the QUESTIONS PART 1: QUESTION 3

			//This is the START of SECOND "if Statement", I am using this to check if the User input was "NO= N" for the QUESTIONS PART 1: QUESTION 3
			if (USER_questions_Part1 == 'n')
			{
				//The program have to print to the screen "COME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				System.out.println("\nCOME ON!!! DON'T SAY NO! DON'T LIE TO ME...\nEVERYONE WANTS TO BE A MILLONARIE...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This the End of the SECOND "if statement" for the QUESTIONS PART 1: QUESTION 3


	//This the End of the "Do While Loop" for the QUESTIONS PART 1: QUESTION 3
	}while (USER_questions_Part1 == 'n' || USER_questions_Part1 != 'y' && USER_questions_Part1 != 'n');


//QUESTIONS PART 1: QUESTION 4 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen "...SO?... WHAT ARE YOU WAITING FOR?\nNOW IS THE MOMENT TO BE RICH AND BUY A BIG GOLDEN HOUSE IN THE BAHAMAS..."
	System.out.print ("...SO?... WHAT ARE YOU WAITING FOR?\nNOW IS THE MOMENT TO BE RICH AND BUY A BIG GOLDEN HOUSE IN THE BAHAMAS...\n\n");

	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen "...TO PLAY THIS LOTTERY IS VERY EASY...\nAND THE PROBABILITY TO WIN IS REALLY HUGE... LIKE THE UNIVERSE!!!"
	System.out.print ("...TO PLAY THIS LOTTERY IS VERY EASY...\nAND THE PROBABILITY TO WIN IS REALLY HUGE... LIKE THE UNIVERSE!!!\n\n");

	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen "...THE FIRST THING THAT YOU HAVE TO DO, IS TELL ME..."
	System.out.print ("...THE FIRST THING THAT YOU HAVE TO DO, IS TELL ME...");


// PROGRAM STARTS /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//I have to create the Scanner for "USER_lines_attempts", here the user put the numbers of lines wants to play.
Scanner USER_lines_attempts= new Scanner (System.in);

//Declaring the variable "USER_attempts" and "Try_On"
int USER_attempts = 6;
int Try_On = 0;

		
//I have to create the Scanner for "USER_input_number"
Scanner USER_input_number = new Scanner (System.in);

//I have to create the Array to arrange the numbers of the user input
int [][] USER_number = new int [USER_attempts][5];


//I have to create the Scanner for "Last_Question" and the Char for "USER_Last_Question"
Scanner Last_Question = new Scanner (System.in);
char USER_Last_Question = ' ';

Scanner Confirmation_Question = new Scanner (System.in);
char USER_Confirmation_Numbers_Question = ' ';


//This is the START of the "Do While Loop" for the INITIATION OF THE PROGRAM
do{

do{//This is the START of the "Do While Loop" FOR THE USER_Confirmation_Numbers_Question
	
	//This is the START of the "Do While Loop" for the PLAYED LINES
	do{ 

		//This is the START of the "TRY Declaration" for the PLAYED LINES
		try
		{
			//The program have to print to the screen "HOW MANY LINES DO YOU WANT TO PLAY: "
			System.out.print ("\n\nHOW MANY LINES DO YOU WANT TO PLAY: ");

			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_attempts = Integer.parseInt(USER_lines_attempts.nextLine());

			//Variable to check if the user put the correct input
			Try_On = 1;
				
		}//This is the END of the "TRY Declaration" for the PLAYED LINES

			//This is the START of the "CATCH Declaration" for the PLAYED LINES
		catch (NumberFormatException GeomarErrorLetter)
		{

			//The program have to print to the screen "WE BOTH KNOW, THAT IS NOT A NUMBER... AM I RIGHT?...\nCAN YOU PLEASE, PUT A NUMBER?,\nTHANK YOU..."
			System.out.print("WE BOTH KNOW, THAT IS NOT A NUMBER... AM I RIGHT?...\nCAN YOU PLEASE, PUT A NUMBER?,\nTHANK YOU...\n");

				
		}//This is the END of the "CATCH Declaration" for the PLAYED LINES
			
//This is the END of the "Do While Loop" for the for the PLAYED LINES
}while (Try_On == 0 );



// PROGRAM STARTS /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//Declaring the variables to find out which numbers are correct to run the program 
	int Testing_3_Correct_Number = 1;
	//int testing_3 = 1;

	//Declaring the variables to find out which numbers are recurrent in the list
	int Testing_1_Repeated_Number = 0;
	//int testing_1 = 0;
	int testing_2 = 1;


	
	//Declaring the variable for the "While Loop", this is for the counter of the lines using for the user to play
	int Lines_Counter = 0;

	//This is the START of the "While Loop" for the INITIATION OF THE USER INPUT for the numbers of lines wants to play.
	while (Lines_Counter < USER_attempts){

	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen the number of the line played for the user
	System.out.println("|| LINE " +(Lines_Counter + 1)+ " ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	

	//The program have to print to the screen an empty line "GREAT!!!\n\nNOW YOU CAN PLAY YOUR LINE...\n\nGOOD LUCK...:"
	System.out.print("\nGREAT!!!\n\nNOW YOU CAN PLAY YOUR LINE...\n\nGOOD LUCK...:\n\n");
	

	//The program have to print to the screen "PUT A NUMBER BETWEEN 1 AND 45: " asking to the user to put the LOTTERY NUMBERS
	System.out.print("PUT A NUMBER BETWEEN 1 AND 45: ");

		//Declaring the variable for the "While Loop", this is for the 5 numbers the user is going to play.
		int Numbers_Of_Options =0;

		//This is the START of the "While Loop" for the INITIATION OF THE USER INPUT LOTTERY NUMBERS (5 numbers have to be).
		while (Numbers_Of_Options <5){

// START BOOLEAN METHOD PART /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			//This is the START of the "TRY Declaration" for the numbers played and check which are correct and which are not
			try
			{
				//The program have to print to the screen THE NUMBERS OF THE LINE PLAYED AND THE NUMBER OF THE POSITION O THE NUMBERS PLAYED FOR TUE USER ( EXAMPLE: [FOR THE Line ( 1 ) Number ( 1 ) ]: 2
				System.out.print("\n[FOR THE Line ( " + (Lines_Counter + 1)  + " ) Number ( " + (Numbers_Of_Options + 1) + " ) ]: ");

				//The program have to receive the user input (data) and convert in an Integer, to “flow” into the program.
				int Input_Number_User  = Integer.parseInt(USER_input_number.nextLine());

				//This variable has to find out which numbers are Repeated inside the List
				Testing_1_Repeated_Number = 0;

				//This variable has to find out which numbers are correct to run the program (between 1 and 45)
				Testing_3_Correct_Number = 0;

				//This is the START of the "if Statement", I am using this to check which numbers are between 1 and 45
				if ((Input_Number_User < 1) || (Input_Number_User  >=46))
				{
					//The program have to print to the screen "THIS NUMBER HAVE CANNOT BE LESS THAN 1 OR MORE THAN 45...\nCAN YOU PUT, PLEASE, A NUMBER BETWEEN 1 AND 45,\nTHANK YOU\"
					System.out.println("THIS NUMBER HAVE CANNOT BE LESS THAN 1 OR MORE THAN 45...\nCAN YOU PLEASE, PUT A NUMBER BETWEEN 1 AND 45,\nTHANK YOU\n");

					//This variable has to KNOW which numbers are LESS THAN 1 OR MORE THAN 45 to run the program (between 1 and 45)
					Testing_3_Correct_Number = 1;
					
				}//This is the END of the "if Statement", I am using this to check which numbers are between 1 and 45


				//This is the START of the "if Statement", this part is for checking which numbers are already in the list
				if (Testing_3_Correct_Number == 0 )
				{

					//This is the START of the "if Statement", this part works together the boolean method, and check if is false
					if ( checkNum( USER_number[Lines_Counter], Input_Number_User ) == false ){

						//This variable has to find out which numbers are NOT Repeated inside the List
						Testing_1_Repeated_Number = 1;
						
					}	
				}//This is the END of the "if Statement", this part is for checking which numbers are already in the list
					
					//This is the START of the "if Statement", this part works together the boolean method, and check if is false
					if (Testing_1_Repeated_Number == 1)
					{
						//The program have to print to the screen "THIS NUMBER IS ALREADY IN THE LIST,\nCAN YOU PLEASE, PUT A DIFFERENT NUMBER AGAIN?\nTHANK YOU\"
						System.out.println("THIS NUMBER IS ALREADY IN THE LIST,\nCAN YOU PLEASE, PUT A DIFFERENT NUMBER AGAIN?\nTHANK YOU\n");
						
					}//This is the END of the "if Statement", this part works together the boolean method, and check if is false


					//This is the START of the "if Statement", this part works together the boolean method, and check if is true
					if ( Testing_1_Repeated_Number == 0 && Testing_3_Correct_Number == 0 ){

						//The program has to know compare the numbers between the list and the user input
						USER_number [Lines_Counter][Numbers_Of_Options] = Input_Number_User;

						//Variable INCREASE one at time.
						Numbers_Of_Options++;

						
					}//This is the START of the "if Statement", this part works together the boolean method, and check if is true
					

			}//This is the END of the "TRY Declaration" for the numbers played and check which are correct and which are not


			//This is the START of the "CATHC Declaration" for the WRONG INPUT FROM THE USER
			catch(NumberFormatException GeomarError_Letter)
			{
				//The program have to print to the screen "WE BOTH KNOW, THAT IS NOT A NUMBER...\nCAN YOU PLEASE, PUT A REAL NUMBER?,\nTHANK YOU"
				System.out.println("WE BOTH KNOW, THAT IS NOT A NUMBER...\nCAN YOU PLEASE, PUT A REAL NUMBER?,\nTHANK YOU\n");

				//This variable has to find out which is the right input for the user
				Testing_3_Correct_Number = 0;
				
			}//This is the END of the "CATHC Declaration" for the WRONG INPUT FROM THE USER
 		
		}//This is the END of the "While Loop" for the INITIATION OF THE USER INPUT LOTTERY NUMBERS (5 numbers have to be).


		//The program have to print to the screen a preliminary list of the numbers played by the user.
		System.out.print("\nYOUR NUMBERS FOR YOUR LINE " + "( " + (Lines_Counter + 1) + " ) " + " ARE : " + USER_number[Lines_Counter][testing_2 - 1] + " - " + USER_number[Lines_Counter][testing_2] + " - " + USER_number[Lines_Counter][testing_2 + 1] + " - " + USER_number[Lines_Counter][testing_2 + 2] + " - " + USER_number[Lines_Counter][testing_2 + 3] + "\n");


		//Variable INCREASE one at time "------------------------------------------------------------------------------"
		System.out.print("------------------------------------------------------------------------------" + "\n");


		//Variable INCREASE one at time.
		Lines_Counter++;
 		
 	}//This is the END of the "While Loop" for the INITIATION OF THE USER INPUT for the numbers of lines wants to play.

	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen "NOW I'M GOING TO ORGANICE ALL THIS NUMBER INFORMATION IN ONE SIMPLE TABLE"
	System.out.println("NOW I'M GOING TO ORGANICE ALL THIS NUMBER INFORMATION IN ONE SIMPLE TABLE");
			
			
// CREATING THE TABLE OF THE USER NUMBERS /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//The program have to print to the screen "  LINE   |               NUMBERS			 "
	System.out.println("\n\n" + "  LINE   |               NUMBERS			 ");
		
	//The program have to print to the screen "||||||||||||||||||||||||||||||||||||||||||||||||||"
	System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||-");


	//Declaring the variables for ARRANGE the user numbers on a table
	int Column_A = 0;
	int Column_B = 0;
	int Table = 0;
	int Table_Organization = 0;

	//This is the START of the "While Loop" arrange the user numbers on a table (nested loop)
	while (Column_A < USER_attempts){

		//This is the START of the "While Loop" arrange the user numbers on a table
		while (Table < 4){

			//This is the START of the "While Loop" arrange the user numbers Column_B
			while (Column_B < 4){

				//This is the START of the "if Statement", to make the table
				if(USER_number[Column_A][Column_B] > USER_number[Column_A][Column_B + 1])
				{

					Table_Organization = USER_number[Column_A][Column_B];
					USER_number[Column_A][Column_B] = USER_number[Column_A][Column_B + 1];
					USER_number[Column_A][Column_B + 1] = Table_Organization; 
							
				}//This is the END of the "if Statement", to make the table

				//Variable INCREASE one at time.
				Column_B ++;
				
			}//This is the END of the "While Loop" arrange the user numbers Column_B
					
		//Variable INCREASE one at time.
		Table ++;
			
		}//This is the END of the "While Loop" arrange the user numbers Column_B

	//Variable INCREASE one at time.
	Column_A ++;
			
	}//This is the END of the "While Loop" arrange the user numbers on a table


	//Declaring the variables to PRINT to make a table numbers
	int Column_D = 0;
	int Column_E;

	//This is the START of the "While Loop" to PRINT the user numbers on a table
	while (Column_D < USER_attempts){

		//The program have to print to the screen
		System.out.print ("    " + Column_D + "    -");

		//This is the START of the "For Loop" to PRINT the user numbers on a table
		for (Column_E = 0; Column_E <5; Column_E++){

			//This is the START of the "if Statement" part 1
			if (Column_E == 0)
			{
				//This is the START of the "if Statement", for the [Column_D][Column_E] < 11
				if (USER_number [Column_D][Column_E] < 11)
				{
					//The program have to print to the screen the [Column_D][Column_E]
					System.out.print ("     " + USER_number [Column_D][Column_E]);
					
				}//This is the END of the "if Statement", for the [Column_D][Column_E]


				//This is the START of the "ELSE Statement", for the [Column_D][Column_E]
				else
				{
					//The program have to print to the screen the [Column_D][Column_E]
					System.out.print ("      " + USER_number [Column_D][Column_E]);
					
				}//This is the END of the "ELSE Statement", for the [Column_D][Column_E]
			
			}//This is the END of the "if Statement", part 1


			//This is the START of the "ELSE Statement", for the [Column_D][Column_E] < 11
			else
			{

				//This is the START of the "if Statement", for the [Column_D][Column_E] < 11
				if (USER_number [Column_D][Column_E] < 11)
				{
					//The program have to print to the screen the [Column_D][Column_E]
					System.out.print ("    " + USER_number [Column_D][Column_E]);
							
				}//This is the END of the "if Statement", for the [Column_D][Column_E] < 11

				//This is the START of the "ELSE Statement"
				else
				{
					//The program have to print to the screen the [Column_D][Column_E]
					System.out.print ("     " + USER_number [Column_D][Column_E]);
					
				}//This is the END of the "ELSE Statement"
				
			}//This is the END of the "ELSE Statement", for the [Column_D][Column_E] < 11
					

				
		}//This is the END of the "For Loop" to PRINT the user numbers on a table

	//The program have to print to the screen an empty line
	System.out.println();


	//Variable INCREASE one at time.
	Column_D++;
	
 	}//This is the END of the "While Loop" to PRINT the user numbers on a table
			

 	//The program have to print to the screen "||||||||||||||||||||||||||||||||||||||||||||||||||-"
 	System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||-");

 	//The program have to print to the screen an empty line
	System.out.println();


//QUESTIONS PART 2: QUESTION 3 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//This is the START of the "Do While Loop" to the CONFIRM THE NUMBERS PLAYED FOR THE USER
	do{

		//The program have to print to the screen "ARE YOU SURE ABOUT YOUR NUMBERS?\nFOR YES= Y / FOR NO= N: "
		System.out.print ("\n\n\nARE YOU SURE ABOUT YOUR NUMBERS?\nFOR YES= Y / FOR NO= N: ");

		//This is the START of the "TRY Declaration" for the CONFIRMATION OF NUMBERS
		try
		{
			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_Confirmation_Numbers_Question = Confirmation_Question.nextLine().toLowerCase().charAt(0);
			
		}//This is the END of the "TRY Declaration" for the CONFIRMATION OF NUMBERS
				
		catch (NumberFormatException GeomarErrorLetter)
		
		{//This is the START of the "CATCH Declaration" for the CONFIRMATION OF NUMBERS
					
		}//This is the END of the "CATCH Declaration" for the CONFIRMATION OF NUMBERS
		
			//This is the START of the "if Statement", for the CONFIRMATION OF NUMBERS
			if (USER_Confirmation_Numbers_Question != 'n' && USER_Confirmation_Numbers_Question != 'y')
			{
				//The program have to print to the screen
				System.out.print("\nWE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nREMEMBER THIS LOTTERY JUST ACCEPT 'YES' OR 'NO' AS ANSWER...\nCAN YOU PLEASE, ANSWER THE QUESTION?\n");
				
			}//This is the END of the "if Statement", for the CONFIRMATION OF NUMBERS


	//This is the END of the "Do While Loop" to the CONFIRM THE NUMBERS PLAYED FOR THE USER
	}while (USER_Confirmation_Numbers_Question != 'n' && USER_Confirmation_Numbers_Question != 'y');

			//This is the START of the "if Statement", for the CONFIRMATION OF NUMBERS if the user put NO as answer
			 if (USER_Confirmation_Numbers_Question == 'n')
			{
				//The program have to print to the screen
				System.out.println ("\n\nOK... I UNDERSTAND THAT YOU ARE NOT SURE...\nAND JUST BECAUSE I LIKE YOU...\nI'M GOING TO GIVE ANOTHER OPPORTUNITY TO THINK VERY WELL YOUR NUMBERS AGAIN...\nGOOD LUCK THIS TIME...");
				
			}//This is the END of the "if Statement", for the CONFIRMATION OF NUMBERS if the user put NO as answer
			

	//This is the END of the "DO WHILE LOOP", for the USER_Confirmation_Numbers_Question
	}while (USER_Confirmation_Numbers_Question == 'n');

			


// CREATING THE LOTTERY RAMDOM NUMBERS /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//The program have to print to the screen "THE LOTTERY WINNING NUMBERS ARE"
	System.out.print ("\n\nTHE LOTTERY WINNING NUMBERS ARE: [ ");

	//The program has to create an Array of 6 Numbers
	int [] Random_numbers = new int [6];

	// This is the START of "For Loop", the program has to run six times
	for (int number_A = 0; number_A < 6; number_A ++)
	{
		//The program has to create 6 random numbers between 1 and 45
		Random_numbers [number_A] = (int) (Math.random() * 45) + 1;

		//This is the START of "If Statement" of the Random Numbers arrangement
		if (number_A > 0)
		{
			//This is the START of "Fo Loop" of the Random Numbers arrangement
			for (int number_B =0; number_B <=(number_A - 1); number_B ++)
			{
				//This is the START of "If Statement" of the Random Numbers arrangement
				if(Random_numbers[number_B] == Random_numbers[number_A])
				{
					
				//The program has to create random numbers between 1 and 45
				Random_numbers [number_A] = (int) (Math.random() * 45) + 1;

				//Variable DECREASE one at time.
				number_B--;
								
				}//This is the END of "If Statement" of the Random Numbers arrangement
				
 			}//This is the END of "For Loop" of the Random Numbers arrangement
 			
		}//This is the END of "If Statement" of the Random Numbers arrangement


		//This is the START of "If Statement" of the Random Numbers (THE LOTTERY WINNING NUMBERS)
		if (number_A == 4)
		{
			//The program have to print to the screen THE LOTTERY WINNING NUMBERS
			System.out.print (Random_numbers[number_A] + " ] ");
			
			
		}//This is the END of "If Statement" of the Random Numbers arrangement


		//This is the START of "If Statement" of the Random Numbers (THE EXTRA LOTTERY WINNING NUMBER)
		if (number_A == 5)
		{
			//The program have to print to the screen an empty line
			System.out.println();

			//The program have to print to the screen an empty line
			System.out.println();

			//The program have to print to the screen "AND JUST BECAUSE I LIKE YOU... I'M GOING TO GIVE YOU ONE EXTRA NUMBER:"
			System.out.print ("AND JUST BECAUSE I LIKE YOU... I'M GOING TO GIVE YOU ONE EXTRA NUMBER:");
			
			//The program have to print to the screen "GOOD LUCK"
			System.out.println("\nGOOD LUCK");

			//The program have to print to the screen Random_numbers
			System.out.print ("( " + Random_numbers[number_A] + " )");
			
		}//This is the END of "If Statement" of the Random Numbers (THE EXTRA LOTTERY WINNING NUMBER)


		//This is the START of "If Statement" of the Random Numbers (THE EXTRA LOTTERY WINNING NUMBER)
		if (number_A < 4 && number_A >= 0 )
		
		{
			//The program have to print to the screen Random_numbers
			System.out.print (Random_numbers[number_A] + "  ");
			
		}//This is the END of "If Statement" of the Random Numbers (THE EXTRA LOTTERY WINNING NUMBER)
		
	}// This is the START of "For Loop", the program has to create 6 random numbers, six times

			
	//The program have to print to the screen an empty line
	System.out.println();

	//The program have to print to the screen the table numbers
	System.out.println("\n\n" + "  LINE   |               NUMBERS			 ");

	//The program have to print to the screen:
	System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||-");

	//Declaring the variables to PRINT to make a table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
	int Column_F = 0;
	int Column_G;
	int Digit;
	int EQUAL_numbers = 0; 
	int COUNTER_EQUAL_numbers = 0;

	//This is the START of the "WHILE LOOP", for the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
	while (Column_F < USER_attempts ){

		//The program have to print to the screen A COLUMN
		System.out.print ("    " + Column_F + "    -");
		
		//This is the START of the "FOR LOOP", for the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
		for (Column_G = 0; Column_G <5; Column_G ++)
		{
			//This is the START of the "FOR LOOP" (NESTED LOOP), for the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
			for (Digit = 0; Digit <=5; Digit ++)
			{
				
				//This is the START of the "IF STATEMENT" (NESTED LOOP), for ORGANICE the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
				if (Random_numbers [Digit ] == USER_number [Column_F][Column_G])
				{
					//Variable INCREASE one at time.
					COUNTER_EQUAL_numbers++;
					
					EQUAL_numbers = 1;
								
				}//This is the END of the "IF STATEMENT" (NESTED LOOP), for ORGANICE the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
				
			}//This is the END of the "FOR LOOP" (NESTED LOOP), for the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
			
						
		//This is the START of the "IF STATEMENT" for ORGANICE the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
		if (Column_G == 0 )
		{

			//This is the START of the "IF STATEMENT" for ORGANICE the COLUMNS (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)
			if (USER_number [Column_F][Column_G] <10)
			{
				//This is the START of the "IF STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
				if (EQUAL_numbers != 1)
				{
					//The program have to print to the screen
					System.out.print ("    " + USER_number [Column_F][Column_G]);
					
				}//This is the END of the "IF STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER


				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				else
				{
					//The program have to print to the screen IF THE NUMBER IS EQUAL TO THE USER NUMBER "€" next to the number
					System.out.print ("    " + USER_number [Column_F][Column_G]+ "€");
					
				}//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				
			}//This is the START of the "IF STATEMENT" for ORGANICE the COLUMNS (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)

			
			//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER				
			else
			{
				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
				if (EQUAL_numbers != 1)
				{
					//The program have to print to the screen
					System.out.print ("    " + USER_number [Column_F][Column_G]);
					
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER

				
				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				else
				{
					//The program have to print to the screen IF THE NUMBER IS EQUAL TO THE USER NUMBER "€" next to the number
					System.out.print ("   " + USER_number [Column_F][Column_G]+ "€");
					
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				
				
			}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
		
		}//This is the START of the "IF STATEMENT" for ORGANICE the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)

	
		//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
		else
		{

			//This is the START of the "IF STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
			if (USER_number [Column_F][Column_G]<10)
			{
				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER		
				if (EQUAL_numbers != 1)
				
				{
					//The program have to print to the screen 
					System.out.print ("     " + USER_number [Column_F][Column_G]);
				
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER


				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
				else
				{
					//The program have to print to the screen IF THE NUMBER IS EQUAL TO THE USER NUMBER "€" next to the number
					System.out.print ("    " + USER_number [Column_F][Column_G]+ "€");
					
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				
			}//This is the END of the "IF STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER


			//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
			else
			{
				//This is the START of the "IF STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
				if (EQUAL_numbers != 1)
				{
					
					System.out.print ("    " +   USER_number [Column_F][Column_G]);
					
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER


				//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER
				else
				{
					//The program have to print to the screen IF THE NUMBER IS EQUAL TO THE USER NUMBER "€" next to the number
					System.out.print ("     " +  USER_number [Column_F][Column_G]+ "€");
					
			
				}//This is the END of the "ELSE STATEMENT", IF THE NUMBER IS EQUAL TO THE USER NUMBER

				
			}//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER
			
		}//This is the START of the "ELSE STATEMENT", IF THE NUMBER IS NOT EQUAL TO THE USER NUMBER

		//Variable is valid
		EQUAL_numbers = 0;
		
		}

		//The program have to print to the screen an 
		System.out.print ("   " + "   " + "   " + "   " + "   " + " YOU HIT : " + "(" + COUNTER_EQUAL_numbers + ")" + " NUMBER[S] IN THIS JACKPOT");

		//The program have to print to the screen an empty
		System.out.println();

		//The program have to print to the screen an empty "|||||||||||||||||||||||||||||||||||||||||||||||||"
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||-\n\n");
						
	//Variable is valid	
	COUNTER_EQUAL_numbers = 0;

	//Variable INCREASE one at time.
	Column_F++;
	
	}//This is the START of the "WHILE LOOP", for the table numbers (TO COMPARE USER NUMBERS AND LOTTERY WINNING NUMBERS)

						
// LAST QUESTION /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//This is the START of the "Do While Loop" for the LAST QUESTION OF THE PROGRAM
	do{
		//The program have to print to the screen "DO YOU WANT TO PLAY AGAIN?\nFOR YES= Y / FOR NO= N: "
		System.out.print ("\n\n\nDO YOU WANT TO PLAY AGAIN?\nFOR YES= Y / FOR NO= N: ");

		//This is the START of the "TRY Declaration" for the LAST QUESTION OF THE PROGRAM
		try
		{
			//The program have to receive the user input (data) and convert it, to “flow” into the program.
			USER_Last_Question = Last_Question.nextLine().toLowerCase().charAt(0);
			
		}//This is the END of the "TRY Declaration" for the LAST QUESTION OF THE PROGRAM


		//This is the START of the "CATCH Declaration" for the LAST QUESTION OF THE PROGRAM
		catch (NumberFormatException GeomarError_Letter)
		{
			
		}//This is the END of the "CATCH Declaration" for the LAST QUESTION OF THE PROGRAM

			//This is the START of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user put WRONG INPUT
			if (USER_Last_Question != 'n' && USER_Last_Question != 'y')
			{
				//The program have to print to the screen:
				System.out.print("\nWE BOTH KNOW, THAT IS NOT THE RIGHT LETTER OR YOU PUT A NUMBER, AM I RIGHT?...\nCAN YOU, PLEASE, ANSWER THE QUESTION?\n");
				
			}//This is the END of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user put WRONG INPUT


			//This is the START of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user choice is NO
			if (USER_Last_Question == 'n')
			{
				//The program have to print to the screen:
				System.out.print("\n\nGOOD BYE MY FRIEND... SEE YOU IN ANOTHER OPPORTUNITY...\n\n");
				
			}//This is the END of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user choice is NO
			

	//This is the END of the "Do While Loop" for the LAST QUESTION OF THE PROGRAM
	}while (USER_Last_Question != 'n' && USER_Last_Question != 'y');
	
			//This is the START of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user choice is YES
			if (USER_Last_Question == 'y')
			{
				//The program have to print to the screen: "LET'S PLAY ONE MORE GAME AGAIN...\nTHIS TIME I'M PRETTY SURE THAT YOU WILL BE A MILLONARIE...\nGOOD LUCK..."
				System.out.println("\n\n\n\nLET'S PLAY ONE MORE GAME AGAIN...\nTHIS TIME I'M PRETTY SURE THAT YOU WILL BE A MILLONARIE...\nGOOD LUCK...");
				
			}//This is the START of the "if Statement", for the LAST QUESTION OF THE PROGRAM if the user choice is YES


	//This is the END of the "Do While Loop" for the TERMINATION OF THE PROGRAM if the user choice is YES the program will start again, otherwise the program will STOP.
	}while (USER_Last_Question == 'y');
	
	 
	}//This is the END of the Main Method public static void main
	

	//This the start of the BOOLEAN CHECKNUM method
	public static boolean checkNum( int[] Number_List, int InputNumber ){

		//Declaring the variable when is true
		boolean Valid_Everything = true;

		//Variable
		int Cheking_Number = 0;

		//This is the START of the "Do While Loop"
		do
		{
			//This is the START of the "IF STATEMENT"
			if (Number_List[ Cheking_Number ] == InputNumber )
			{
				//Declaring the variable false
				Valid_Everything = false;
				
			}//This is the END of the "IF STATEMENT"

			//Variable INCREASE one at time
			Cheking_Number++;

		//This is the START of the "Do While Loop"
		}while( Cheking_Number < Number_List.length );

				
		//Variable has to return
		return Valid_Everything;

	}//This is the END of the MAIN method
 
}//This is the END of the class GEO_FINAL_4
 