package buckland;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import shire.sort.ISort;
import shire.sort.InsertionSort;

public class DriverMain {

	public static void main(final String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(new Random().nextInt() % 100);

		ISort<Integer> sort = new InsertionSort<Integer>();
		list = sort.sort(list);

		System.out.println(list);
	}

}
