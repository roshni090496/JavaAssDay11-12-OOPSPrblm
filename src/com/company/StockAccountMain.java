package com.company;

import java.util.*;
public class StockAccountMain {

    ArrayList<Stock> stockAccountsList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private void setStocks() {
        System.out.println("Enter the Number of Stock Account You Want : ");
        int no = sc.nextInt();
        for(int i = 0; i < no; i++) {
            Stock stock = new Stock();
            setStockInfo(stock,i);
        }
    }

    private void setStockInfo(Stock stock, int i) {
        System.out.println("Enter the Stock "+(i+1)+" Information :");
        System.out.println("Enter the Stock Name :");
        stock.setStockName(sc.next());
        System.out.println("Enter the Number of Shares :");
        stock.setNoOfShares(sc.nextInt());
        System.out.println("Enter the Price of Shares :");
        stock.setSharePrice(sc.nextDouble());
        stock.setShareTotalValue(stock.getNoOfShares(),stock.getSharePrice());
        stockAccountsList.add(stock);
    }

    private void getStockInfo() {
        int i = 1;
        for(Stock stockAccount : stockAccountsList) {
            System.out.println("The Stock "+i+" Information is :");
            System.out.println("Stock Name : "+stockAccount.getStockName());
            System.out.println("Number of Shares : "+stockAccount.getNoOfShares());
            System.out.println("Price of Shares : "+stockAccount.getSharePrice());
            System.out.println("Total Value of Shares : "+stockAccount.getShareTotalValue());
            i++;
        }
    }

    public static void main(String[] args) {
        StockAccountMain stockPortfolio = new StockAccountMain();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }
}

