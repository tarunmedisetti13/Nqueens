package org.example;

import GenerateNqueens.NQueens;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NQueens queens = new NQueens();
        queens.addSize(8);
        queens.generatenqueens();
        System.out.print(queens.Nways());

    }
}