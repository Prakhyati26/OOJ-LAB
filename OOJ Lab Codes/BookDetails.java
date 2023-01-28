import java.util.*;
import java.io.*;

class Book
{
String title,author;
float price;
int num_pages;

Book()
{
title = "Default Value";
author = "Default Value";
price = 0.0f;
num_pages = 0;
}

void setTitle(String title)
{
this.title=title;
}

void setAuthor(String author)
{
this.author=author;
}

void setPrice(float price)
{
this.price=price;
}

void setPages(int num_pages)
{
this.num_pages = num_pages;
}


public String toString()
{
return title+"\t\t"+author+"\t\t"+price+"\t\t"+num_pages+"\n";
}


}

public class BookDetails

{
public static void main(String args[])
{

String t, a;
float p;
int np,n;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of Books: ");
n = s.nextInt();
Book[] b = new Book[n];
for(int i=0;i<n;i++)
{
System.out.println();
System.out.print("Enter the book name: ");
t = s.next();
System.out.print("Enter the author name: ");
a = s.next();
System.out.print("Enter the book price: ");
p = s.nextFloat();
System.out.print("Enter the number of pages: ");
np = s.nextInt();

b[i] = new Book();
b[i].setTitle(t);
b[i].setAuthor(a);
b[i].setPrice(p);
b[i].setPages(np);
}

System.out.println("Title \t\t Author \t\t Price \t\t Pages\n");
for(int i=0; i<n;i++)
{
System.out.println(b[i]);
}
}
}