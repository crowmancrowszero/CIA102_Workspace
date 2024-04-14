package hw1;


public class hw1 {
	public static void main(String[] arge) {
         // 1 請設計一隻Java程式，計算12，6這兩個數值的和與積       
		    int num1 = 12;
	        int num2 = 6;
	        
	        // 計算和
	        int sum = num1 + num2;
	        // 計算積
	        int product = num1 * num2;
	        
	        // 輸出結果
	        System.out.println("和：" + sum);
	        System.out.println("積：" + product);
	
	     // 2 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	        
	     // 定義總共的蛋數
	        int totalEggs = 200;
	        // 定義一打的蛋數
	        int dozen = 12;
	     // 計算打數
	        int dozens = totalEggs / dozen;
	        // 計算剩餘的蛋數
	        int remainingEggs = totalEggs % dozen;
	        System.out.println(totalEggs + "顆蛋共是" + dozens + "打" + remainingEggs + "顆");
	
        // 3 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	        
	        // 定義總秒數
	        int totalSeconds = 256559;
	        
	        // 計算天數
	        int days = totalSeconds / (24 * 60 * 60);
	        // 計算小時數
	        int hours = (totalSeconds % (24 * 60 * 60)) / (60 * 60);
	        // 計算分鐘數
	        int minutes = ((totalSeconds % (24 * 60 * 60)) % (60 * 60)) / 60;
	        // 計算剩餘的秒數
	        int seconds = ((totalSeconds % (24 * 60 * 60)) % (60 * 60)) % 60;
	        
	        // 輸出結果
	        System.out.println(totalSeconds + "秒為 " + days + "天, " + hours + "小時, " + minutes + "分, " + seconds + "秒");
	        
	     // 4 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	     // 定義圓周率常數
	        final double PI = 3.1415;
	        
	        // 定義半徑
	        double radius = 5;
	        
	        // 計算圓面積
	        double area = PI * radius * radius;
	        
	        // 計算圓周長
	        double circumference = 2 * PI * radius;
	        
	        // 輸出結果
	        System.out.println("半徑為 " + radius + " 的圓面積為 " + area);
	        System.out.println("半徑為 " + radius + " 的圓周長為 " + circumference);
	      
	     // 5 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	     //   金加利息共有多少錢 (用複利計算，公式請自行google)
	        
	        double principal = 1500000; // 本金150萬
	        double annualInterestRate = 0.02; // 年利率2%
	        int numberOfYears = 10; // 存款10年

	        // 計算複利總金額
	        double totalAmount = principal * Math.pow(1 + annualInterestRate, numberOfYears);

	        // 輸出結果
	        System.out.println("10年後，本金加利息共有：" + totalAmount + "元");
	        
	      // 6 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
	      //  5 + 5
	      //  5 + ‘5’
	      //  5 + “5”
	      //  並請用註解各別說明答案的產生原因
	        // 第一個運算式：5 + 5
	        // 這是兩個整數相加，所以結果是整數相加的總和。
	        System.out.println(5 + 5); // 輸出：10
	        
	        // 第二個運算式：5 + '5'
	        // '5' 是一個字符，根據ASCII碼，它的值是整數53。
	        // 因此這裡是一個整數和一個字符相加，Java會將字符轉換為對應的ASCII值。
	        // 5 + 53 的結果是兩個整數相加的總和。
	        System.out.println(5 + '5'); // 輸出：58
	        
	        // 第三個運算式：5 + "5"
	        // "5" 是一個字符串，Java會嘗試將整數5轉換為字符串，然後將兩個字符串進行連接。
	        // 因此這裡實際上是兩個字符串的連接操作。
	        System.out.println(5 + "5"); // 輸出：55
	        
	    }
	}
	  
