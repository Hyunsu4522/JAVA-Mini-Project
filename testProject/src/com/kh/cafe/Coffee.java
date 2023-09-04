package com.kh.cafe;

public class Coffee {
		private String drinkName; //음료 이름
		private int price; //가격
		private int number;//음료 갯수
		private boolean caffeine; //카페인 여부
		
		public Coffee(String drinkName, int price) {
			this.drinkName = drinkName;
			this.price = price;
			this.caffeine = true;
		}
		
		//getter
		public String getDrinkName() {
			return drinkName;
		}
		public int getPrice() {
			return price;
		}
		public int getNumber() {
			return number;
		}

		//setter
		public void setDrinkName(String drinkName) {
			this.drinkName = drinkName;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public void setCaffeine(boolean caffeine) {
			this.caffeine = caffeine;
		}
		
		public boolean isCaffeine() {
			return caffeine;
		}

		@Override
		public String toString() {
			return this.drinkName + "\t" + this.price + "\t" + (this.caffeine ? "카페인": "디카페인");
		}



	
	}

