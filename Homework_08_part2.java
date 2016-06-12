package Homework;

import java.util.*;

class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	public Train(int number, String type, String start, String dest, double price){
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + number;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	public int compareTo(Train aTrain) {
		if (this.number > aTrain.number) {
			return -1;
		} else if(this.number == aTrain.number){
			return 0;
		} else {
			return 1;
		}
	}

	public String toString(){
		String s = number + ", " + type + ", " + start + ", " + dest + ", " + price;
		return s;
	}
}

public class Homework_08_part2 {

	public static void main(String[] args) {
		
		Stack<Train> list = new Stack<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花連", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花連", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		//請寫一隻程式,能讓台鐵安排車次的人員取得不會重覆的Train物件
		//(請分別用Iterator與for迴圈取值)
		//承上,Train物件不會重覆之外,還能讓班次編號由大排到小列出
		Set<Train> set = new TreeSet<Train>();//TreeSet:元素不重覆、會排序
		for (Train obj : list){
			set.add(obj); //加入不重覆物件， 須在Train中改寫hashCode和equals方法
			//依班次由大到小排序，須在Train中實作Comparable介面並改寫compareTo方法
		}
		
		Iterator<Train> trains = set.iterator();
		while (trains.hasNext()){
			Train atrain = trains.next();
			System.out.println(atrain);
		}
		System.out.println();
		
		for (Train atrain : set){
			System.out.println(atrain);
		}
		System.out.println();
		
		//因應年假人潮,台鐵加開一個車次(116, “自強”, “高雄”, “台北”,500)
		//在原本7個車次的後面,請問該如何設計程式碼
		//承上,有哪些取值的方式能得到這8個Train的物件
		list.add(new Train(116, "自強", "高雄", "台北", 500));
		
		for (Train atrain : list){
			System.out.println(atrain);
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println();
		
		while (!list.empty())
			System.out.println(list.pop());
	}
	
}
