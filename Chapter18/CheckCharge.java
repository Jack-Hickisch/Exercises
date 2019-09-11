import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

public class CheckCharge
{
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the $ in your checking account");
        final int nextInt = scanner.nextInt();
        System.out.println("Enter the $ in your savings account");
        final int nextInt2 = scanner.nextInt();
        if (nextInt > 1000 || nextInt2 > 1500) {
            System.out.println("There is no service charge for writng a check ");
        }
        else {
            System.out.println("There is a $0.15 charge per check");
        }
    }
}

// I messed up on commiting and started deleting stuff to get it back, I accidentally deleted this file but I found a decompieler online ( I still had a working class file) !!!!!!!!