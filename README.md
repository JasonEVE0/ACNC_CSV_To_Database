-----------------------------------------------------------------
Summary
-----------------------------------------------------------------
This project takes the CSV file of the ACNC registered charities and converts it into a database table.
The CSV in the project root is up-to-date as of 11/02/2023 however you can get the most up to date 
CSV file from: https://data.gov.au/dataset/ds-dga-b050b242-4487-4306-abf5-07ca073e5594/details?q=acnc

The ACNC registered charities list is useful in the database form as you could use the database alongside an API to 
create an application that fetches unique information about Australian charities.

-----------------------------------------------------------------
Instructions for use
-----------------------------------------------------------------
After downloading the project go to DataSourceConfig and modify the url, username and password for your specific
database for example:
url = "jdbc:mysql://localhost:3306/db-name"
username = "root"
password = "password"

The program will read the datadotgov_main.csv file in the root folder so make sure you have an up-to-date copy.
The copy currently in the root is up-to-date as of February 2023

When you execute the program it will then create a table for you and populate it with the records found in the
csv file.

Please note, the datadotgov_main file has around 60,000 entries, so it could take a few minutes to fully populate
the database, there is a log to let you know how many records have been added while you wait.

-----------------------------------------------------------------
Terms of use
-----------------------------------------------------------------
This project is licenced under the MIT licence and everybody is free to download, modify, use or distribute the
program as they wish.
