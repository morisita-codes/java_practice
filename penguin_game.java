package study;

import java.util.Scanner;

public class penguin_game {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int mood = 5; // ペンギンのごきげん値（0〜10）

		        System.out.println("ペンギン育成ゲームへようこそ♡");
		        System.out.println("あなたのペンギンの名前を入力してください：");
		        String name = scanner.nextLine();

		        System.out.println(name + " が生まれました！かわいがってあげてね♡");

		        for (int day = 1; day <= 3; day++) {
		            System.out.println("\nDay " + day + ": 何をしますか？");
		            System.out.println("1: エサをあげる");
		            System.out.println("2: なでる");
		            System.out.println("3: 放置する");

		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println(name + " はおいしそうに食べています♡");
		                    mood += 2;
		                    break;
		                case 2:
		                    System.out.println(name + " はうっとりしています♡");
		                    mood += 1;
		                    break;
		                case 3:
		                    System.out.println(name + " はじっと見つめています…");
		                    mood -= 2;
		                    break;
		                default:
		                    System.out.println("ペンギンは困惑しています…");
		                    mood -= 1;
		            }

		            // ごきげんの範囲を制限
		            if (mood > 10) mood = 10;
		            if (mood < 0) mood = 0;

		            System.out.println("現在のごきげん: " + mood + "/10");
		        }

		        // 最終結果
		        System.out.println("\n--- 育成結果 ---");
		        if (mood >= 8) {
		            System.out.println(name + " はあなたにベタ惚れです♡");
		        } else if (mood >= 4) {
		            System.out.println(name + " はまあまあ懐いています。");
		        } else {
		            System.out.println(name + " はあなたにそっけない態度をとっています…ペンペン。");
		        }

		        scanner.close();
		    }
		


	}